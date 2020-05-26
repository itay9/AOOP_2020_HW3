package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JSlider;
import java.awt.Component;
import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
//git test
public class gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
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
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Road system");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
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
				//setBackground(Color.red);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("None");
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
				JOptionPane.showMessageDialog(frame, "Home Work 3 \nGUI @ Threads");

			}
		});
	
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnNewMenu_3.add(mntmNewMenuItem_1);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 35));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		
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
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Start");
		btnNewButton_1.setBackground(SystemColor.scrollbar);
		btnNewButton_1.setBorder(new LineBorder(Color.BLUE));
		btnNewButton_1.setSize(new Dimension(14, 0));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Stop");
		btnNewButton_2.setBackground(SystemColor.scrollbar);
		btnNewButton_2.setBorder(new LineBorder(Color.BLUE));
		btnNewButton_2.setSize(new Dimension(14, 0));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Resume");
		btnNewButton_3.setBackground(SystemColor.scrollbar);
		btnNewButton_3.setBorder(new LineBorder(Color.BLUE));
		btnNewButton_3.setSize(new Dimension(14, 0));
		panel.add(btnNewButton_3);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setBackground(SystemColor.scrollbar);
		btnInfo.setBorder(new LineBorder(Color.BLUE));
		btnInfo.setSize(new Dimension(14, 0));
		panel.add(btnInfo);
	}
}
