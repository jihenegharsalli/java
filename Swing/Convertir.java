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

public class Convertir extends JFrame implements ActionListener {
	JLabel a=new JLabel("donner montant:");
	JRadioButton b1=new JRadioButton("euro-->dinars");
	JRadioButton b2=new JRadioButton("dinars-->euros");
	JButton convertir=new JButton("convertir");
	JTextField t=new JTextField();
	JTextField res=new JTextField("Resultat:");
	JPanel p1=new JPanel();
	//JPanel p2=new JPanel();
	JPanel pa=new JPanel();
	//JPanel pb=new JPanel();
	ButtonGroup bg=new ButtonGroup();
	
	
	
	    public Convertir() {
	    res.setEditable(false);
	    convertir.addActionListener(this);
	    bg.add(b1);
	    bg.add(b2);
	    p1.add(b1);
	    p1.add(b2);
	    pa.add(a);
	    pa.add(t);
	    pa.add(p1);
	    pa.add(convertir);
	   
	    p1.setLayout(new GridLayout(2,1));
	    pa.setLayout(new GridLayout(2,2,10,10));
	    this.add(pa,BorderLayout.CENTER);
	    this.add(res,BorderLayout.SOUTH);
	    res.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));	
	    	
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.pack();
	    this.setVisible(true);
	    }
	   
	public static void main(String[] args) {
	new Convertir();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		Double m=Double.parseDouble(t.getText());
		if(b1.isSelected()) {
			res.setText(String.valueOf(m*3.38));
		}
		else if(b2.isSelected()) {
			res.setText(String.valueOf(m*0.30));
		}
		else {
			JOptionPane.showMessageDialog(this,"Veullez selectionner un choix","Attention",JOptionPane.ERROR_MESSAGE);
		}
		
		}catch (NumberFormatException ef){
	           JOptionPane.showMessageDialog(this,"erreur de saisie"+ef.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
		
			
	}}}

