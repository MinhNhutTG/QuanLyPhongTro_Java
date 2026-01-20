package com.quanlyphongtro.ui.Service;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class panel_service extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtSoPhong, txtKi, txtDienCu, txtDienMoi, txtGiaDien, txtNuocCu, txtNuocMoi, txtGiaNuoc, txtTienMang;
    private JTable table;
    private DefaultTableModel model;
    private JLabel lblMaHD;
    private JSpinner spinDate;
    private JComboBox<String> cbFilterStatus;

    // Hệ màu hiện đại
    private final Color PRIMARY_COLOR = new Color(41, 128, 185);
    private final Color SUCCESS_COLOR = new Color(39, 174, 96);
    private final Color DANGER_COLOR = new Color(231, 76, 60);
    private final Color BACKGROUND_COLOR = new Color(240, 242, 245);

    public panel_service() {
        setBackground(BACKGROUND_COLOR);
        setLayout(new BorderLayout(20, 20));
        setBorder(new EmptyBorder(25, 25, 25, 25));

        // --- HEADER ---
        add(createHeader(), BorderLayout.NORTH);

        // --- MAIN CONTENT ---
        JPanel panelMain = new JPanel(new BorderLayout(0, 20));
        panelMain.setOpaque(false);

        panelMain.add(createInputForm(), BorderLayout.NORTH);
        panelMain.add(createTableSection(), BorderLayout.CENTER);

        add(panelMain, BorderLayout.CENTER);

        // --- FOOTER ---
        add(createFooterNav(), BorderLayout.SOUTH);
        
        loadSampleData();
    }

    private JPanel createHeader() {
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);

        JLabel lblTitle = new JLabel("Quản Lý Dịch Vụ Phòng");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitle.setForeground(new Color(33, 37, 41));
        header.add(lblTitle, BorderLayout.WEST);

        // Toolbar: Gom nhóm Filter và Buttons
        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        toolbar.setOpaque(false);

        cbFilterStatus = new JComboBox<>(new String[]{"Tất cả trạng thái", "Đã thanh toán", "Chưa thanh toán"});
        cbFilterStatus.setPreferredSize(new Dimension(180, 35));
        toolbar.add(cbFilterStatus);

        JButton btnPrice = createStyledButton("Quản lý giá", new Color(155, 89, 182), Color.WHITE);
        toolbar.add(btnPrice);

        header.add(toolbar, BorderLayout.EAST);
        return header;
    }

    private JPanel createInputForm() {
        JPanel card = new JPanel(new BorderLayout(20, 15));
        card.setBackground(Color.WHITE);
        card.setBorder(new CompoundBorder(
            new LineBorder(new Color(218, 220, 224), 1),
            new EmptyBorder(20, 20, 20, 20)
        ));

        // Grid nhập liệu
        JPanel gridFields = new JPanel(new GridBagLayout());
        gridFields.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        // Dòng 1: Mã, Số phòng, Kỳ
        gbc.gridy = 0;
        gbc.gridx = 0; gridFields.add(new JLabel("Mã sử dụng:"), gbc);
        lblMaHD = new JLabel("HD222");
        lblMaHD.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblMaHD.setForeground(PRIMARY_COLOR);
        gbc.gridx = 1; gridFields.add(lblMaHD, gbc);

        gbc.gridx = 2; gridFields.add(new JLabel("Số phòng:"), gbc);
        txtSoPhong = createStyledTextField(); gbc.gridx = 3; gridFields.add(txtSoPhong, gbc);

        gbc.gridx = 4; gridFields.add(new JLabel("Kỳ sử dụng:"), gbc);
        txtKi = createStyledTextField(); gbc.gridx = 5; gridFields.add(txtKi, gbc);

        // Dòng 2: Chỉ số điện
        gbc.gridy = 1;
        gbc.gridx = 0; gridFields.add(new JLabel("Số điện cũ:"), gbc);
        txtDienCu = createStyledTextField(); gbc.gridx = 1; gridFields.add(txtDienCu, gbc);

        gbc.gridx = 2; gridFields.add(new JLabel("Số điện mới:"), gbc);
        txtDienMoi = createStyledTextField(); gbc.gridx = 3; gridFields.add(txtDienMoi, gbc);

        gbc.gridx = 4; gridFields.add(new JLabel("Giá điện:"), gbc);
        txtGiaDien = createStyledTextField(); gbc.gridx = 5; gridFields.add(txtGiaDien, gbc);

        // Dòng 3: Chỉ số nước
        gbc.gridy = 2;
        gbc.gridx = 0; gridFields.add(new JLabel("Số nước cũ:"), gbc);
        txtNuocCu = createStyledTextField(); gbc.gridx = 1; gridFields.add(txtNuocCu, gbc);

        gbc.gridx = 2; gridFields.add(new JLabel("Số nước mới:"), gbc);
        txtNuocMoi = createStyledTextField(); gbc.gridx = 3; gridFields.add(txtNuocMoi, gbc);

        gbc.gridx = 4; gridFields.add(new JLabel("Giá nước:"), gbc);
        txtGiaNuoc = createStyledTextField(); gbc.gridx = 5; gridFields.add(txtGiaNuoc, gbc);

        // Dòng 4: Tiền mạng & Ngày tạo
        gbc.gridy = 3;
        gbc.gridx = 0; gridFields.add(new JLabel("Tiền mạng:"), gbc);
        txtTienMang = createStyledTextField(); gbc.gridx = 1; gridFields.add(txtTienMang, gbc);

        gbc.gridx = 2; gridFields.add(new JLabel("Ngày tạo:"), gbc);
        spinDate = new JSpinner(new SpinnerDateModel());
        spinDate.setEditor(new JSpinner.DateEditor(spinDate, "dd/MM/yyyy"));
        spinDate.setPreferredSize(new Dimension(0, 35));
        gbc.gridx = 3; gridFields.add(spinDate, gbc);

        // Nút chức năng chính
        JPanel btnAction = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        btnAction.setOpaque(false);
        btnAction.add(createStyledButton("Thêm mới", SUCCESS_COLOR, Color.WHITE));
        btnAction.add(createStyledButton("Chỉnh sửa", PRIMARY_COLOR, Color.WHITE));
        btnAction.add(createStyledButton("Xóa", DANGER_COLOR, Color.WHITE));
        btnAction.add(createStyledButton("Làm mới", new Color(108, 117, 125), Color.WHITE));

        card.add(gridFields, BorderLayout.CENTER);
        card.add(btnAction, BorderLayout.SOUTH);

        return card;
    }

    private JPanel createTableSection() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);

        String[] columns = {"Mã HD", "Phòng", "Kì", "Điện Cũ", "Điện Mới", "Nước Cũ", "Nước Mới", "Mạng", "Ngày tạo", "Trạng thái"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        styleTable(table);
        
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBorder(new LineBorder(new Color(218, 220, 224), 1));
        panel.add(scroll, BorderLayout.CENTER);

        return panel;
    }

    private JPanel createFooterNav() {
        JPanel footer = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        footer.setOpaque(false);
        
        JButton btnPrev = createStyledButton("<< Phòng trước", Color.WHITE, Color.DARK_GRAY);
        btnPrev.setBorder(new LineBorder(new Color(200, 200, 200)));
        JButton btnNext = createStyledButton("Phòng tiếp theo >>", Color.WHITE, Color.DARK_GRAY);
        btnNext.setBorder(new LineBorder(new Color(200, 200, 200)));

        footer.add(btnPrev);
        footer.add(btnNext);
        return footer;
    }

    // --- HELPER METHODS ---
    private JTextField createStyledTextField() {
        JTextField tf = new JTextField();
        tf.setPreferredSize(new Dimension(0, 35));
        tf.setBorder(new CompoundBorder(new LineBorder(new Color(206, 212, 218)), new EmptyBorder(0, 8, 0, 8)));
        return tf;
    }

    private JButton createStyledButton(String text, Color bg, Color fg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(130, 40));
        
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) { btn.setBackground(bg.brighter()); }
            public void mouseExited(MouseEvent e) { btn.setBackground(bg); }
        });
        return btn;
    }

    private void styleTable(JTable table) {
        table.setRowHeight(35);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        table.setShowGrid(false);
        table.setIntercellSpacing(new Dimension(0, 0));
        
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.WHITE);
        header.setFont(new Font("Segoe UI", Font.BOLD, 13));
        header.setPreferredSize(new Dimension(0, 40));
        header.setBorder(new MatteBorder(0, 0, 1, 0, new Color(218, 220, 224)));
    }

    private void loadSampleData() {
        model.addRow(new Object[]{"HD222", "101", "01/2026", "1250", "1380", "450", "462", "100.000", "20/01/2026", "Chưa thanh toán"});
    }
}