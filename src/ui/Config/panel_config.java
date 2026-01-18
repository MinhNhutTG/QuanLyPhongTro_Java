package ui.Config;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
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
		setBackground(Color.WHITE);
        setLayout(null); // Sử dụng Absolute Layout để căn chỉnh chính xác như trong ảnh

        // --- 1. CARD: TÀI KHOẢN NGÂN HÀNG ---
        JPanel cardBank = createConfigCard("TÀI KHOẢN NGÂN HÀNG", 
            new String[]{"Số tài khoản", "Tên Tài Khoản", "Tên Ngân Hàng"}, 
            "🏦", 30, 30, 480, 220);
        add(cardBank);

        // --- 2. CARD: EMAIL HỆ THỐNG ---
        JPanel cardEmail = createConfigCard("EMAIL HỆ THỐNG", 
            new String[]{"Email", "Mật khẩu ứng dụng (App Password)"}, 
            "🤖", 540, 30, 480, 220);
        add(cardEmail);

        // --- 3. CARD: TÀI KHOẢN ĐĂNG NHẬP ---
        JPanel cardAccount = createConfigCard("TÀI KHOẢN ĐĂNG NHẬP", 
            new String[]{"Tên Đăng Nhập", "Mật Khẩu", "EmailUser"}, 
            "👤", 30, 270, 480, 250);
        add(cardAccount);

	}
	private JPanel createConfigCard(String title, String[] fields, String iconText, int x, int y, int w, int h) {
        JPanel card = new JPanel(null);
        card.setBounds(x, y, w, h);
        card.setBackground(new Color(51, 102, 204)); // Màu xanh đậm của card
        card.setBorder(new LineBorder(Color.WHITE, 1));

        // Tiêu đề Card
        JLabel lblTitle = new JLabel(title, SwingConstants.CENTER);
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTitle.setBounds(0, 5, w, 30);
        card.add(lblTitle);

        // Icon minh họa (Sử dụng Emoji hoặc bạn có thể thay bằng ImageIcon)
        JLabel lblIcon = new JLabel(iconText, SwingConstants.CENTER);
        lblIcon.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 70));
        lblIcon.setBounds(20, 50, 100, 100);
        card.add(lblIcon);

        // Nút Lưu (Màu xanh lá)
        JButton btnSave = new JButton("Lưu");
        btnSave.setBackground(new Color(51, 204, 51));
        btnSave.setForeground(Color.WHITE);
        btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnSave.setFocusPainted(false);
        btnSave.setBounds(30, 160, 80, 30);
        card.add(btnSave);

        // Các ô nhập liệu (Sử dụng TitledBorder để tạo label bao quanh ô text)
        int inputY = 45;
        for (String fieldName : fields) {
            JTextField txtInput = new JTextField();
            txtInput.setBackground(Color.WHITE);
            
            // Tạo border có tiêu đề trắng
            TitledBorder titledBorder = BorderFactory.createTitledBorder(
                new LineBorder(Color.WHITE), fieldName);
            titledBorder.setTitleColor(Color.WHITE);
            titledBorder.setTitleFont(new Font("Tahoma", Font.PLAIN, 11));
            
            txtInput.setBorder(titledBorder);
            txtInput.setBounds(140, inputY, 320, 50);
            card.add(txtInput);
            
            inputY += 60; // Khoảng cách giữa các ô
        }

        return card;
    }

}
