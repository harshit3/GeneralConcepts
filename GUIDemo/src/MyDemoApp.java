import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyDemoApp extends JFrame{ //implements ActionListener {

	private JPanel contentPane;
	JButton btnOk = new JButton("OK");
	JButton btnCancel = new JButton("Cancel");
	/**
	 * Create the frame.
	 */
	public MyDemoApp() {
		setVisible(true);
		setTitle("MYFirstScreen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		btnOk.setBounds(123, 53, 89, 23);
		contentPane.add(btnOk);

		btnCancel.setBounds(123, 123, 89, 23);
		contentPane.add(btnCancel);
		//btnOk.addActionListener(this);
		//btnCancel.addActionListener(this);
		
		
		
		/*ActionListener l=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyDemoApp.this,"U clicked on OK");			
			}
		};
		btnOk.addActionListener(l);*/
		btnOk.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyDemoApp.this,"U clicked on OK");			
			}
		});
	
		
		
		
		ActionListener l2=new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MyDemoApp.this,"U clicked on Cancel");			
			}
		};
		btnCancel.addActionListener(l2);
	}


/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					MyDemoApp frame = new MyDemoApp();
					
				}


/*@Override
 * Very Bad approach.SRP break & large no of if-else
public void actionPerformed(ActionEvent e) {
	
	String btnLbl=e.getActionCommand();
	if(btnLbl.equals("OK")){
		JOptionPane.showMessageDialog(this,"u click on OK");		
	}
	else if(btnLbl.equals("Cancel")){
		
		JOptionPane.showMessageDialog(MyDemoApp.this,"u click on Cancel");
	}
	
	
}*/

	//Using Anonymous Class:-
	
}	
