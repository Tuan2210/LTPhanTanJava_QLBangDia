//Nguoi thuc hien : NguyenTienDat_19512891
package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import app.FrmThongKe;
import entity.BangDia;
import entity.KhachHang;
import entity.NhanVien;
import entity.PhieuThue;
import app.FrmBangDia;






public class FrmPhieuThue extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTitle,lblSoPhieu , lblNgayThue , lblmaThe, lblmaBang, lblTenBang, lblTheLoai,lblTinhTrang, lblslDia , lblsoNgaymuon , lbldonGia ,lblTim,lblMessage;
	private JTextField txtSoPhieu, txtNgayThue, txtmaThe, txtmaBang , txtTenBang , txtTheLoai,txtTinhTrang , txtslDia , txtSoNgaymuon , txtdonGia, txtTim,txtMessage;
	private JTable table1;
	private JComboBox cbCMND, cbTenBang, cbMaNV;
//	private ListPhieuThue listPhieu ;
//	private PhieuThueTableModel tableModel;
	private JButton btnBaoCao,btnThem , btnXoa , btnSua , btnTim , btnLuu, btnXoaTrang ;
	
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
	
	public FrmPhieuThue() {
		// TODO Auto-generated constructor stub
		setTitle("Phieu thue CD");
		setSize(900,600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addControl();
		setVisible(true);
	}
	private void addControl() {
		// TODO Auto-generated method stub
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
		listKH = FrmMain.khachHangDao.getAllKhachHang();
		for(KhachHang kh : listKH) {
			cbCMND.addItem(kh.getSoCMND());
		}
		
//		cbCMND = new JComboBox()

		b.add(b3= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b3.add(lblTenBang = new JLabel("Tên băng:"));
		b3.add(cbTenBang = new JComboBox());
		b3.add(lblmaBang = new JLabel("Mã CD:"));
		b3.add(txtTenBang = new JTextField(15));
		
		List<BangDia> listBD = new ArrayList<BangDia>();
		listBD = FrmMain.bangDiaDao.getAllBangDia();
		for(BangDia bd : listBD) {
			cbTenBang.addItem(bd.getTenBD());
		}
		

		
		b.add(b4= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b4.add(lblTheLoai = new JLabel("Mã NV:"));
		b4.add(cbMaNV = new JComboBox());
		b4.add(lblslDia = new JLabel("Số lượng băng :"));
		b4.add(txtslDia = new JTextField());
		
		List<NhanVien> listNV = new ArrayList<NhanVien>();
		listNV = FrmMain.nhanVienDao.getAllNhanVien();
		for(NhanVien nv : listNV) {
			cbMaNV.addItem(nv.getMaNV());
		}
		
		b.add(b5= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
		b5.add(lblsoNgaymuon = new JLabel("Số ngày mượn:"));
		b5.add(txtSoNgaymuon = new JTextField());
		b5.add(lbldonGia = new JLabel("Đơn giá:"));
		b5.add(txtdonGia = new JTextField());
		
		b.add(b2= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));	
		b2.add(lblNgayThue = new JLabel("Ngày thuê:"));
		b2.add(txtNgayThue = new JTextField(15));
		b2.add(lblTinhTrang = new JLabel("Tình trạng:"));
		b2.add(txtTinhTrang = new JTextField(15));
		
		
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
		
		
		b7.add(new JScrollPane(table1 = new JTable()));
		table1.setRowHeight(25);
		
		b.add(b6= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(600));
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
		lblTinhTrang.setPreferredSize(lblslDia.getPreferredSize());
		lblmaBang.setPreferredSize(lblslDia.getPreferredSize());
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
		pSouth.add(btnBaoCao = new JButton("Báo cáo"));
		
		add(pSouth, BorderLayout.SOUTH);
		pSouth.setBorder(BorderFactory.createTitledBorder(borderVien, ""));
		
//		listPhieu = new ListPhieuThue();
//		Database db = new Database();
//		Database.getInstance().connect();
//		try {
//			listPhieu.napDuLieuTuFile();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		updatetableData();
		
		table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int row = table1.getSelectedRow();
				fillForm(row);
			}
		});
		
		btnBaoCao.addActionListener(this);
		btnLuu.addActionListener(this);
		btnSua.addActionListener(this);
		btnThem.addActionListener(this);
		btnTim.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		
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
	}
//	private void updatetableData() {
//		// TODO Auto-generated method stub
//		tableModel = new PhieuThueTableModel(listPhieu.getListPhieuThue());
//		table1.setModel(tableModel);
//	}
	private boolean validData() {
		// TODO Auto-generated method stub
		String soPhieu = txtSoPhieu.getText().trim();
		String MaBD = txtmaBang.getText().trim();
		String donGia = txtdonGia.getText().trim();
		String soLuong = txtslDia.getText().trim();
		
		if (!(!soPhieu.equals("") && soPhieu.matches("[0-9]+"))) {
			showMessage("Error: mã nhân viên", txtSoPhieu);
			return false;
		}
		if (!(!MaBD.equals("") && MaBD.matches("[0-9]+"))) {
			showMessage("Error: tên nhân viên", txtmaBang);
			return false;
		}
		
		return true;
	}
	private void showMessage(String message, JTextField txt) {
		// TODO Auto-generated method stub
		txtMessage.setText(message);
		txt.requestFocus();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
//		if (o.equals(btnTrolai)) {
//			new GiaoDienChinh().setVisible(true);
//		}
		if (o.equals(btnThem)) {
			if (validData()) {
//				PhieuThue c = revertFromTextfield();

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
				int index = table1.getSelectedRow();
				int del = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
				if(del==JOptionPane.YES_OPTION) {

				}
			
			}
		}
		if (o.equals(btnTim)) {
			int sp = Integer.parseInt(txtTim.getText().trim());

		}
		if(o.equals(btnSua)){
			int soPhieu = Integer.parseInt(txtSoPhieu.getText());
			if(validData()){
//				PhieuThue pMoi = revertFromTextfield();

			}
		}
		if (o.equals(btnBaoCao)) {
			new FrmThongKe().setVisible(true);
		}
	}
	private void emtyTextfields() {
		// TODO Auto-generated method stub
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
