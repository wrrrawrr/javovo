package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;

import calculation.Parser;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField textField;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnAdd;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMinus;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnRazy;
	private JButton btnComma;
	private JButton btn0;
	private JButton btnWyn;
	private JButton btnDziel;
	private String strWyr;
	private Parser parser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.NORTH);
		textField.setColumns(10);

		JPanel panelBasic = new JPanel();
		frame.getContentPane().add(panelBasic, BorderLayout.CENTER);
		panelBasic.setLayout(new GridLayout(4, 4, 0, 0));

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setWyr(btn1);
			}
		});
		panelBasic.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn2);
			}
		});
		panelBasic.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn3);
			}
		});
		panelBasic.add(btn3);

		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btnAdd);
			}
		});
		panelBasic.add(btnAdd);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn4);
			}
		});
		panelBasic.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn5);
			}
		});
		panelBasic.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn6);
			}
		});
		panelBasic.add(btn6);

		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btnMinus);
			}
		});
		panelBasic.add(btnMinus);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn7);
			}
		});
		panelBasic.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn8);
			}
		});
		panelBasic.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn9);
			}
		});
		panelBasic.add(btn9);

		btnRazy = new JButton("*");
		btnRazy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btnRazy);
			}
		});
		panelBasic.add(btnRazy);

		btnComma = new JButton(",");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btnComma);
			}
		});
		panelBasic.add(btnComma);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btn0);
			}
		});
		panelBasic.add(btn0);

		btnWyn = new JButton("=");
		btnWyn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parser = new Parser(textField.getText());

			}
		});
		panelBasic.add(btnWyn);

		btnDziel = new JButton("/");
		btnDziel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setWyr(btnDziel);
			}
		});
		panelBasic.add(btnDziel);
	}

	private void setWyr(JButton btnX){
		String temp = btnX.getText();
		strWyr = textField.getText();
		textField.setText(strWyr + temp);
	}

}
