

package forms;

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
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;

public class leaveform {

	private JFrame frmPermissionForm;
	private JTextField utxf;
	private JTextField fntxf;
	private JTextField lntxf;
	private JTextField ptxf;
	private JTextField emtxf;
	private JTextField adtxf;
	private JTextField stxf;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					leaveform window = new leaveform();
					window.frmPermissionForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public leaveform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPermissionForm = new JFrame();
		frmPermissionForm.getContentPane().setBackground(new Color(64, 128, 128));
		frmPermissionForm.setTitle("permission form");
		frmPermissionForm.setBounds(100, 100, 758, 455);
		frmPermissionForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPermissionForm.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("permission form");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		lblNewLabel.setBounds(198, 30, 235, 46);
		frmPermissionForm.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id:");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 87, 115, 19);
		frmPermissionForm.getContentPane().add(lblNewLabel_1);
		
		utxf = new JTextField();
		utxf.setBounds(253, 87, 209, 27);
		frmPermissionForm.getContentPane().add(utxf);
		utxf.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("employeename");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(0, 125, 158, 19);
		frmPermissionForm.getContentPane().add(lblNewLabel_1_1);
		
		fntxf = new JTextField();
		fntxf.setColumns(10);
		fntxf.setBounds(253, 125, 209, 27);
		frmPermissionForm.getContentPane().add(fntxf);
		
		JLabel lblNewLabel_1_2 = new JLabel("reason for permission");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(0, 175, 243, 19);
		frmPermissionForm.getContentPane().add(lblNewLabel_1_2);
		
		lntxf = new JTextField();
		lntxf.setColumns(10);
		lntxf.setBounds(253, 167, 209, 27);
		frmPermissionForm.getContentPane().add(lntxf);
		
		JLabel lblNewLabel_1_3 = new JLabel("date");
		lblNewLabel_1_3.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(0, 216, 115, 19);
		frmPermissionForm.getContentPane().add(lblNewLabel_1_3);
		
		ptxf = new JTextField();
		ptxf.setColumns(10);
		ptxf.setBounds(253, 205, 209, 27);
		frmPermissionForm.getContentPane().add(ptxf);
		
		JLabel lblNewLabel_1_4 = new JLabel("startdate");
		lblNewLabel_1_4.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(0, 249, 115, 19);
		frmPermissionForm.getContentPane().add(lblNewLabel_1_4);
		
		emtxf = new JTextField();
		emtxf.setColumns(10);
		emtxf.setBounds(253, 243, 209, 27);
		frmPermissionForm.getContentPane().add(emtxf);
		
		JLabel lblNewLabel_1_5 = new JLabel("enddate");
		lblNewLabel_1_5.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(0, 281, 115, 19);
		frmPermissionForm.getContentPane().add(lblNewLabel_1_5);
		
		adtxf = new JTextField();
		adtxf.setColumns(10);
		adtxf.setBounds(253, 281, 209, 27);
		frmPermissionForm.getContentPane().add(adtxf);
		
		JLabel lblNewLabel_1_6 = new JLabel("leavetype");
		lblNewLabel_1_6.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(10, 318, 115, 19);
		frmPermissionForm.getContentPane().add(lblNewLabel_1_6);
		
		stxf = new JTextField();
		stxf.setColumns(10);
		stxf.setBounds(253, 319, 209, 27);
		frmPermissionForm.getContentPane().add(stxf);
		
		JButton btnNewButton = new JButton("view");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
					Statement stm=con.createStatement();
					String query="Select * from permision";
					ResultSet rs =stm.executeQuery(query);
					java.sql.ResultSetMetaData rsmd= rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int cols=rsmd.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0; i<cols; i++)
						colName[i]=rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String id,employee_name,reason_for_leave,date,time_for_leave,time_for_back,reason_type;
					while(rs.next()) {
						id=rs.getString(1);
						employee_name=rs.getString(2);
						reason_for_leave=rs.getString(3);
						date=rs.getString(4);
						time_for_leave=rs.getString(5);
						time_for_back=rs.getString(6);
						reason_type=rs.getString(6);
						String[] row= {id,employee_name,reason_for_leave,date,time_for_leave,time_for_back,reason_type};
						model.addRow(row);
					}
					stm.close();
					con.close();
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}

				
			
			}
		});
		btnNewButton.setFont(new Font("Stencil", Font.BOLD, 19));
		btnNewButton.setBounds(20, 384, 89, 23);
		frmPermissionForm.getContentPane().add(btnNewButton);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setFont(new Font("Stencil", Font.BOLD, 19));
		btnUpdate.setBounds(175, 384, 124, 23);
		frmPermissionForm.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");	
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/aimeediane_kubwimana_eams","222002776","222002776");
					String query="DELETE FROM permision WHERE id=?";
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
		btnDelete.setFont(new Font("Stencil", Font.BOLD, 19));
		btnDelete.setBounds(339, 384, 105, 23);
		frmPermissionForm.getContentPane().add(btnDelete);
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allform emp=new allform();
				emp.frame.setVisible(true);
				frmPermissionForm.dispose();
			}
		});
		btnBack.setFont(new Font("Stencil", Font.BOLD, 19));
		btnBack.setBounds(482, 384, 89, 23);
		frmPermissionForm.getContentPane().add(btnBack);
		
		table = new JTable();
		table.setBounds(472, 11, 272, 237);
		frmPermissionForm.getContentPane().add(table);
	}
}
