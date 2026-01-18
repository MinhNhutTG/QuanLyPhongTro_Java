package ui.Contract;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class add_edit_contract extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_edit_contract frame = new add_edit_contract();
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
	public add_edit_contract() {
		setTitle("Contract");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // --- PANEL BÊN TRÁI: Danh sách khách thuê ---
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Bảng 1: Danh sách khách thuê (Trên)
        String[] columnNames1 = {"Mã Khách", "Tên Khách", "Trạng Thái"};
        Object[][] data1 = {
            {"1", "Nguyễn Minh Nhựt", "Đang Thuê"},
            {"2", "Thái Văn Thoại", "Đang Thuê"},
            {"3", "Huỳnh Ngọc Yến", "Đang Thuê"},
            {"1", "Nguyễn Minh Nhựt", "Đang Thuê"},
            {"2", "Thái Văn Thoại", "Đang Thuê"},
            {"3", "Huỳnh Ngọc Yến", "Đang Thuê"},
            {"1", "Nguyễn Minh Nhựt", "Đang Thuê"},
            {"2", "Thái Văn Thoại", "Đang Thuê"},
            {"3", "Huỳnh Ngọc Yến", "Đang Thuê"},
            {"1", "Nguyễn Minh Nhựt", "Đang Thuê"},
            {"2", "Thái Văn Thoại", "Đang Thuê"},
            {"3", "Huỳnh Ngọc Yến", "Đang Thuê"},
            {"1", "Nguyễn Minh Nhựt", "Đang Thuê"},
            {"2", "Thái Văn Thoại", "Đang Thuê"},
            {"3", "Huỳnh Ngọc Yến", "Đang Thuê"}
        };
        JTable tableTop = new JTable(new DefaultTableModel(data1, columnNames1));
        JPanel pnlTable1 = createTitledPanel("Danh sách khách thuê", new JScrollPane(tableTop));

        // Nút bấm Thêm/Loại
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPanel.add(new JButton("Thêm"));
        btnPanel.add(new JButton("Loại"));

        // Bảng 2: Danh sách khách thuê (Dưới)
        String[] columnNames2 = {"Mã...", "Tên Khách", "Vai Trò"};
        JTable tableBottom = new JTable(new DefaultTableModel(new Object[][]{}, columnNames2));
        JPanel pnlTable2 = createTitledPanel("Danh sách khách thuê", new JScrollPane(tableBottom));

        leftPanel.add(pnlTable1);
        leftPanel.add(btnPanel);
        leftPanel.add(pnlTable2);

        // --- PANEL BÊN PHẢI: Thông tin hợp đồng ---
        JPanel rightPanel = new JPanel(new GridBagLayout());
        rightPanel.setBorder(new TitledBorder("Hợp đồng"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Mã hợp đồng
        addFormItem(rightPanel, gbc, 0, "Mã Hợp Đồng:", createContractIDPanel());
        // Trạng thái
        addFormItem(rightPanel, gbc, 1, "Trạng Thái:", new JComboBox<>(new String[]{"Đang Hiệu Lực"}));
        // Các ngày tháng
        addFormItem(rightPanel, gbc, 2, "Ngày tạo hợp đồng:", new JTextField("3/27/2025"));
        addFormItem(rightPanel, gbc, 3, "Ngày Thuê:", new JTextField("3/27/2025"));
        addFormItem(rightPanel, gbc, 4, "Hạn Thuê:", new JTextField("3/27/2025"));
        // Thông tin phòng
        addFormItem(rightPanel, gbc, 5, "Số Phòng:", new JComboBox<>(new String[]{"110"}));
        addFormItem(rightPanel, gbc, 6, "Loại Phòng:", new JLabel("Phòng hai người"));
        
        // Giá thuê
        JPanel pricePanel = new JPanel(new BorderLayout(5, 0));
        pricePanel.add(new JTextField("1,500,000"), BorderLayout.CENTER);
        JLabel lblVnd = new JLabel("VND");
        lblVnd.setForeground(Color.RED);
        pricePanel.add(lblVnd, BorderLayout.EAST);
        addFormItem(rightPanel, gbc, 7, "Giá Thuê:", pricePanel);

        // Nút Lưu
        JButton btnSave = new JButton("Lưu");
        btnSave.setBackground(new Color(21, 115, 71)); // Màu xanh lá
        btnSave.setForeground(Color.WHITE);
        btnSave.setFocusPainted(false);
        gbc.gridx = 1; gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        rightPanel.add(btnSave, gbc);

        // Thêm vào Frame chính
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);
	}
	private JPanel createTitledPanel(String title, JComponent component) {
        JPanel p = new JPanel(new BorderLayout());
        p.setBorder(new TitledBorder(title));
        p.add(component);
        return p;
    }

    // Hàm phụ thêm dòng vào Form bên phải
    private void addFormItem(JPanel p, GridBagConstraints gbc, int row, String label, JComponent comp) {
        gbc.gridx = 0; gbc.gridy = row;
        p.add(new JLabel(label), gbc);
        gbc.gridx = 1;
        p.add(comp, gbc);
    }

    // Panel riêng cho Mã Hợp Đồng để có icon Refresh
    private JPanel createContractIDPanel() {
        JPanel p = new JPanel(new BorderLayout(5, 0));
        JLabel lblId = new JLabel("HDT30360");
        lblId.setForeground(Color.RED);
        lblId.setFont(new Font("Arial", Font.BOLD, 14));
        p.add(lblId, BorderLayout.WEST);
        p.add(new JLabel("🔄"), BorderLayout.CENTER); // Icon minh họa
        return p;
    }

   
}
