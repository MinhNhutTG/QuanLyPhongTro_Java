package ui.Report;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;

public class panel_report extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public panel_report() {
		setPreferredSize(new Dimension(1920, 1080));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setMaximumSize(new Dimension(32767, 40));
		panel_1.setBackground(new Color(39, 83, 138));
		panel_1.setPreferredSize(new Dimension(10, 40));
		panel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("Quản lý báo cáo thống kê");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setMaximumSize(new Dimension(32767, 60));
		panel_2.setPreferredSize(new Dimension(10, 60));
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut);
		
		JButton btnNewButton = new JButton("Tổng quan");
		btnNewButton.setMaximumSize(new Dimension(170, 35));
		btnNewButton.setPreferredSize(new Dimension(170, 35));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(btnNewButton);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_1);
		
		JButton btnNewButton_1 = new JButton("Doanh thu");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setMaximumSize(new Dimension(170, 35));
		panel_2.add(btnNewButton_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_2);
		
		JButton btnNewButton_2 = new JButton("Dịch vụ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setMaximumSize(new Dimension(170, 35));
		panel_2.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(1300, 10));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_4, BorderLayout.EAST);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setPreferredSize(new Dimension(600, 10));
		panel_3.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.Y_AXIS));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setMaximumSize(new Dimension(32767, 200));
		panel_5.add(verticalStrut);
		
		JPanel panel_6 = new JPanel();
		panel_6.setMaximumSize(new Dimension(500, 160));
		panel_6.setPreferredSize(new Dimension(200, 100));
		panel_6.setBackground(new Color(0, 255, 255));
		panel_5.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.Y_AXIS));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 128, 255));
		panel_7.setMaximumSize(new Dimension(32767, 40));
		panel_6.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("SỐ LƯỢNG PHÒNG:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_7.add(lblNewLabel_1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel_7.add(horizontalStrut_3);
		
		JLabel lblNewLabel_2 = new JLabel("10");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_7.add(lblNewLabel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 128, 255));
		panel_8.setMaximumSize(new Dimension(32767, 40));
		panel_6.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_4 = new JLabel("SỐ PHÒNG ĐANG TRỐNG:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_8.add(lblNewLabel_4);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel_8.add(horizontalStrut_4);
		
		JLabel lblNewLabel_5 = new JLabel("3");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_8.add(lblNewLabel_5);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setBackground(new Color(0, 128, 255));
		panel_8_1.setMaximumSize(new Dimension(32767, 40));
		panel_6.add(panel_8_1);
		panel_8_1.setLayout(new BoxLayout(panel_8_1, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_6 = new JLabel("SỐ PHÒNG ĐANG THUÊ:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_8_1.add(lblNewLabel_6);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_8_1.add(horizontalStrut_5);
		
		JLabel lblNewLabel_7 = new JLabel("7");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_8_1.add(lblNewLabel_7);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setBackground(new Color(0, 128, 255));
		panel_8_2.setMaximumSize(new Dimension(32767, 40));
		panel_6.add(panel_8_2);
		panel_8_2.setLayout(new BoxLayout(panel_8_2, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_8 = new JLabel("SỐ PHÒNG ĐANG SỬA:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_8_2.add(lblNewLabel_8);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(20);
		panel_8_2.add(horizontalStrut_6);
		
		JLabel lblNewLabel_9 = new JLabel("0");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_8_2.add(lblNewLabel_9);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		panel_5.add(verticalStrut_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setMaximumSize(new Dimension(500, 160));
		panel_5.add(panel_9);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.Y_AXIS));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 128, 255));
		panel_10.setMaximumSize(new Dimension(32767, 40));
		panel_9.add(panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_3 = new JLabel("SỐ LƯỢNG HOÁ ĐƠN:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_10.add(lblNewLabel_3);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(20);
		panel_10.add(horizontalStrut_7);
		
		JLabel lblNewLabel_10 = new JLabel("22");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_10.add(lblNewLabel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 128, 255));
		panel_11.setMaximumSize(new Dimension(32767, 40));
		panel_9.add(panel_11);
		panel_11.setLayout(new BoxLayout(panel_11, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_11 = new JLabel("SỐ HOÁ ĐƠN ĐÃ THANH TOÁN:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_11.add(lblNewLabel_11);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(20);
		panel_11.add(horizontalStrut_8);
		
		JLabel lblNewLabel_12 = new JLabel("14");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_11.add(lblNewLabel_12);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 128, 255));
		panel_12.setMaximumSize(new Dimension(32767, 40));
		panel_9.add(panel_12);
		panel_12.setLayout(new BoxLayout(panel_12, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_13 = new JLabel("SỐ HOÁ ĐƠN CHƯA THANH TOÁN:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_12.add(lblNewLabel_13);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(20);
		panel_12.add(horizontalStrut_9);
		
		JLabel lblNewLabel_14 = new JLabel("8");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_12.add(lblNewLabel_14);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 128, 255));
		panel_13.setMaximumSize(new Dimension(32767, 40));
		panel_9.add(panel_13);
		panel_13.setLayout(new BoxLayout(panel_13, BoxLayout.X_AXIS));

	}

}
