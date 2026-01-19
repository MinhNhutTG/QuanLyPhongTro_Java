package com.quanlyphongtro.ui.Room;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class add_edit_room extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_edit_room frame = new add_edit_room();
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
	public add_edit_room() {
		setTitle("ModifyRoom");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- 1. TOOLBAR (Phía trên - Màu xanh nhạt) ---
        JPanel toolbar = new JPanel(new FlowLayout(FlowLayout.RIGHT, 15, 10));
        toolbar.setBackground(new Color(191, 205, 226)); // Màu xanh pastel
        
        JButton btnSave = new JButton("💾"); // Bạn có thể thay bằng Icon thực tế
        JButton btnRefresh = new JButton("🔄");
        
        // Làm phẳng nút bấm cho giống style modern
        btnSave.setContentAreaFilled(false);
        btnRefresh.setContentAreaFilled(false);
        
        toolbar.add(btnSave);
        toolbar.add(btnRefresh);
        add(toolbar, BorderLayout.NORTH);

        // --- 2. MAIN CONTENT (Phần thân) ---
        JPanel mainPanel = new JPanel(null); // Sử dụng Absolute Layout để căn chỉnh chính xác như ảnh
        mainPanel.setBackground(new Color(245, 245, 245));

        // Group: Số phòng
        JPanel pnlSoPhong = createGroupBox("Số phòng", 40, 30, 250, 60);
        JTextField txtSoPhong = new JTextField();
        txtSoPhong.setBounds(15, 20, 220, 25);
        txtSoPhong.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 120, 215))); // Gạch chân xanh
        pnlSoPhong.add(txtSoPhong);
        mainPanel.add(pnlSoPhong);

        // Group: Loại Phòng
        JPanel pnlLoaiPhong = createGroupBox("Loại Phòng", 40, 110, 250, 60);
        String[] loaiPhongs = {"--Tất cả--", "Phòng đơn", "Phòng đôi"};
        JComboBox<String> cbLoaiPhong = new JComboBox<>(loaiPhongs);
        cbLoaiPhong.setBounds(15, 20, 220, 25);
        pnlLoaiPhong.add(cbLoaiPhong);
        mainPanel.add(pnlLoaiPhong);

        // Group: Trạng thái (Radio Buttons)
        JPanel pnlTrangThai = createGroupBox("Trạng thái", 320, 30, 330, 140);
        pnlTrangThai.setLayout(new GridLayout(3, 1, 5, 5));
        JRadioButton rbTrong = new JRadioButton("Trống");
        JRadioButton rbDangThue = new JRadioButton("Đang thuê");
        JRadioButton rbSuaChua = new JRadioButton("Đang sửa chữa");
        
        // Group các radio lại để chỉ chọn được 1
        ButtonGroup groupTrangThai = new ButtonGroup();
        groupTrangThai.add(rbTrong);
        groupTrangThai.add(rbDangThue);
        groupTrangThai.add(rbSuaChua);

        // Căn lề cho radio button
        rbTrong.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        pnlTrangThai.add(rbTrong);
        pnlTrangThai.add(rbDangThue);
        pnlTrangThai.add(rbSuaChua);
        mainPanel.add(pnlTrangThai);

        // Group: Ghi chú
        JPanel pnlGhiChu = createGroupBox("Ghi chú", 40, 190, 610, 150);
        JTextArea txtGhiChu = new JTextArea();
        txtGhiChu.setBorder(new LineBorder(Color.LIGHT_GRAY));
        JScrollPane scrollGhiChu = new JScrollPane(txtGhiChu);
        scrollGhiChu.setBounds(15, 25, 580, 110);
        pnlGhiChu.add(scrollGhiChu);
        mainPanel.add(pnlGhiChu);

        add(mainPanel, BorderLayout.CENTER);

	}
	private JPanel createGroupBox(String title, int x, int y, int width, int height) {
        JPanel panel = new JPanel(null);
        panel.setBounds(x, y, width, height);
        panel.setOpaque(false);
        TitledBorder border = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.LIGHT_GRAY), title);
        border.setTitleFont(new Font("Arial", Font.PLAIN, 14));
        panel.setBorder(border);
        return panel;
    }

}
