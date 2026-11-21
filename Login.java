package morninng;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login implements ActionListener 
{
	JButton b,b1;
	JTextField t;
	JFrame f;
	JPasswordField t1;
	void demo()
	{
		f=new JFrame("My Project");
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
		
		b1=new JButton("Register");
		b1.setBounds(540, 460, 300, 50);
		b1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		b1.setForeground(Color.decode("#2E8B57"));
		f.add(b1);
		b1.addActionListener(this);
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
			else 
			{
				String url="jdbc:mysql://localhost/first_class";
				String user="root";
				String pass="kokilajana";
				try {
					Connection con=DriverManager.getConnection(url, user, pass);
					String Query="select * from login where name=? and pass=?";
					PreparedStatement ps=con.prepareStatement(Query);
					ps.setString(1, s);
					ps.setString(2, s1);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(b, "Login Success");
						new Next();
					}
					else
					{
						JOptionPane.showMessageDialog(b, "Invalid username or password...");
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		}
		else if(e.getSource()==b1)
		{
			Register r=new Register();
			r.fun();
			f.setVisible(false);
		}
	}
}
