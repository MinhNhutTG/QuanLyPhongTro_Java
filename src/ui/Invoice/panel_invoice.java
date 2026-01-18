package ui.Invoice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Date;
import java.util.Calendar;

public class panel_invoice extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtSearch;
    private JTable table;
    private DefaultTableModel model;
    private ButtonGroup bgPaymentStatus; // Nhóm RadioButton

    public panel_invoice() {
        this.setSize(1200, 800);
        setLayout(new BorderLayout(0, 0));

        // --- 1. HEADER TITLE ---
        JPanel panelHeader = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelHeader.setBackground(new Color(39, 83, 138));
        panelHeader.setPreferredSize(new Dimension(10, 50));
        
        JLabel lblTitle = new JLabel(" QUẢN LÝ HÓA ĐƠN");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        panelHeader.add(lblTitle);
        add(panelHeader, BorderLayout.NORTH);

        // --- 2. MAIN CONTENT AREA ---
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelMain.setBackground(Color.WHITE);
        add(panelMain, BorderLayout.CENTER);

        // --- 3. FILTER SECTION ---
        JPanel panelFilterContainer = new JPanel();
        panelFilterContainer.setBackground(Color.WHITE);
        panelFilterContainer.setMaximumSize(new Dimension(32767, 100));
        panelFilterContainer.setLayout(new BoxLayout(panelFilterContainer, BoxLayout.X_AXIS));

        // Lọc theo thời gian và trạng thái
        JPanel panelFilterLeft = new JPanel();
        panelFilterLeft.setBorder(new TitledBorder(null, "Bộ lọc hóa đơn", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY));
        panelFilterLeft.setBackground(Color.WHITE);
        panelFilterLeft.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        panelFilterLeft.add(new JLabel("Tháng/Năm:"));
        JSpinner spinnerDate = new JSpinner(new SpinnerDateModel());
        spinnerDate.setEditor(new JSpinner.DateEditor(spinnerDate, "MM/yyyy"));
        spinnerDate.setPreferredSize(new Dimension(120, 30));
        panelFilterLeft.add(spinnerDate);

        // Radio Buttons Trạng thái
        bgPaymentStatus = new ButtonGroup();
        JRadioButton rdPaid = new JRadioButton("Đã thanh toán");
        JRadioButton rdUnpaid = new JRadioButton("Chưa thanh toán");
        rdPaid.setBackground(Color.WHITE);
        rdUnpaid.setBackground(Color.WHITE);
        bgPaymentStatus.add(rdPaid);
        bgPaymentStatus.add(rdUnpaid);
        
        panelFilterLeft.add(new JLabel("| Trạng thái:"));
        panelFilterLeft.add(rdPaid);
        panelFilterLeft.add(rdUnpaid);

        panelFilterContainer.add(panelFilterLeft);

        // Ô tìm kiếm nhanh
        JPanel panelSearch = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        panelSearch.setBackground(Color.WHITE);
        txtSearch = new JTextField(20);
        txtSearch.setPreferredSize(new Dimension(200, 35));
        JButton btnSearch = new JButton("Tìm kiếm");
        btnSearch.setPreferredSize(new Dimension(100, 35));
        panelSearch.add(txtSearch);
        panelSearch.add(btnSearch);

        panelFilterContainer.add(panelSearch);
        panelMain.add(panelFilterContainer);
        panelMain.add(Box.createVerticalStrut(10));

        // --- 4. TABLE & ACTION BUTTONS ---
        JPanel panelTableArea = new JPanel(new BorderLayout(10, 0));
        panelTableArea.setBackground(Color.WHITE);

        // Table
        String[] columns = {"Mã hóa đơn", "Phòng", "Khách hàng", "Ngày lập", "Tổng tiền", "Trạng thái"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        table.setRowHeight(30);
        JScrollPane scrollPane = new JScrollPane(table);
        panelTableArea.add(scrollPane, BorderLayout.CENTER);

        // Nút chức năng (Cột bên phải)
        JPanel panelActions = new JPanel();
        panelActions.setPreferredSize(new Dimension(180, 0));
        panelActions.setBackground(Color.WHITE);
        panelActions.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        String[] btnLabels = {"Tạo HD tự động", "Tạo hóa đơn", "Chỉnh sửa", "Xóa hóa đơn", "Xem chi tiết", "In hóa đơn"};
        for (String label : btnLabels) {
            JButton btn = new JButton(label);
            btn.setPreferredSize(new Dimension(160, 40));
            btn.setFocusPainted(false);
            if(label.equals("Xóa hóa đơn")) btn.setForeground(Color.RED);
            panelActions.add(btn);
        }

        panelTableArea.add(panelActions, BorderLayout.EAST);
        panelMain.add(panelTableArea);

        loadDummyData();
    }

    private void loadDummyData() {
        model.addRow(new Object[]{"INV001", "P.101", "Nguyễn Văn A", "15/01/2026", "3,750,000", "Đã thanh toán"});
        model.addRow(new Object[]{"INV002", "P.202", "Lê Thị B", "16/01/2026", "4,200,000", "Chưa thanh toán"});
        model.addRow(new Object[]{"INV003", "P.105", "Trần Văn C", "18/01/2026", "3,100,000", "Chưa thanh toán"});
    }
}