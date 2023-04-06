package ja;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class exercice2 extends JFrame{
	JPanel pa=new JPanel();
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4 =new JPanel();
	JPanel p5=new JPanel();
	JLabel n=new JLabel("nom");
	JTextField nf=new JTextField();
	JLabel p=new JLabel("prenom");
	JTextField pf=new JTextField();
	JLabel a=new JLabel("adresse");
	JTextArea aa=new JTextArea("");	
	JLabel s=new JLabel("sexe:");
	JRadioButton h=new JRadioButton("homme");
	JRadioButton f=new JRadioButton("femme");
	ButtonGroup gb=new ButtonGroup();
	JCheckBox ch1=new JCheckBox("aa");
	JCheckBox ch2=new JCheckBox("bb");
	JCheckBox ch3=new JCheckBox("cc");
	JCheckBox ch4=new JCheckBox("dd");
	JCheckBox ch5=new JCheckBox("aa");
	JCheckBox ch6=new JCheckBox("bb");
	JCheckBox ch7=new JCheckBox("cc");
	JCheckBox ch8=new JCheckBox("dd");
	JCheckBox ch9=new JCheckBox("aa");
	JButton b1=new JButton("ok");
	JButton b2=new JButton("annuler");
	
	exercice2(){
		p1.setLayout(new GridLayout(5,1));
		p4.setLayout(new GridLayout(9,1));
		//p3.setLayout(new GridLayout(1,3));
		p2.setLayout(new GridLayout(1,1));
		pa.setLayout(new BorderLayout());
		pa.setBorder(BorderFactory.createEtchedBorder());
		p4.setBorder(BorderFactory.createLineBorder(Color.red,3));
		gb.add(h);
		gb.add(f);
		p1.add(n);
		p1.add(nf);
		p1.add(p);
		p1.add(pf);
		p1.add(a);
		p2.add(aa);
		p3.add(s);
		p3.add(h);
		p3.add(f);
		p4.add(ch1);
		p4.add(ch2);
		p4.add(ch3);
		p4.add(ch4);
		p4.add(ch5);
		p4.add(ch6);
		p4.add(ch7);
		p4.add(ch8);
		p4.add(ch9);
		p5.add(b1);
		p5.add(b2);
		pa.add(p1,BorderLayout.NORTH);
		pa.add(p2,BorderLayout.CENTER);
		pa.add(p3,BorderLayout.SOUTH);
		
		this.add(pa,BorderLayout.CENTER);
		this.add(p4,BorderLayout.EAST);
		this.add(p5,BorderLayout.SOUTH);
		this.setTitle("Exercice2");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		this.setLocationRelativeTo(null);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
	new exercice2();
		

	}

}
