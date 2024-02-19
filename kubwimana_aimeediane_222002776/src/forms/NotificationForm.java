package forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NotificationForm implements ActionListener {

	JFrame frame;
	JLabel ulb=new JLabel("ID:");
	JLabel fnlb=new JLabel("EMPLOYEE_name:");
	JLabel lnlb=new JLabel("TYPE:");
	JLabel plb=new JLabel("CONTENT:");
	JLabel emlb=new JLabel("STATUS:");
	JTextField utxf=new JTextField();
	JTextField fntxf=new JTextField();
	JTextField lntxf=new JTextField();
	JTextField ptxf=new JTextField();
	JTextField emtxf=new JTextField();
	JButton sendbtn=new JButton("ATTEND");
	JButton conbtn=new JButton("CANCEL");
	JButton cobtn=new JButton("BACK");
	NotificationForm(){
		createwindow();
	}
	private void createwindow() {
		frame=new JFrame();
		frame.setTitle("NOTIFICATION FORM");
		frame.setBounds(10,10, 500, 350);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		frame.setResizable(true);
		frame.setVisible(true);
		setsizeandlocation();
		
	}
	private void setsizeandlocation() {
	ulb.setBounds(10, 10, 200, 30);	
	fnlb.setBounds(10, 60, 200, 30);
	lnlb.setBounds(10, 110, 200, 30);
	plb.setBounds(10, 160, 200, 30);
	emlb.setBounds(10, 210, 200, 30);
	utxf.setBounds(200, 10, 200, 30);
	fntxf.setBounds(200, 60, 200, 30);
	lntxf.setBounds(200, 110, 200, 30);
	ptxf.setBounds(200, 160, 200, 30);
	emtxf.setBounds(200, 210, 200, 30);
     sendbtn.setBounds(50, 260,90, 40);
     conbtn.setBounds(150, 260, 90, 40);
     cobtn.setBounds(250, 260, 90, 40);
     addcomponent();
     
	}
	private void addcomponent() {
		frame.add(ulb);
		frame.add(fnlb);
		frame.add(lnlb);
		frame.add(plb);
		frame.add(emlb);
		frame.add(utxf);
		frame.add(fntxf);
		frame.add(lntxf);
		frame.add(ptxf);
		frame.add(emtxf);
        frame.add(sendbtn);
        frame.add(conbtn);
        frame.add(cobtn);
        ActionEvent();
	}
	private void ActionEvent() {
		sendbtn.addActionListener(this);
		sendbtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
					String query="INSERT INTO notification() VALUES(?,?,?,?,?)";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setInt(1,Integer.parseInt(utxf.getText()));

					pStatement.setString(2, fntxf.getText());
					pStatement.setString(3, lntxf.getText());
					pStatement.setString(4, ptxf.getText());
					pStatement.setString(5, emtxf.getText());
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(sendbtn, "data inserted well");
					pStatement.close();
					connection.close();	
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			}
		});	
		conbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utxf.setText("");
				fntxf.setText("");
				lntxf.setText("");
				ptxf.setText("");
				emtxf.setText("");
				
			}
		});
		cobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allform emp=new allform();
				emp.frame.setVisible(true);
				frame.dispose();
			}
		});
	}
	public static void main(String[] args) {
		NotificationForm not=new NotificationForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
