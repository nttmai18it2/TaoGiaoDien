package taogiaodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
    JLabel lblac ;
    JLabel lblpas ;
    JTextField tfac ; 
    JTextField tfpas ; 
    JButton btnDk ; 
    public GUI() {
    	lblac = new JLabel() ; 
    	lblac.setText(" User name ");
    	tfac  = new JTextField(20) ;
    	lblpas = new JLabel() ;
    	lblpas.setText(" Password ");
    	tfpas = new JTextField(20) ;
    	btnDk = new JButton(" Sign up ");
    	btnDk.addActionListener(this);  	
    	Container cont = this.getContentPane();
    	setSize(500, 500);
    	cont.setLayout(new FlowLayout());
    	cont.add(lblac);
    	cont.add(tfac);
    	cont.add(lblpas);
    	cont.add(tfpas);
    	cont.add(btnDk);
    	setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new GUI() ;
	}
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null,"");
	}

}
