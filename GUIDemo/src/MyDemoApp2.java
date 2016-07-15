import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;

public class MyDemoApp2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					MyDemoApp2 frame = new MyDemoApp2();
					frame.setVisible(true);
				}
	

	/**
	 * Create the frame.
	 */
	public MyDemoApp2() {
		setTitle("MyScreen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(Color.GRAY);
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 14));
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(Color.GRAY);
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(MyDemoApp2.this,"OK Clicked");
				
				/*String temp=btnOk.getText();
				btnOk.setText(btnCancel.getText());
				btnCancel.setText(temp);*/
				
				//btnCancel.setText("Hello OK");
			}
		});
		btnOk.setBounds(69, 54, 89, 23);
		contentPane.add(btnOk);
	
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyDemoApp2.this,btnCancel.getText()+" Clicked");
			}
		});
		btnCancel.setBounds(208, 54, 89, 23);
		contentPane.add(btnCancel);
	}
}
