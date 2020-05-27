package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import components.Driving;

public class MainScreen extends JFrame {
	
	public static int numOfVehicle=25;
	public static int numOfJunction=11;


	private JPanel contentPane;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
		});
	}
	
	/** 
	 * Main JFrame 
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Background");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_1.setBackground(SystemColor.menu);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Blue");
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.blue);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("None");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.white);
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Vehicle color");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Blue");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Magenta");
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Orange");
		mntmNewMenuItem_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Random");
		mntmNewMenuItem_7.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_2.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Help");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(	contentPane, "Home Work 3 \nGUI @ Threads");

			}
		});
	
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		
		JPanel panel =menuPanel();
		panel.setPreferredSize(new Dimension(10, 35));
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		contentPane.add(panel, BorderLayout.SOUTH);
		
	}//end of MainScreen
	
	
	private JPanel menuPanel() {
		JPanel menu=new JPanel();
		JButton btnNewButton = new JButton("Create road system");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sliders sl=new sliders();
				sl.NewScreen();
			}
			
		});
		btnNewButton.setBackground(SystemColor.scrollbar);
		btnNewButton.setBorder(new LineBorder(Color.BLUE));
		btnNewButton.setSize(new Dimension(14, 0));
		btnNewButton.setBounds(new Rectangle(0, 0, 10, 0));
		menu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Start");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Driving driving=new Driving(numOfVehicle, numOfJunction);
				driving.drive(20);
			}
			
		});
		btnNewButton_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1.setBorder(new LineBorder(Color.BLUE));
		btnNewButton_1.setSize(new Dimension(14, 0));
		menu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Stop");
		btnNewButton_2.setBackground(SystemColor.scrollbar);
		btnNewButton_2.setBorder(new LineBorder(Color.BLUE));
		btnNewButton_2.setSize(new Dimension(14, 0));
		menu.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Resume");
		btnNewButton_3.setBackground(SystemColor.scrollbar);
		btnNewButton_3.setBorder(new LineBorder(Color.BLUE));
		btnNewButton_3.setSize(new Dimension(14, 0));
		menu.add(btnNewButton_3);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setBackground(SystemColor.scrollbar);
		btnInfo.setBorder(new LineBorder(Color.BLUE));
		btnInfo.setSize(new Dimension(14, 0));
		menu.add(btnInfo);
		return menu;
	}
	

}//class ends
