package com.quanlyphongtro.ui.Report;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class panel_report extends JPanel {

    private static final long serialVersionUID = 1L;
    
    // Hệ màu Dashboard hiện đại
    private final Color PRIMARY_COLOR = new Color(41, 128, 185);
    private final Color SUCCESS_COLOR = new Color(39, 174, 96);
    private final Color WARNING_COLOR = new Color(241, 196, 15);
    private final Color DANGER_COLOR = new Color(231, 76, 60);
    private final Color BACKGROUND_COLOR = new Color(240, 242, 245);

    public panel_report() {
        setBackground(BACKGROUND_COLOR);
        setLayout(new BorderLayout(0, 0));

        // --- 1. HEADER ---
        add(createHeader(), BorderLayout.NORTH);

        // --- 2. MAIN CONTENT ---
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBorder(new EmptyBorder(25, 25, 25, 25));
        panelMain.setOpaque(false);
        add(panelMain, BorderLayout.CENTER);

        // --- 3. NAVIGATION TABS (Segmented Control style) ---
        JPanel panelNav = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panelNav.setOpaque(false);
        panelNav.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));

        panelNav.add(createNavButton("Tổng quan", true));
        panelNav.add(createNavButton("Doanh thu", false));
        panelNav.add(createNavButton("Dịch vụ", false));
        
        panelMain.add(panelNav);
        panelMain.add(Box.createVerticalStrut(25));

        // --- 4. SUMMARY CARDS ---
        JPanel panelCards = new JPanel(new GridLayout(1, 4, 20, 0));
        panelCards.setOpaque(false);
        panelCards.setMaximumSize(new Dimension(Integer.MAX_VALUE, 120));

        panelCards.add(createStatCard("TỔNG SỐ PHÒNG", "10", PRIMARY_COLOR, "🏢"));
        panelCards.add(createStatCard("PHÒNG ĐANG THUÊ", "07", SUCCESS_COLOR, "🔑"));
        panelCards.add(createStatCard("HÓA ĐƠN THÁNG", "22", WARNING_COLOR, "📄"));
        panelCards.add(createStatCard("DOANH THU", "25.5M", DANGER_COLOR, "💰"));

        panelMain.add(panelCards);
        panelMain.add(Box.createVerticalStrut(25));

        // --- 5. CHART AREA ---
        JPanel panelChartArea = new JPanel(new BorderLayout());
        panelChartArea.setBackground(Color.WHITE);
        panelChartArea.setBorder(new CompoundBorder(
            new LineBorder(new Color(218, 220, 224), 1, true),
            new EmptyBorder(20, 20, 20, 20)
        ));
        
        // Header của biểu đồ
        JPanel pnlChartHeader = new JPanel(new BorderLayout());
        pnlChartHeader.setOpaque(false);
        JLabel lblChartTitle = new JLabel("Phân tích doanh thu & Xu hướng");
        lblChartTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
        pnlChartHeader.add(lblChartTitle, BorderLayout.WEST);
        
        panelChartArea.add(pnlChartHeader, BorderLayout.NORTH);
        
        // Placeholder cho biểu đồ
        JLabel lblPlaceholder = new JLabel("Biểu đồ thống kê sẽ hiển thị tại đây (JFreeChart)");
        lblPlaceholder.setHorizontalAlignment(SwingConstants.CENTER);
        lblPlaceholder.setFont(new Font("Segoe UI", Font.ITALIC, 15));
        lblPlaceholder.setForeground(new Color(150, 150, 150));
        
        panelChartArea.add(lblPlaceholder, BorderLayout.CENTER);
        
        panelMain.add(panelChartArea);
    }

    private JPanel createHeader() {
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(Color.WHITE);
        header.setPreferredSize(new Dimension(0, 70));
        header.setBorder(new MatteBorder(0, 0, 1, 0, new Color(218, 220, 224)));
        
        JLabel lblTitle = new JLabel("Báo Cáo & Thống Kê");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblTitle.setBorder(new EmptyBorder(0, 25, 0, 0));
        header.add(lblTitle, BorderLayout.WEST);
        
        // Nút xuất báo cáo
        JButton btnExport = new JButton(" Xuất Báo Cáo (PDF/Excel)");
        btnExport.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnExport.setBackground(SUCCESS_COLOR);
        btnExport.setForeground(Color.WHITE);
        btnExport.setFocusPainted(false);
        btnExport.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        JPanel pnlExport = new JPanel(new FlowLayout(FlowLayout.RIGHT, 25, 18));
        pnlExport.setOpaque(false);
        pnlExport.add(btnExport);
        header.add(pnlExport, BorderLayout.EAST);
        
        return header;
    }

    private JButton createNavButton(String text, boolean isActive) {
        JButton btn = new JButton(text);
        btn.setPreferredSize(new Dimension(140, 40));
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        if (isActive) {
            btn.setBackground(PRIMARY_COLOR);
            btn.setForeground(Color.WHITE);
            btn.setBorder(new LineBorder(PRIMARY_COLOR));
        } else {
            btn.setBackground(Color.WHITE);
            btn.setForeground(new Color(100, 100, 100));
            btn.setBorder(new LineBorder(new Color(218, 220, 224)));
        }
        
        return btn;
    }

    private JPanel createStatCard(String title, String value, Color color, String icon) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Color.WHITE);
        card.setBorder(new CompoundBorder(
            new LineBorder(new Color(218, 220, 224), 1, true),
            new EmptyBorder(20, 20, 20, 20)
        ));

        // Phần text
        JPanel pnlText = new JPanel();
        pnlText.setLayout(new BoxLayout(pnlText, BoxLayout.Y_AXIS));
        pnlText.setOpaque(false);

        JLabel lblTitle = new JLabel(title);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 12));
        lblTitle.setForeground(new Color(150, 150, 150));

        JLabel lblValue = new JLabel(value);
        lblValue.setFont(new Font("Segoe UI", Font.BOLD, 28));
        lblValue.setForeground(new Color(50, 50, 50));

        pnlText.add(lblTitle);
        pnlText.add(Box.createVerticalStrut(5));
        pnlText.add(lblValue);

        // Phần icon/vạch màu
        JLabel lblIcon = new JLabel(icon);
        lblIcon.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        lblIcon.setForeground(color);

        card.add(pnlText, BorderLayout.CENTER);
        card.add(lblIcon, BorderLayout.EAST);
        
        // Vạch màu trang trí phía dưới
        card.add(new JPanel() {{
            setBackground(color);
            setPreferredSize(new Dimension(0, 4));
        }}, BorderLayout.SOUTH);

        return card;
    }
}