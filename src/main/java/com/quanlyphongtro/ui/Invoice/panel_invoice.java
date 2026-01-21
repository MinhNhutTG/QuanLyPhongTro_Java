package com.quanlyphongtro.ui.Invoice;

import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
@Component
public class panel_invoice extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtSearch;
    private JTable table;
    private DefaultTableModel model;
    
    // Hệ thống màu sắc đồng bộ
    private final Color PRIMARY_COLOR = new Color(41, 128, 185);    // Blue
    private final Color SUCCESS_COLOR = new Color(39, 174, 96);    // Green
    private final Color DANGER_COLOR = new Color(231, 76, 60);     // Red
    private final Color WARNING_COLOR = new Color(241, 196, 15);   // Yellow
    private final Color BACKGROUND_COLOR = new Color(240, 242, 245);
    private final Font MAIN_FONT = new Font("Segoe UI", Font.PLAIN, 14);

    public panel_invoice() {
        setBackground(BACKGROUND_COLOR);
        setLayout(new BorderLayout(20, 20));
        setBorder(new EmptyBorder(25, 25, 25, 25));

        // --- 1. TOP: TIÊU ĐỀ VÀ BỘ LỌC TỔNG QUÁT ---
        add(createHeaderPanel(), BorderLayout.NORTH);

        // --- 2. CENTER: BẢNG DỮ LIỆU VÀ THANH CÔNG CỤ ---
        JPanel panelContent = new JPanel(new BorderLayout(20, 0));
        panelContent.setOpaque(false);
        
        panelContent.add(createTableSection(), BorderLayout.CENTER);
        panelContent.add(createActionSidebar(), BorderLayout.EAST);

        add(panelContent, BorderLayout.CENTER);

        loadDummyData();
    }

    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);

        // Tiêu đề
        JLabel lblTitle = new JLabel("Quản Lý Hóa Đơn");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitle.setForeground(new Color(33, 37, 41));
        header.add(lblTitle, BorderLayout.WEST);

        // Bộ lọc nhanh
        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        filterPanel.setOpaque(false);

        filterPanel.add(new JLabel("Tháng/Năm:"));
        JSpinner spinnerDate = new JSpinner(new SpinnerDateModel());
        spinnerDate.setEditor(new JSpinner.DateEditor(spinnerDate, "MM/yyyy"));
        spinnerDate.setPreferredSize(new Dimension(120, 35));
        filterPanel.add(spinnerDate);

        txtSearch = new JTextField(18);
        txtSearch.setPreferredSize(new Dimension(200, 35));
        // Giả lập placeholder
        txtSearch.setToolTipText("Tìm mã HD, tên khách...");
        filterPanel.add(txtSearch);

        JButton btnSearch = createStyledButton("Tìm kiếm", PRIMARY_COLOR, Color.WHITE);
        filterPanel.add(btnSearch);

        header.add(filterPanel, BorderLayout.EAST);
        return header;
    }

    private JPanel createTableSection() {
        JPanel panel = new JPanel(new BorderLayout(0, 15));
        panel.setOpaque(false);

        // Filter trạng thái bằng RadioButtons nằm trong một "Card" nhỏ
        JPanel statusCard = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        statusCard.setBackground(Color.WHITE);
        statusCard.setBorder(new LineBorder(new Color(218, 220, 224), 1));

        JLabel lblStatus = new JLabel("Trạng thái thanh toán:");
        lblStatus.setFont(new Font("Segoe UI", Font.BOLD, 13));
        statusCard.add(lblStatus);

        JRadioButton rdAll = new JRadioButton("Tất cả", true);
        JRadioButton rdPaid = new JRadioButton("Đã thanh toán");
        JRadioButton rdUnpaid = new JRadioButton("Chưa thanh toán");
        
        ButtonGroup bg = new ButtonGroup();
        for (JRadioButton rd : new JRadioButton[]{rdAll, rdPaid, rdUnpaid}) {
            rd.setBackground(Color.WHITE);
            rd.setFont(MAIN_FONT);
            bg.add(rd);
            statusCard.add(rd);
        }

        // Bảng dữ liệu
        String[] columns = {"Mã hóa đơn", "Phòng", "Khách hàng", "Ngày lập", "Tổng tiền", "Trạng thái"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        styleTable(table);
        
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBorder(new LineBorder(new Color(218, 220, 224), 1));
        scroll.getViewport().setBackground(Color.WHITE);

        panel.add(statusCard, BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);
        return panel;
    }

    private JPanel createActionSidebar() {
        JPanel sidebar = new JPanel();
        sidebar.setPreferredSize(new Dimension(200, 0));
        sidebar.setBackground(Color.WHITE);
        sidebar.setBorder(new CompoundBorder(
            new LineBorder(new Color(218, 220, 224), 1),
            new EmptyBorder(15, 15, 15, 15)
        ));
        sidebar.setLayout(new GridLayout(7, 1, 0, 12));

        JLabel lblAction = new JLabel("THAO TÁC");
        lblAction.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lblAction.setHorizontalAlignment(SwingConstants.CENTER);
        sidebar.add(lblAction);

        sidebar.add(createStyledButton("Tạo HD tự động", SUCCESS_COLOR, Color.WHITE));
        sidebar.add(createStyledButton("Tạo hóa đơn", new Color(46, 204, 113), Color.WHITE));
        sidebar.add(createStyledButton("Chỉnh sửa", WARNING_COLOR, new Color(50, 50, 50)));
        sidebar.add(createStyledButton("Xem chi tiết", PRIMARY_COLOR, Color.WHITE));
        sidebar.add(createStyledButton("In hóa đơn", new Color(149, 165, 166), Color.WHITE));
        sidebar.add(createStyledButton("Xóa hóa đơn", DANGER_COLOR, Color.WHITE));

        return sidebar;
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
        
        // Căn lề phải cho cột Tổng tiền
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
    }

    private JButton createStyledButton(String text, Color bg, Color fg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setBorder(new EmptyBorder(5, 10, 5, 10));

        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) { btn.setBackground(bg.brighter()); }
            public void mouseExited(MouseEvent e) { btn.setBackground(bg); }
        });
        return btn;
    }

    private void loadDummyData() {
        model.addRow(new Object[]{"INV001", "P.101", "Nguyễn Văn A", "15/01/2026", "3,750,000", "Đã thanh toán"});
        model.addRow(new Object[]{"INV002", "P.202", "Lê Thị B", "16/01/2026", "4,200,000", "Chưa thanh toán"});
        model.addRow(new Object[]{"INV003", "P.105", "Trần Văn C", "18/01/2026", "3,100,000", "Chưa thanh toán"});
    }
}