package forms;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class userform1 {

	private JFrame frmUserinterface;
	protected Window frmLoginForm;
	protected Object frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userform1 window = new userform1();
					window.frmUserinterface.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public userform1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUserinterface = new JFrame();
		frmUserinterface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\michel.jpg"));
		frmUserinterface.setTitle("USERINTERFACE");
		frmUserinterface.setBounds(100, 100, 582, 360);
		frmUserinterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUserinterface.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("MAKE ATTEND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AttendanceForm login= new AttendanceForm();
	             login.setVisible(true);
	             frmLoginForm.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(32, 75, 191, 33);
		frmUserinterface.getContentPane().add(btnNewButton);
		
		JButton btnApplyForPermission = new JButton("APPLY FOR LEAVE");
		btnApplyForPermission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					PermissionForm login= new PermissionForm();
		             login.setVisible(true);
		             frmLoginForm.dispose();
			}
		});
		btnApplyForPermission.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnApplyForPermission.setBounds(32, 163, 235, 52);
		frmUserinterface.getContentPane().add(btnApplyForPermission);
		
		JButton btnApplyForHoliday = new JButton("APPLY FOR HOLIDAY");
		btnApplyForHoliday.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					HolidayForm login= new HolidayForm();
		             login.setVisible(true);
		             frmLoginForm.dispose();
			}
		});
		btnApplyForHoliday.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnApplyForHoliday.setBounds(284, 75, 262, 33);
		frmUserinterface.getContentPane().add(btnApplyForHoliday);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					userform1 login= new userform1();
		             login.setVisible(true);
		             frmLoginForm.dispose();
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(316, 163, 191, 33);
		frmUserinterface.getContentPane().add(btnBack);
	}

	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
