package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JList;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String[] features =  {"Trang chủ" , "Hợp đồng", "Phòng", "Dịch vụ", "Hóa đơn", "Thống kê", "Báo cáo", "Cấu hình","Thoát"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setSize(1920,1080); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel side_panel = new JPanel();
		side_panel.setBackground(new Color(39, 83, 138));
		side_panel.setPreferredSize(new Dimension(300, 10));
		contentPane.add(side_panel, BorderLayout.WEST);
		side_panel.setLayout(new BoxLayout(side_panel, BoxLayout.Y_AXIS));
		
		
		
		JLabel lblNewLabel_1 = new JLabel("QUẢN LÝ PHÒNG TRỌ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setPreferredSize(new Dimension(300, 300));
		lblNewLabel_1.setMaximumSize(new Dimension(300, 300));
		side_panel.add(lblNewLabel_1);
		for (int i=0 ; i< features.length -1; i++ ) {
			JButton btnNewButton = new JButton(features[i]);
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
			btnNewButton.setForeground(new Color(39, 83, 138));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setMinimumSize(new Dimension(105, 20));
			btnNewButton.setMaximumSize(new Dimension(400, 80));
			btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
			btnNewButton.setPreferredSize(new Dimension(30, 27));
			side_panel.add(btnNewButton);
		}


		JButton btnNewButton = new JButton(features[features.length -1]);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(39, 83, 138));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setMinimumSize(new Dimension(105, 20));
		btnNewButton.setMaximumSize(new Dimension(400, 80));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setPreferredSize(new Dimension(30, 27));
		side_panel.add(btnNewButton);
		
		JPanel main_panel = new JPanel();
		main_panel.setPreferredSize(new Dimension(10, 60));
		contentPane.add(main_panel, BorderLayout.CENTER);
		main_panel.setLayout(new CardLayout(0, 0));

	}

}
