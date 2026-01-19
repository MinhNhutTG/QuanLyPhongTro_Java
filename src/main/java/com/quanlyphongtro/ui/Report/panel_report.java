package com.quanlyphongtro.ui.Report;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class panel_report extends JPanel {

    private static final long serialVersionUID = 1L;

    public panel_report() {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout(0, 0));

        // --- 1. HEADER ---
        JPanel panelHeader = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelHeader.setBackground(new Color(39, 83, 138));
        panelHeader.setPreferredSize(new Dimension(10, 50));
        
        JLabel lblTitle = new JLabel(" QUẢN LÝ BÁO CÁO & THỐNG KÊ");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        panelHeader.add(lblTitle);
        add(panelHeader, BorderLayout.NORTH);

        // --- 2. MAIN CONTENT ---
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBorder(new EmptyBorder(20, 20, 20, 20));
        panelMain.setBackground(new Color(245, 245, 245));
        add(panelMain, BorderLayout.CENTER);

        // --- 3. NAVIGATION TABS ---
        JPanel panelNav = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        panelNav.setOpaque(false);
        panelNav.setMaximumSize(new Dimension(32767, 40));

        JButton btnOverview = createNavButton("Tổng quan", true);
        JButton btnRevenue = createNavButton("Doanh thu", false);
        JButton btnService = createNavButton("Dịch vụ", false);
        
        panelNav.add(btnOverview);
        panelNav.add(btnRevenue);
        panelNav.add(btnService);
        panelMain.add(panelNav);
        panelMain.add(Box.createVerticalStrut(20));

        // --- 4. SUMMARY CARDS (Top Row) ---
        JPanel panelCards = new JPanel(new GridLayout(1, 4, 20, 0));
        panelCards.setOpaque(false);
        panelCards.setMaximumSize(new Dimension(32767, 120));

        panelCards.add(createStatCard("TỔNG SỐ PHÒNG", "10", new Color(52, 152, 219)));
        panelCards.add(createStatCard("PHÒNG ĐANG THUÊ", "7", new Color(46, 204, 113)));
        panelCards.add(createStatCard("HÓA ĐƠN THÁNG", "22", new Color(241, 194, 50)));
        panelCards.add(createStatCard("DOANH THU (VNĐ)", "25.5M", new Color(231, 76, 60)));

        panelMain.add(panelCards);
        panelMain.add(Box.createVerticalStrut(30));

        // --- 5. CHART AREA (Bottom Section) ---
        JPanel panelChartArea = new JPanel(new BorderLayout());
        panelChartArea.setBackground(Color.WHITE);
        panelChartArea.setBorder(new LineBorder(new Color(230, 230, 230), 1, true));
        
        JLabel lblChartPlaceholder = new JLabel("Khu vực biểu đồ thống kê (Tích hợp JFreeChart tại đây)");
        lblChartPlaceholder.setHorizontalAlignment(SwingConstants.CENTER);
        lblChartPlaceholder.setFont(new Font("Segoe UI", Font.ITALIC, 16));
        lblChartPlaceholder.setForeground(Color.GRAY);
        
        panelChartArea.add(lblChartPlaceholder, BorderLayout.CENTER);
        panelMain.add(panelChartArea);
    }

    // Hàm tạo nút điều hướng chuyên nghiệp
    private JButton createNavButton(String text, boolean isActive) {
        JButton btn = new JButton(text);
        btn.setPreferredSize(new Dimension(130, 35));
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        if (isActive) {
            btn.setBackground(new Color(39, 83, 138));
            btn.setForeground(Color.WHITE);
        } else {
            btn.setBackground(Color.WHITE);
            btn.setForeground(Color.DARK_GRAY);
        }
        return btn;
    }

    // Hàm tạo thẻ thống kê bo góc đẹp
    private JPanel createStatCard(String title, String value, Color color) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout());
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 0, color)); // Vạch màu bên trái

        JPanel pnlContent = new JPanel();
        pnlContent.setLayout(new BoxLayout(pnlContent, BoxLayout.Y_AXIS));
        pnlContent.setOpaque(false);
        pnlContent.setBorder(new EmptyBorder(15, 15, 15, 15));

        JLabel lblTitle = new JLabel(title);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblTitle.setForeground(Color.GRAY);

        JLabel lblValue = new JLabel(value);
        lblValue.setFont(new Font("Segoe UI", Font.BOLD, 28));
        lblValue.setForeground(color);

        pnlContent.add(lblTitle);
        pnlContent.add(Box.createVerticalStrut(5));
        pnlContent.add(lblValue);

        card.add(pnlContent, BorderLayout.CENTER);
        return card;
    }
}