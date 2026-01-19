package com.quanlyphongtro.ui.Room;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class add_edit_room_typeroom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_edit_room_typeroom frame = new add_edit_room_typeroom();
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
	public add_edit_room_typeroom() {
		setTitle("ModifyTypeRoom");
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // --- CỘT TRÁI: BẢNG DỮ LIỆU ---
        String[] cols = {"Mã Loại", "Tên Loại", "Giá"};
        Object[][] data = {{"L1", "Phòng một người", "1,200,000"}, {"L2", "Phòng hai người", "1,500,000"}};
        JTable table = new JTable(new DefaultTableModel(data, cols));
        JScrollPane scroll = new JScrollPane(table);
        
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.weightx = 0.6; gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(scroll, gbc);

        // --- CỘT PHẢI: FORM NHẬP ---
        JPanel rightPanel = new JPanel(null);
        gbc.gridx = 1; gbc.weightx = 0.4;
        add(rightPanel, gbc);

        // Các ô Input dùng TitledBorder
        String[] labels = {"Mã Loại", "Tên loại", "Giá"};
        for (int i = 0; i < 3; i++) {
            JPanel p = new JPanel(new BorderLayout());
            p.setBorder(new TitledBorder(labels[i]));
            p.setBounds(10, 10 + (i * 70), 280, 55);
            p.add(new JTextField());
            rightPanel.add(p);
        }

        // Nút bấm
        JButton btnLuu = new JButton("Lưu");
        btnLuu.setBackground(new Color(0, 120, 215));
        btnLuu.setForeground(Color.WHITE);
        btnLuu.setBounds(10, 230, 100, 40);

        JButton btnXoa = new JButton("Xóa");
        btnXoa.setBackground(new Color(0, 120, 215));
        btnXoa.setForeground(Color.WHITE);
        btnXoa.setBounds(120, 230, 100, 40);

        JButton btnReset = new JButton("🔄");
        btnReset.setBounds(230, 230, 50, 40);

        rightPanel.add(btnLuu);
        rightPanel.add(btnXoa);
        rightPanel.add(btnReset);
    }

	}


