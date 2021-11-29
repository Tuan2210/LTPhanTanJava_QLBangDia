package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
<<<<<<< HEAD
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
import app.FrmThongKe;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
import dao.BangDiaDao;
import dao.KhachHangDao;
import dao.NhanVienDao;
import dao.PhieuThueDao;
<<<<<<< HEAD
import dao.Regex;
import dao.ThongKeDao;
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
import entity.BangDia;
import entity.KhachHang;
import entity.NhanVien;
import entity.PhieuThue;
<<<<<<< HEAD
import app.FrmBangDia;

public class FrmPhieuThue extends JFrame implements ActionListener, MouseListener {

=======

public class FrmPhieuThue extends JFrame implements ActionListener {
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private JLabel lblTitle,lblSoPhieu , lblNgayThue , lblmaThe, lblmaBang, lblTenBang, lblTheLoai,lblTinhTrang, lblslDia , lblsoNgaymuon , lbldonGia ,lblTim, lblMessage;
	private JTextField txtSoPhieu, txtNgayThue, txtmaThe, txtmaBang, txtTenBang, txtTheLoai, txtTinhTrang, txtslDia, txtSoNgaymuon, txtdonGia, txtTim, txtMessage;
	private JTable table1;
	@SuppressWarnings("rawtypes")
	private JComboBox cbCMND, cbTenBang, cbMaNV;
	private DefaultTableModel tableModel;
<<<<<<< HEAD
//	private ListPhieuThue listPhieu ;
//	private PhieuThueTableModel tableModel;
	private JButton btnBaoCao,btnThem , btnXoa , btnSua , btnTim , btnLuu, btnXoaTrang ;
=======
	private JButton btnThem, btnXoa, btnSua, btnTim, btnLuu, btnXoaTrang;

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	PhieuThueDao phieuThueDao = new PhieuThueDao(FrmMain.factory);
	KhachHangDao khachHangDao = new KhachHangDao(FrmMain.factory);
	BangDiaDao bangDiaDao = new BangDiaDao(FrmMain.factory);
	NhanVienDao nhanVienDao = new NhanVienDao(FrmMain.factory);
<<<<<<< HEAD
	ThongKeDao thongKeDao = new ThongKeDao(FrmMain.factory);
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrmPhieuThue().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
<<<<<<< HEAD
	
	public FrmPhieuThue() throws RemoteException{
		// TODO Auto-generated constructor stub
=======

	public FrmPhieuThue() throws RemoteException{
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		setTitle("Phieu thue CD");
		setSize(900,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addControl();
		setVisible(true);
	}
<<<<<<< HEAD
	private void addControl() throws RemoteException{
		// TODO Auto-generated method stub
=======

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void addControl() throws RemoteException{
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		JPanel pNorth =new JPanel();
		pNorth.add(lblTitle = new JLabel("QUẢN LÝ PHIẾU ĐĂNG KÝ THUÊ ĐĨA "));
		Border borderVien = BorderFactory.createLineBorder(Color.ORANGE);
		pNorth.setBorder(BorderFactory.createTitledBorder(borderVien, ""));
		pNorth.setBackground(Color.pink);
		//setFont-text
		Font fpNorth = new Font("Time New Roman", Font.BOLD, 30);
		lblTitle.setBackground(Color.blue);
		lblTitle.setFont(fpNorth);
		add(pNorth,BorderLayout.NORTH);

		//pCen
		JPanel pCen = new JPanel();
		Box b = Box.createVerticalBox();
		Box b1,b2,b3,b4,b5,b6,b7;
		pCen.setBorder(BorderFactory.createTitledBorder(borderVien, ""));

		b.add(b1= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(850));
		b1.add(lblmaThe = new JLabel("Số CMND:"));
		b1.add(cbCMND = new JComboBox());
		b1.add(lblSoPhieu = new JLabel("Số phiếu:"));
		b1.add(txtSoPhieu = new JTextField(15));

		List<KhachHang> listKH = new ArrayList<KhachHang>();
		listKH = khachHangDao.getAllKhachHang();
		for(KhachHang kh : listKH) {
			cbCMND.addItem(kh.getSoCMND());
		}

		b.add(b3= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b3.add(lblTenBang = new JLabel("Tên băng:"));
		b3.add(cbTenBang = new JComboBox());
<<<<<<< HEAD
		b3.add(lblslDia = new JLabel("Số lượng băng :"));
		b3.add(txtslDia = new JTextField());
		
=======
		b3.add(lblmaBang = new JLabel("Mã CD:"));
		b3.add(txtmaBang = new JTextField(15));

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		List<BangDia> listBD = new ArrayList<BangDia>();
		listBD = bangDiaDao.getAllBangDia();
		for(BangDia bd : listBD) {
			cbTenBang.addItem(bd.getTenBD());
		}



		b.add(b4= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b4.add(lblTheLoai = new JLabel("Mã NV:"));
		b4.add(cbMaNV = new JComboBox());
<<<<<<< HEAD
		b4.add(lbldonGia = new JLabel("Đơn giá:"));
		b4.add(txtdonGia = new JTextField());
		
=======
		b4.add(lblslDia = new JLabel("Số lượng băng :"));
		b4.add(txtslDia = new JTextField());

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		List<NhanVien> listNV = new ArrayList<NhanVien>();
		listNV = nhanVienDao.getAllNhanVien();
		for(NhanVien nv : listNV) {
			cbMaNV.addItem(nv.getMaNV());
		}

		b.add(b5= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b5.add(lblsoNgaymuon = new JLabel("Số ngày mượn:"));
		b5.add(txtSoNgaymuon = new JTextField());
<<<<<<< HEAD
		b5.add(lblNgayThue = new JLabel("Ngày thuê:"));
		b5.add(txtNgayThue = new JTextField(15));
		
//		b.add(b2= Box.createHorizontalBox());
//		b.add(Box.createHorizontalStrut(600));	
//		b2.add();
//		b2.add();
//		b2.add(lblTinhTrang = new JLabel("Tình trạng:"));
//		b2.add(txtTinhTrang = new JTextField(15));
		
		
=======
		b5.add(lbldonGia = new JLabel("Đơn giá:"));
		b5.add(txtdonGia = new JTextField());

		b.add(b2= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));	
		b2.add(lblNgayThue = new JLabel("Ngày thuê:"));
		b2.add(txtNgayThue = new JTextField(15));
		b2.add(lblTinhTrang = new JLabel("Tình trạng:"));
		b2.add(txtTinhTrang = new JTextField(15));


>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		b.add(b6= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b.add(Box.createVerticalStrut(40));
		b6.add(txtMessage = new JTextField());
		txtMessage.setEditable(false);
		txtMessage.setBorder(null);
		txtMessage.setFont(new Font("Arial", Font.ITALIC, 12));
		txtMessage.setForeground(Color.BLUE);
		txtMessage.setBackground(Color.pink);

		b.add(b7= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
<<<<<<< HEAD
		
		String tenCot[] = {"Số phiếu", "Số CMND", "Tên băng đĩa", "Ngày thuê", "Số ngày mượn", "Số lượng", "Đơn giá", "Mã nhân viên", "Tình trạng"};
=======

		String tenCot[] = {"Số phiếu", "Số CMND", "Tên băng đĩa", "Ngày thuê", "Số ngày mượn", "Số lượng", "Đơn giá", "Tình trạng"};
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		tableModel = new DefaultTableModel(tenCot, 0);
		DocDuLieuVaoTablePhieuThue();
		b7.add(new JScrollPane(table1 = new JTable(tableModel)));
		table1.setRowHeight(25);
		b.add(b6= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
<<<<<<< HEAD
		
		b6.add(new JScrollPane(table1));
		table1.setRowHeight(20);
		
=======

		b6.add(new JScrollPane(table1));
		table1.setRowHeight(20);

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		pCen.add(b);
		add(pCen, BorderLayout.CENTER);
		lblmaThe.setPreferredSize(new Dimension(100, 10));
		lblNgayThue.setPreferredSize(lblmaThe.getPreferredSize());
		lblTheLoai.setPreferredSize(lblmaThe.getPreferredSize());
		lblsoNgaymuon.setPreferredSize(lblmaThe.getPreferredSize());
		lblTenBang.setPreferredSize(new Dimension(100, 10));

		lblslDia.setPreferredSize(lblslDia.getPreferredSize());
		lblSoPhieu.setPreferredSize(lblslDia.getPreferredSize());
		lbldonGia.setPreferredSize(lblslDia.getPreferredSize());
//		lblTinhTrang.setPreferredSize(lblslDia.getPreferredSize());
//		lblmaBang.setPreferredSize(lblslDia.getPreferredSize());
		cbCMND.setPreferredSize(new Dimension(200, 10));
		cbTenBang.setPreferredSize(new Dimension(200, 10));
		cbMaNV.setPreferredSize(new Dimension(200, 10));

		//pSouth
		JPanel pSouth = new JPanel();
		pSouth.add(lblTim = new JLabel("Nhập mà tìm :"));
		pSouth.add(txtTim = new JTextField(8));
		pSouth.add(btnTim = new JButton("Tìm"));
		pSouth.add(btnThem = new JButton("Thêm"));
		pSouth.add(btnXoa = new JButton("Xóa"));
		pSouth.add(btnXoaTrang = new JButton("Xóa trắng"));
		pSouth.add(btnSua = new JButton("Cập nhật"));
		pSouth.add(btnLuu = new JButton("Lưu"));

		add(pSouth, BorderLayout.SOUTH);
		pSouth.setBorder(BorderFactory.createTitledBorder(borderVien, ""));
<<<<<<< HEAD
		
//		listPhieu = new ListPhieuThue();
//		Database db = new Database();
//		Database.getInstance().connect();
//		try {
//			listPhieu.napDuLieuTuFile();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		updatetableData();
		
//		table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//			
//			public void valueChanged(ListSelectionEvent e) {
//				// TODO Auto-generated method stub
//				int row = table1.getSelectedRow();
//				fillForm(row);
//			}
//		});
		
		table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent e) {
				int row = table1.getSelectedRow();
				if(row != -1) {
					cbCMND.setSelectedItem(table1.getValueAt(row, 1).toString());
					cbTenBang.setSelectedItem(table1.getValueAt(row, 2).toString());
					cbMaNV.setSelectedItem(table1.getValueAt(row, 7).toString());
					txtSoNgaymuon.setText(table1.getValueAt(row, 3).toString());
					txtSoPhieu.setText(table1.getValueAt(row, 0).toString());
					txtslDia.setText(table1.getValueAt(row, 5).toString());
					txtdonGia.setText(table1.getValueAt(row, 6).toString());
					txtNgayThue.setText(table1.getValueAt(row, 3).toString());
				}
			}
		});
		
		btnBaoCao.addActionListener(this);
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		btnLuu.addActionListener(this);
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnTim.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXoaTrang.addActionListener(this);
<<<<<<< HEAD
		
	}

	protected void fillForm(int row) {
		// TODO Auto-generated method stub
		if (row != -1) {
//			PhieuThue c = listPhieu.getListPhieuThue().get(row);
//			txtSoPhieu.setText(c.getSoPhieu()+ "");
//			txtdonGia.setText(c.getDonGia()+ "");
//			txtmaBang.setText(c.getMaBD());
//			txtmaThe.setText(c.getMaTheTV()+"");
//			txtNgayThue.setText(c.getNgayThue() + "");
//			txtslDia.setText(c.getSoluong() +"");
//			txtSoNgaymuon.setText(c.getSoNgayMuon()+ "");
//			txtTenBang.setText(c.getTenBD());
//			txtTheLoai.setText(c.getTheLoai());
//			txtTinhTrang.setText(c.getTinhTrang());
//			txtSoPhieu.requestFocus();
		}
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	}

	private boolean validData() {
<<<<<<< HEAD
		// TODO Auto-generated method stub
//		String soPhieu = txtSoPhieu.getText().trim();
//		String MaBD = txtmaBang.getText().trim();
//		String donGia = txtdonGia.getText().trim();
//		String soLuong = txtslDia.getText().trim();
//		
//		if (!(!soPhieu.equals("") && soPhieu.matches("[0-9]+"))) {
//			showMessage("Error: mã nhân viên", txtSoPhieu);
//			return false;
//		}
//		if (!(!MaBD.equals("") && MaBD.matches("[0-9]+"))) {
////			showMessage("Error: tên nhân viên", txtmaBang);
////			return false;
//		}
//		
=======
		String soPhieu = txtSoPhieu.getText().trim();
		@SuppressWarnings("unused")
		String MaBD = txtmaBang.getText().trim();
		//		String donGia = txtdonGia.getText().trim();
		//		String soLuong = txtslDia.getText().trim();

		if (!(!soPhieu.equals("") && soPhieu.matches("[0-9]+"))) {
			showMessage("Error: mã nhân viên", txtSoPhieu);
			return false;
		}
		//		if (!(!MaBD.equals("") && MaBD.matches("[0-9]+"))) {
		//			showMessage("Error: tên nhân viên", txtmaBang);
		//			return false;
		//		}

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		return true;
	}
	private void showMessage(String message, JTextField txt) {
		txtMessage.setText(message);
		txt.requestFocus();
	}

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (o.equals(btnThem)) {
			if (validData()) {
<<<<<<< HEAD
//				PhieuThue c = revertFromTextfield();
//				private JTextField txtSoPhieu, txtNgayThue, txtmaThe, txtmaBang , txtTenBang , txtTheLoai,txtTinhTrang , txtslDia , txtSoNgaymuon , txtdonGia, txtTim,txtMessage;
//				private JTable table1;
//				private JComboBox cbCMND, cbTenBang, cbMaNV;
				Regex r = new Regex();
				if(r.regexDate(txtNgayThue)) {
					int soPhieu = Integer.parseInt(txtSoPhieu.getText());
					String cmnd = cbCMND.getSelectedItem().toString();
					String tenBang = cbTenBang.getSelectedItem().toString();
					String nvID = cbMaNV.getSelectedItem().toString();
					int maNV = Integer.parseInt(nvID);
					int soNgayMuon = Integer.parseInt(txtSoNgaymuon.getText());
					String ngayThue = txtNgayThue.getText().toString().trim();
					int soLuong = Integer.parseInt(txtslDia.getText());
					double donGia = Double.parseDouble(txtdonGia.getText());
					
					System.out.println(cmnd);
					
					List<BangDia> b = bangDiaDao.findBangDia(tenBang);
					NhanVien n = nhanVienDao.getNhanVienByID(maNV);
					KhachHang k = khachHangDao.getKhachHangByID(cmnd);
					
					Set<BangDia> setBangDia = new HashSet<BangDia>(b);
					
					for(BangDia ba : setBangDia) {
						System.out.println(ba.getTenBD() + ba.getMaBD());
					}
					
					PhieuThue pt = new PhieuThue(soPhieu, k, ngayThue, setBangDia, soLuong, soNgayMuon, donGia, n);
					phieuThueDao.add(pt);
					
					tableModel.addRow(new Object[] {
							pt.getSoPhieu(), k.getSoCMND(), tenBang, ngayThue, soNgayMuon, soLuong, donGia
					});
				}
=======
				cbCMND.setSelectedItem(cbCMND.getSelectedIndex());

				int soPhieu = Integer.parseInt(txtSoPhieu.getText());
				String cmnd = cbCMND.getSelectedItem().toString();
				String tenBang = cbTenBang.getSelectedItem().toString();
				String nvID = cbMaNV.getSelectedItem().toString();
				int maNV = Integer.parseInt(nvID);
				int soNgayMuon = Integer.parseInt(txtSoNgaymuon.getText());
				String ngayThue = txtNgayThue.getText().toString().trim();
				int soLuong = Integer.parseInt(txtslDia.getText());
				double donGia = Double.parseDouble(txtdonGia.getText());

				System.out.println(cmnd);

				List<BangDia> b = bangDiaDao.findBangDia(tenBang);
				NhanVien n = nhanVienDao.getNhanVienByID(maNV);
				KhachHang k = khachHangDao.getKhachHangByID(cmnd);

				Set<BangDia> setBangDia = new HashSet<BangDia>(b);

				for(BangDia ba : setBangDia) {
					System.out.println(ba.getTenBD() + ba.getMaBD());
				}

				PhieuThue pt = new PhieuThue(soPhieu, k, ngayThue, setBangDia, soLuong, soNgayMuon, donGia, n);
				phieuThueDao.add(pt);

				tableModel.addRow(new Object[] {
						pt.getSoPhieu(), k.getSoCMND(), tenBang, ngayThue, soNgayMuon, soLuong, donGia
				});
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
			}
		}
		if (o.equals(btnLuu)) {

			txtMessage.setText("Saved");
		}
		if (o.equals(btnXoaTrang)) {
			emtyTextfields();
			//			updatetableData();
		}
		if (o.equals(btnXoa)) {
			if (table1.getSelectedRow() != -1) {
				@SuppressWarnings("unused")
				int index = table1.getSelectedRow();
<<<<<<< HEAD
				int soPhieu = Integer.parseInt(txtSoPhieu.getText());
				int del = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
				if(del==JOptionPane.YES_OPTION) {
					phieuThueDao.removePhieuThueByID(soPhieu);
					tableModel.setRowCount(0);
					DocDuLieuVaoTablePhieuThue();
				}
=======
				int sp = Integer.parseInt(txtTim.getText().trim());
				int del = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
				if(del==JOptionPane.YES_OPTION) {
					phieuThueDao.removePhieuThue(sp);
					tableModel.setRowCount(0);
					DocDuLieuVaoTablePhieuThue();
				}

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
			}
		}
		if (o.equals(btnTim)) {
			//			int sp = Integer.parseInt(txtTim.getText().trim());
			if(txtTim.getText() == null) {
				tableModel.setRowCount(0);
			}
			else {
				int pos = Integer.parseInt(txtTim.getText().trim()) ;
				tableModel.setRowCount(0);
				String bangDia =  cbTenBang.getSelectedItem().toString();
				String cmnd = cbCMND.getSelectedItem().toString();
				List<PhieuThue> listPhieuThue = phieuThueDao.findPhieuThue(pos);
				for (PhieuThue phieuThue : listPhieuThue) {
					BangDia bd = new BangDia();
					bd = bangDiaDao.getBangDiaByTen(bangDia);
					tableModel.addRow(new Object[] {
							phieuThue.getSoPhieu(),
							cmnd,
							bangDia,
							phieuThue.getNgayThue(),
							phieuThue.getSoNgayMuon(),
							phieuThue.getSoluong(),
							phieuThue.getDonGia(),
							((entity.BangDia) bd).getTinhTrang(),
					});
				}
			}

		}
		if(o.equals(btnSua)){
			if (table1.getSelectedRow() != -1) {
<<<<<<< HEAD
=======
				@SuppressWarnings("unused")
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
				int index = table1.getSelectedRow();
				int sp = Integer.parseInt(txtTim.getText().trim());
				int del = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
				if(del==JOptionPane.YES_OPTION) {
					phieuThueDao.removePhieuThue(sp);
					tableModel.setRowCount(0);
					DocDuLieuVaoTablePhieuThue();
				}
<<<<<<< HEAD
=======
			}
			int soPhieu = Integer.parseInt(txtSoPhieu.getText());
			String cmnd = cbCMND.getSelectedItem().toString();
			String tenBang = cbTenBang.getSelectedItem().toString();
			String nvID = cbMaNV.getSelectedItem().toString();
			int maNV = Integer.parseInt(nvID);
			int soNgayMuon = Integer.parseInt(txtSoNgaymuon.getText());
			String ngayThue = txtNgayThue.getText().toString().trim();
			int soLuong = Integer.parseInt(txtslDia.getText());
			double donGia = Double.parseDouble(txtdonGia.getText());

			List<BangDia> b = bangDiaDao.findBangDia(tenBang);
			NhanVien n = nhanVienDao.getNhanVienByID(maNV);
			KhachHang k = khachHangDao.getKhachHangByID(cmnd);

			Set<BangDia> setBangDia = new HashSet<>(b);

			PhieuThue pt = new PhieuThue(soPhieu, k, ngayThue, setBangDia, soLuong, soNgayMuon, donGia, n);
			phieuThueDao.updatePhieuThue(pt);
			tableModel.setRowCount(0);
			DocDuLieuVaoTablePhieuThue();
		}

		if (o.equals(btnTim)) {
			//			int sp = Integer.parseInt(txtTim.getText().trim());
			if(txtTim.getText() == null) {
				tableModel.setRowCount(0);
			}
			else {
				int pos = Integer.parseInt(txtTim.getText().trim()) ;
				tableModel.setRowCount(0);
				String bangDia =  cbTenBang.getSelectedItem().toString();
				String cmnd = cbCMND.getSelectedItem().toString();
				List<PhieuThue> listPhieuThue = phieuThueDao.findPhieuThue(pos);
				for (PhieuThue phieuThue : listPhieuThue) {
					BangDia bd = new BangDia();
					bd = bangDiaDao.getBangDiaByTen(bangDia);
					tableModel.addRow(new Object[] {
							phieuThue.getSoPhieu(),
							cmnd,
							bangDia,
							phieuThue.getNgayThue(),
							phieuThue.getSoNgayMuon(),
							phieuThue.getSoluong(),
							phieuThue.getDonGia(),
							((entity.BangDia) bd).getTinhTrang(),
					});
				}
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
			}

		}

		if(o.equals(btnSua)){
			int soPhieu = Integer.parseInt(txtSoPhieu.getText());
			String cmnd = cbCMND.getSelectedItem().toString();
			String tenBang = cbTenBang.getSelectedItem().toString();
			String nvID = cbMaNV.getSelectedItem().toString();
			int maNV = Integer.parseInt(nvID);
			int soNgayMuon = Integer.parseInt(txtSoNgaymuon.getText());
			String ngayThue = txtNgayThue.getText().toString().trim();
			int soLuong = Integer.parseInt(txtslDia.getText());
			double donGia = Double.parseDouble(txtdonGia.getText());

			List<BangDia> b = bangDiaDao.findBangDia(tenBang);
			NhanVien n = nhanVienDao.getNhanVienByID(maNV);
			KhachHang k = khachHangDao.getKhachHangByID(cmnd);

			Set<BangDia> setBangDia = new HashSet<>(b);

			PhieuThue pt = new PhieuThue(soPhieu, k, ngayThue, setBangDia, soLuong, soNgayMuon, donGia, n);
			phieuThueDao.updatePhieuThue(pt);
			tableModel.setRowCount(0);
			DocDuLieuVaoTablePhieuThue();
		}
		
		if (o.equals(btnTim)) {
//			int sp = Integer.parseInt(txtTim.getText().trim());
			if(txtTim.getText() == null) {
				tableModel.setRowCount(0);
			}
			else {
				int pos = Integer.parseInt(txtTim.getText().trim()) ;
				tableModel.setRowCount(0);
				String bangDia =  cbTenBang.getSelectedItem().toString();
				String cmnd = cbCMND.getSelectedItem().toString();
				List<PhieuThue> listPhieuThue = phieuThueDao.findPhieuThue(pos);
				for (PhieuThue phieuThue : listPhieuThue) {
					BangDia bd = new BangDia();
					bd = bangDiaDao.getBangDiaByTen(bangDia);
					tableModel.addRow(new Object[] {
							phieuThue.getSoPhieu(),
							cmnd,
							bangDia,
							phieuThue.getNgayThue(),
							phieuThue.getSoNgayMuon(),
							phieuThue.getSoluong(),
							phieuThue.getDonGia(),
							((entity.BangDia) bd).getTinhTrang(),
					});
				}
			}

		}
		
		if(o.equals(btnSua)){
			int soPhieu = Integer.parseInt(txtSoPhieu.getText());
			String cmnd = cbCMND.getSelectedItem().toString();
			String tenBang = cbTenBang.getSelectedItem().toString();
			String nvID = cbMaNV.getSelectedItem().toString();
			int maNV = Integer.parseInt(nvID);
			int soNgayMuon = Integer.parseInt(txtSoNgaymuon.getText());
			String ngayThue = txtNgayThue.getText().toString().trim();
			int soLuong = Integer.parseInt(txtslDia.getText());
			double donGia = Double.parseDouble(txtdonGia.getText());
			
			List<BangDia> b = bangDiaDao.findBangDia(tenBang);
			NhanVien n = nhanVienDao.getNhanVienByID(maNV);
			KhachHang k = khachHangDao.getKhachHangByID(cmnd);
			
			Set<BangDia> setBangDia = new HashSet<>(b);
			
			PhieuThue pt = new PhieuThue(soPhieu, k, ngayThue, setBangDia, soLuong, soNgayMuon, donGia, n);
			phieuThueDao.updatePhieuThue(pt);
			tableModel.setRowCount(0);
			DocDuLieuVaoTablePhieuThue();
		}
	}
	private void emtyTextfields() {
		txtSoPhieu.setText("");
		txtdonGia.setText("");
		txtmaBang.setText("");
		txtmaThe.setText("");
		txtNgayThue.setText("");
		txtslDia.setText("");
		txtSoNgaymuon.setText("");
		txtTenBang.setText("");
		txtTheLoai.setText("");
		txtTinhTrang.setText("");
		txtSoPhieu.requestFocus();

	}
<<<<<<< HEAD
	
	private void DocDuLieuVaoTablePhieuThue() {
		List<PhieuThue> listPhieuThue = phieuThueDao.getAllPhieuThue();
		List<String> lTenBD = phieuThueDao.getTenBangDia();
		List<String> lCMND = phieuThueDao.getCMNDByPhieuThueID();
		List<Integer> lMaNV = phieuThueDao.getMaNVByPhieuThueID();
		List<String> lTinhTrang = thongKeDao.getDate();

		for (int i = 0; i < listPhieuThue.size(); i++) {
			tableModel.addRow(new Object[] { 
					listPhieuThue.get(i).getSoPhieu(), lCMND.get(i).toString(), 
					lTenBD.get(i).toString(), listPhieuThue.get(i).getNgayThue(), 
					listPhieuThue.get(i).getSoNgayMuon(), listPhieuThue.get(i).getSoluong(),
					listPhieuThue.get(i).getDonGia(), lMaNV.get(i).toString(), lTinhTrang.get(i).toString()
=======

	private void DocDuLieuVaoTablePhieuThue() {
		List<PhieuThue> listPhieuThue = phieuThueDao.getAllPhieuThue();
		List<String> lTenBD = phieuThueDao.getTenBangDia();

		for (int i = 0; i < listPhieuThue.size(); i++) {
			tableModel.addRow(new Object[] { 
					listPhieuThue.get(i).getSoPhieu(), listPhieuThue.get(i).getCMND().toString(), lTenBD.get(i).toString()
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
			});
		}
	}

<<<<<<< HEAD
	@Override
	public void mouseClicked(MouseEvent e) {
		int row = table1.getSelectedRow();
		txtSoNgaymuon.setText(table1.getValueAt(row, 3).toString());
		txtSoPhieu.setText(table1.getValueAt(row, 0).toString());
		txtslDia.setText(table1.getValueAt(row, 5).toString());
		txtdonGia.setText(table1.getValueAt(row, 6).toString());
		txtNgayThue.setText(table1.getValueAt(row, 3).toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//	private PhieuThue revertFromTextfield() {
//		// TODO Auto-generated method stub
//		PhieuThue pt = new PhieuThue();
//		int 	soPhieu 	= Integer.parseInt(txtSoPhieu.getText());
//		double  donGia 		= Double.parseDouble(txtdonGia.getText().trim());
//		String 	maBang 		= txtmaBang.getText().trim();
//		int 	maThe 		= Integer.parseInt(txtmaThe.getText());
//		String 	ngayThue 	= txtNgayThue.getText().trim();
//		int 	slDia 		= Integer.parseInt(txtslDia.getText().trim());
//		String 	tinhTrang 	= txtTinhTrang.getText().trim();
//		String 	tenBang 	= txtTenBang.getText().trim();
//		String 	theLoai 	= txtTheLoai.getText().trim();
//		int 	soNgayM 	= Integer.parseInt(txtSoNgaymuon.getText().trim());
//		
//		return new PhieuThue(soPhieu, maThe, ngayThue, maBang, tenBang, theLoai, tinhTrang, slDia, soNgayM, donGia);
//	}
}
=======
}
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
