package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sliders extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public void NewScreen() {
		try {
			sliders dialog = new sliders();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public sliders() {
		setBounds(100, 100,600,300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JSlider slider = new JSlider();
			slider.setValue(11);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setName("");
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(1);
			slider.setMinimum(3);
			slider.setMaximum(20);
			slider.setBounds(59, 53, 434, 61);
			contentPanel.add(slider);
		}
		
		JLabel lblNewLabel = new JLabel("Number of junction");
		lblNewLabel.setBounds(198, 16, 162, 44);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of vehicles");
		lblNewLabel_1.setBounds(198, 117, 162, 44);
		contentPanel.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setOpaque(false);
		slider.setValue(25);
		slider.setValueIsAdjusting(true);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(5);
		slider.setMaximum(50);
		slider.setBounds(59, 155, 434, 60);
		contentPanel.add(slider);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
