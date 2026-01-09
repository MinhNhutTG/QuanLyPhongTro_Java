package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Point;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TrangChu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
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
	public TrangChu() {
		setTitle("Rental Room Management - Main");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout());

        // --- 1. SIDEBAR (THANH BÊN) ---
        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(new Color(41, 74, 122)); // Màu xanh đậm
        sidePanel.setPreferredSize(new Dimension(200, 600));
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));

        // Logo (Phần trên cùng của Sidebar)
        JLabel logoLabel = new JLabel("LOGO HERE", SwingConstants.CENTER);
        logoLabel.setLocation(new Point(0, 90));
        logoLabel.setForeground(Color.WHITE);
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        logoLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 30, 0));
        sidePanel.add(logoLabel);

        // Các nút Menu
        String[] menuItems = {
            "KHÁCH THUÊ", "HỢP ĐỒNG", "PHÒNG", "DỊCH VỤ", 
            "HÓA ĐƠN", "THỐNG KÊ BÁO CÁO", "CẤU HÌNH", "THOÁT"
        };

        for (String item : menuItems) {
            JButton btn = createMenuButton(item);
            sidePanel.add(btn);
            sidePanel.add(Box.createRigidArea(new Dimension(0, 5))); // Khoảng cách giữa các nút
        }

        // --- 2. MAIN CONTENT (NỘI DUNG CHÍNH) ---
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // Header (Dòng "Trang chủ")
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setBackground(new Color(41, 74, 122));
        JLabel lblTitle = new JLabel("  Trang chủ");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 14));
        headerPanel.add(lblTitle);
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Body (Logo lớn ở giữa)
        JPanel bodyPanel = new JPanel(new GridBagLayout()); // Dùng GridBagLayout để căn giữa
        bodyPanel.setBackground(Color.WHITE);
        
        // Giả lập Logo lớn (Bạn có thể thay bằng ImageIcon thực tế)
        JLabel centralLogo = new JLabel("RENTAL ROOM MANAGEMENT", SwingConstants.CENTER);
        centralLogo.setFont(new Font("Serif", Font.BOLD, 24));
        centralLogo.setForeground(Color.GRAY);
        bodyPanel.add(centralLogo);

        mainPanel.add(bodyPanel, BorderLayout.CENTER);

        // Thêm vào JFrame
        getContentPane().add(sidePanel, BorderLayout.WEST);
        getContentPane().add(mainPanel, BorderLayout.CENTER);
	}
	private JButton createMenuButton(String text) {
        JButton btn = new JButton(text);
        btn.setMaximumSize(new Dimension(200, 40));
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.PLAIN, 12));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Hiệu ứng hover đơn giản
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setForeground(Color.LIGHT_GRAY);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setForeground(Color.WHITE);
            }
        });
        return btn;
    }
}
