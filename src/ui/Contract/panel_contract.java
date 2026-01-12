package ui.Contract;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class panel_contract extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public panel_contract() {
		setLayout(new BorderLayout(0, 0));
		this.setSize(1920,1080);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_3.setMaximumSize(new Dimension(32767, 40));
		panel_3.setPreferredSize(new Dimension(10, 40));
		panel_3.setBackground(new Color(39, 83, 138));
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblQunLKhch = new JLabel("Quản lý hợp đồng");
		lblQunLKhch.setForeground(Color.WHITE);
		lblQunLKhch.setHorizontalAlignment(SwingConstants.LEFT);
		lblQunLKhch.setHorizontalTextPosition(SwingConstants.CENTER);
		lblQunLKhch.setFont(new Font("Liberation Mono", Font.BOLD, 18));
		lblQunLKhch.setBorder(null);
		lblQunLKhch.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblQunLKhch.setPreferredSize(new Dimension(500, 40));
		lblQunLKhch.setMaximumSize(new Dimension(500, 40));
		panel_3.add(lblQunLKhch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setPreferredSize(new Dimension(10, 100));
		panel_1.setMaximumSize(new Dimension(1920, 100));
		panel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(200, 32767));
		panel_1.add(horizontalStrut);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(250, 26));
		comboBox.setMaximumSize(new Dimension(250, 35));
		panel_1.add(comboBox);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(750, 32767));
		panel_1.add(horizontalStrut_1);
		
		JButton btn_add = new JButton("Thêm hợp đồng");
		btn_add.setPreferredSize(new Dimension(200, 35));
		btn_add.setMaximumSize(new Dimension(180, 35));
		panel_1.add(btn_add);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_2);
		
		JButton btn_modify = new JButton("Chỉnh sửa");
		btn_modify.setPreferredSize(new Dimension(200, 35));
		btn_modify.setMaximumSize(new Dimension(180, 35));
		panel_1.add(btn_modify);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_3);
		
		JButton btn_remove = new JButton("Xóa");
		btn_remove.setPreferredSize(new Dimension(200, 35));
		btn_remove.setMaximumSize(new Dimension(180, 35));
		panel_1.add(btn_remove);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_4);
		
		JButton btn_view = new JButton("Xem chi tiết");
		btn_view.setPreferredSize(new Dimension(200, 35));
		btn_view.setMaximumSize(new Dimension(180, 35));
		panel_1.add(btn_view);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_5);
		
		JButton btn_refresh = new JButton("Làm mới\n");
		btn_refresh.setPreferredSize(new Dimension(200, 35));
		btn_refresh.setMaximumSize(new Dimension(180, 35));
		panel_1.add(btn_refresh);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_1.add(horizontalStrut_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setPreferredSize(new Dimension(200, 35));
		panel_2.setMaximumSize(new Dimension(1920, 1080));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Ng\u00E0y t\u1EA1o h\u1EE3p \u0111\u1ED3ng", "Tr\u1EA1ng th\u00E1i ", "Gi\u00E1 ph\u00F2ng", "S\u1ED1 ph\u00F2ng", "H\u1EA1n thu\u00EA", "Ng\u00E0y thu\u00EA", "M\u00E3 h\u1EE3p \u0111\u1ED3ng"
			}
		));
		panel_2.add(table, BorderLayout.CENTER);

	}
}
