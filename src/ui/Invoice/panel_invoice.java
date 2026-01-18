package ui.Invoice;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class panel_invoice extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public panel_invoice() {
		this.setSize(1920, 1080);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 40));
		panel_1.setMaximumSize(new Dimension(32767, 40));
		panel_1.setBackground(new Color(39, 83, 138));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Quản lý hoá đơn");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setPreferredSize(new Dimension(200, 14));
		lblNewLabel.setMaximumSize(new Dimension(200, 14));
		panel_1.add(lblNewLabel, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setPreferredSize(new Dimension(10, 100));
		panel_2.setMaximumSize(new Dimension(32767, 100));
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "L\u1ECDc ho\u00E1 \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setMaximumSize(new Dimension(800, 100));
		panel_4.setPreferredSize(new Dimension(800, 100));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_4.add(horizontalStrut);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_5.add(horizontalStrut_2);
		
		JLabel lblNewLabel_1 = new JLabel("Tháng :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_5.add(lblNewLabel_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_5.add(horizontalStrut_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner.setModel(new SpinnerDateModel(new Date(1768150800000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setPreferredSize(new Dimension(150, 35));
		spinner.setMaximumSize(new Dimension(150, 35));
		panel_5.add(spinner);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setMaximumSize(new Dimension(50, 32767));
		horizontalStrut_3.setPreferredSize(new Dimension(50, 0));
		panel_5.add(horizontalStrut_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setPreferredSize(new Dimension(30, 10));
		panel_4.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("Trạng thái thanh toán");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_6.add(lblNewLabel_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_6.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Đã thanh toán");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_7.add(rdbtnNewRadioButton);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setMaximumSize(new Dimension(32767, 10));
		verticalStrut.setPreferredSize(new Dimension(0, 10));
		panel_7.add(verticalStrut);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Chưa thanh toán");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_7.add(rdbtnNewRadioButton_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(null);
		panel_8.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setMaximumSize(new Dimension(100, 32767));
		panel_8.add(horizontalStrut_4);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(900, 40));
		textField.setPreferredSize(new Dimension(400, 20));
		panel_8.add(textField);
		textField.setColumns(10);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_5);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setMaximumSize(new Dimension(170, 35));
		panel_8.add(btnNewButton);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_6);
		
		JButton btnNewButton_1 = new JButton("Tải lại");
		btnNewButton_1.setMaximumSize(new Dimension(100, 35));
		panel_8.add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 0));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setPreferredSize(new Dimension(245, 10));
		panel_9.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_9, BorderLayout.EAST);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.Y_AXIS));
		
		JButton btnNewButton_2 = new JButton("Tạo HD tự động");
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_2.setMaximumSize(new Dimension(170, 35));
		panel_9.add(btnNewButton_2);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_9.add(verticalStrut_1);
		
		JButton btnNewButton_3 = new JButton("Tạo hoá đơn");
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_3.setMaximumSize(new Dimension(170, 35));
		panel_9.add(btnNewButton_3);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		panel_9.add(verticalStrut_2);
		
		JButton btnNewButton_4 = new JButton("Chỉnh sửa");
		btnNewButton_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_4.setMaximumSize(new Dimension(170, 35));
		panel_9.add(btnNewButton_4);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		panel_9.add(verticalStrut_3);
		
		JButton btnNewButton_5 = new JButton("Xoá hoá đơn");
		btnNewButton_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_5.setMaximumSize(new Dimension(170, 35));
		panel_9.add(btnNewButton_5);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		panel_9.add(verticalStrut_4);
		
		JButton btnNewButton_6 = new JButton("Xem chi tiết");
		btnNewButton_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_6.setMaximumSize(new Dimension(170, 35));
		panel_9.add(btnNewButton_6);
		
		table = new JTable();
		panel_3.add(table, BorderLayout.CENTER);

	}

}
