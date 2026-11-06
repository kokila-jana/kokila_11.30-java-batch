package morninng;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login implements ActionListener 
{
	JButton b;
	JTextField t;
	JPasswordField t1;
	void demo()
	{
		JFrame f=new JFrame("My Project");
		f.setSize(1600, 900);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.decode("#FFDEAD"));
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\w1.png")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Login Page");
		l.setBounds(540, 20, 300, 100);
		l.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		l.setForeground(Color.decode("#2E8B57"));
		f.add(l);
		
		JLabel l1=new JLabel("User Name");
		l1.setBounds(440, 120, 300, 100);
		l1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		l1.setForeground(Color.decode("#2E8B57"));
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(690, 140, 300, 50);
		t.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		t.setForeground(Color.decode("#2E8B57"));
		f.add(t);
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(440, 220, 300, 100);
		l2.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		l2.setForeground(Color.decode("#2E8B57"));
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(690, 240, 300, 50);
		t1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		t1.setForeground(Color.decode("#2E8B57"));
		f.add(t1);
		
		b=new JButton("Login");
		b.setBounds(540, 360, 300, 50);
		b.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		b.setForeground(Color.decode("#2E8B57"));
		f.add(b);
		b.addActionListener(this);
	}
	public static void main(String[] args)
	{
		Login l=new Login();
		l.demo();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=t.getText();
		String s1=t1.getText();
		if(e.getSource()==b)
		{
			if(s.isEmpty() || s1.isEmpty())
			{
				JOptionPane.showMessageDialog(b, "Please enter all data");
			}
			else if(s.equals("Java") && s1.equals("12345"))
			{
			JOptionPane.showMessageDialog(b, "Login Success");
			}
			else
			{
				JOptionPane.showMessageDialog(b, "Invalid username or password..");
			}
		}
	}
}
