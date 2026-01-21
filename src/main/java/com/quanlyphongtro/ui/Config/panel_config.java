package com.quanlyphongtro.ui.Config;

import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
@Component
public class panel_config extends JPanel {

    private static final long serialVersionUID = 1L;
    
    // Hệ màu hiện đại đồng bộ
    private final Color PRIMARY_COLOR = new Color(41, 128, 185);
    private final Color SUCCESS_COLOR = new Color(39, 174, 96);
    private final Color BACKGROUND_COLOR = new Color(240, 242, 245);
    private final Font MAIN_FONT = new Font("Segoe UI", Font.PLAIN, 14);

    public panel_config() {
        setBackground(BACKGROUND_COLOR);
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(25, 25, 25, 25));

        // --- 1. HEADER ---
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        header.setOpaque(false);
        JLabel lblTitle = new JLabel("Cài Đặt Hệ Thống");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitle.setForeground(new Color(33, 37, 41));
        header.add(lblTitle);
        add(header, BorderLayout.NORTH);

        // --- 2. MAIN CONTENT (Sử dụng FlowLayout để các card tự nhảy dòng) ---
        JPanel pnlContent = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
        pnlContent.setOpaque(false);

        // Card Ngân hàng
        pnlContent.add(createConfigCard("TÀI KHOẢN NGÂN HÀNG", 
            new String[]{"Số tài khoản", "Tên chủ tài khoản", "Tên ngân hàng"}, "🏦"));

        // Card Email
        pnlContent.add(createConfigCard("EMAIL HỆ THỐNG", 
            new String[]{"Email gửi tin", "Mật khẩu ứng dụng (App Password)"}, "🤖"));

        // Card Tài khoản
        pnlContent.add(createConfigCard("TÀI KHOẢN ĐĂNG NHẬP", 
            new String[]{"Tên đăng nhập", "Mật khẩu mới", "Email khôi phục"}, "👤"));

        add(new JScrollPane(pnlContent) {{
            setOpaque(false);
            getViewport().setOpaque(false);
            setBorder(null);
        }}, BorderLayout.CENTER);
    }

    private JPanel createConfigCard(String title, String[] fields, String iconText) {
        JPanel card = new JPanel();
        card.setPreferredSize(new Dimension(480, 280));
        card.setBackground(Color.WHITE);
        card.setLayout(new BorderLayout());
        card.setBorder(new CompoundBorder(
            new LineBorder(new Color(218, 220, 224), 1, true),
            new EmptyBorder(15, 15, 15, 15)
        ));

        // Title của card
        JLabel lblTitle = new JLabel(title);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblTitle.setForeground(PRIMARY_COLOR);
        lblTitle.setBorder(new EmptyBorder(0, 0, 15, 0));
        card.add(lblTitle, BorderLayout.NORTH);

        // Center Content: Gồm Icon và Fields
        JPanel pnlCenter = new JPanel(new BorderLayout(20, 0));
        pnlCenter.setOpaque(false);

        // Vùng Icon và Nút Lưu
        JPanel pnlLeft = new JPanel(new BorderLayout(0, 10));
        pnlLeft.setOpaque(false);
        pnlLeft.setPreferredSize(new Dimension(100, 0));
        
        JLabel lblIcon = new JLabel(iconText, SwingConstants.CENTER);
        lblIcon.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 60));
        pnlLeft.add(lblIcon, BorderLayout.CENTER);

        JButton btnSave = new JButton("Lưu lại");
        btnSave.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btnSave.setBackground(SUCCESS_COLOR);
        btnSave.setForeground(Color.WHITE);
        btnSave.setFocusPainted(false);
        btnSave.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSave.setPreferredSize(new Dimension(80, 35));
        pnlLeft.add(btnSave, BorderLayout.SOUTH);

        pnlCenter.add(pnlLeft, BorderLayout.WEST);

        // Vùng nhập liệu
        JPanel pnlInputs = new JPanel();
        pnlInputs.setLayout(new BoxLayout(pnlInputs, BoxLayout.Y_AXIS));
        pnlInputs.setOpaque(false);

        for (String fieldName : fields) {
            JLabel lbl = new JLabel(fieldName);
            lbl.setFont(new Font("Segoe UI", Font.BOLD, 12));
            lbl.setForeground(new Color(100, 100, 100));
            pnlInputs.add(lbl);
            
            JTextField txt = new JTextField();
            txt.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
            txt.setPreferredSize(new Dimension(0, 35));
            txt.setBorder(new CompoundBorder(
                new LineBorder(new Color(200, 200, 200)),
                new EmptyBorder(0, 8, 0, 8)
            ));
            pnlInputs.add(txt);
            pnlInputs.add(Box.createVerticalStrut(10));
        }

        pnlCenter.add(pnlInputs, BorderLayout.CENTER);
        card.add(pnlCenter, BorderLayout.CENTER);

        // Hiệu ứng Hover cho card
        card.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                card.setBorder(new CompoundBorder(
                    new LineBorder(PRIMARY_COLOR, 1, true),
                    new EmptyBorder(15, 15, 15, 15)
                ));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                card.setBorder(new CompoundBorder(
                    new LineBorder(new Color(218, 220, 224), 1, true),
                    new EmptyBorder(15, 15, 15, 15)
                ));
            }
        });

        return card;
    }
}