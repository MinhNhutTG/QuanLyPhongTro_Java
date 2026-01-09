package ui.Home;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class panel_home extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public panel_home() {
		this.setSize(1920,1080);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTrangCh = new JLabel("Trang Chủ");
		lblTrangCh.setBounds(437, 280, 274, 121);
		panel.add(lblTrangCh);
	}
}
