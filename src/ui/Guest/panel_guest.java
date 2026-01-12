package ui.Guest;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;

import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import javax.swing.JFormattedTextField;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class panel_guest extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_1;


	/**
	 * Create the panel.
	 */
	public panel_guest() {
		this.setSize(1920,1080);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 240, 164));
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setMaximumSize(new Dimension(32767, 40));
		panel_1.setPreferredSize(new Dimension(10, 40));
		panel_1.setBackground(new Color(39, 83, 138));
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblQunLKhch = new JLabel("Quản lý khách thuê");
		lblQunLKhch.setForeground(Color.WHITE);
		lblQunLKhch.setHorizontalAlignment(SwingConstants.LEFT);
		lblQunLKhch.setHorizontalTextPosition(SwingConstants.CENTER);
		lblQunLKhch.setFont(new Font("Liberation Mono", Font.BOLD, 18));
		lblQunLKhch.setBorder(null);
		lblQunLKhch.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblQunLKhch.setPreferredSize(new Dimension(500, 40));
		lblQunLKhch.setMaximumSize(new Dimension(500, 40));
		panel_1.add(lblQunLKhch);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel.add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GREEN);
		panel_2.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));
		
		JPanel panel_5 = new JPanel();
		panel_5.setMaximumSize(new Dimension(32767, 50));
		panel_5.setPreferredSize(new Dimension(10, 50));
		panel_5.setBackground(Color.WHITE);
		panel_4.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(150, 32767));
		horizontalStrut.setPreferredSize(new Dimension(200, 0));
		panel_5.add(horizontalStrut);
		
		JComboBox cbx_status = new JComboBox();
		cbx_status.setMaximumSize(new Dimension(200, 30));
		panel_5.add(cbx_status);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(150, 32767));
		panel_5.add(horizontalStrut_1);
		
		textField = new JTextField();
		textField.setMaximumSize(new Dimension(400, 30));
		panel_5.add(textField);
		textField.setColumns(10);
		
		JButton btn_search = new JButton("Tìm kiếm ");
		btn_search.setMaximumSize(new Dimension(105, 30));
		panel_5.add(btn_search);
		
		JPanel panel_6 = new JPanel();
		panel_6.setPreferredSize(new Dimension(10, 60));
		panel_6.setMaximumSize(new Dimension(32767, 60));
		panel_6.setBackground(Color.WHITE);
		panel_4.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(600, 32767));
		panel_6.add(horizontalStrut_2);
		
		JButton btn_add = new JButton("Thêm khách");
		btn_add.setPreferredSize(new Dimension(200, 27));
		btn_add.setMaximumSize(new Dimension(170, 30));
		panel_6.add(btn_add);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_3);
		
		JButton btn_modify = new JButton("Sửa khách");
		btn_modify.setMaximumSize(new Dimension(105, 30));
		btn_modify.setMaximumSize(new Dimension(170, 30));
		panel_6.add(btn_modify);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_4);
		
		JButton btn_remove = new JButton("Xóa khách\n");
		btn_remove.setMaximumSize(new Dimension(105, 30));
		btn_remove.setMaximumSize(new Dimension(170, 30));
		panel_6.add(btn_remove);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_6.add(horizontalStrut_5);
		
		JButton btn_refresh = new JButton("Làm mới \n");
		btn_refresh.setAlignmentX(Component.CENTER_ALIGNMENT);
		btn_refresh.setMaximumSize(new Dimension(170, 30));
		
		panel_6.add(btn_refresh);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.RED);
		panel_4.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setRowHeight(30);
		table.setBackground(Color.WHITE);
		panel_7.add(table, BorderLayout.CENTER);
		String[] columns = {"ID", "Tên", "Email"};

		DefaultTableModel model = new DefaultTableModel(columns, 0);

		model.addRow(new Object[]{1, "Nguyễn A", "a@gmail.com"});
		model.addRow(new Object[]{2, "Trần B", "b@gmail.com"});
		model.addRow(new Object[]{3, "Lê C", "c@gmail.com"});

		table.setModel(model);
		
		JPanel panel_3 = new JPanel();
		panel_3.setMaximumSize(new Dimension(450, 1080));
		panel_3.setPreferredSize(new Dimension(450, 1080));
		panel_3.setBackground(Color.WHITE);
		panel_2.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		panel_3.add(verticalStrut);
		verticalStrut.setMaximumSize(new Dimension(32767, 70));
		
		JPanel panel_8 = new JPanel();
		panel_8.setFont(new Font("Dialog", Font.PLAIN, 12));
		panel_8.setMaximumSize(new Dimension(430, 500));
		panel_8.setBackground(Color.WHITE);
		panel_8.setPreferredSize(new Dimension(500, 500));
		panel_8.setBorder( 
				new CompoundBorder(new TitledBorder(null, "Th\u00F4ng tin kh\u00E1ch thu\u00EA", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(51, 51, 51)), new EmptyBorder(10, 10, 10, 10)));
		panel_3.add(panel_8);
		panel_8.setLayout(new BoxLayout(panel_8, BoxLayout.Y_AXIS));
		
		Component verticalStrut_8 = Box.createVerticalStrut(20);
		panel_8.add(verticalStrut_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setMaximumSize(new Dimension(32767, 35));
		panel_9.setPreferredSize(new Dimension(10, 30));
		panel_8.add(panel_9);
		panel_9.setLayout(new BoxLayout(panel_9, BoxLayout.X_AXIS));
		
		JLabel lblMKhch = new JLabel("Mã khách: ");
		lblMKhch.setHorizontalAlignment(SwingConstants.CENTER);
		lblMKhch.setBounds(new Rectangle(20, 0, 20, 0));
		lblMKhch.setMaximumSize(new Dimension(100, 35));
		panel_9.add(lblMKhch);
		
		textField_1 = new JTextField();
		textField_1.setMaximumSize(new Dimension(300, 2147483647));
		panel_9.add(textField_1);
		textField_1.setColumns(10);
		
		Component verticalStrut_7 = Box.createVerticalStrut(20);
		panel_8.add(verticalStrut_7);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBackground(Color.WHITE);
		panel_8.add(panel_9_1);
		panel_9_1.setPreferredSize(new Dimension(10, 30));
		panel_9_1.setMaximumSize(new Dimension(32767, 35));
		panel_9_1.setLayout(new BoxLayout(panel_9_1, BoxLayout.X_AXIS));
		
		JLabel lblHTn = new JLabel("Họ tên:");
		lblHTn.setHorizontalAlignment(SwingConstants.CENTER);
		lblHTn.setMaximumSize(new Dimension(100, 35));
		lblHTn.setBounds(new Rectangle(20, 0, 20, 0));
		panel_9_1.add(lblHTn);
		
		textField_2 = new JTextField();
		textField_2.setMaximumSize(new Dimension(300, 2147483647));
		textField_2.setColumns(10);
		panel_9_1.add(textField_2);
		
		Component verticalStrut_6 = Box.createVerticalStrut(20);
		panel_8.add(verticalStrut_6);
		
		JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setBackground(Color.WHITE);
		panel_9_1_1.setPreferredSize(new Dimension(10, 30));
		panel_9_1_1.setMaximumSize(new Dimension(32767, 35));
		panel_8.add(panel_9_1_1);
		panel_9_1_1.setLayout(new BoxLayout(panel_9_1_1, BoxLayout.X_AXIS));
		
		JLabel lblNgySinh = new JLabel("Ngày sinh:");
		lblNgySinh.setMaximumSize(new Dimension(100, 35));
		lblNgySinh.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgySinh.setBounds(new Rectangle(20, 0, 20, 0));
		panel_9_1_1.add(lblNgySinh);
		
		SpinnerDateModel Model = new SpinnerDateModel();
		JSpinner spinner = new JSpinner(Model);
		spinner.setPreferredSize(new Dimension(200, 22));
		spinner.setMaximumSize(new Dimension(200, 32767));
		JSpinner.DateEditor editor =
			    new JSpinner.DateEditor(spinner, "dd/MM/yyyy");
		spinner.setEditor(editor);
		panel_9_1_1.add(spinner);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		panel_8.add(verticalStrut_5);
		
		JPanel panel_9_1_2 = new JPanel();
		panel_9_1_2.setBackground(Color.WHITE);
		panel_9_1_2.setPreferredSize(new Dimension(10, 30));
		panel_9_1_2.setMaximumSize(new Dimension(32767, 35));
		panel_8.add(panel_9_1_2);
		panel_9_1_2.setLayout(new BoxLayout(panel_9_1_2, BoxLayout.X_AXIS));
		
		JLabel lblCc = new JLabel("CCCD:");
		lblCc.setMaximumSize(new Dimension(100, 35));
		lblCc.setHorizontalAlignment(SwingConstants.CENTER);
		lblCc.setBounds(new Rectangle(20, 0, 20, 0));
		panel_9_1_2.add(lblCc);
		
		textField_3 = new JTextField();
		textField_3.setMaximumSize(new Dimension(300, 2147483647));
		textField_3.setColumns(10);
		panel_9_1_2.add(textField_3);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		panel_8.add(verticalStrut_4);
		
		JPanel panel_9_1_3 = new JPanel();
		panel_9_1_3.setBackground(Color.WHITE);
		panel_9_1_3.setPreferredSize(new Dimension(10, 30));
		panel_9_1_3.setMaximumSize(new Dimension(32767, 35));
		panel_8.add(panel_9_1_3);
		panel_9_1_3.setLayout(new BoxLayout(panel_9_1_3, BoxLayout.X_AXIS));
		
		JLabel lblSinThoi = new JLabel("Số điện  thoại:");
		lblSinThoi.setMaximumSize(new Dimension(100, 35));
		lblSinThoi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSinThoi.setBounds(new Rectangle(20, 0, 20, 0));
		panel_9_1_3.add(lblSinThoi);
		
		textField_4 = new JTextField();
		textField_4.setMaximumSize(new Dimension(300, 2147483647));
		textField_4.setColumns(10);
		panel_9_1_3.add(textField_4);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		panel_8.add(verticalStrut_3);
		
		JPanel panel_9_1_4 = new JPanel();
		panel_9_1_4.setBackground(Color.WHITE);
		panel_9_1_4.setPreferredSize(new Dimension(10, 30));
		panel_9_1_4.setMaximumSize(new Dimension(32767, 35));
		panel_8.add(panel_9_1_4);
		panel_9_1_4.setLayout(new BoxLayout(panel_9_1_4, BoxLayout.X_AXIS));
		
		JLabel lblTrnThi = new JLabel("Trạng thái:");
		lblTrnThi.setMaximumSize(new Dimension(100, 35));
		lblTrnThi.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrnThi.setBounds(new Rectangle(20, 0, 20, 0));
		panel_9_1_4.add(lblTrnThi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setMaximumSize(new Dimension(200, 32767));
		comboBox.setPreferredSize(new Dimension(100, 26));
		panel_9_1_4.add(comboBox);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		panel_8.add(verticalStrut_2);
		
		JPanel panel_9_1_5 = new JPanel();
		panel_9_1_5.setBackground(Color.WHITE);
		panel_9_1_5.setPreferredSize(new Dimension(10, 30));
		panel_9_1_5.setMaximumSize(new Dimension(32767, 35));
		panel_8.add(panel_9_1_5);
		panel_9_1_5.setLayout(new BoxLayout(panel_9_1_5, BoxLayout.X_AXIS));
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setMaximumSize(new Dimension(100, 35));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(new Rectangle(20, 0, 20, 0));
		panel_9_1_5.add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setMaximumSize(new Dimension(300, 2147483647));
		textField_5.setColumns(10);
		panel_9_1_5.add(textField_5);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 10));
		panel_8.add(verticalStrut_1);
		
		JPanel panel_9_1_6 = new JPanel();
		panel_9_1_6.setBackground(Color.WHITE);
		panel_9_1_6.setPreferredSize(new Dimension(10, 30));
		panel_9_1_6.setMaximumSize(new Dimension(32767, 35));
		panel_8.add(panel_9_1_6);
		panel_9_1_6.setLayout(new BoxLayout(panel_9_1_6, BoxLayout.X_AXIS));
		
		JLabel lblQuQun = new JLabel("Quê quán:");
		lblQuQun.setMaximumSize(new Dimension(100, 35));
		lblQuQun.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuQun.setBounds(new Rectangle(20, 0, 20, 0));
		panel_9_1_6.add(lblQuQun);
		
		textField_6 = new JTextField();
		textField_6.setMaximumSize(new Dimension(300, 2147483647));
		textField_6.setColumns(10);
		panel_9_1_6.add(textField_6);
		
		Component verticalStrut_9 = Box.createVerticalStrut(20);
		verticalStrut_9.setMaximumSize(new Dimension(32767, 60));
		panel_3.add(verticalStrut_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setMaximumSize(new Dimension(430, 400));
		panel_10.setPreferredSize(new Dimension(430, 10));
		panel_10.setBorder(new TitledBorder(null, "Th\u00F4ng tin h\u1EE3p \u0111\u1ED3ng", TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));
		panel_3.add(panel_10);
		panel_10.setLayout(new BoxLayout(panel_10, BoxLayout.Y_AXIS));
		
		JPanel panel_12 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_12.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_12.setBackground(Color.WHITE);
		panel_12.setMaximumSize(new Dimension(32767, 35));
		panel_12.setPreferredSize(new Dimension(10, 35));
		panel_10.add(panel_12);
		
		JLabel lblNewLabel = new JLabel("Mã hợp đồng:");
		lblNewLabel.setMaximumSize(new Dimension(82, 35));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setPreferredSize(new Dimension(82, 35));
		panel_12.add(lblNewLabel);
		
		JLabel lblHd = new JLabel("HD22");
		lblHd.setPreferredSize(new Dimension(32, 35));
		lblHd.setMaximumSize(new Dimension(32, 35));
		panel_12.add(lblHd);
		
		Component verticalStrut_10 = Box.createVerticalStrut(20);
		panel_10.add(verticalStrut_10);
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_11.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_11.setBackground(Color.WHITE);
		panel_11.setMaximumSize(new Dimension(32767, 35));
		panel_11.setPreferredSize(new Dimension(10, 35));
		panel_10.add(panel_11);
		
		JLabel lblSPhng = new JLabel("Số phòng:");
		lblSPhng.setMaximumSize(new Dimension(59, 35));
		lblSPhng.setPreferredSize(new Dimension(59, 35));
		panel_11.add(lblSPhng);
		
		JLabel label = new JLabel("10");
		label.setPreferredSize(new Dimension(14, 35));
		label.setMaximumSize(new Dimension(14, 35));
		panel_11.add(label);
		
		Component verticalStrut_11_1 = Box.createVerticalStrut(20);
		panel_10.add(verticalStrut_11_1);
		
		table_1 = new JTable();
		table_1.setBackground(Color.WHITE);
		table_1.setRowHeight(28);
		String[] columnsHD = {
			    "Mã hợp đồng",
			    "Tên khách",
			    "Vai trò"
			};
		DefaultTableModel modelHD = new DefaultTableModel(columnsHD, 0) {
		    @Override
		    public boolean isCellEditable(int row, int column) {
		        return false; // không cho sửa
		    }
		};

		// Gán model cho table
		table_1.setModel(modelHD);

		// Thêm dữ liệu mẫu
		modelHD.addRow(new Object[]{"HD001", "Nguyễn Văn A", "Chủ thuê"});
		modelHD.addRow(new Object[]{"HD002", "Trần Thị B", "Khách thuê"});
		modelHD.addRow(new Object[]{"HD003", "Lê Văn C", "Người đại diện"});

		// Bọc JTable trong JScrollPane (RẤT QUAN TRỌNG)
		JScrollPane scrollPaneHD = new JScrollPane(table_1);
		scrollPaneHD.setBorder(new TitledBorder(null, "Chi ti\u1EBFt h\u1EE3p \u0111\u1ED3ng ", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		scrollPaneHD.setBackground(Color.WHITE);
		scrollPaneHD.setMaximumSize(new Dimension(32767, 200));
		scrollPaneHD.setPreferredSize(new Dimension(420, 200));
		panel_10.add(scrollPaneHD);
	}	

}
