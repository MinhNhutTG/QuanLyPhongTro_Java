package ui.Room;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panel_room extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;

    public panel_room() {
        this.setSize(1200, 800);
        setLayout(new BorderLayout(0, 0));

        // --- 1. HEADER TITLE ---
        JPanel panelHeader = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelHeader.setBackground(new Color(39, 83, 138));
        panelHeader.setPreferredSize(new Dimension(10, 50));
        
        JLabel lblTitle = new JLabel(" QUẢN LÝ DANH SÁCH PHÒNG");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
        panelHeader.add(lblTitle);
        add(panelHeader, BorderLayout.NORTH);

        // --- 2. MAIN CONTAINER ---
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelMain.setBackground(Color.WHITE);
        add(panelMain, BorderLayout.CENTER);

        // --- 3. TOOLBAR (Nút bấm & Bộ lọc) ---
        JPanel panelToolbar = new JPanel();
        panelToolbar.setBackground(Color.WHITE);
        panelToolbar.setMaximumSize(new Dimension(32767, 50));
        panelToolbar.setLayout(new BoxLayout(panelToolbar, BoxLayout.X_AXIS));

        // Nhóm nút chức năng
        JButton btnAdd = createButton("Thêm phòng", new Color(46, 204, 113));
        JButton btnEdit = createButton("Sửa phòng", new Color(52, 152, 219));
        JButton btnDelete = createButton("Xóa phòng", new Color(231, 76, 60));
        JButton btnTypeMgmt = createButton("Loại phòng", new Color(155, 89, 182));

        panelToolbar.add(btnAdd);
        panelToolbar.add(Box.createHorizontalStrut(10));
        panelToolbar.add(btnEdit);
        panelToolbar.add(Box.createHorizontalStrut(10));
        panelToolbar.add(btnDelete);
        panelToolbar.add(Box.createHorizontalStrut(10));
        panelToolbar.add(btnTypeMgmt);

        // Khoảng trắng đẩy bộ lọc về bên phải
        panelToolbar.add(Box.createHorizontalGlue());

        // Bộ lọc
        panelToolbar.add(new JLabel("Loại: "));
        JComboBox<String> cbxType = new JComboBox<>(new String[]{"Tất cả", "Phòng Đơn", "Phòng Đôi", "VIP"});
        cbxType.setMaximumSize(new Dimension(150, 30));
        panelToolbar.add(cbxType);
        
        panelToolbar.add(Box.createHorizontalStrut(10));
        
        panelToolbar.add(new JLabel("Trạng thái: "));
        JComboBox<String> cbxStatus = new JComboBox<>(new String[]{"Tất cả", "Trống", "Đang thuê", "Bảo trì"});
        cbxStatus.setMaximumSize(new Dimension(150, 30));
        panelToolbar.add(cbxStatus);

        panelMain.add(panelToolbar);
        panelMain.add(Box.createVerticalStrut(15));

        // --- 4. TABLE VIEW ---
        String[] columns = {"Số phòng", "Loại phòng", "Giá phòng", "Số người tối đa", "Trạng thái"};
        model = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };

        table = new JTable(model);
        table.setRowHeight(30);
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
        
        JScrollPane scrollPane = new JScrollPane(table);
        panelMain.add(scrollPane);

        // --- 5. EVENTS ---
        btnTypeMgmt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Giả sử add_edit_room_typeroom là JFrame hoặc JDialog của bạn
                // typeRoomFrame.setVisible(true);
                JOptionPane.showMessageDialog(null, "Mở cửa sổ Quản lý loại phòng");
            }
        });

        loadDummyData();
    }

    private JButton createButton(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setBackground(bg);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setPreferredSize(new Dimension(130, 35));
        btn.setMaximumSize(new Dimension(130, 35));
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        return btn;
    }

    private void loadDummyData() {
        model.addRow(new Object[]{"101", "Phòng Đơn", "2.500.000", "1", "Trống"});
        model.addRow(new Object[]{"102", "Phòng Đôi", "4.000.000", "2", "Đang thuê"});
        model.addRow(new Object[]{"201", "VIP", "7.000.000", "4", "Bảo trì"});
        model.addRow(new Object[]{"202", "Phòng Đôi", "4.000.000", "2", "Trống"});
    }
}