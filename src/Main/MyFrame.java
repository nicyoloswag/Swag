package Main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField swag;
	private JLabel lblAids;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblAids = new JLabel("AIDS");
		lblAids.setBounds(22, 121, 332, 16);
		contentPane.add(lblAids);

		textField = new JTextField();
		textField.setBounds(34, 25, 134, 28);
		contentPane.add(textField);
		textField.setColumns(10);

		comboBox = new JComboBox();
		comboBox.setBounds(186, 27, 61, 27);
		comboBox.addItem("+");
		comboBox.addItem("-");
		comboBox.addItem("/");
		comboBox.addItem("*");
		comboBox.addItem("^");
		contentPane.add(comboBox);

		JButton btnYoloswag = new JButton("YOLOSWAG");
		btnYoloswag.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("+")){
					lblAids.setText(""+(Integer.parseInt(textField.getText()) + Integer.parseInt(swag.getText())));
				}
				else if(comboBox.getSelectedItem().equals("/")){
					lblAids.setText(""+Double.parseDouble(textField.getText()) / Double.parseDouble(swag.getText()));
				}
				else if(comboBox.getSelectedItem().equals("*")){
					lblAids.setText(""+Double.parseDouble(textField.getText()) * Double.parseDouble(swag.getText()));
				}
				else if(comboBox.getSelectedItem().equals("-")){
					lblAids.setText(""+(Double.parseDouble(textField.getText()) - Double.parseDouble(swag.getText())));
				}
			}
		});

		btnYoloswag.setBounds(22, 172, 134, 29);
		contentPane.add(btnYoloswag);

		swag = new JTextField();
		swag.setBounds(257, 25, 134, 28);
		contentPane.add(swag);
		swag.setColumns(10);

	}
}
