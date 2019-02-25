import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Info extends JFrame  implements ActionListener
{

	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	JComboBox j1,j2;
	
		public Info()
		{
				setSize(600,600);
				setVisible(true);
				setLayout(null);	
				
				l=new JLabel("********STUDENT INFORMATION********");
				l.setBounds(10,5,250,20);
				add(l);
			
				l1=new JLabel("First Name :");
				l1.setBounds(10,50,80,20);
				add(l1);
				
				t1=new JTextField();
				t1.setBounds(110,50,200,30);
				add(t1);
				
				l2=new JLabel("Last Name :");
				l2.setBounds(10,100,80,20);
				add(l2);
				
				t2=new JTextField();
				t2.setBounds(110,100,200,30);
				add(t2);
				
				l3=new JLabel("Address :");
				l3.setBounds(10,150,80,20);
				add(l3);
				
				t3=new JTextField();
				t3.setBounds(110,150,200,30);
				add(t3);
				
				l4=new JLabel("Collage Name :");
				l4.setBounds(10,200,100,20);
				add(l4);
				
				t4=new JTextField();
				t4.setBounds(110,200,200,30);
				add(t4);
				
				l5=new JLabel("Branch ");
				l5.setBounds(10,250,100,20);
				add(l5);
				
				String count[]={"Mechanicle","Electricle","Computer Science","E&TC","Civil"};
				j1=new JComboBox(count);
				j1.setBounds(110,250,200,25);
				add(j1);
				
				l6=new JLabel("Roll No :");
				l6.setBounds(10,300,80,20);
				add(l6);
				
				t5=new JTextField();
				t5.setBounds(110,300,200,30);
				add(t5);
				
				l7=new JLabel("Bach :");
				l7.setBounds(10,350,80,20);
				add(l7);
				
				String count1[]={"T1","T2","T3","T4"};
				j2=new JComboBox(count1);
				j2.setBounds(110,350,200,25);
				add(j2);
				
				b1=new JButton("SUBMIT");
				b1.setBounds(50,420,80,30);
				add(b1);
				
				b2=new JButton("Clear");
				b2.setBounds(150,420,80,30);
				add(b2);
				
				b1.addActionListener(this);
				b2.addActionListener(this);
				
				l8=new JLabel();
				l8.setBounds(30,450,300,30);
				add(l8);
				
				
				l9=new JLabel();
				l9.setBounds(30,480,300,30);
				add(l9);
				
				l10=new JLabel();
				l10.setBounds(30,510,300,30);
				add(l10);
				
				l11=new JLabel();
				l11.setBounds(30,540,300,30);
				add(l11);
				
				l12=new JLabel();
				l12.setBounds(30,570,300,30);
				add(l12);
				
				l13=new JLabel();
				l13.setBounds(30,600,300,30);
				add(l13);
				
				l14=new JLabel();
				l14.setBounds(30,480,300,30);
				add(l14);
				
				
	
		}
		public void actionPerformed(ActionEvent ae)
		{
			String str=ae.getActionCommand();
			String fname=t1.getText();
			String lname=t2.getText();
			String adr=t3.getText();
			String cname=t4.getText();
			String rll=t5.getText();
			String data=" ";
			String data1=" ";
					
			if(ae.getSource()==b1)
			{
				l8.setText("Student Name: "+fname+" "+lname);
				l9.setText("Address: "+adr);
				l10.setText("Collage Name: "+cname);
				data="Branch: "+j1.getItemAt(j1.getSelectedIndex());
				l11.setText(data);
				l12.setText("Roll No: "+rll);
				data1="Bach: "+j2.getItemAt(j2.getSelectedIndex());
				l13.setText(data1);
			}
			else
			{
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
				
				l8.setText(null);
				l9.setText(null);
				l10.setText(null);
				l11.setText(null);
				l12.setText(null);
				l13.setText(null);
			}
			
			repaint();
		}
		public static void main(String args[])
		{
				new Info();
		}
}