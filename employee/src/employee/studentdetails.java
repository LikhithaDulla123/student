package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.awt.event.ActionEvent;

public class studentdetails {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdetails window = new studentdetails();
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
	public studentdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT DETAILS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(176, 11, 140, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(112, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setBounds(112, 101, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH");
		lblNewLabel_4.setBounds(112, 150, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(243, 55, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(243, 98, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tb1.getText();
				String name=tb2.getText();
				String branch=(String)cbl.getSelectedItem();
				String marks=tb3.getText();
				int m=Integer.parseInt(marks);
				try
				{
					java.sql.connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrec","root","mrec");
					String q="insert into students values('"+id+"','"+name+"','"+branch+"','"+result+"')";
					Statement stn=con.CreateStatement();
					stn.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "Inserted sucessfully");
					}
				catch(SQLException e)
				{
				e1.printStackTrace();
				}
            
				btnNewButton.setBounds(147, 238, 89, 23);
				frame.getContentPane().add(btnNewButton);
				
				JLabel lblNewLabel_5 = new JLabel("MARKS");
				lblNewLabel_5.setBounds(112, 197, 46, 14);
				frame.getContentPane().add(lblNewLabel_5);
				
				tb3 = new JTextField();
				tb3.setBounds(243, 194, 86, 20);
				frame.getContentPane().add(tb3);
				tb3.setColumns(10);
				
				JComboBox cb1 = new JComboBox();
				cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "DS", "ECE", "IOT", "ECE"}));
				cb1.setBounds(243, 146, 92, 22);
				frame.getContentPane().add(cb1);
				
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setForeground(new Color(255, 128, 192));
				lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\student.jpg"));
				lblNewLabel.setBounds(0, 0, 434, 261);
				frame.getContentPane().add(lblNewLabel);
		 
	        }
		  
		 );
		

}
}
