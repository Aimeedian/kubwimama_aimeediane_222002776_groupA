package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.function.Supplier;
import java.awt.event.ActionEvent;

public class allform {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allform window = new allform();
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
	public allform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 28));
		frame.getContentPane().setBackground(new Color(69, 69, 69));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ALL FORMS IN SYSTEM ");
		lblNewLabel.setBounds(80, 28, 540, 43);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnproducts = new JButton("employee");
		btnproducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employeeform1 pro=new Employeeform1();
				pro.frame.setVisible(true);
				frame.dispose();
			
			}
		});
		btnproducts.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnproducts.setBounds(78, 129, 206, 68);
		frame.getContentPane().add(btnproducts);
		
		JButton btnemployee = new JButton("attendance");
		btnemployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendanceForm emp=new AttendanceForm();
				emp.setVisible(true);
				frame.dispose();
			}
		});
		btnemployee.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnemployee.setBounds(78, 257, 206, 63);
		frame.getContentPane().add(btnemployee);
		
		JButton btnsupplier = new JButton("holiday");
		btnsupplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				holiday sup=new holiday();
				sup.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnsupplier.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnsupplier.setBounds(323, 129, 281, 68);
		frame.getContentPane().add(btnsupplier);
		
		JButton btncustomerorders = new JButton("permission");
		btncustomerorders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PermissionForm cst=new PermissionForm();
				cst.frame.setVisible(true);
				frame.dispose();
			}
		});
		btncustomerorders.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btncustomerorders.setBounds(323, 257, 281, 63);
		frame.getContentPane().add(btncustomerorders);
		
		JButton btnstocks = new JButton("notification");
		btnstocks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NotificationForm stock=new NotificationForm();
				stock.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnstocks.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnstocks.setBounds(78, 374, 206, 63);
		frame.getContentPane().add(btnstocks);
		
		JButton btnpayments = new JButton("back");
		btnpayments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allform emp=new allform();
				emp.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnpayments.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnpayments.setBounds(323, 374, 281, 63);
		frame.getContentPane().add(btnpayments);
		frame.setBounds(100, 100, 690, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
