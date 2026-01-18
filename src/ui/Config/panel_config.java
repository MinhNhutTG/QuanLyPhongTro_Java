package ui.Config;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;

public class panel_config extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public panel_config() {
		setPreferredSize(new Dimension(1920, 1080));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 40));
		panel_1.setBackground(new Color(39, 83, 138));
		panel_1.setMaximumSize(new Dimension(32767, 40));
		panel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("CẤU HÌNH");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel_3.setMaximumSize(new Dimension(960, 32767));
		panel_2.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setMaximumSize(new Dimension(32767, 200));
		panel_3.add(verticalStrut);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 128, 255));
		panel_5.setMaximumSize(new Dimension(600, 300));
		panel_3.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("TÀI KHOẢN NGÂN HÀNG");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_5.add(lblNewLabel_1);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		panel_5.add(verticalStrut_3);
		
		textField = new JTextField();
		textField.setBorder(new TitledBorder(null, "S\u1ED1 t\u00E0i kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		textField.setMaximumSize(new Dimension(300, 40));
		panel_5.add(textField);
		textField.setColumns(10);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		panel_5.add(verticalStrut_4);
		
		textField_1 = new JTextField();
		textField_1.setMaximumSize(new Dimension(300, 40));
		textField_1.setColumns(10);
		textField_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00EAn t\u00E0i kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.add(textField_1);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		panel_5.add(verticalStrut_5);
		
		textField_2 = new JTextField();
		textField_2.setMaximumSize(new Dimension(300, 40));
		textField_2.setColumns(10);
		textField_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00EAn ng\u00E2n h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5.add(textField_2);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		panel_5.add(verticalStrut_6);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setMaximumSize(new Dimension(300, 40));
		panel_5.add(btnNewButton);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_3.add(verticalStrut_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setMaximumSize(new Dimension(600, 300));
		panel_5_1.setBackground(new Color(0, 128, 255));
		panel_3.add(panel_5_1);
		panel_5_1.setLayout(new BoxLayout(panel_5_1, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1_1 = new JLabel("TÀI KHOẢN ĐĂNG NHẬP");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setAlignmentX(0.5f);
		panel_5_1.add(lblNewLabel_1_1);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		panel_5_1.add(verticalStrut_7);
		
		textField_3 = new JTextField();
		textField_3.setMaximumSize(new Dimension(300, 40));
		textField_3.setColumns(10);
		textField_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00EAn t\u00E0i kho\u1EA3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5_1.add(textField_3);
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		panel_5_1.add(verticalStrut_8);
		
		textField_4 = new JTextField();
		textField_4.setMaximumSize(new Dimension(300, 40));
		textField_4.setColumns(10);
		textField_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "M\u1EADt kh\u1EA9u", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5_1.add(textField_4);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		panel_5_1.add(verticalStrut_9);
		
		textField_5 = new JTextField();
		textField_5.setMaximumSize(new Dimension(300, 40));
		textField_5.setColumns(10);
		textField_5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "EmailUser", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5_1.add(textField_5);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		panel_5_1.add(verticalStrut_10);
		
		JButton btnNewButton_1 = new JButton("Lưu");
		btnNewButton_1.setMaximumSize(new Dimension(300, 40));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setAlignmentX(0.5f);
		panel_5_1.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setMaximumSize(new Dimension(960, 32767));
		panel_2.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setMaximumSize(new Dimension(32767, 145));
		panel_4.add(verticalStrut_2);
		
		JPanel panel_5_2 = new JPanel();
		panel_5_2.setMaximumSize(new Dimension(600, 290));
		panel_5_2.setBackground(new Color(0, 128, 255));
		panel_4.add(panel_5_2);
		panel_5_2.setLayout(new BoxLayout(panel_5_2, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel_1_2 = new JLabel("EMAIL HỆ THỐNG");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setAlignmentX(0.5f);
		panel_5_2.add(lblNewLabel_1_2);
		
		Component verticalStrut_11 = Box.createVerticalStrut(20);
		panel_5_2.add(verticalStrut_11);
		
		textField_6 = new JTextField();
		textField_6.setMaximumSize(new Dimension(300, 40));
		textField_6.setColumns(10);
		textField_6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Email", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5_2.add(textField_6);
		
		Component verticalStrut_12 = Box.createVerticalStrut(20);
		panel_5_2.add(verticalStrut_12);
		
		textField_7 = new JTextField();
		textField_7.setMaximumSize(new Dimension(300, 40));
		textField_7.setColumns(10);
		textField_7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "M\u1EADt kh\u1EA9u \u1EE9ng d\u1EE5ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_5_2.add(textField_7);
		
		Component verticalStrut_13 = Box.createVerticalStrut(20);
		panel_5_2.add(verticalStrut_13);
		
		JButton btnNewButton_2 = new JButton("Lưu");
		btnNewButton_2.setMaximumSize(new Dimension(300, 40));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setAlignmentX(0.5f);
		panel_5_2.add(btnNewButton_2);

	}

}
