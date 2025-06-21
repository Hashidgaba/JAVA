package Forms;
import java.io.*;
import java.util.Scanner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextArea;

 class User_information extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField t;
	private JTextArea t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new File("SwingFiles").mkdirs();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_information frame = new User_information();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User_information() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t = new JTextField();
		t.setBounds(152, 58, 149, 20);
		contentPane.add(t);
		t.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("File Name");
		lblNewLabel.setBounds(62, 61, 80, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		t1 = new JTextArea();
		t1.setLineWrap(true);
		t1.setWrapStyleWord(true);
		t1.setBounds(152, 95, 206, 184);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter");
		lblNewLabel_1.setBounds(62, 95, 64, 20);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Create\r\n");
		btnNewButton.setBounds(62, 326, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        String name=t.getText();
			        File file=new File("SwingFiles/" + name + ".txt");
			        if (file.createNewFile()) 
			        	JOptionPane.showMessageDialog(null, "File created.");
			        else 
			        	JOptionPane.showMessageDialog(null, "File already exists.");
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			    }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Write\r\n");
		btnNewButton_1.setBounds(176, 326, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        String name=t.getText();
			        String content=t1.getText();
			        FileWriter fw=new FileWriter("SwingFiles/" + name + ".txt");
			        fw.write(content);
			        fw.close();
			        JOptionPane.showMessageDialog(null, "Content written to file.");
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			    }
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Read");
		btnNewButton_2.setBounds(300, 326, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        String name =t.getText();
			        File file=new File("SwingFiles/" + name + ".txt");
			        Scanner sc=new Scanner(file);
			        String content = "";
			        while (sc.hasNextLine()) 
			        {
			            content += sc.nextLine() + "\n";
			        }
			        sc.close();
			        t1.setText(content.trim());
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			    }
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Update");
		btnNewButton_3.setBounds(118, 360, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        String name =t.getText();
			        String content =t1.getText();
			        File file = new File("SwingFiles/" + name + ".txt");
			        if (file.exists()) {
			            FileWriter fw=new FileWriter(file, true);
			            fw.write("\n"+content);
			            fw.close();
			            JOptionPane.showMessageDialog(null, "File updated.");
			        } else {
			            JOptionPane.showMessageDialog(null, "File not found.");
			        }
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			    }
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Delete");
		btnNewButton_4.setBounds(247, 360, 89, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        String name=t.getText();
			        File file=new File("SwingFiles/" +name+ ".txt");
			        if (file.delete()) 
			        	JOptionPane.showMessageDialog(null, "File deleted.");
			        else 
			        	JOptionPane.showMessageDialog(null, "File not found or can't be deleted.");
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
			    }
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton_4);
		
		JTextPane txtpnFileHandling = new JTextPane();
		txtpnFileHandling.setBounds(135, 10, 166, 38);
		txtpnFileHandling.setEnabled(false);
		txtpnFileHandling.setBackground(SystemColor.menu);
		txtpnFileHandling.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		txtpnFileHandling.setText("       File Handling");
		txtpnFileHandling.setEditable(false);
		contentPane.add(txtpnFileHandling);
	}
}