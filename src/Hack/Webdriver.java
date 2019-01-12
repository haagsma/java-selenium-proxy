package Hack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Hack.Farm;
import Hack.Tropas;

public class Webdriver {
	
	
	public static WebDriver navegador = new ChromeDriver(WebConfigss());
	//public static WebDriver navegador = new ChromeDriver();
		
		public static DesiredCapabilities WebConfigss() {
			Proxy proxy = new Proxy(); 
			proxy.setHttpProxy("186.248.135.180:3128"); 
			proxy.setSslProxy("186.248.135.180:3128"); 

			DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
			capabilities.setCapability("proxy", proxy); 

			ChromeOptions options = new ChromeOptions(); 
			options.addArguments("start-maximized"); 

			capabilities.setCapability(ChromeOptions.CAPABILITY, options); 
			return capabilities;
		}
		public static void teste() {
			String[] time = navegador.findElement(By.xpath("//table[@class='vis']/tbody/tr[4]/td[2]")).getText().split(":");
			
			System.out.println(Integer.parseInt(time[0])+1);
		}
		public static void abrir() {
			navegador.get("https://tribalwars.com.br");
			
		}
		public static void login(String login, String password) throws InterruptedException {
			navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			TimeUnit.SECONDS.sleep(1);
			navegador.findElement(By.id("user")).sendKeys(login);
			TimeUnit.SECONDS.sleep(1);
			navegador.findElement(By.id("password")).sendKeys(password);
			TimeUnit.SECONDS.sleep(1);
			navegador.findElement(By.className("btn-login")).click();
			TimeUnit.SECONDS.sleep(1);
			//navegador.findElement(By.className("world-select")).findElement(By.tagName("span")).click();
			navegador.findElement(By.xpath("//span[@class='world_button_active' and text()='Mundo 92']")).click();
		}
		public static void coletar() {
			navegador.get("https://br92.tribalwars.com.br/game.php?screen=place&mode=scavenge");
			navegador.findElement(By.className("fill-all")).click();
			
			
		}
		public static void atacar(String[] tropas, String[] coords) throws InterruptedException {
			navegador.get("https://br92.tribalwars.com.br/game.php?screen=place");
			TimeUnit.SECONDS.sleep(1);
			for(int e = 0; e < coords.length; e++) {
				TimeUnit.SECONDS.sleep(1);
				for(int i = 0; i < tropas.length; i++) {
					navegador.findElement(By.id(Tropas.tropas[i])).sendKeys(tropas[i]);
				}
				TimeUnit.SECONDS.sleep(1);
				navegador.findElement(By.id("place_target")).findElement(By.className("target-input-field")).sendKeys(coords[e]);
				TimeUnit.SECONDS.sleep(1);
				navegador.findElement(By.id("target_attack")).click();
				try {
					TimeUnit.SECONDS.sleep(2);
					navegador.findElement(By.id("troop_confirm_go")).click();
				}catch(Exception error){
					System.out.println("Erro do ataque: "+error);
					break;
				}finally {
					TimeUnit.SECONDS.sleep(3);
				}
			}
			
		}
}
