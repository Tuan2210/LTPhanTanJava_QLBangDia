package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import entity.KhachHang;
//import quanLyBangDia.FrmBangDia;


public class FrmKhachHang extends JFrame implements ActionListener, MouseListener{
	private static final long serialVersionUID = 1L;
	private JTextField txtHoTen;
	private JTextField txtGioiTinh;
	private JTextField txtDienThoai;
	private JTextField txtDiaChi;
	private JTextField txtSoCMND;
	private JTextField txtMessage;
	private JTextField txtNhap;
	private JButton btnThem;
	private JButton btnXoa;
	private JButton btnSua;
	private JButton btnLuu;
	private JButton btnTim;
	private JButton btnXoaRong;
	private JTable table;
	private DefaultTableModel tableModel,tableModelBD;
//	private DanhSachKhachHang listKH;
//	private ArrayList<KhachHang> listData;
	JSplitPane split;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrmKhachHang().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FrmKhachHang() throws SQLException {
		setTitle("QUẢN LÝ KHÁCH HÀNG");
		setSize(900,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JLabel lblTitle, lblHoTen, lblGioiTinh, lblDienThoai, lblDiaChi, lblSoCMND, lblNhap;
		//North
		JPanel pNorth = new JPanel();
		pNorth.setBackground(Color.pink);
		pNorth.add(lblTitle = new JLabel("THÔNG TIN KHÁCH HÀNG"));
		Font fp = new Font("Times new Roman", Font.BOLD,30);
		lblTitle.setFont(fp);
		lblTitle.setForeground(Color.DARK_GRAY);
		add(pNorth,BorderLayout.NORTH);

		//Center
		JPanel pCen = new JPanel();
		Box b = Box.createVerticalBox();
		Box b1 = Box.createHorizontalBox();
		Box b2 = Box.createHorizontalBox();
		Box b3 = Box.createHorizontalBox();
		Box b4 = Box.createHorizontalBox();
		Box b5 = Box.createHorizontalBox();

		b1.add(lblHoTen = new JLabel("Họ Tên: "));
		b1.add(txtHoTen = new JTextField(50));
		b.add(b1);
		b1.add(lblGioiTinh = new JLabel("Giới Tính: "));
		b1.add(txtGioiTinh = new JTextField(15));
		b.add(b1);
		b.add(Box.createVerticalStrut(10));

		b2.add(lblDienThoai = new JLabel("Điện Thoại: "));
		b2.add(txtDienThoai = new JTextField());
		b.add(b2);
		b.add(Box.createVerticalStrut(10));

		b3.add(lblDiaChi = new JLabel("Địa Chỉ: "));
		b3.add(txtDiaChi = new JTextField());
		b.add(b3);
		b.add(Box.createVerticalStrut(10));

		b4.add(lblSoCMND = new JLabel("Số CMND: "));
		b4.add(txtSoCMND = new JTextField());
		b.add(b4);
		b.add(Box.createVerticalStrut(10));

		b5.add(txtMessage = new JTextField());
		txtMessage.setEditable(false);
		txtMessage.setBorder(null);
		txtMessage.setFont(new Font("Arial", Font.ITALIC, 12));
		txtMessage.setForeground(Color.BLUE);
		txtMessage.setBackground(Color.pink);

		lblHoTen.setPreferredSize(lblDienThoai.getPreferredSize());
		lblGioiTinh.setPreferredSize(lblDienThoai.getPreferredSize());
		lblDiaChi.setPreferredSize(lblDienThoai.getPreferredSize());
		lblSoCMND.setPreferredSize(lblDienThoai.getPreferredSize());

		//table
		String[] cols = {"Họ tên", "Giới tính", "Điện thoại", "Địa chỉ", "Số CMND"};
		tableModel = new DefaultTableModel(cols,0);
		table = new JTable(tableModel);
		DocDuLieuVaoTableKhachHang();

		JScrollPane scroll;
		table.setRowHeight(20);
		scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(852,320));
		b.add(scroll);
		b.add(Box.createVerticalStrut(10));
		pCen.add(b);
		add(pCen,BorderLayout.CENTER);

		//South

		//South
		split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JPanel pLeft = new JPanel();
		pLeft.add(lblNhap = new JLabel("Nhập số CMND cần tìm:"));
		pLeft.add(txtNhap = new JTextField(20));
		pLeft.add(btnTim = new JButton("Tìm"));
		split.setLeftComponent(pLeft);

		JPanel pRight = new JPanel();
		pRight.setBorder(BorderFactory.createTitledBorder(""));
		pRight.add(btnThem = new JButton("Thêm"));
		pRight.add(btnXoaRong = new JButton("Xóa Rỗng"));
		pRight.add(btnXoa = new JButton("Xóa"));
		pRight.add(btnSua = new JButton("Sửa"));
		pRight.add(btnLuu = new JButton("Lưu"));
		split.setRightComponent(pRight);
		add(split,BorderLayout.SOUTH);

//		listKH = new DanhSachKhachHang();
//		Database db=new Database();
//		Database.getInstance().connect();
//		listData = new Database().getAllFromSQL();

		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnSua.addActionListener(this);
		btnXoaRong.addActionListener(this);
		btnLuu.addActionListener(this);
		btnTim.addActionListener(this);
		table.addMouseListener(this);

	}
	private void xoaRong() {
		// TODO Auto-generated method stub
		txtHoTen.setText("");
		txtDienThoai.setText("");
		txtDiaChi.setText("");
		txtSoCMND.setText("");;
		txtHoTen.requestFocus();
	}
//	private void LayDuLieuTuSQLChoModel() {
//		for(KhachHang kh : listData) {
//			tableModel.addRow(new Object[] {kh.getHoTen(), kh.getGioiTinh(), kh.getDienThoai(),kh.getDiaChi(), kh.getSoCMND()});
//		}
//	}
	private void XoaHetDuLieuTableModel(DefaultTableModel tableModelBD2) {
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.getDataVector().removeAllElements();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

		if(o.equals(btnThem)) {
			String hoten = txtHoTen.getText();
			String gioitinh = txtGioiTinh.getText();
			String dienthoai = txtDienThoai.getText();
			String diachi = txtDiaChi.getText();
			int socmnd = Integer.parseInt(txtSoCMND.getText());
			KhachHang kh = new KhachHang(hoten, gioitinh, dienthoai, diachi, socmnd);
			FrmMain.khachHangDao.add(kh);
			
			tableModel.addRow(new Object[] {
					kh.getHoTen(), kh.getGioiTinh(), kh.getDienThoai(), kh.getDiaChi(), kh.getSoCMND()
			});
		}
		if(o.equals(btnXoa)) {
			if (table.getSelectedRow() != -1) {
				int index = table.getSelectedRow();
				int socmnd = Integer.parseInt(txtSoCMND.getText());
				int del = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa?", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
				if(del==JOptionPane.YES_OPTION) {
					FrmMain.khachHangDao.removeKhachHang(socmnd);
					tableModel.setRowCount(0);
					DocDuLieuVaoTableKhachHang();
				}
			
			}
		}
		if(o.equals(btnXoaRong)) {
			xoaRong();
		}
		if(o.equals(btnLuu)) {		
			
<<<<<<< HEAD
		}
		if(o.equals(btnSua)) {
			String hoten = txtHoTen.getText();
			String gioitinh = txtGioiTinh.getText();
			String dienthoai = txtDienThoai.getText();
			String diachi = txtDiaChi.getText();
			int socmnd = Integer.parseInt(txtSoCMND.getText());
			KhachHang khUpdate = new KhachHang(hoten, gioitinh, dienthoai, diachi, socmnd);
			
			FrmMain.khachHangDao.updateKhachHang(khUpdate);
			tableModel.setRowCount(0);
			DocDuLieuVaoTableKhachHang();
=======
>>>>>>> 82af7f23d77324cfbff68462e799a0589b5f1231
		}
		if(o.equals(btnTim)) {
			if(txtNhap.getText() == null) {
				tableModel.setRowCount(0);
			}
			else if (txtNhap.getText() != null) {
				int pos = Integer.parseInt(txtNhap.getText());
				tableModel.setRowCount(0);
				List<KhachHang> listKH = FrmMain.khachHangDao.findKhachHang(pos);
				
				for(KhachHang h : listKH) {
					tableModel.addRow(new Object[] {
							h.getHoTen(), h.getGioiTinh(), h.getDienThoai(), h.getDiaChi(), h.getSoCMND()
					});
				}
			}
		}
	}

	
//	private void updateTablemodel() {
//		// TODO Auto-generated method stub
//		ArrayList<KhachHang> list = new ArrayList<>();
//		list = listKH.getListKH();
//		for (KhachHang kh : list) {
//			tableModel.addRow(new Object[] {
//					kh.getDiaChi(),kh.getDienThoai(),kh.getGioiTinh(),kh.getHoTen(),kh.getSoCMND()
//			});
//		}
//	}
	private KhachHang revertFromTextfield() {
		// TODO Auto-generated method stub
		String hoten = txtHoTen.getText().trim();
		String Gioitinh = txtGioiTinh.getText().trim();
		String DienThoai = txtDienThoai.getText().trim();
		String diachi = txtDiaChi.getText().trim();
		int soCMND = Integer.parseInt(txtSoCMND.getText());
		
		return new KhachHang(hoten, Gioitinh, DienThoai, diachi, soCMND);
	}
	
	public void mouseClicked(MouseEvent e) {
		int row = table.getSelectedRow();
		txtHoTen.setText(table.getValueAt(row, 0).toString());
		txtGioiTinh.setText(table.getValueAt(row, 1).toString());
		txtDienThoai.setText(table.getValueAt(row, 2).toString());
		txtDiaChi.setText(table.getValueAt(row, 3).toString());
		txtSoCMND.setText(table.getValueAt(row, 4).toString());
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	public void DocDuLieuVaoTableKhachHang() {
		List<KhachHang> list = FrmMain.khachHangDao.getAllKhachHang();
		
		for(KhachHang h : list) {
			tableModel.addRow(new Object[] {
					h.getHoTen(), h.getGioiTinh(), h.getDienThoai(), h.getDiaChi(), h.getSoCMND()
			});
		}
	}

}
