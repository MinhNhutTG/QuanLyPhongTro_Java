package ui.Service;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class panel_service extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public panel_service() {
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
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_3.setMaximumSize(new Dimension(32766, 70));
		panel_3.setPreferredSize(new Dimension(10, 100));
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "S\u1EAFp x\u1EBFp", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel_5.setMaximumSize(new Dimension(200, 80));
		panel_5.setPreferredSize(new Dimension(200, 50));
		panel_5.setBackground(Color.WHITE);
		panel_3.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kì gần nhất");
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		panel_5.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnKXaNht = new JRadioButton("Kì xa nhất");
		rdbtnKXaNht.setBackground(Color.WHITE);
		panel_5.add(rdbtnKXaNht);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(null, "Tr\u1EA1ng th\u00E1i", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_6.setPreferredSize(new Dimension(200, 70));
		panel_6.setMaximumSize(new Dimension(200, 80));
		panel_6.setBackground(Color.WHITE);
		panel_3.add(panel_6);
		panel_6.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumSize(new Dimension(170, 35));
		comboBox.setPreferredSize(new Dimension(170, 35));
		panel_6.add(comboBox);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setMaximumSize(new Dimension(500, 32767));
		panel_3.add(horizontalStrut_3);
		
		JButton btnNewButton = new JButton("Thêm mới");
		btnNewButton.setMaximumSize(new Dimension(150, 35));
		btnNewButton.setPreferredSize(new Dimension(170, 35));
		panel_3.add(btnNewButton);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_4);
		
		JButton btnNewButton_1 = new JButton("Chỉnh sửa");
		btnNewButton_1.setMaximumSize(new Dimension(150, 35));
		btnNewButton_1.setPreferredSize(new Dimension(170, 35));
		panel_3.add(btnNewButton_1);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_5);
		
		JButton btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setMaximumSize(new Dimension(150, 35));
		btnNewButton_2.setPreferredSize(new Dimension(170, 35));
		panel_3.add(btnNewButton_2);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_6);
		
		JButton btnNewButton_3 = new JButton("Làm mới");
		btnNewButton_3.setMaximumSize(new Dimension(150, 35));
		btnNewButton_3.setPreferredSize(new Dimension(170, 35));
		panel_3.add(btnNewButton_3);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_7);
		
		JButton btnNewButton_4 = new JButton("Quản lý giá dịch vụ");
		btnNewButton_4.setMaximumSize(new Dimension(150, 35));
		btnNewButton_4.setPreferredSize(new Dimension(170, 35));
		panel_3.add(btnNewButton_4);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_3.add(horizontalStrut_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "C\u1EADp nh\u1EADt d\u1ECBch v\u1EE5 ph\u00F2ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setMaximumSize(new Dimension(1900, 200));
		panel_4.setPreferredSize(new Dimension(10, 200));
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 4, 0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_8.setMaximumSize(new Dimension(300, 40));
		panel_8.setPreferredSize(new Dimension(300, 40));
		panel_8.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_9);
		
		JLabel lblSd = new JLabel("Mã sử dụng dịch vụ:");
		lblSd.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_8.add(lblSd);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_8);
		
		JLabel lblHd = new JLabel("HD222");
		lblHd.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_8.add(lblHd);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_10);
		
		JButton btnNewButton_5 = new JButton("Đổi mã");
		panel_8.add(btnNewButton_5);
		
		JPanel panel_9 = new JPanel();
		panel_9.setMaximumSize(new Dimension(300, 40));
		panel_9.setPreferredSize(new Dimension(300, 40));
		panel_9.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_9);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_1 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_9_1);
		
		JLabel lblSPhng = new JLabel("Số phòng:");
		lblSPhng.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_9.add(lblSPhng);
		
		Component horizontalStrut_9_2 = Box.createHorizontalStrut(20);
		panel_9.add(horizontalStrut_9_2);
		
		textField_3 = new JTextField();
		textField_3.setMaximumSize(new Dimension(240, 35));
		textField_3.setColumns(10);
		panel_9.add(textField_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_9 = Box.createHorizontalStrut(20);
		panel_10.add(horizontalStrut_9_9);
		
		JLabel lblSPhng_4 = new JLabel("Kì:");
		lblSPhng_4.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_10.add(lblSPhng_4);
		
		Component horizontalStrut_9_10 = Box.createHorizontalStrut(20);
		panel_10.add(horizontalStrut_9_10);
		
		textField_6 = new JTextField();
		textField_6.setMaximumSize(new Dimension(240, 35));
		textField_6.setColumns(10);
		panel_10.add(textField_6);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_12);
		panel_12.setLayout(new BoxLayout(panel_12, BoxLayout.X_AXIS));
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(20);
		panel_12.add(horizontalStrut_11);
		
		JLabel lblSinC = new JLabel("Số điện cũ:");
		lblSinC.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_12.add(lblSinC);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(20);
		panel_12.add(horizontalStrut_12);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(240, 35));
		panel_12.add(textField);
		textField.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_13);
		panel_13.setLayout(new BoxLayout(panel_13, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_3 = Box.createHorizontalStrut(20);
		panel_13.add(horizontalStrut_9_3);
		
		JLabel lblSPhng_1 = new JLabel("Số điện cũ:");
		lblSPhng_1.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_13.add(lblSPhng_1);
		
		Component horizontalStrut_9_4 = Box.createHorizontalStrut(20);
		panel_13.add(horizontalStrut_9_4);
		
		textField_4 = new JTextField();
		textField_4.setMaximumSize(new Dimension(240, 35));
		textField_4.setColumns(10);
		panel_13.add(textField_4);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_14);
		panel_14.setLayout(new BoxLayout(panel_14, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_11 = Box.createHorizontalStrut(20);
		panel_14.add(horizontalStrut_9_11);
		
		JLabel lblSPhng_5 = new JLabel("Giá điện:");
		lblSPhng_5.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_14.add(lblSPhng_5);
		
		Component horizontalStrut_9_12 = Box.createHorizontalStrut(20);
		panel_14.add(horizontalStrut_9_12);
		
		textField_7 = new JTextField();
		textField_7.setMaximumSize(new Dimension(240, 35));
		textField_7.setColumns(10);
		panel_14.add(textField_7);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_16);
		panel_16.setLayout(new BoxLayout(panel_16, BoxLayout.X_AXIS));
		
		Component horizontalStrut_12_2 = Box.createHorizontalStrut(20);
		panel_16.add(horizontalStrut_12_2);
		
		JLabel lblNewLabel = new JLabel("Số nước cũ: ");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_16.add(lblNewLabel);
		
		Component horizontalStrut_12_1 = Box.createHorizontalStrut(20);
		panel_16.add(horizontalStrut_12_1);
		
		textField_1 = new JTextField();
		textField_1.setMaximumSize(new Dimension(240, 35));
		textField_1.setColumns(10);
		panel_16.add(textField_1);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_17);
		panel_17.setLayout(new BoxLayout(panel_17, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_5 = Box.createHorizontalStrut(20);
		panel_17.add(horizontalStrut_9_5);
		
		JLabel lblSPhng_2 = new JLabel("Số nước cũ:");
		lblSPhng_2.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_17.add(lblSPhng_2);
		
		Component horizontalStrut_9_6 = Box.createHorizontalStrut(20);
		panel_17.add(horizontalStrut_9_6);
		
		textField_5 = new JTextField();
		textField_5.setMaximumSize(new Dimension(240, 35));
		textField_5.setColumns(10);
		panel_17.add(textField_5);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_18);
		panel_18.setLayout(new BoxLayout(panel_18, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_13 = Box.createHorizontalStrut(20);
		panel_18.add(horizontalStrut_9_13);
		
		JLabel lblSPhng_6 = new JLabel("Giá nước:");
		lblSPhng_6.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_18.add(lblSPhng_6);
		
		Component horizontalStrut_9_14 = Box.createHorizontalStrut(20);
		panel_18.add(horizontalStrut_9_14);
		
		textField_8 = new JTextField();
		textField_8.setMaximumSize(new Dimension(240, 35));
		textField_8.setColumns(10);
		panel_18.add(textField_8);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_19);
		
		JButton btnPhngTrn = new JButton("Phòng Trên");
		panel_19.add(btnPhngTrn);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_20);
		panel_20.setLayout(new BoxLayout(panel_20, BoxLayout.X_AXIS));
		
		Component horizontalStrut_12_1_2 = Box.createHorizontalStrut(20);
		panel_20.add(horizontalStrut_12_1_2);
		
		JLabel lblTinMng = new JLabel("Tiền mạng:");
		lblTinMng.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_20.add(lblTinMng);
		
		Component horizontalStrut_12_1_1 = Box.createHorizontalStrut(20);
		panel_20.add(horizontalStrut_12_1_1);
		
		textField_2 = new JTextField();
		textField_2.setMaximumSize(new Dimension(240, 35));
		textField_2.setColumns(10);
		panel_20.add(textField_2);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_21);
		panel_21.setLayout(new BoxLayout(panel_21, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_7 = Box.createHorizontalStrut(20);
		panel_21.add(horizontalStrut_9_7);
		
		JLabel lblSPhng_3 = new JLabel("Ngày tạo:");
		lblSPhng_3.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_21.add(lblSPhng_3);
		
		Component horizontalStrut_9_8 = Box.createHorizontalStrut(20);
		panel_21.add(horizontalStrut_9_8);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1768237200000L), null, null, Calendar.DAY_OF_YEAR));
		spinner.setMaximumSize(new Dimension(240, 35));
		panel_21.add(spinner);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_22);
		panel_22.setLayout(new BoxLayout(panel_22, BoxLayout.X_AXIS));
		
		Component horizontalStrut_9_15 = Box.createHorizontalStrut(20);
		panel_22.add(horizontalStrut_9_15);
		
		JLabel lblSPhng_7 = new JLabel("Trạng thái:");
		lblSPhng_7.setFont(new Font("Dialog", Font.BOLD, 14));
		panel_22.add(lblSPhng_7);
		
		Component horizontalStrut_9_16 = Box.createHorizontalStrut(20);
		panel_22.add(horizontalStrut_9_16);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setMaximumSize(new Dimension(240, 35));
		panel_22.add(comboBox_1);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_23);
		
		JButton btnPhngDi = new JButton("Phòng Dưới");
		panel_23.add(btnPhngDi);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_2.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBackground(new Color(255, 255, 255));
		panel_7.add(table);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBackground(new Color(255, 255, 255));
		panel_7.add(verticalStrut, BorderLayout.NORTH);
	}

}
