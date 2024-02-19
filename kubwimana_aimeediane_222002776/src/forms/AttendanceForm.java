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

public class AttendanceForm implements ActionListener {

	JFrame frame;
	JLabel ulb=new JLabel("ID:");
	JLabel fnlb=new JLabel("EMPLOYEE_CODE:");
	JLabel lnlb=new JLabel("DATE:");
	JLabel plb=new JLabel("TIME_IN:");
	JLabel emlb=new JLabel("TIME_OUT:");
	JLabel adlb=new JLabel("WORKEDHOURS:");
	JTextField utxf=new JTextField();
	JTextField fntxf=new JTextField();
	JTextField lntxf=new JTextField();
	JTextField ptxf=new JTextField();
	JTextField emtxf=new JTextField();
	JTextField adtxf=new JTextField();
	JButton sendbtn=new JButton("ATTEND");
	JButton conbtn=new JButton("CANCEL");
	JButton cobtn=new JButton("more_option");
	AttendanceForm(){
		createwindow();
	}
	private void createwindow() {
		frame=new JFrame();
		frame.setTitle("ATTENDANCE FORM");
		frame.setBounds(10,10, 500, 450);
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
	adlb.setBounds(10, 260, 200, 30);
	utxf.setBounds(200, 10, 200, 30);
	fntxf.setBounds(200, 60, 200, 30);
	lntxf.setBounds(200, 110, 200, 30);
	ptxf.setBounds(200, 160, 200, 30);
	emtxf.setBounds(200, 210, 200, 30);
	adtxf.setBounds(200, 260, 200, 30);
     sendbtn.setBounds(50, 360,90, 40);
     conbtn.setBounds(150, 360, 90, 40);
     cobtn.setBounds(250, 360, 90, 40);
     addcomponent();
     
	}
	private void addcomponent() {
		frame.add(ulb);
		frame.add(fnlb);
		frame.add(lnlb);
		frame.add(plb);
		frame.add(emlb);
		frame.add(adlb);
		frame.add(utxf);
		frame.add(fntxf);
		frame.add(lntxf);
		frame.add(ptxf);
		frame.add(emtxf);
		frame.add(adtxf);
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
					String query="INSERT INTO attendance VALUES(?,?,?,?,?,?)";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setInt(1,Integer.parseInt(utxf.getText()));
					pStatement.setInt(2,Integer.parseInt(fntxf.getText()));
					pStatement.setString(3, lntxf.getText());
					pStatement.setString(4, ptxf.getText());
					pStatement.setString(5, emtxf.getText());
					pStatement.setString(6, adtxf.getText());
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
				adtxf.setText("");
				
			}
		});
		cobtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HolidayForm all=new HolidayForm();
				all.frame.setVisible(true);
				frame. dispose();
			}
		});
	}
	public static void main(String[] args) {
		AttendanceForm attend=new AttendanceForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
