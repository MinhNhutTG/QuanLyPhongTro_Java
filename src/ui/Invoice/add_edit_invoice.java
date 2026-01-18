package ui.Invoice;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class add_edit_invoice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_edit_invoice frame = new add_edit_invoice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public add_edit_invoice() {
		setTitle("Bill");
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout(10, 10));

        // --- PANEL TRÊN CÙNG: Radio Buttons ---
        JPanel pnlTop = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 10));
        JRadioButton rbPhong = new JRadioButton("Tính hóa đơn tiền phòng", true);
        JRadioButton rbDichVu = new JRadioButton("Tính hóa đơn dịch vụ khác");
        ButtonGroup bgType = new ButtonGroup();
        bgType.add(rbPhong); bgType.add(rbDichVu);
        pnlTop.add(rbPhong); pnlTop.add(rbDichVu);
        add(pnlTop, BorderLayout.NORTH);

        // --- TRUNG TÂM: CHIA 2 CỘT ---
        JPanel pnlCenter = new JPanel(new GridLayout(1, 2, 20, 0));
        pnlCenter.setBorder(new EmptyBorder(0, 10, 10, 10));
        add(pnlCenter, BorderLayout.CENTER);

        // ================= CỘT TRÁI =================
        JPanel pnlLeft = new JPanel();
        pnlLeft.setLayout(new BoxLayout(pnlLeft, BoxLayout.Y_AXIS));
        pnlCenter.add(pnlLeft);

        // Group Hóa đơn
        JPanel pnlHoaDon = createGroupPanel("Hóa đơn", 130);
        pnlHoaDon.add(createRow("Mã hóa đơn", createTextWithIcon("HD273", "🔄")));
        pnlHoaDon.add(createRow("Trạng thái", new JComboBox<>(new String[]{"Chưa Thanh Toán"})));
        pnlHoaDon.add(createRow("Ngày lập", new JTextField("3/17/2025")));
        pnlLeft.add(pnlHoaDon);

        // Group Chọn phòng
        JPanel pnlChonPhong = createGroupPanel("Chọn phòng", 60);
        pnlChonPhong.add(createRow("Phòng", new JComboBox<>(new String[]{"Phòng 101", "Phòng 102"})));
        pnlLeft.add(pnlChonPhong);

        // Group Lịch sử sử dụng dịch vụ
        JPanel pnlLichSu = createGroupPanel("Lịch sử sử dụng dịch vụ", 200);
        String[] cols = {"Mã dịch vụ", "Kì", "Ngày tạo"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        JTable tblLichSu = new JTable(model);
        pnlLichSu.add(new JScrollPane(tblLichSu));
        pnlLeft.add(pnlLichSu);

        // Group Ghi chú
        JPanel pnlGhiChu = createGroupPanel("Ghi chú", 100);
        pnlGhiChu.add(new JScrollPane(new JTextArea()));
        pnlLeft.add(pnlGhiChu);

        // ================= CỘT PHẢI =================
        JPanel pnlRight = new JPanel();
        pnlRight.setLayout(new BoxLayout(pnlRight, BoxLayout.Y_AXIS));
        pnlCenter.add(pnlRight);

        // Các nhóm dịch vụ (Màu xanh lá)
        pnlRight.add(createServiceDetail("Phòng", "Loại phòng: 0", "Giá tiền: 0"));
        pnlRight.add(createServiceDetail("Dịch vụ đã sử dụng", "Mã lịch sử: 0", ""));
        pnlRight.add(createServiceDetail("Dịch vụ điện", "Số kí điện: 0", "Thành tiền: 0"));
        pnlRight.add(createServiceDetail("Dịch vụ nước", "Số khối nước: 0", "Thành tiền: 0"));
        pnlRight.add(createServiceDetail("Các dịch vụ khác", "Tiền mạng : 0", "Tiền dịch vụ khác: 0"));

        // --- FOOTER CỘT PHẢI: Tổng tiền ---
        JPanel pnlFooterRight = new JPanel(new BorderLayout());
        pnlFooterRight.setMaximumSize(new Dimension(500, 80));
        
        JLabel lblTongTien = new JLabel("🔄 Tổng tiền : 0       VND", SwingConstants.RIGHT);
        lblTongTien.setFont(new Font("Arial", Font.BOLD, 16));
        lblTongTien.setForeground(Color.RED);
        pnlFooterRight.add(lblTongTien, BorderLayout.NORTH);

        JButton btnLuu = new JButton("Lưu");
        btnLuu.setBackground(new Color(21, 115, 71));
        btnLuu.setForeground(Color.WHITE);
        btnLuu.setPreferredSize(new Dimension(150, 40));
        JPanel pnlBtn = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnlBtn.add(btnLuu);
        pnlFooterRight.add(pnlBtn, BorderLayout.CENTER);
        
        pnlRight.add(pnlFooterRight);

	}
	private JPanel createGroupPanel(String title, int height) {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setBorder(new TitledBorder(title));
        p.setMaximumSize(new Dimension(500, height));
        return p;
    }

    // Hàm tạo dòng nhãn - ô nhập
    private JPanel createRow(String label, JComponent comp) {
        JPanel p = new JPanel(new BorderLayout(10, 0));
        p.setBorder(new EmptyBorder(2, 5, 2, 5));
        JLabel lbl = new JLabel(label);
        lbl.setPreferredSize(new Dimension(100, 25));
        p.add(lbl, BorderLayout.WEST);
        p.add(comp, BorderLayout.CENTER);
        return p;
    }

    // Hàm tạo ô text có icon refresh bên cạnh
    private JPanel createTextWithIcon(String text, String icon) {
        JPanel p = new JPanel(new BorderLayout(5, 0));
        p.add(new JTextField(text), BorderLayout.CENTER);
        p.add(new JLabel(icon), BorderLayout.EAST);
        return p;
    }

    // Hàm tạo khối chi tiết dịch vụ (Bên phải)
    private JPanel createServiceDetail(String title, String line1, String line2) {
        JPanel p = new JPanel(new GridLayout(2, 1));
        TitledBorder border = new TitledBorder(title);
        border.setTitleColor(new Color(0, 153, 0)); // Màu xanh lá
        p.setBorder(border);
        p.setMaximumSize(new Dimension(500, 70));

        JLabel lbl1 = new JLabel("      " + line1);
        p.add(lbl1);
        
        if (!line2.isEmpty()) {
            JLabel lbl2 = new JLabel("      " + line2);
            if (line2.contains("Giá tiền") || line2.contains("Thành tiền") || line2.contains("Tiền")) {
                lbl2.setForeground(Color.RED); // Đổi màu đỏ cho phần tiền
            }
            p.add(lbl2);
        }
        return p;
    }

}
