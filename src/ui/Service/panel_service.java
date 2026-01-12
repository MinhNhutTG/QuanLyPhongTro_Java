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

public class panel_service extends JPanel {

	private static final long serialVersionUID = 1L;

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
		panel_2.setBackground(Color.ORANGE);
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
		panel_4.setMaximumSize(new Dimension(32767, 300));
		panel_4.setPreferredSize(new Dimension(10, 300));
		panel_4.setBackground(Color.WHITE);
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 4, 0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.RED);
		panel_2.add(panel_7);
	}

}
