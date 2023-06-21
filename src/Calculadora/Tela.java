package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import java.awt.Insets;

public class Tela {

	private JFrame frmCalculadora;
	private JTextField visor;
	private JButton btn4;
	private JButton btn5;
	private JButton btn1;
	private JButton btn0;
	private JButton btnClear;
	private JButton btn00;
	private JButton btnMais;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMenos;
	private JButton btn6;
	private JButton btnMulti;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDiv;
	private JButton btnPonto;
	private JButton btnIgual;
	private JButton btnPorcentagem;
	
	double primeiro;
	double segundo;
	double resultado;
	String operacao;
	String resposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.getContentPane().setBackground(new Color(38, 162, 105));
		frmCalculadora.setBackground(new Color(229, 165, 10));
		frmCalculadora.setFont(new Font("Century Schoolbook L", Font.BOLD, 12));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 265, 428);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		visor = new JTextField();
		visor.setMargin(new Insets(50, 50, 50, 50));
		visor.setEditable(false);
		visor.setBounds(new Rectangle(50, 50, 50, 50));
		visor.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		visor.setForeground(new Color(255, 255, 255));
		visor.setBackground(new Color(26, 95, 180));
		visor.setFont(new Font("Century Schoolbook L", Font.PLAIN, 22));
		visor.setBounds(12, 12, 242, 55);
		frmCalculadora.getContentPane().add(visor);
		visor.setColumns(10);
		
		JButton btnBackSpace = new JButton("B");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String voltar = null;
				if(visor.getText().length()>0);
				{
					StringBuilder str = new StringBuilder(visor.getText());
					str.deleteCharAt(visor.getText().length()-1);
					voltar = str.toString();
					visor.setText(voltar);
					
				}
			}
		});
		btnBackSpace.setBackground(new Color(229, 165, 10));
		btnBackSpace.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnBackSpace.setBounds(12, 79, 60, 60);
		frmCalculadora.getContentPane().add(btnBackSpace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn7.getText();
				visor.setText(numero);
			}
		});
		btn7.setBackground(new Color(229, 165, 10));
		btn7.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn7.setBounds(12, 139, 60, 60);
		frmCalculadora.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn4.getText();
				visor.setText(numero);
			}
		});
		btn4.setBackground(new Color(229, 165, 10));
		btn4.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn4.setBounds(12, 199, 60, 60);
		frmCalculadora.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn5.getText();
				visor.setText(numero);
			}
		});
		btn5.setBackground(new Color(229, 165, 10));
		btn5.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn5.setBounds(73, 199, 60, 60);
		frmCalculadora.getContentPane().add(btn5);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn1.getText();
				visor.setText(numero);
			}
		});
		btn1.setBackground(new Color(229, 165, 10));
		btn1.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn1.setBounds(12, 259, 60, 60);
		frmCalculadora.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn0.getText();
				visor.setText(numero);
			}
		});
		btn0.setBackground(new Color(229, 165, 10));
		btn0.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn0.setBounds(12, 319, 60, 60);
		frmCalculadora.getContentPane().add(btn0);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visor.setText(null);
			}
		});
		btnClear.setBackground(new Color(229, 165, 10));
		btnClear.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnClear.setBounds(73, 79, 60, 60);
		frmCalculadora.getContentPane().add(btnClear);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn00.getText();
				visor.setText(numero);
				operacao = "+";
			}
		});
		btn00.setBackground(new Color(229, 165, 10));
		btn00.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn00.setBounds(134, 79, 60, 60);
		frmCalculadora.getContentPane().add(btn00);
		
		btnMais = new JButton("+");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(visor.getText());
				visor.setText("");
				operacao = "+";		
			}
		});
		btnMais.setBackground(new Color(229, 165, 10));
		btnMais.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnMais.setBounds(195, 79, 60, 60);
		frmCalculadora.getContentPane().add(btnMais);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn8.getText();
				visor.setText(numero);
			}
		});
		btn8.setBackground(new Color(229, 165, 10));
		btn8.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn8.setBounds(73, 139, 60, 60);
		frmCalculadora.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn9.getText();
				visor.setText(numero);
			}
		});
		btn9.setBackground(new Color(229, 165, 10));
		btn9.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn9.setBounds(134, 139, 60, 60);
		frmCalculadora.getContentPane().add(btn9);
		
		btnMenos = new JButton("-");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(visor.getText());
				visor.setText("");
				operacao = "-";		
			}
		});
		btnMenos.setBackground(new Color(229, 165, 10));
		btnMenos.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnMenos.setBounds(195, 139, 60, 60);
		frmCalculadora.getContentPane().add(btnMenos);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn6.getText();
				visor.setText(numero);
			}
		});
		btn6.setBackground(new Color(229, 165, 10));
		btn6.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn6.setBounds(134, 199, 60, 60);
		frmCalculadora.getContentPane().add(btn6);
		
		btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(visor.getText());
				visor.setText("");
				operacao = "*";		
			}
		});
		btnMulti.setBackground(new Color(229, 165, 10));
		btnMulti.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnMulti.setBounds(195, 199, 60, 60);
		frmCalculadora.getContentPane().add(btnMulti);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn2.getText();
				visor.setText(numero);
			}
		});
		btn2.setBackground(new Color(229, 165, 10));
		btn2.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn2.setBounds(73, 259, 60, 60);
		frmCalculadora.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btn3.getText();
				visor.setText(numero);
			}
		});
		btn3.setBackground(new Color(229, 165, 10));
		btn3.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btn3.setBounds(134, 259, 60, 60);
		frmCalculadora.getContentPane().add(btn3);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(visor.getText());
				visor.setText("");
				operacao = "/";		
			}
		});
		btnDiv.setBackground(new Color(229, 165, 10));
		btnDiv.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnDiv.setBounds(195, 259, 60, 60);
		frmCalculadora.getContentPane().add(btnDiv);
		
		btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=visor.getText()+btnPonto.getText();
				visor.setText(numero);
			}
		});
		btnPonto.setBackground(new Color(229, 165, 10));
		btnPonto.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnPonto.setBounds(73, 319, 60, 60);
		frmCalculadora.getContentPane().add(btnPonto);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resposta;
				segundo = Double.parseDouble(visor.getText());
				switch (operacao) {
				case "+":
					resultado = primeiro + segundo;
					resposta = String.format("%.2f", resultado);
					visor.setText(resposta);
					break;
				case "-":
					resultado = primeiro - segundo;
					resposta = String.format("%.2f", resultado);
					visor.setText(resposta);
					break;
				case "*":
					resultado = primeiro * segundo;
					resposta = String.format("%.2f", resultado);
					visor.setText(resposta);
					break;
				case "/":
					resultado = primeiro / segundo;
					resposta = String.format("%.2f", resultado);
					visor.setText(resposta);
					break;
				case "%":
					resultado = (primeiro/100)*segundo;
					resposta = String.format("%.2f", resultado);
					visor.setText(resposta);
					break;
					
				}
				
				
			}
		});
		btnIgual.setBackground(new Color(229, 165, 10));
		btnIgual.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnIgual.setBounds(134, 319, 60, 60);
		frmCalculadora.getContentPane().add(btnIgual);
		
		btnPorcentagem = new JButton("%");
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiro = Double.parseDouble(visor.getText());
				visor.setText("");
				operacao = "%";		
			}
		});
		btnPorcentagem.setBackground(new Color(229, 165, 10));
		btnPorcentagem.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		btnPorcentagem.setBounds(195, 319, 60, 60);
		frmCalculadora.getContentPane().add(btnPorcentagem);
	}
}
