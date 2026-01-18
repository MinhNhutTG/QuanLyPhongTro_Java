package ui.Contract;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class panel_contract extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;
    private JComboBox<String> cbxStatusFilter;

    public panel_contract() {
        // Cấu hình tổng thể
        setLayout(new BorderLayout(0, 0));
        this.setSize(1200, 800); 
        setBackground(Color.WHITE);

        // --- 1. HEADER TITLE ---
        JPanel panelHeader = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelHeader.setBackground(new Color(39, 83, 138));
        panelHeader.setPreferredSize(new Dimension(10, 50));
        
        JLabel lblTitle = new JLabel(" QUẢN LÝ HỢP ĐỒNG");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        panelHeader.add(lblTitle);
        add(panelHeader, BorderLayout.NORTH);

        // --- 2. MAIN CONTENT AREA ---
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBorder(new EmptyBorder(15, 15, 15, 15));
        panelMain.setBackground(Color.WHITE);
        add(panelMain, BorderLayout.CENTER);

        // --- 3. TOOLBAR (FILTER & BUTTONS) ---
        JPanel panelToolbar = new JPanel();
        panelToolbar.setBackground(Color.WHITE);
        panelToolbar.setMaximumSize(new Dimension(32767, 45));
        panelToolbar.setLayout(new BoxLayout(panelToolbar, BoxLayout.X_AXIS));

        // Filter
        panelToolbar.add(new JLabel("Lọc trạng thái: "));
        cbxStatusFilter = new JComboBox<>(new String[]{"Tất cả hợp đồng", "Đang hiệu lực", "Đã thanh lý", "Quá hạn"});
        cbxStatusFilter.setMaximumSize(new Dimension(200, 30));
        panelToolbar.add(cbxStatusFilter);

        panelToolbar.add(Box.createHorizontalGlue()); // Đẩy các nút về phía bên phải

        // Buttons
        JButton btnAdd = createStyledButton("Thêm hợp đồng", new Color(46, 204, 113));
        JButton btnEdit = createStyledButton("Chỉnh sửa", new Color(52, 152, 219));
        JButton btnDelete = createStyledButton("Xóa", new Color(231, 76, 60));
        JButton btnRefresh = createStyledButton("Làm mới", new Color(149, 165, 166));

        panelToolbar.add(btnAdd);
        panelToolbar.add(Box.createHorizontalStrut(10));
        panelToolbar.add(btnEdit);
        panelToolbar.add(Box.createHorizontalStrut(10));
        panelToolbar.add(btnDelete);
        panelToolbar.add(Box.createHorizontalStrut(10));
        panelToolbar.add(btnRefresh);

        panelMain.add(panelToolbar);
        panelMain.add(Box.createVerticalStrut(15));

        // --- 4. DATA TABLE ---
        String[] columnNames = {
            "Mã hợp đồng", "Số phòng", "Ngày thuê", "Hạn thuê", "Giá thuê", "Trạng thái", "Ngày tạo"
        };
        
        model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Không cho phép sửa trực tiếp trên bảng
            }
        };

        table = new JTable(model);
        table.setRowHeight(30);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
        table.getTableHeader().setBackground(new Color(240, 240, 240));
        
        // Bọc bảng trong ScrollPane (Quan trọng)
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230)));
        panelMain.add(scrollPane);

        // Thêm dữ liệu mẫu
        loadDummyData();
    }

    // Hàm hỗ trợ tạo Button đẹp hơn
    private JButton createStyledButton(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setBackground(bg);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setPreferredSize(new Dimension(130, 35));
        btn.setMaximumSize(new Dimension(130, 35));
        return btn;
    }

    private void loadDummyData() {
        model.addRow(new Object[]{"HD001", "P.101", "01/01/2026", "12 tháng", "3.500.000", "Đang hiệu lực", "30/12/2025"});
        model.addRow(new Object[]{"HD002", "P.202", "15/01/2026", "6 tháng", "4.000.000", "Đang hiệu lực", "10/01/2026"});
        model.addRow(new Object[]{"HD003", "P.105", "20/12/2025", "12 tháng", "3.200.000", "Đã thanh lý", "15/12/2025"});
    }
}