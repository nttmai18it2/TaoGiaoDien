package taogiaodien;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tinhgiaithua extends JFrame {
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblKQ;
	JTextField tfKQ;
	JButton btnTinhGT;
	JButton btnTinhCan;
	public tinhgiaithua() {
		lblSoN = new JLabel();
		lblSoN.setText(" Số N ");
		tfSoN  = new JTextField(15);
		lblKQ = new JLabel();
		lblKQ.setText(" Kết Quả ");
		tfKQ = new JTextField(15);
		btnTinhGT = new JButton();
		btnTinhGT.setText(" Tính GT ");
		btnTinhGT.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String soN = tfSoN.getText();
				int n = Integer.parseInt(soN);
				int tich=1;
				for(int i=2;i<=n;i++) {
					tich=tich*i;
				}
				tfKQ.setText(String.valueOf(tich));
			}
		});
		btnTinhCan = new JButton();
		btnTinhCan.setText(" Tính Căn ");
		btnTinhCan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String soN = tfSoN.getText();
				int n = Integer.parseInt(soN);
				double tong=0;
				for(int i=1;i<=n;i++) {
					tong=tong+Math.sqrt(i);
				}
				tfKQ.setText(String.valueOf(tong));
			}
		});
		Container cont=this.getContentPane();
		setSize(500,300);
		cont.setLayout(new FlowLayout());
		cont.add(lblSoN);
		cont.add(tfSoN);
		cont.add(lblKQ);
		cont.add(tfKQ);
		cont.add(btnTinhGT);
		cont.add(btnTinhCan);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tinhgiaithua obj = new tinhgiaithua();
	}

}