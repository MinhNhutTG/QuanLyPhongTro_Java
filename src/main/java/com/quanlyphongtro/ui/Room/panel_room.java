package com.quanlyphongtro.ui.Room;

import com.quanlyphongtro.config.SpringContext;
import com.quanlyphongtro.dto.PhongDto;
import com.quanlyphongtro.service.PhongService;

import javax.swing.*;

import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

@org.springframework.stereotype.Component
public class panel_room extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;
    

    // Hệ thống màu sắc đồng bộ (Modern UI)
    private final Color PRIMARY_COLOR = new Color(41, 128, 185);    // Blue
    private final Color SUCCESS_COLOR = new Color(39, 174, 96);    // Green
    private final Color DANGER_COLOR = new Color(231, 76, 60);     // Red
    private final Color PURPLE_COLOR = new Color(155, 89, 182);   // Purple
    private final Color BACKGROUND_COLOR = new Color(240, 242, 245);
    private final Font MAIN_FONT = new Font("Segoe UI", Font.PLAIN, 14);

    private final PhongService phongService;

    private JButton btnAdd;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JButton btnTypeMgmt;




    public panel_room() {
    	this.phongService =
                SpringContext.getBean(PhongService.class);
        // Cấu hình tổng thể
        setBackground(BACKGROUND_COLOR);
        setLayout(new BorderLayout(0, 0));
        setBorder(new EmptyBorder(25, 25, 25, 25));

        // --- 1. TOP: TIÊU ĐỀ VÀ BỘ LỌC ---
        add(createTopPanel(), BorderLayout.NORTH);

        // --- 2. MAIN CONTENT AREA ---
        JPanel panelMain = new JPanel(new BorderLayout(0, 15));
        panelMain.setOpaque(false);
        panelMain.setBorder(new EmptyBorder(15, 0, 0, 0));

        // Toolbar: Nhóm các nút chức năng
        panelMain.add(createToolbar(), BorderLayout.NORTH);

        // Table: Danh sách phòng
        panelMain.add(createTableSection(), BorderLayout.CENTER);

        add(panelMain, BorderLayout.CENTER);

        loadPhongFromDB();

        setupEvent();

    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);

        JLabel lblTitle = new JLabel("Quản Lý Danh Sách Phòng");
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 26));
        lblTitle.setForeground(new Color(33, 37, 41));
        
        // Panel bên phải cho các bộ lọc ComboBox
        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 0));
        filterPanel.setOpaque(false);
        
        // Filter Loại Phòng
        filterPanel.add(new JLabel("Loại:"));
        JComboBox<String> cbxType = new JComboBox<>(new String[]{"Tất cả", "Phòng Đơn", "Phòng Đôi", "VIP"});
        cbxType.setPreferredSize(new Dimension(130, 35));
        filterPanel.add(cbxType);
        
        // Filter Trạng Thái
        filterPanel.add(new JLabel("Trạng thái:"));
        JComboBox<String> cbxStatus = new JComboBox<>(new String[]{"Tất cả", "Trống", "Đang thuê", "Bảo trì"});
        cbxStatus.setPreferredSize(new Dimension(130, 35));
        filterPanel.add(cbxStatus);

        panel.add(lblTitle, BorderLayout.WEST);
        panel.add(filterPanel, BorderLayout.EAST);
        return panel;
    }

    private JPanel createToolbar() {
        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        toolbar.setOpaque(false);

        btnAdd = createStyledButton(" Thêm mới ", SUCCESS_COLOR, Color.WHITE);
        btnUpdate = createStyledButton(" Cập nhật ", PRIMARY_COLOR, new Color(50, 50, 50));
        btnDelete = createStyledButton(" Xóa khách ", DANGER_COLOR, Color.WHITE);
        btnTypeMgmt = createStyledButton("  Quản lý loại phòng ", new Color(108, 117, 125), Color.WHITE);

        toolbar.add(btnAdd);
        toolbar.add(btnUpdate);
        toolbar.add(btnDelete);
        toolbar.add(btnTypeMgmt);


        return toolbar;
    }

    private JScrollPane createTableSection() {
        String[] columns = {"Số phòng", "Loại phòng", "Giá phòng", "Trạng thái"};
        model = new DefaultTableModel(columns, 0) {
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

        // Căn giữa dữ liệu cho cột Số phòng và Trạng thái
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer); // Trạng thái

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
    private void setupEvent() {
    	btnAdd.addActionListener(e -> {
            new add_edit_room().setVisible(true);
        });
    	btnUpdate.addActionListener(e -> {
    		new add_edit_room().setVisible(true);
    	});
    	btnTypeMgmt.addActionListener(e->{
    		new add_edit_room_typeroom().setVisible(true);
    	});
    }

    private void loadPhongFromDB() {
        model.setRowCount(0); // clear table

        for (PhongDto dto : phongService.getAllPhong()) {
            model.addRow(new Object[]{
                dto.getSoPhong(),
                dto.getTenLoai(),
                dto.getGiaPhong(),
                dto.getTrangThai()
            });
        }
    }

}