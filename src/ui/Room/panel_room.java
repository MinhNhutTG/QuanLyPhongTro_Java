package ui.Room;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panel_room extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public panel_room() {
		this.setSize(1920,1080);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setMaximumSize(new Dimension(32767, 40));
		panel_1.setPreferredSize(new Dimension(10, 40));
		panel_1.setBackground(new Color(39, 83, 138));
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblQunLKhch = new JLabel("Quản lý phòng");
		lblQunLKhch.setForeground(Color.WHITE);
		lblQunLKhch.setHorizontalAlignment(SwingConstants.LEFT);
		lblQunLKhch.setHorizontalTextPosition(SwingConstants.CENTER);
		lblQunLKhch.setFont(new Font("Liberation Mono", Font.BOLD, 18));
		lblQunLKhch.setBorder(null);
		lblQunLKhch.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblQunLKhch.setPreferredSize(new Dimension(500, 40));
		lblQunLKhch.setMaximumSize(new Dimension(500, 40));
		panel_1.add(lblQunLKhch);
		
		

		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(10, 90));
		panel.add(panel_2);
		panel_2.setMinimumSize(new Dimension(1920, 10));
		panel_2.setMaximumSize(new Dimension(32767, 90));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut);
		
		JButton btnNewButton = new JButton("Thêm phòng");
		btnNewButton.setMaximumSize(new Dimension(140, 35));
		btnNewButton.setPreferredSize(new Dimension(140, 27));
		panel_2.add(btnNewButton);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_1);
		
		JButton btnNewButton_1 = new JButton("Sửa phòng");
		btnNewButton_1.setMaximumSize(new Dimension(140, 35));
		btnNewButton_1.setPreferredSize(new Dimension(140, 27));
		panel_2.add(btnNewButton_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_2);
		
		JButton btnNewButton_2 = new JButton("Xóa phòng");
		btnNewButton_2.setMaximumSize(new Dimension(140, 35));
		btnNewButton_2.setPreferredSize(new Dimension(140, 27));
		panel_2.add(btnNewButton_2);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_3);
		
		JButton btnNewButton_3 = new JButton("Quản lý loại phòng");
		btnNewButton_3.setMaximumSize(new Dimension(150, 35));
		btnNewButton_3.setPreferredSize(new Dimension(150, 27));
		panel_2.add(btnNewButton_3);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setMaximumSize(new Dimension(400, 32767));
		panel_2.add(horizontalStrut_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumSize(new Dimension(250, 35));
		comboBox.setPreferredSize(new Dimension(250, 35));
		panel_2.add(comboBox);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setMaximumSize(new Dimension(250, 35));
		comboBox_1.setPreferredSize(new Dimension(250, 35));
		panel_2.add(comboBox_1);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_6);
		
		JButton btnNewButton_4 = new JButton("Đặt lại");
		panel_2.add(btnNewButton_4);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_7);
		
		JPanel panel_3 = new JPanel();
		panel_3.setMaximumSize(new Dimension(32767, 950));
		panel_3.setPreferredSize(new Dimension(10, 950));
		panel_3.setBackground(UIManager.getColor("ComboBox.buttonShadow"));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		panel_3.add(table, BorderLayout.CENTER);
		
		

	}

}
