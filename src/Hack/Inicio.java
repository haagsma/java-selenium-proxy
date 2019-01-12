package Hack;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Inicio {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 300, 599, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Osamas Hack");
		
		JLabel lblLogin = new JLabel("Logiin:");
		lblLogin.setBounds(20, 28, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(20, 67, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(67, 25, 131, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBotFarm = new JButton("Bot Farm");
		btnBotFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String[] tropas = {textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText() 
							, textField_6.getText(), textField_7.getText(), textField_8.getText(), textField_9.getText(), textField_10.getText()};
					
					String[] coords = textArea.getText().split(",");
					Webdriver.atacar(tropas, coords);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnBotFarm.setBounds(10, 136, 188, 23);
		frame.getContentPane().add(btnBotFarm);
		
		JButton btnCriarConta = new JButton("Iniciar");
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.setProperty("webdriver.chrome.driver", "Lib/chromedriver.exe");
				try {
					Webdriver.abrir();
					Webdriver.login(textField.getText(), passwordField.getText());
					//Webdriver.login("login", "senha");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCriarConta.setBounds(10, 102, 188, 23);
		frame.getContentPane().add(btnCriarConta);
		
		JButton btnTeste = new JButton("btnTeste");
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Webdriver.teste();
			}
		});
		btnTeste.setBounds(200, 102, 100, 23);
		frame.getContentPane().add(btnTeste);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(67, 64, 131, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblLanceiro = new JLabel("Lanceiro");
		lblLanceiro.setBounds(360, 28, 46, 14);
		frame.getContentPane().add(lblLanceiro);
		
		JLabel lblEspada = new JLabel("Espada");
		lblEspada.setBounds(360, 50, 46, 14);
		frame.getContentPane().add(lblEspada);
		
		JLabel lblBarbaro = new JLabel("Barbaro");
		lblBarbaro.setBounds(360, 70, 46, 14);
		frame.getContentPane().add(lblBarbaro);
		
		JLabel lblSpy = new JLabel("Spy");
		lblSpy.setBounds(360, 95, 46, 14);
		frame.getContentPane().add(lblSpy);
		
		JLabel lblCavLeve = new JLabel("Cav. Leve");
		lblCavLeve.setBounds(360, 115, 60, 14);
		frame.getContentPane().add(lblCavLeve);
		
		JLabel lblCavPesada = new JLabel("Cav. Pesada");
		lblCavPesada.setBounds(360, 140, 74, 14);
		frame.getContentPane().add(lblCavPesada);
		
		JLabel lblAriete = new JLabel("Ariete");
		lblAriete.setBounds(360, 165, 46, 14);
		frame.getContentPane().add(lblAriete);
		
		JLabel lblCataputa = new JLabel("Cataputa");
		lblCataputa.setBounds(360, 190, 46, 14);
		frame.getContentPane().add(lblCataputa);
		
		JLabel lblPaladino = new JLabel("Paladino");
		lblPaladino.setBounds(360, 216, 46, 14);
		frame.getContentPane().add(lblPaladino);
		
		JLabel lblNobre = new JLabel("Nobre");
		lblNobre.setBounds(360, 241, 46, 14);
		frame.getContentPane().add(lblNobre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(439, 25, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(439, 47, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(439, 70, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(439, 92, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(439, 115, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(439, 137, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(439, 162, 86, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(439, 187, 86, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(439, 213, 86, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(439, 238, 86, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setText("\"634|588\", \"633|588\", \"634|587\",\"633|587\", \"636|588\", \"636|587\", \"633|590\", \"638|587\", \"637|586\", \"634|585\", \"636|585\", \"636|584\"");
		textArea.setBounds(10, 171, 188, 138);
		frame.getContentPane().add(textArea);
	}
}
