package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
import app.FrmMain;
import dao.BangDiaDao;
import dao.KhachHangDao;
import dao.NhanVienDao;
import entity.BangDia;
=======
import dao.NhanVienDao;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
import entity.NhanVien;


public class FrmNhanVien extends JFrame implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel tableModelNV;
	private JTextField txtMaNV;
	private JTextField txtTenNV;
	private JTextField txtDienThoai;
	private JTextField txtMoTa;
	private JTextField txtMessage;
	private JButton btnThem , btnXoaTrang , btnCapNhat, btnXoa , btnTim, btnLuu;
	private JLabel lblTieuDe , lblMaNV, lblTenNV, lblDienThoai, lblMoTa;
<<<<<<< HEAD
	NhanVienDao nhanVienDao = new NhanVienDao(FrmMain.factory);
	//	private ListNhanVien listNhanVien;
	//	private NhanVienTableModel tableModel;
=======

	NhanVienDao nhanVienDao = new NhanVienDao(FrmMain.factory);
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrmNhanVien().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmNhanVien() throws SQLException, RemoteException {
<<<<<<< HEAD
		// TODO Auto-generated constructor stub
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		setTitle("THÔNG TIN NHÂN VIÊN");
		setSize(900,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		BuildGUI();

	}
	public void BuildGUI() throws SQLException, RemoteException  {
		JPanel pNorth = new JPanel();

		@SuppressWarnings("unused")
		Box b,b0,b1,b2,b3,b4,b5,b6,b7;
		b = Box.createVerticalBox();
		b.add(Box.createVerticalStrut(5));
		b.add(Box.createHorizontalStrut(800));
		b.add(Box.createVerticalStrut(5));
		pNorth.add(b);
		add(pNorth,BorderLayout.NORTH);

		Border borderVien = BorderFactory.createLineBorder(Color.ORANGE);
		pNorth.setBorder(BorderFactory.createTitledBorder(borderVien, ""));

		b.add(b1 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));

		b.add(b0 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));
		b.add(b2 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));
		b.add(b3 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));
		b.add(b4 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));
		b.add(b5 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));
		b.add(b6 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));
		b.add(b7 = Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(5));

		b1.add(lblTieuDe = new JLabel("THÔNG TIN NHÂN VIÊN"));
		lblTieuDe.setFont(new Font("Time New Romal", Font.BOLD, 30));
		lblTieuDe.setForeground(Color.DARK_GRAY);
		pNorth.setBackground(Color.pink);

		b2.add(lblMaNV = new JLabel("Nhập Mã:"));
		b2.add(txtMaNV = new JTextField(20));
		b2.add(Box.createHorizontalStrut(200));

		b3.add(lblTenNV = new JLabel("Nhập Tên:"));
		b3.add(txtTenNV = new JTextField()) ;
		b3.add(Box.createHorizontalStrut(200));

		b4.add(lblDienThoai = new JLabel("Nhập Số DT: "));
		b4.add(txtDienThoai = new JTextField());
		b4.add(Box.createHorizontalStrut(200));

		b5.add(lblMoTa = new JLabel("Nhập Mô Tả Khác: "));
		b5.add(txtMoTa = new JTextField());
		b5.add(Box.createHorizontalStrut(200));
		b5.add(Box.createVerticalStrut(20));

		b6.add(txtMessage = new JTextField());
		txtMessage.setEditable(false);
		txtMessage.setBorder(null);
		txtMessage.setFont(new Font("Arial", Font.ITALIC, 12));
		txtMessage.setForeground(Color.darkGray);
		txtMessage.setBackground(Color.pink);

		lblMaNV.setPreferredSize(lblMoTa.getPreferredSize());
		lblTenNV.setPreferredSize(lblMoTa.getPreferredSize());
		lblDienThoai.setPreferredSize(lblMoTa.getPreferredSize());

		String tenCot[] = {"ID", "Ten nhan vien", "So dien thoai", "Mo ta"};
		tableModelNV = new DefaultTableModel(tenCot, 0);
		table = new JTable(tableModelNV);
		DocDuLieuVaoTableNhanVien();


		add(new JScrollPane(table));
		table.setRowHeight(25);

		JPanel pnSouth;
		add(pnSouth = new JPanel(), BorderLayout.SOUTH);
		pnSouth.add(btnThem = new JButton("Thêm"));
		pnSouth.add(btnXoaTrang = new JButton("Xóa Trắng"));
		pnSouth.add(btnXoa = new JButton("Xóa"));
		pnSouth.add(btnCapNhat = new JButton("Cập nhật"));
		pnSouth.add(btnTim = new JButton( " Tìm kiếm"));
		pnSouth.add(btnLuu = new JButton("Lưu"));
		pnSouth.createVolatileImage(120, 40);
		pnSouth.setBorder(BorderFactory.createTitledBorder(borderVien, ""));

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				int row = table.getSelectedRow();
<<<<<<< HEAD
//				fillForm(row);
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
				if(row != -1) {
					txtMaNV.setText(table.getValueAt(row, 0).toString());
					txtTenNV.setText(table.getValueAt(row, 1).toString());
					txtDienThoai.setText(table.getValueAt(row, 2).toString());
					txtMoTa.setText(table.getValueAt(row, 3).toString());
				}
			}
		});

		btnThem.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnXoa.addActionListener(this);
		btnLuu.addActionListener(this);
		btnTim.addActionListener(this);
		btnCapNhat.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o.equals(btnThem)) {
			if (validData()) {
				NhanVien n = revertFromTextfield();
<<<<<<< HEAD
				
				nhanVienDao.add(n);
				
=======

				nhanVienDao.add(n);
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
				tableModelNV.addRow(new Object[] {
						n.getMaNV(), n.getTenNV(), n.getDienThoai(), n.getMoTa()
				});
			}
		}
		if (o.equals(btnLuu)) {

			txtMessage.setText("Đã lưu");
			tableModelNV.setRowCount(0);
		}
		if (o.equals(btnXoaTrang)) {
			emptyTextfields();
			DocDuLieuVaoTableNhanVien();
<<<<<<< HEAD
//			updateTableData();
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		}
		if (o.equals(btnXoa)) {
			if (table.getSelectedRow() != -1) {
				int del = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa ?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
				int id = Integer.parseInt(txtMaNV.getText());
				if(del==JOptionPane.YES_OPTION) {
					nhanVienDao.removeNhanVien(id);
					tableModelNV.setRowCount(0);
					DocDuLieuVaoTableNhanVien();
				}
			}

		}
		if (o.equals(btnTim)) {
			@SuppressWarnings("unused")
			String maNV = JOptionPane.showInputDialog("Nhập mà nhân viên: " );

		}
		if(o.equals(btnCapNhat)){
			if(validData()){
				int maNV = Integer.parseInt(txtMaNV.getText());
				String tenNV = txtTenNV.getText().trim();
				String dienThoai = txtDienThoai.getText().trim();
				String moTa = txtMoTa.getText().trim();
				nhanVienDao.updateNhanVien(maNV, tenNV, moTa, dienThoai);
				tableModelNV.setRowCount(0);
				DocDuLieuVaoTableNhanVien();
			}
		}
	}
	private void emptyTextfields() {
		txtMaNV.setText("");
		txtTenNV.setText("");
		txtDienThoai.setText("");
		txtMoTa.setText("");
		txtMaNV.requestFocus();
	}

	private NhanVien revertFromTextfield() {
		String tenNV = txtTenNV.getText().trim();
		String dienThoai = txtDienThoai.getText().trim();
		String moTa = txtMoTa.getText().trim();
		return new NhanVien(tenNV, dienThoai, moTa);

	}
	@SuppressWarnings("unused")
	private boolean validData() {
		String maNV = txtMaNV.getText().trim();
		String tenNV = txtTenNV.getText().trim();
		String dienThoai = txtDienThoai.getText().trim();
		String moTa = txtMoTa.getText().trim();

		return true;
	}

<<<<<<< HEAD
	//	private void updateTableData() {
	//		// TODO Auto-generated method stub
	//		tableModel = new NhanVienTableModel(listNhanVien.getListNhanVien());
	//		table.setModel(tableModel);
	//	}

	private void fillForm(int row) {
		// TODO Auto-generated method stub
		if (row != -1) {
//						NhanVien c = listNhanVien.getListNhanVien().get(row);
//						txtMaNV.setText(c.getMaNV());
//						txtTenNV.setText(c.getTenNV());
//						txtDienThoai.setText(c.getDienThoai());
//						txtMoTa.setText(c.getMoTa());
//						txtMaNV.requestFocus();
		}
	}

	//int i = 0;	
	//		for(NhanVien bd : listNhanVien) {
	//			tableModelBD.addRow(new Object[] {
	//					//i++,  // là số thứ tự của table
	//					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(),
	//					bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(),
	//					bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
	//			});
	//		}
	
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	public void DocDuLieuVaoTableNhanVien() {
		List<NhanVien> listNV = new ArrayList<>();
		listNV.clear();
		listNV = nhanVienDao.getAllNhanVien();
<<<<<<< HEAD
		
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		for(NhanVien n : listNV) {
			tableModelNV.addRow(new Object[] {
					n.getMaNV(), n.getTenNV(), n.getDienThoai(), n.getMoTa()
			});
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int row = table.getSelectedRow();
		txtMaNV.setText(table.getValueAt(row, 0).toString());
		txtTenNV.setText(table.getValueAt(row, 1).toString());
		txtDienThoai.setText(table.getValueAt(row, 2).toString());
		txtMoTa.setText(table.getValueAt(row, 3).toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	}

}
