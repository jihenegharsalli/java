package ja;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class calculatrice extends JFrame implements ActionListener {
	JLabel a=new JLabel("donner a:");
	JLabel b=new JLabel("donner b:");
	JLabel resultat=new JLabel("resultat:");
	JTextField af=new JTextField(13);
	JTextField bf=new JTextField(13);
	JTextField res=new JTextField(13);
	JButton addi=new JButton("addition");
	JButton sous=new JButton("sous");
	JButton div=new JButton("div");
	JButton mul=new JButton("mul");
	JPanel p1=new JPanel(new GridLayout(3,2));
	JPanel p2=new JPanel(new GridLayout(2,2,5,5));
	
	
	
	    public calculatrice() {
	    res.setEditable(false);
	    this.setLayout(new GridLayout(2,1));
	    p1.add(a);
	    p1.add(af);
	    p1.add(b);
	    p1.add(bf);
	    p1.add(resultat);
	    p1.add(res);
	    p2.add(addi);
	    p2.add(sous);
	    p2.add(div);
	    p2.add(mul);
	    this.add(p1);
	    this.add(p2);
	    addi.addActionListener(this);
	    sous.addActionListener(this);
	    div.addActionListener(this);
	    mul.addActionListener(this);
	    resultat.setForeground(Color.BLUE);
	    res.setBorder(BorderFactory.createLineBorder(Color.black,2));
	    	
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.pack();
	    this.setVisible(true);
	    }
	   
	public static void main(String[] args) {
	new calculatrice();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			JButton button=(JButton) e.getSource();
			if(button==addi) {
				res.setText(String.valueOf(Double.parseDouble(af.getText())+(Double.parseDouble(bf.getText()))));
			}
			else if(button==sous) {
				res.setText(String.valueOf(Double.parseDouble(af.getText())-(Double.parseDouble(bf.getText()))));
			}
			else if(button==mul) {
				res.setText(String.valueOf(Double.parseDouble(af.getText())*(Double.parseDouble(bf.getText()))));
			}
			else {
				
				if((Double.parseDouble(bf.getText()))==0) {
					JOptionPane.showMessageDialog(this, "division par zero","Erreur",JOptionPane.ERROR_MESSAGE);
				}
				else {
					res.setText(String.valueOf(Double.parseDouble(af.getText())/(Double.parseDouble(bf.getText()))));
				}}
			
			
		}catch (NumberFormatException ef){
	           JOptionPane.showMessageDialog(this,"erreur de saisie "+ef.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
		
			
	}}}
	
