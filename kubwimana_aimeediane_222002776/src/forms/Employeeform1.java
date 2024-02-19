package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Employeeform1 {

	JFrame frame;
	private JTextField utxf;
	private JLabel fnlb;
	private JTextField fntxf;
	private JLabel lnlb;
	private JTextField lntxf;
	private JLabel plb;
	private JTextField ptxf;
	private JLabel ulb_4;
	private JTextField emtxf;
	private JLabel ulb_5;
	private JTextField adtxf;
	private JLabel ulb_6;
	private JTextField stxf;
	private JButton sendbtn;
	private JButton readbtn;
	private JButton updatebtn;
	private JButton conbtn;
	private JButton deletebtn;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employeeform1 window = new Employeeform1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Employeeform1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 1154, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLOYEE FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(185, 0, 343, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel ulb = new JLabel("EMPLOYEE_CODE");
		ulb.setFont(new Font("Tahoma", Font.BOLD, 19));
		ulb.setBounds(10, 43, 203, 32);
		frame.getContentPane().add(ulb);
		
		utxf = new JTextField();
		utxf.setBounds(209, 43, 272, 32);
		frame.getContentPane().add(utxf);
		utxf.setColumns(10);
		
		fnlb = new JLabel("FIRSTNAME");
		fnlb.setFont(new Font("Tahoma", Font.BOLD, 19));
		fnlb.setBounds(10, 82, 203, 32);
		frame.getContentPane().add(fnlb);
		
		fntxf = new JTextField();
		fntxf.setColumns(10);
		fntxf.setBounds(209, 82, 272, 32);
		frame.getContentPane().add(fntxf);
		
		lnlb = new JLabel("LASTNAME");
		lnlb.setFont(new Font("Tahoma", Font.BOLD, 19));
		lnlb.setBounds(10, 121, 203, 32);
		frame.getContentPane().add(lnlb);
		
		lntxf = new JTextField();
		lntxf.setColumns(10);
		lntxf.setBounds(209, 121, 272, 32);
		frame.getContentPane().add(lntxf);
		
		plb = new JLabel("PHONE");
		plb.setFont(new Font("Tahoma", Font.BOLD, 19));
		plb.setBounds(10, 164, 203, 32);
		frame.getContentPane().add(plb);
		
		ptxf = new JTextField();
		ptxf.setColumns(10);
		ptxf.setBounds(209, 164, 272, 32);
		frame.getContentPane().add(ptxf);
		
		ulb_4 = new JLabel("EMAIL");
		ulb_4.setFont(new Font("Tahoma", Font.BOLD, 19));
		ulb_4.setBounds(10, 207, 203, 32);
		frame.getContentPane().add(ulb_4);
		
		emtxf = new JTextField();
		emtxf.setColumns(10);
		emtxf.setBounds(209, 207, 272, 32);
		frame.getContentPane().add(emtxf);
		
		ulb_5 = new JLabel("ADDRESS");
		ulb_5.setFont(new Font("Tahoma", Font.BOLD, 19));
		ulb_5.setBounds(10, 250, 203, 32);
		frame.getContentPane().add(ulb_5);
		
		adtxf = new JTextField();
		adtxf.setColumns(10);
		adtxf.setBounds(209, 250, 272, 32);
		frame.getContentPane().add(adtxf);
		
		ulb_6 = new JLabel("STATUS");
		ulb_6.setFont(new Font("Tahoma", Font.BOLD, 19));
		ulb_6.setBounds(10, 293, 203, 32);
		frame.getContentPane().add(ulb_6);
		
		stxf = new JTextField();
		stxf.setColumns(10);
		stxf.setBounds(209, 293, 272, 32);
		frame.getContentPane().add(stxf);
		
		sendbtn = new JButton("send");
		sendbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendbtn.addActionListener(this);
				sendbtn.addActionListener(new ActionListener() {
					
					public void actionPerformed(java.awt.event.ActionEvent e) {
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");	
							Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
							String query="INSERT INTO employee() VALUES(?,?,?,?,?,?,?)";
							PreparedStatement pStatement=connection.prepareStatement(query);
							pStatement.setInt(1,Integer.parseInt(utxf.getText()));
							pStatement.setString(2, fntxf.getText());
							pStatement.setString(3, lntxf.getText());
							pStatement.setString(4, ptxf.getText());
							pStatement.setString(5, emtxf.getText());
							pStatement.setString(6, adtxf.getText());
							pStatement.setString(7, stxf.getText());
							pStatement.executeUpdate();
							JOptionPane.showMessageDialog(sendbtn, "data inserted well");
							pStatement.close();
							connection.close();	
						} 
					catch (Exception e2) {
							System.out.println(e2.getMessage());
						}
						
					}
				});
			}
		});
		sendbtn.setBackground(new Color(255, 255, 255));
		sendbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sendbtn.setBounds(209, 355, 95, 32);
		frame.getContentPane().add(sendbtn);
		
		readbtn = new JButton("read");
		readbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
							Statement stm=con.createStatement();
							String query="Select * from employee";
							ResultSet rs =stm.executeQuery(query);
							java.sql.ResultSetMetaData rsmd= rs.getMetaData();
							DefaultTableModel model=(DefaultTableModel) table.getModel();
							int cols=rsmd.getColumnCount();
							String[] colName=new String[cols];
							for(int i=0; i<cols; i++)
								colName[i]=rsmd.getColumnName(i+1);
							model.setColumnIdentifiers(colName);
							String employeecode,firstname,lastname,phone,email,address,status;
							while(rs.next()) {
								employeecode=rs.getString(1);
								firstname=rs.getString(2);
								lastname=rs.getString(3);
								phone=rs.getString(4);
								email=rs.getString(5);
								address=rs.getString(6);
								status=rs.getString(7);
								String[] row= {employeecode,firstname,lastname,phone,email,address,status};
								model.addRow(row);
							}
							stm.close();
							con.close();
						} catch (Exception e2) {
							System.out.println(e2.getMessage());
						}

						
					}
				});
				
				
			}
		});
		readbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		readbtn.setBackground(Color.BLUE);
		readbtn.setBounds(32, 398, 117, 32);
		frame.getContentPane().add(readbtn);
		
		updatebtn = new JButton("update");
		updatebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
					String query="UPDATE employee SET firstname=?,lastname=?,phone=?,email=?,address=?,status=? WHERE employee_code=?";
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setString(1, fntxf.getText());
					pStatement.setString(2, lntxf.getText());
					pStatement.setString(3, ptxf.getText());
					pStatement.setString(4, emtxf.getText());
					pStatement.setString(5, adtxf.getText());
					pStatement.setString(6, stxf.getText());
					pStatement.setInt(7,Integer.parseInt(utxf.getText()));
					pStatement.executeUpdate();
					JOptionPane.showMessageDialog(updatebtn, " data changed well");
					pStatement.close();
					connection.close();	
				} 
			catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
		updatebtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		updatebtn.setBackground(new Color(255, 255, 255));
		updatebtn.setBounds(32, 355, 117, 32);
		frame.getContentPane().add(updatebtn);
		
		conbtn = new JButton("cancel");
		conbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				utxf.setText("");
				fntxf.setText("");
				lntxf.setText("");
				ptxf.setText("");
				emtxf.setText("");
				adtxf.setText("");
				stxf.setText("");
			}
			
			
		});
		conbtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		conbtn.setBackground(new Color(128, 0, 255));
		conbtn.setBounds(209, 398, 95, 32);
		frame.getContentPane().add(conbtn);
		
		deletebtn = new JButton("delete");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
					String query="DELETE FROM employee WHERE employee_code=?";
					 int utxf=Integer.parseInt(JOptionPane.showInputDialog("enter id to delete"));
					PreparedStatement pStatement=connection.prepareStatement(query);
					pStatement.setInt(1,utxf);
					JOptionPane.showMessageDialog(deletebtn, "delete successfully");
					Component delete;
					pStatement.executeUpdate();
					pStatement.close();
					connection.close();	
				} 
			catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		});
		deletebtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		deletebtn.setBackground(new Color(255, 255, 255));
		deletebtn.setBounds(345, 355, 95, 32);
		frame.getContentPane().add(deletebtn);
		
		table = new JTable();
		table.setBounds(527, 30, 603, 320);
		frame.getContentPane().add(table);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allform emp=new allform();
				emp.frame.setVisible(true);
				frame.dispose();	
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(345, 398, 95, 32);
		frame.getContentPane().add(btnBack);
		
		JButton btnNewButton = new JButton("view_all_tables");
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allform all=new allform();
				all.frame.setVisible(true);
				frame. dispose();
			}
		});
		btnNewButton.setBounds(575, 383, 226, 47);
		frame.getContentPane().add(btnNewButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
