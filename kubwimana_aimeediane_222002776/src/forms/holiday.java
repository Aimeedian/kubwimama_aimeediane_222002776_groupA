package forms;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;

public class holiday {

	JFrame frame;
	private JTextField utxf;
	private JTextField fntxf;
	private JTextField lntxf;
	private JTextField ptxf;
	private JTextField emtxf;
	private JTextField adtxf;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					holiday window = new holiday();
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
	public holiday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.setBounds(100, 100, 1018, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLY FOR HOLIDAY");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(198, 24, 186, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel idlb = new JLabel("ID");
		idlb.setFont(new Font("Sylfaen", Font.BOLD, 21));
		idlb.setBounds(21, 93, 50, 39);
		frame.getContentPane().add(idlb);
		
		utxf = new JTextField();
		utxf.setBounds(175, 94, 274, 32);
		frame.getContentPane().add(utxf);
		utxf.setColumns(10);
		
		JLabel emplb = new JLabel("EMPLOYEENAME");
		emplb.setFont(new Font("Sylfaen", Font.BOLD, 19));
		emplb.setBounds(0, 146, 193, 39);
		frame.getContentPane().add(emplb);
		
		fntxf = new JTextField();
		fntxf.setColumns(10);
		fntxf.setBounds(175, 147, 274, 32);
		frame.getContentPane().add(fntxf);
		
		JLabel lblHolidaytype = new JLabel("HOLIDAYTYPE");
		lblHolidaytype.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblHolidaytype.setBounds(0, 208, 193, 39);
		frame.getContentPane().add(lblHolidaytype);
		
		lntxf = new JTextField();
		lntxf.setColumns(10);
		lntxf.setBounds(175, 212, 274, 32);
		frame.getContentPane().add(lntxf);
		
		JLabel lblStartdate = new JLabel("STARTDATE");
		lblStartdate.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblStartdate.setBounds(0, 268, 193, 39);
		frame.getContentPane().add(lblStartdate);
		
		ptxf = new JTextField();
		ptxf.setColumns(10);
		ptxf.setBounds(175, 272, 274, 32);
		frame.getContentPane().add(ptxf);
		
		JLabel lblEnddate = new JLabel("ENDDATE");
		lblEnddate.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblEnddate.setBounds(0, 329, 193, 39);
		frame.getContentPane().add(lblEnddate);
		
		emtxf = new JTextField();
		emtxf.setColumns(10);
		emtxf.setBounds(175, 333, 274, 32);
		frame.getContentPane().add(emtxf);
		
		JLabel lblDocument = new JLabel("DOCUMENT");
		lblDocument.setFont(new Font("Sylfaen", Font.BOLD, 19));
		lblDocument.setBounds(0, 371, 193, 39);
		frame.getContentPane().add(lblDocument);
		
		adtxf = new JTextField();
		adtxf.setColumns(10);
		adtxf.setBounds(175, 375, 274, 32);
		frame.getContentPane().add(adtxf);
		
		JButton btnView = new JButton("view");
		btnView.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
						Statement stm=con.createStatement();
						String query="Select * from holiday";
						ResultSet rs =stm.executeQuery(query);
						java.sql.ResultSetMetaData rsmd= rs.getMetaData();
						DefaultTableModel model=(DefaultTableModel) table.getModel();
						int cols=rsmd.getColumnCount();
						String[] colName=new String[cols];
						for(int i=0; i<cols; i++)
							colName[i]=rsmd.getColumnName(i+1);
						model.setColumnIdentifiers(colName);
						String id,employee_name,holidaytype,startdate,enddate,document;
						while(rs.next()) {
							id=rs.getString(1);
							employee_name=rs.getString(2);
							holidaytype=rs.getString(3);
							startdate=rs.getString(4);
							enddate=rs.getString(5);
							document=rs.getString(6);
							String[] row= {id,employee_name,holidaytype,startdate,enddate,document};
							model.addRow(row);
						}
						stm.close();
						con.close();
					} catch (Exception e2) {
						System.out.println(e2.getMessage());
					}

					
				}
			});
		btnView.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnView.setBounds(148, 421, 114, 47);
		frame.getContentPane().add(btnView);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");	
						Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
						String query="DELETE FROM holiday WHERE id=?";
						 int utxf=Integer.parseInt(JOptionPane.showInputDialog("enter id to delete"));
						PreparedStatement pStatement=connection.prepareStatement(query);
						pStatement.setInt(1,utxf);
						JOptionPane.showMessageDialog(btnDelete, "delete successfully");
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
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDelete.setBounds(365, 421, 114, 47);
		frame.getContentPane().add(btnDelete);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");	
						Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
						String query="UPDATE holiday SET employee_name=?,holidaytype=?,startdate=?,enddate=?,document=? WHERE id=?";
						PreparedStatement pStatement=connection.prepareStatement(query);
						pStatement.setString(1, fntxf.getText());
						pStatement.setString(2, lntxf.getText());
						pStatement.setString(3, ptxf.getText());
						pStatement.setString(4, emtxf.getText());
						pStatement.setString(5, adtxf.getText());
						pStatement.setInt(6,Integer.parseInt(utxf.getText()));
						pStatement.executeUpdate();
						JOptionPane.showMessageDialog(btnUpdate, " data changed well");
						pStatement.close();
						connection.close();	
					} 
				catch (Exception e2) {
						System.out.println(e2.getMessage());
					}
					
				}
			});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnUpdate.setBounds(530, 421, 114, 47);
		frame.getContentPane().add(btnUpdate);
		
		table = new JTable();
		table.setBounds(501, 24, 493, 280);
		frame.getContentPane().add(table);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allform emp=new allform();
				emp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBack.setBounds(734, 421, 114, 47);
		frame.getContentPane().add(btnBack);
	}
}
