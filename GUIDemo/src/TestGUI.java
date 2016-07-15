import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//AWT & Swing are used to create Desktop Applications.
//Swing is lightweight as compared to AWT because AWT components make OS call before rendering so-
//Output different for different OS.
//Swing has richer UI.

//GUI:- JButton, JTextField, JPassword, JRadioButton,...J comes from Java Foundation Classes(JFC)
//JFC-	1.Swing	2.PLAF(Pluggable look & feel)	3.2-D Graphics	4.Accessibility		

//A->B: A parent	B child
//JComponent->(JButtons,JTextField,JTextArea,JRadioButton...),JContainer

//JContainer(add,delete,show,hide)->JWindow(Only rectangular area)->JFrame(Rectangular Area+(x - +)+TitleBar)
//JWindow is used for creating splash screens.(ex->in eclipse)
class MyFirstScreen extends JFrame{

	JButton ok=new JButton("OK");
	JButton cancel=new JButton("CANCEL");

	MyFirstScreen(){	//Design of frame must be in constructor
	this.setSize(400,300);
	this.setTitle("MyFirstScreen");
	this.setVisible(true);
	this.setLocation(300,200);
	
	/*BorderLayout is the default layout applied in content pane.It is master layout used to create  master page
	this.getContentPane().add(ok);
	this.getContentPane().add(ok,BorderLayout.NORTH);
	this.getContentPane().add(cancel,BorderLayout.SOUTH);*/
	
	/*this.getContentPane().setLayout(null);
	this.getContentPane().add(ok);
	this.getContentPane().add(cancel);
	ok.setBounds(20, 20, 100, 40);
	cancel.setBounds(130, 20, 100, 40);*/
	
	this.getContentPane().setLayout(new FlowLayout());
	this.getContentPane().add(ok);
	this.getContentPane().add(cancel);
	}
}
	
public class TestGUI {

	public static void main(String[] args) {
		
		MyFirstScreen screen1=new MyFirstScreen();
		

	}

}
