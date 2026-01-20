package com.quanlyphongtro.ui.Guest;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class panel_guest extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtSearch, txtGuestID, txtFullName, txtIDCard, txtPhone, txtEmail;
    private JTable tableGuests, tableContracts;
    private DefaultTableModel modelGuests, modelContracts;
    private JComboBox<String> cbxStatusFilter, cbxStatusDetail;
    private JSpinner spinnerDOB;
    
    // Hệ thống màu sắc hiện đại
    private final Color PRIMARY_COLOR = new Color(41, 128, 185);    // Blue
    private final Color SUCCESS_COLOR = new Color(39, 174, 96);    // Green
    private final Color DANGER_COLOR = new Color(231, 76, 60);     // Red
    private final Color WARNING_COLOR = new Color(241, 196, 15);   // Yellow
    private final Color BACKGROUND_COLOR = new Color(240, 242, 245);
    private final Color CARD_COLOR = Color.WHITE;
    private final Font MAIN_FONT = new Font("Segoe UI", Font.PLAIN, 14);

    public panel_guest() {
        setBackground(BACKGROUND_COLOR);
        setLayout(new BorderLayout(20, 20));
        setBorder(new EmptyBorder(25, 25, 25, 25));

        // --- TOP: TIÊU ĐỀ VÀ TÌM KIẾM ---
        add(createHeaderPanel(), BorderLayout.NORTH);

        // --- CENTER: BẢNG DỮ LIỆU VÀ FORM ---
        JPanel panelContent = new JPanel(new BorderLayout(20, 0));
        panelContent.setOpaque(false);
        panelContent.add(createTableSection(), BorderLayout.CENTER);
        panelContent.add(createFormSection(), BorderLayout.EAST);

        add(panelContent, BorderLayout.CENTER);

        loadSampleData();
        setupEvents();
    }

    private JPanel createHeaderPanel() {
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);

        // Title bên trái
        JLabel lblTitle = new JLabel("Quản Lý Khách Thuê");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitle.setForeground(new Color(33, 37, 41));
        header.add(lblTitle, BorderLayout.WEST);

        // Search Bar bên phải
        JPanel searchContainer = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        searchContainer.setOpaque(false);

        cbxStatusFilter = new JComboBox<>(new String[]{"Tất cả trạng thái", "Đang thuê", "Đã rời đi"});
        cbxStatusFilter.setPreferredSize(new Dimension(150, 35));
        
        txtSearch = new JTextField(20);
        txtSearch.setPreferredSize(new Dimension(200, 35));
        // Giả lập placeholder nếu không dùng thư viện ngoài
        txtSearch.setToolTipText("Nhập tên hoặc CCCD để tìm...");

        JButton btnSearch = createStyledButton("Tìm kiếm", PRIMARY_COLOR, Color.WHITE);
        
        searchContainer.add(new JLabel("Lọc:"));
        searchContainer.add(cbxStatusFilter);
        searchContainer.add(txtSearch);
        searchContainer.add(btnSearch);

        header.add(searchContainer, BorderLayout.EAST);
        return header;
    }

    private JPanel createTableSection() {
        JPanel panel = new JPanel(new BorderLayout(0, 15));
        panel.setOpaque(false);

        // Nút thao tác
        JPanel actions = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        actions.setOpaque(false);
        
        actions.add(createStyledButton(" + Thêm mới ", SUCCESS_COLOR, Color.WHITE));
        actions.add(createStyledButton(" Cập nhật ", WARNING_COLOR, new Color(50, 50, 50)));
        actions.add(createStyledButton(" Xóa khách ", DANGER_COLOR, Color.WHITE));
        actions.add(createStyledButton(" Làm mới ", new Color(108, 117, 125), Color.WHITE));

        // Bảng
        String[] columns = {"ID", "Họ tên", "CCCD", "SĐT", "Trạng thái"};
        modelGuests = new DefaultTableModel(columns, 0);
        tableGuests = new JTable(modelGuests);
        styleTable(tableGuests);
        
        JScrollPane scroll = new JScrollPane(tableGuests);
        scroll.setBorder(new LineBorder(new Color(218, 220, 224), 1));
        scroll.getViewport().setBackground(Color.WHITE);

        panel.add(actions, BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);
        return panel;
    }

    private JPanel createFormSection() {
        JPanel formWrapper = new JPanel(new BorderLayout());
        formWrapper.setPreferredSize(new Dimension(380, 0));
        formWrapper.setBackground(CARD_COLOR);
        formWrapper.setBorder(new CompoundBorder(
            new LineBorder(new Color(218, 220, 224), 1),
            new EmptyBorder(20, 20, 20, 20)
        ));

        JPanel formBody = new JPanel();
        formBody.setLayout(new BoxLayout(formBody, BoxLayout.Y_AXIS));
        formBody.setOpaque(false);

        JLabel lblTitle = new JLabel("CHI TIẾT KHÁCH THUÊ");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lblTitle.setAlignmentX(Component.LEFT_ALIGNMENT);
        formBody.add(lblTitle);
        formBody.add(Box.createVerticalStrut(20));

        // Thêm các trường nhập liệu
        addInputGroup(formBody, "Mã định danh", txtGuestID = new JTextField());
        txtGuestID.setEditable(false);
        txtGuestID.setBackground(new Color(248, 249, 250));
        
        addInputGroup(formBody, "Họ và tên khách", txtFullName = new JTextField());
        
        // Ngày sinh dùng JSpinner
        JLabel lblDOB = new JLabel("Ngày sinh");
        lblDOB.setFont(new Font("Segoe UI", Font.BOLD, 13));
        formBody.add(lblDOB);
        spinnerDOB = new JSpinner(new SpinnerDateModel());
        spinnerDOB.setEditor(new JSpinner.DateEditor(spinnerDOB, "dd/MM/yyyy"));
        spinnerDOB.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        formBody.add(spinnerDOB);
        formBody.add(Box.createVerticalStrut(12));

        addInputGroup(formBody, "Số CCCD/Passport", txtIDCard = new JTextField());
        addInputGroup(formBody, "Số điện thoại", txtPhone = new JTextField());
        addInputGroup(formBody, "Email liên lạc", txtEmail = new JTextField());

        // Hợp đồng liên quan (Phần phụ)
        formBody.add(Box.createVerticalStrut(10));
        JLabel lblHD = new JLabel("Hợp đồng liên quan");
        lblHD.setFont(new Font("Segoe UI", Font.BOLD, 13));
        formBody.add(lblHD);
        formBody.add(Box.createVerticalStrut(5));
        
        modelContracts = new DefaultTableModel(new String[]{"Số HD", "Phòng", "Loại"}, 0);
        tableContracts = new JTable(modelContracts);
        styleTable(tableContracts);
        JScrollPane scrollHD = new JScrollPane(tableContracts);
        scrollHD.setPreferredSize(new Dimension(0, 120));
        formBody.add(scrollHD);

        formWrapper.add(formBody, BorderLayout.NORTH);
        return formWrapper;
    }

    // --- CÁC HÀM TIỆN ÍCH (UTILITIES) ---

    private void addInputGroup(JPanel container, String labelText, JTextField field) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("Segoe UI", Font.BOLD, 13));
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        field.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        field.setPreferredSize(new Dimension(0, 40));
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(206, 212, 218), 1),
            new EmptyBorder(0, 10, 0, 10)
        ));

        container.add(label);
        container.add(Box.createVerticalStrut(5));
        container.add(field);
        container.add(Box.createVerticalStrut(12));
    }

    private JButton createStyledButton(String text, Color bg, Color fg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFocusPainted(false);
        btn.setBorder(new EmptyBorder(10, 20, 10, 20));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Hiệu ứng hover
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(bg.brighter());
            }
            public void mouseExited(MouseEvent e) {
                btn.setBackground(bg);
            }
        });
        
        return btn;
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
        header.setBorder(new MatteBorder(0, 0, 1, 0, new Color(218, 220, 224)));
    }

    private void loadSampleData() {
        modelGuests.addRow(new Object[]{"K001", "Nguyễn Văn A", "0123456789", "090123456", "Đang thuê"});
        modelGuests.addRow(new Object[]{"K002", "Trần Thị B", "9876543210", "090778899", "Đang thuê"});
    }

    private void setupEvents() {
        tableGuests.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tableGuests.getSelectedRow();
                if (row != -1) {
                    txtGuestID.setText(modelGuests.getValueAt(row, 0).toString());
                    txtFullName.setText(modelGuests.getValueAt(row, 1).toString());
                    txtIDCard.setText(modelGuests.getValueAt(row, 2).toString());
                    txtPhone.setText(modelGuests.getValueAt(row, 3).toString());
                }
            }
        });
    }
}