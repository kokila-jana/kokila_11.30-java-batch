package morninng;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register implements ActionListener 
{
	JFrame f;
	JPasswordField t1;
	JTextField t,t2,t3;
	JButton b;
	void fun()
	{
		f=new JFrame("My Project");
		f.setSize(1600, 900);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.decode("#FFDEAD"));
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\w1.png")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Register Page");
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
		
		JLabel l3=new JLabel("Phone");
		l3.setBounds(440, 320, 300, 100);
		l3.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		l3.setForeground(Color.decode("#2E8B57"));
		f.add(l3);
		
		t2=new JTextField();
		t2.setBounds(690, 340, 300, 50);
		t2.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		t2.setForeground(Color.decode("#2E8B57"));
		f.add(t2);
		
		JLabel l4=new JLabel("Email");
		l4.setBounds(440, 420, 300, 100);
		l4.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		l4.setForeground(Color.decode("#2E8B57"));
		f.add(l4);
		
		t3=new JTextField();
		t3.setBounds(690, 440, 300, 50);
		t3.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		t3.setForeground(Color.decode("#2E8B57"));
		f.add(t3);
		
		b=new JButton("Register");
		b.setBounds(540, 550, 300, 50);
		b.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		b.setForeground(Color.decode("#2E8B57"));
		f.add(b);
		b.addActionListener(this);
	}

	public static void main(String[] args) 
	{
		Register r=new Register();
		r.fun();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			String s=t.getText();
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			if(s.isEmpty() ||s1.isEmpty()|| s2.isEmpty() ||s3.isEmpty())
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
					String Query="insert into login values(?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(Query);
					ps.setString(1, s);
					ps.setString(2, s1);
					ps.setString(3, s2);
					ps.setString(4, s3);
					ps.execute();
					JOptionPane.showMessageDialog(b, "Register success");
					Login l=new Login();
					l.demo();
					f.setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		}
		
	}

}
