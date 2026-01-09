package ui.Contract;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;

public class panel_contract extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public panel_contract() {
		setLayout(null);
		
		JLabel lblHi = new JLabel("CONTRACT");
		lblHi.setBounds(179, 76, 104, 104);
		add(lblHi);

	}
}
