package com.quanlyphongtro.ui.Contract;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class panel_contract extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;
    private JComboBox<String> cbxStatusFilter;
    
    // Hệ thống màu sắc đồng bộ (Modern UI)
    private final Color PRIMARY_COLOR = new Color(41, 128, 185);
    private final Color SUCCESS_COLOR = new Color(39, 174, 96);
    private final Color DANGER_COLOR = new Color(231, 76, 60);
    private final Color BACKGROUND_COLOR = new Color(240, 242, 245);
    private final Color HEADER_BG = new Color(255, 255, 255);
    private final Font MAIN_FONT = new Font("Segoe UI", Font.PLAIN, 14);

    public panel_contract() {
        // Cấu hình tổng thể
        setBackground(BACKGROUND_COLOR);
        setLayout(new BorderLayout(0, 0));
        setBorder(new EmptyBorder(25, 25, 25, 25));

        // --- 1. HEADER TITLE & SEARCH ---
        add(createTopPanel(), BorderLayout.NORTH);

        // --- 2. MAIN CONTENT AREA ---
        JPanel panelMain = new JPanel(new BorderLayout(0, 15));
        panelMain.setOpaque(false);
        panelMain.setBorder(new EmptyBorder(15, 0, 0, 0));

        // Toolbar: Nút chức năng
        panelMain.add(createToolbar(), BorderLayout.NORTH);

        // Table: Danh sách hợp đồng
        panelMain.add(createTableSection(), BorderLayout.CENTER);

        add(panelMain, BorderLayout.CENTER);

        loadDummyData();
    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);

        JLabel lblTitle = new JLabel("Quản Lý Hợp Đồng");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitle.setForeground(new Color(33, 37, 41));
        
        // Panel bên phải cho Filter
        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        filterPanel.setOpaque(false);
        
        JLabel lblFilter = new JLabel("Trạng thái: ");
        lblFilter.setFont(new Font("Segoe UI", Font.BOLD, 13));
        
        cbxStatusFilter = new JComboBox<>(new String[]{"Tất cả hợp đồng", "Đang hiệu lực", "Đã thanh lý", "Quá hạn"});
        cbxStatusFilter.setPreferredSize(new Dimension(180, 35));
        
        filterPanel.add(lblFilter);
        filterPanel.add(cbxStatusFilter);

        panel.add(lblTitle, BorderLayout.WEST);
        panel.add(filterPanel, BorderLayout.EAST);
        return panel;
    }

    private JPanel createToolbar() {
        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        toolbar.setOpaque(false);

        toolbar.add(createStyledButton(" + Thêm hợp đồng", SUCCESS_COLOR, Color.WHITE));
        toolbar.add(createStyledButton(" Sửa hợp đồng", PRIMARY_COLOR, Color.WHITE));
        toolbar.add(createStyledButton(" Xóa", DANGER_COLOR, Color.WHITE));
        toolbar.add(createStyledButton(" Làm mới", new Color(108, 117, 125), Color.WHITE));

        return toolbar;
    }

    private JScrollPane createTableSection() {
        String[] columnNames = {
            "Mã hợp đồng", "Số phòng", "Ngày thuê", "Hạn thuê", "Giá thuê", "Trạng thái", "Ngày tạo"
        };

        model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);
        styleTable(table);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new LineBorder(new Color(218, 220, 224), 1));
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        return scrollPane;
    }

    private void styleTable(JTable table) {
        table.setRowHeight(35);
        table.setFont(MAIN_FONT);
        table.setSelectionBackground(new Color(232, 241, 249));
        table.setSelectionForeground(Color.BLACK);
        table.setShowGrid(false);
        table.setIntercellSpacing(new Dimension(0, 0));

        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.WHITE);
        header.setFont(new Font("Segoe UI", Font.BOLD, 13));
        header.setForeground(new Color(108, 117, 125));
        header.setPreferredSize(new Dimension(0, 40));
        header.setBorder(new MatteBorder(0, 0, 1, 0, new Color(218, 220, 224)));
    }

    private JButton createStyledButton(String text, Color bg, Color fg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(10, 15, 10, 15));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(bg.brighter());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(bg);
            }
        });

        return btn;
    }

    private void loadDummyData() {
        model.addRow(new Object[]{"HD001", "P.101", "01/01/2026", "12 tháng", "3.500.000", "Đang hiệu lực", "30/12/2025"});
        model.addRow(new Object[]{"HD002", "P.202", "15/01/2026", "6 tháng", "4.000.000", "Đang hiệu lực", "10/01/2026"});
        model.addRow(new Object[]{"HD003", "P.105", "20/12/2025", "12 tháng", "3.200.000", "Đã thanh lý", "15/12/2025"});
    }
}