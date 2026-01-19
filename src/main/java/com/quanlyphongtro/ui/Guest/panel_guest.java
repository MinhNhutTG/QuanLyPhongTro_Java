package com.quanlyphongtro.ui.Guest;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.*;

public class panel_guest extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtSearch, txtGuestID, txtFullName, txtIDCard, txtPhone, txtEmail, txtHometown;
    private JTable tableGuests, tableContracts;
    private DefaultTableModel modelGuests, modelContracts;
    private JComboBox<String> cbxStatusFilter, cbxStatusDetail;
    private JSpinner spinnerDOB;

    public panel_guest() {
        this.setSize(1200, 800); // Kích thước hợp lý hơn cho màn hình desktop
        setLayout(new BorderLayout(5, 5));

        // --- TITLE PANEL ---
        JPanel panelHeader = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelHeader.setBackground(new Color(39, 83, 138));
        JLabel lblTitle = new JLabel("QUẢN LÝ KHÁCH THUÊ");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitle.setBorder(new EmptyBorder(10, 20, 10, 10));
        panelHeader.add(lblTitle);
        add(panelHeader, BorderLayout.NORTH);

        // --- MAIN CONTENT PANEL ---
        JPanel panelMain = new JPanel(new BorderLayout(10, 10));
        panelMain.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(panelMain, BorderLayout.CENTER);

        // --- LEFT SIDE: Table and Search ---
        JPanel panelLeft = new JPanel(new BorderLayout(5, 10));
        
        // Toolbar (Search & Buttons)
        JPanel panelToolbar = new JPanel(new GridLayout(2, 1, 5, 5));
        
        // Row 1: Search
        JPanel panelSearch = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelSearch.add(new JLabel("Trạng thái:"));
        cbxStatusFilter = new JComboBox<>(new String[]{"Tất cả", "Đang thuê", "Đã rời đi"});
        panelSearch.add(cbxStatusFilter);
        txtSearch = new JTextField(20);
        panelSearch.add(txtSearch);
        panelSearch.add(new JButton("Tìm kiếm"));
        
        // Row 2: Actions
        JPanel panelActions = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnAdd = new JButton("Thêm mới");
        JButton btnUpdate = new JButton("Cập nhật");
        JButton btnDelete = new JButton("Xóa");
        JButton btnReset = new JButton("Làm mới");
        panelActions.add(btnAdd); panelActions.add(btnUpdate); 
        panelActions.add(btnDelete); panelActions.add(btnReset);

        panelToolbar.add(panelSearch);
        panelToolbar.add(panelActions);
        panelLeft.add(panelToolbar, BorderLayout.NORTH);

        // Table Guests
        String[] columns = {"ID", "Họ tên", "CCCD", "SĐT", "Trạng thái"};
        modelGuests = new DefaultTableModel(columns, 0);
        tableGuests = new JTable(modelGuests);
        tableGuests.setRowHeight(25);
        JScrollPane scrollTable = new JScrollPane(tableGuests); // Quan trọng: Phải có ScrollPane
        panelLeft.add(scrollTable, BorderLayout.CENTER);

        panelMain.add(panelLeft, BorderLayout.CENTER);

        // --- RIGHT SIDE: Details Form ---
        JPanel panelRight = new JPanel();
        panelRight.setPreferredSize(new Dimension(400, 0));
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        
        // Guest Info Group
        JPanel panelGuestInfo = new JPanel(new GridLayout(7, 2, 5, 10));
        panelGuestInfo.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "Thông tin chi tiết"));
        
        panelGuestInfo.add(new JLabel(" Mã khách:"));
        txtGuestID = new JTextField(); txtGuestID.setEditable(false);
        panelGuestInfo.add(txtGuestID);

        panelGuestInfo.add(new JLabel(" Họ tên:"));
        txtFullName = new JTextField();
        panelGuestInfo.add(txtFullName);

        panelGuestInfo.add(new JLabel(" Ngày sinh:"));
        spinnerDOB = new JSpinner(new SpinnerDateModel());
        spinnerDOB.setEditor(new JSpinner.DateEditor(spinnerDOB, "dd/MM/yyyy"));
        panelGuestInfo.add(spinnerDOB);

        panelGuestInfo.add(new JLabel(" CCCD:"));
        txtIDCard = new JTextField();
        panelGuestInfo.add(txtIDCard);

        panelGuestInfo.add(new JLabel(" Số điện thoại:"));
        txtPhone = new JTextField();
        panelGuestInfo.add(txtPhone);

        panelGuestInfo.add(new JLabel(" Email:"));
        txtEmail = new JTextField();
        panelGuestInfo.add(txtEmail);

        panelGuestInfo.add(new JLabel(" Trạng thái:"));
        cbxStatusDetail = new JComboBox<>(new String[]{"Đang thuê", "Đã rời đi"});
        panelGuestInfo.add(cbxStatusDetail);

        panelRight.add(panelGuestInfo);
        panelRight.add(Box.createVerticalStrut(10));

        // Contract Info Group
        String[] colHD = {"Mã HD", "Phòng", "Vai trò"};
        modelContracts = new DefaultTableModel(colHD, 0);
        tableContracts = new JTable(modelContracts);
        JScrollPane scrollContract = new JScrollPane(tableContracts);
        scrollContract.setBorder(new TitledBorder("Hợp đồng liên quan"));
        scrollContract.setPreferredSize(new Dimension(0, 200));
        
        panelRight.add(scrollContract);
        panelMain.add(panelRight, BorderLayout.EAST);

        // --- Dữ liệu mẫu & Sự kiện ---
        loadSampleData();
        setupEvents();
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
                    cbxStatusDetail.setSelectedItem(modelGuests.getValueAt(row, 4).toString());
                }
            }
        });
    }
}