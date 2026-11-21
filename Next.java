package morninng;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Next implements ActionListener {
	JButton b;
	JFrame f;
	Next()
	{
		f=new JFrame("My Project");
		f.setSize(1600, 900);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.decode("#D2691E"));
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\w1.png")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Welcome to my Page....");
		l.setBounds(540, 20, 500, 100);
		l.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		l.setForeground(Color.white);
		f.add(l);
		
		JRadioButton rb=new JRadioButton("Male");
		rb.setBounds(100, 120, 200, 50);
		rb.setBackground(Color.decode("#D2691E"));
		rb.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		rb.setForeground(Color.white);
		f.add(rb);
		
		JRadioButton rb1=new JRadioButton("Female");
		rb1.setBounds(300, 120, 200, 50);
		rb1.setBackground(Color.decode("#D2691E"));
		rb1.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		rb1.setForeground(Color.white);
		f.add(rb1);
		
		ButtonGroup bb=new ButtonGroup();
		bb.add(rb);
		bb.add(rb1);
		
		JCheckBox ck=new JCheckBox("I am not Robot");
		ck.setBounds(100, 220, 350, 50);
		ck.setBackground(Color.decode("#D2691E"));
		ck.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		ck.setForeground(Color.white);
		f.add(ck);
		
		String a[]= {"Select","CSE","ECE","EEE","BE mech"};
		JComboBox cb=new JComboBox(a);
		cb.setBounds(100, 320, 200, 50);
		cb.setBackground(Color.decode("#D2691E"));
		cb.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		cb.setForeground(Color.white);
		f.add(cb);
		
		String course[]= {"Java","C++","C","Python","Web designing"};
		JList ll=new JList(course);
		ll.setBounds(100, 420, 250, 350);
		ll.setSelectedIndex(0);
		ll.setBackground(Color.decode("#D2691E"));
		ll.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		ll.setForeground(Color.white);
		f.add(ll);
		
		JTextArea tt=new JTextArea();
		tt.setBounds(500, 120, 250, 350);
		tt.setSize(500, 300);
		tt.setLineWrap(true);
		tt.setBackground(Color.white);
		tt.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
//		tt.setForeground(Color.white);
		f.add(tt);
		
		b=new JButton("Log out");
		b.setBounds(540, 560, 300, 50);
		b.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
		b.setForeground(Color.decode("#2E8B57"));
		f.add(b);
		b.addActionListener(this);
	}

	public static void main(String[] args)
	{
		new Next();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			JOptionPane.showMessageDialog(b, "You are logged out");
			Login l=new Login();
			l.demo();
			f.setVisible(false);
		}
	}

}
