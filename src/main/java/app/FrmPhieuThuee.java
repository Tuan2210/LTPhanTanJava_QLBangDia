package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.BangDiaDao;
import dao.KhachHangDao;
import dao.NhanVienDao;
import dao.PhieuThueDao;
import entity.BangDia;
import entity.KhachHang;
import entity.NhanVien;
import entity.PhieuThue;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmPhieuThuee extends JFrame implements ActionListener, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5898627365349839295L;
	private JPanel contentPane;
	private DefaultTableModel tableModel;
	private JTable table;
	private JTextField txtSoNgayMuon;
	private JTextField txtNgayThue;
	private JTextField txtSoLuongBang;
	private JTextField txtDonGia;
	private JTextField txtFind;
	private JComboBox cboCMND;
	private JComboBox cboTenBang;
	private JComboBox cboMaNV;
	
	PhieuThueDao phieuThueDao = new PhieuThueDao(FrmMain.factory);
	KhachHangDao khachHangDao = new KhachHangDao(FrmMain.factory);
	BangDiaDao bangDiaDao = new BangDiaDao(FrmMain.factory);
	NhanVienDao nhanVienDao = new NhanVienDao(FrmMain.factory);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPhieuThuee frame = new FrmPhieuThuee();
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
	public FrmPhieuThuee() throws RemoteException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 30, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("QUẢN LÝ ĐĂNG KÝ PHIẾU THUÊ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblTitle.setBounds(300, 20, 380, 30);
		contentPane.add(lblTitle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(50, 200, 900, 500);
		contentPane.add(scrollPane);
		
		String tenCot[] = {"Số phiếu", "Số CMND", "Tên băng đĩa", "Ngày thuê", "Số ngày mượn", "Số lượng", "Đơn giá"};
		tableModel = new DefaultTableModel(tenCot, 0);
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
		DocDuLieuVaoTablePhieuThue();
		
		JLabel lblCMND = new JLabel("Số CMND:");
		lblCMND.setBounds(100, 65, 90, 20);
		contentPane.add(lblCMND);
		
		JLabel lblTenBang = new JLabel("Tên băng:");
		lblTenBang.setBounds(100, 96, 90, 20);
		contentPane.add(lblTenBang);
		
		JLabel lblMaNV = new JLabel("Mã nhân viên:");
		lblMaNV.setBounds(100, 127, 90, 20);
		contentPane.add(lblMaNV);
		
		JLabel lblSoNgayMuon = new JLabel("Số ngày mượn:");
		lblSoNgayMuon.setBounds(100, 158, 90, 20);
		contentPane.add(lblSoNgayMuon);
		
		JLabel lblNgayThue = new JLabel("Ngày thuê:");
		lblNgayThue.setBounds(550, 127, 90, 20);
		contentPane.add(lblNgayThue);
		
		cboCMND = new JComboBox();
		cboCMND.setBounds(200, 64, 200, 22);
		contentPane.add(cboCMND);
		
		List<KhachHang> listKH = new ArrayList<KhachHang>();
		listKH = khachHangDao.getAllKhachHang();
		for(KhachHang kh : listKH) {
			cboCMND.addItem(kh.getSoCMND());
		}
		
		cboTenBang = new JComboBox();
		cboTenBang.setBounds(200, 95, 200, 22);
		contentPane.add(cboTenBang);
		
		List<BangDia> listBD = new ArrayList<BangDia>();
		listBD = bangDiaDao.getAllBangDia();
		for(BangDia bd : listBD) {
			cboTenBang.addItem(bd.getTenBD());
		}
		
		cboMaNV = new JComboBox();
		cboMaNV.setBounds(200, 126, 200, 22);
		contentPane.add(cboMaNV);
		
		List<NhanVien> listNV = new ArrayList<NhanVien>();
		listNV = nhanVienDao.getAllNhanVien();
		for(NhanVien nv : listNV) {
			cboMaNV.addItem(nv.getMaNV());
		}
		
		txtSoNgayMuon = new JTextField();
		txtSoNgayMuon.setBounds(200, 158, 200, 20);
		contentPane.add(txtSoNgayMuon);
		txtSoNgayMuon.setColumns(10);
		
		txtNgayThue = new JTextField();
		txtNgayThue.setBounds(650, 127, 200, 20);
		contentPane.add(txtNgayThue);
		txtNgayThue.setColumns(10);
		
		JLabel lblSoLuongBang = new JLabel("Số lượng băng:");
		lblSoLuongBang.setBounds(550, 61, 90, 20);
		contentPane.add(lblSoLuongBang);
		
		txtSoLuongBang = new JTextField();
		txtSoLuongBang.setBounds(650, 61, 200, 20);
		contentPane.add(txtSoLuongBang);
		txtSoLuongBang.setColumns(10);
		
		JLabel lblDonGia = new JLabel("Đơn giá:");
		lblDonGia.setBounds(550, 95, 90, 20);
		contentPane.add(lblDonGia);
		
		txtDonGia = new JTextField();
		txtDonGia.setBounds(650, 95, 200, 20);
		contentPane.add(txtDonGia);
		txtDonGia.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nhập mã tìm:");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel.setBounds(129, 714, 100, 20);
		contentPane.add(lblNewLabel);
		
		txtFind = new JTextField();
		txtFind.setBounds(239, 712, 200, 20);
		contentPane.add(txtFind);
		txtFind.setColumns(10);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setBounds(449, 711, 89, 23);
		contentPane.add(btnTim);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.setBounds(549, 711, 89, 23);
		contentPane.add(btnThem);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	private void DocDuLieuVaoTablePhieuThue() {
		
	}
}
