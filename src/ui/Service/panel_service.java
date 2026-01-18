package ui.Service;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

public class panel_service extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField txtSoPhong, txtKi, txtDienCu, txtDienMoi, txtGiaDien, txtNuocCu, txtNuocMoi, txtGiaNuoc, txtTienMang;
    private JTable table;
    private JLabel lblMaHD;

    public panel_service() {
        this.setPreferredSize(new Dimension(1200, 800)); // Kích thước chuẩn linh hoạt hơn 1080p
        setLayout(new BorderLayout(0, 0));

        // --- PANEL TRÊN CÙNG: TIÊU ĐỀ ---
        JPanel pnlHeader = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
        pnlHeader.setBackground(new Color(39, 83, 138));
        JLabel lblTitle = new JLabel("QUẢN LÝ DỊCH VỤ PHÒNG");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("SansSerif", Font.BOLD, 18));
        pnlHeader.add(lblTitle);
        add(pnlHeader, BorderLayout.NORTH);

        // PANEL CHÍNH CHỨA TOOLBAR + FORM + TABLE
        JPanel pnlMain = new JPanel();
        pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
        pnlMain.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(pnlMain, BorderLayout.CENTER);

        // --- 1. TOOLBAR: BỘ LỌC VÀ NÚT BẤM ---
        JPanel pnlToolbar = new JPanel();
        pnlToolbar.setLayout(new BoxLayout(pnlToolbar, BoxLayout.X_AXIS));
        pnlToolbar.setMaximumSize(new Dimension(32767, 80));
        
        // Nhóm sắp xếp
        JPanel pnlSort = new JPanel(new GridLayout(2, 1));
        pnlSort.setBorder(new TitledBorder("Sắp xếp"));
        JRadioButton rdGần = new JRadioButton("Kì gần nhất", true);
        JRadioButton rdXa = new JRadioButton("Kì xa nhất");
        ButtonGroup bgSort = new ButtonGroup();
        bgSort.add(rdGần); bgSort.add(rdXa);
        pnlSort.add(rdGần); pnlSort.add(rdXa);
        pnlToolbar.add(pnlSort);

        pnlToolbar.add(Box.createHorizontalStrut(10));

        // Nhóm Trạng thái
        JPanel pnlStatusFilter = new JPanel(new BorderLayout());
        pnlStatusFilter.setBorder(new TitledBorder("Trạng thái"));
        JComboBox<String> cbFilterStatus = new JComboBox<>(new String[]{"Tất cả", "Đã thanh toán", "Chưa thanh toán"});
        pnlStatusFilter.add(cbFilterStatus);
        pnlToolbar.add(pnlStatusFilter);

        pnlToolbar.add(Box.createHorizontalGlue());

        // Nhóm Nút chức năng
        String[] btnLabels = {"Thêm mới", "Chỉnh sửa", "Xóa", "Làm mới", "Quản lý giá"};
        for (String label : btnLabels) {
            JButton btn = new JButton(label);
            btn.setPreferredSize(new Dimension(120, 35));
            pnlToolbar.add(btn);
            pnlToolbar.add(Box.createHorizontalStrut(5));
            
            if(label.equals("Quản lý giá")) {
                btn.addActionListener(e -> {
                    // add_edit_service modify_service = new add_edit_service();
                    // modify_service.setVisible(true);
                    JOptionPane.showMessageDialog(this, "Mở Quản lý giá dịch vụ");
                });
            }
        }
        pnlMain.add(pnlToolbar);
        pnlMain.add(Box.createVerticalStrut(10));

        // --- 2. FORM: CẬP NHẬT DỊCH VỤ (GridBagLayout cho cân đối) ---
        JPanel pnlForm = new JPanel(new GridBagLayout());
        pnlForm.setBorder(new TitledBorder("Cập nhật dịch vụ phòng"));
        pnlForm.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Dòng 1: Mã HD và Số Phòng
        gbc.gridx = 0; gbc.gridy = 0; pnlForm.add(new JLabel("Mã sử dụng:"), gbc);
        lblMaHD = new JLabel("HD222"); lblMaHD.setFont(new Font("Dialog", Font.BOLD, 14)); gbc.gridx = 1; pnlForm.add(lblMaHD, gbc);
        gbc.gridx = 2; pnlForm.add(new JLabel("Số phòng:"), gbc);
        txtSoPhong = new JTextField(10); gbc.gridx = 3; pnlForm.add(txtSoPhong, gbc);

        // Dòng 2: Chỉ số điện
        gbc.gridx = 0; gbc.gridy = 1; pnlForm.add(new JLabel("Số điện cũ:"), gbc);
        txtDienCu = new JTextField(10); gbc.gridx = 1; pnlForm.add(txtDienCu, gbc);
        gbc.gridx = 2; gbc.gridy = 1; pnlForm.add(new JLabel("Số điện mới:"), gbc);
        txtDienMoi = new JTextField(10); gbc.gridx = 3; pnlForm.add(txtDienMoi, gbc);

        // Dòng 3: Chỉ số nước
        gbc.gridx = 0; gbc.gridy = 2; pnlForm.add(new JLabel("Số nước cũ:"), gbc);
        txtNuocCu = new JTextField(10); gbc.gridx = 1; pnlForm.add(txtNuocCu, gbc);
        gbc.gridx = 2; gbc.gridy = 2; pnlForm.add(new JLabel("Số nước mới:"), gbc);
        txtNuocMoi = new JTextField(10); gbc.gridx = 3; pnlForm.add(txtNuocMoi, gbc);

        // Dòng 4: Các thông tin khác
        gbc.gridx = 0; gbc.gridy = 3; pnlForm.add(new JLabel("Ngày tạo:"), gbc);
        JSpinner spinDate = new JSpinner(new SpinnerDateModel());
        gbc.gridx = 1; pnlForm.add(spinDate, gbc);
        gbc.gridx = 2; pnlForm.add(new JLabel("Tiền mạng:"), gbc);
        txtTienMang = new JTextField(10); gbc.gridx = 3; pnlForm.add(txtTienMang, gbc);

        pnlMain.add(pnlForm);
        pnlMain.add(Box.createVerticalStrut(10));

        // --- 3. BẢNG DỮ LIỆU (Có ScrollPane) ---
        String[] columns = {"Mã HD", "Phòng", "Kì", "Điện Cũ", "Điện Mới", "Nước Cũ", "Nước Mới", "Mạng", "Ngày tạo", "Trạng thái"};
        DefaultTableModel model = new DefaultTableModel(columns, 20);
        table = new JTable(model);
        table.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(table);
        pnlMain.add(scrollPane);

        // --- 4. PANEL PHỤ TRỢ DƯỚI CÙNG ---
        JPanel pnlFooter = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlFooter.add(new JButton("<< Phòng trước"));
        pnlFooter.add(new JButton("Phòng tiếp theo >>"));
        add(pnlFooter, BorderLayout.SOUTH);
    }
}