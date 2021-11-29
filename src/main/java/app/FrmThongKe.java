package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

//import quanLyPhieuThue.*;
//import quanLyPhieuThue.Database;
//import quanLyNhanVien.*;
//import quanLyBangDia.*;

public class FrmThongKe extends JFrame implements ActionListener{

	private JLabel lblTitle , lblBangH, lblPhieuHH , lblBangYT, lblTongDT ;
	private JTable tableP,tableBD,tableYT;
//	private ListPhieuThue listPhieuThue;
//	private QLBangDia listBangDia,listYT;
//	private PhieuThueTableModel PtableModel;
	private JButton btnTongDT, btnBangYT ;
	private JTextField txtYT, txtDT;
	private DefaultTableModel tableModelBDYT,tableModelBD  ;
	public FrmThongKe() {
		// TODO Auto-generated constructor stub
		setTitle("Báo cáo tổng hợp");
		setSize(1000,800);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addControl();
	}
	public static void main(String[] args) {
		new FrmThongKe().setVisible(true);
	}
	private void addControl() {
		// TODO Auto-generated method stub
		JPanel pNorth =new JPanel();
		pNorth.add(lblTitle = new JLabel("B�?O C�?O TH�?NG KÊ BĂNG �?ĨA "));
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
		
		b.add(b3= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(10));
		b3.add(txtDT = new JTextField(15));
		txtDT.setEditable(false);
		txtDT.setBorder(null);
		txtDT.setFont(new Font("Arial", Font.ITALIC, 12));
		txtDT.setForeground(Color.BLACK);
		txtDT.setBackground(Color.WHITE);
		txtDT.setBorder(BorderFactory.createTitledBorder(borderVien));
		
		
		b.add(b2= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(5));
		b2.add(lblBangH = new JLabel("DANH S�?CH BĂNG �?ĨA BỊ HƯ:"));
		
		
		String [] header = {"Mã băng đĩa","Tên băng đĩa","Thể loại","Tình trạng","Số lượng","Số ngày được mượn","�?ơn giá","Hãng sản xuất","Ghi chú"};
		
		tableBD = new JTable(tableModelBD=new DefaultTableModel(header, 0));
		b.add(b6= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(10));
		JScrollPane panet = new JScrollPane();
		panet.add(tableBD);
		Dimension maxSize = new Dimension(900,50);
		panet.setMinimumSize(maxSize);
		b6.add(new JScrollPane(tableBD));
		panet.setSize(900,55);
		
		
		b.add(b1= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(5));
		b1.add(lblBangYT = new JLabel("BĂNG �?ĨA �?ƯỢC YÊU TH�?CH:"));
		
		b.add(b2= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(10));
//		String [] header = {"Mã băng đĩa","Tên băng đĩa","Thể loại","Tình trạng","Số lượng","Số ngày được mượn","�?ơn giá","Hãng sản xuất","Ghi chú"};
//		tableYT = new JTable(tableModelBDYT=new DefaultTableModel(header, 0));
//		b2.add(new JScrollPane(tableYT = new JTable()));
//		tableYT.setRowHeight(18);
//		
//		listYT = new QLBangDia();
//		quanLyBangDia.Database dbb = new quanLyBangDia.Database();
//		quanLyBangDia.Database.getInstance().connect();
//		
//		try {
//			listYT.getDulieuBangYT();
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		LayDuLieuTuSQLChoModel();

		String [] tenCot = {"Mã băng đĩa","Tên băng đĩa","Thể loại","Tình trạng","Số lượng","Số ngày được mượn","�?ơn giá","Hãng sản xuất","Ghi chú"};
		
		tableYT = new JTable(tableModelBDYT =new DefaultTableModel(tenCot, 0));
		b.add(b5= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(10));
		JScrollPane panet2 = new JScrollPane();
		panet2.add(tableYT);
		Dimension maxSize2 = new Dimension(900,50);
		panet.setMinimumSize(maxSize2);
		b5.add(tableYT);
		tableYT.setSize(900,50);
		panet.setSize(900,55);
		
		b.add(b7= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(10));
		b7.add(lblPhieuHH = new JLabel("DANH S�?CH PHIẾU THUÊ ĐÃ HẾT HẠN"));
		b.add(b4= Box.createHorizontalBox());
		b.add(Box.createHorizontalStrut(900));
		b.add(Box.createVerticalStrut(10));
		
		JScrollPane paneP = new JScrollPane(tableP = new JTable());
		tableP.setSize(600, 300);
		paneP.setSize(200, 100);
		b4.add(paneP);
		tableP.setRowHeight(18);
		
		
		

		
		pCen.add(b);
		add(pCen, BorderLayout.CENTER);
		
//		listYT = new QLBangDia();
//		quanLyBangDia.Database dbb = new quanLyBangDia.Database();
//		quanLyBangDia.Database.getInstance().connect();
		
//		try {
//			listYT.getDulieuBangYT();
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//		LayDuLieuTuSQLChoModel();
//		LayDuLieuTuSQLmodelBD();
//		listPhieuThue = new ListPhieuThue();
//		Database db = new Database();
//		Database.getInstance().connect();
//		try {
//			listPhieuThue.getDulieuPhieuHH();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//				updatetableData();
		
		tableP.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				int row = tableP.getSelectedRow();
			}

		});
//		lblTongDT.setPreferredSize(lblBangYT.getPreferredSize());
//		lblBangYT.setPreferredSize(lblBangYT.getPreferredSize());
//		txtDT.setText("TỔNG DOANH THU  : " +listPhieuThue.Tong()+" đ");
		
//		b.add(b4= Box.createHorizontalBox());
//		b.add(Box.createHorizontalStrut(600));
//		b4.add(lblTheLoai = new JLabel("Thể loại đĩa :"));
//		b4.add(txtTheLoai = new JTextField());
//		b4.add(lblslDia = new JLabel("Số lượng đĩa :"));
//		b4.add(txtslDia = new JTextField());
//		
//		b.add(b5= Box.createHorizontalBox());
//		b.add(Box.createHorizontalStrut(600));
//		b5.add(lblsoNgaymuon = new JLabel("Số ngày mượn:"));
//		b5.add(txtSoNgaymuon = new JTextField());
//		b5.add(lbldonGia = new JLabel("�?ơn giá:"));
//		b5.add(txtdonGia = new JTextField());
//		
		
		
		
		
//		b1.add(lblTitle = new JLabel("B�?O C�?O BĂNG �?ĨA TỔNG HỢP"));
//		lblTitle.setFont(new Font("SansSerif", Font.BOLD, 30));
//		lblTitle.setForeground(Color.DARK_GRAY);
//		
		
		
		
	}
//	private void LayDuLieuTuSQLChoModel()  {
//		// TODO Auto-generated method stub
//		//		for(int i=0; i<listBD.getSize(); i++) {
//		//			BangDia bd = listBD.getEle(i);
//		//			tableModelBD.addRow(new Object[] {
//		//					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(),
//		//					bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(),
//		//					bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
//		//			});
//		//		}
//		//int i = 0;
//		
//		try {
//			ArrayList<BangDia> list = new ArrayList<>();
//			list = quanLyBangDia.Database.getListYT();
//			for(BangDia bd : list) {
//				tableModelBDYT.addRow(new Object[] {
//						//i++,  // là số thứ tự của table
//						bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(),
//						bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(),
//						bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
//				});
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	private void LayDuLieuTuSQLmodelBD()  {
//		// TODO Auto-generated method stub
//		//		for(int i=0; i<listBD.getSize(); i++) {
//		//			BangDia bd = listBD.getEle(i);
//		//			tableModelBD.addRow(new Object[] {
//		//					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(),
//		//					bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(),
//		//					bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
//		//			});
//		//		}
//		//int i = 0;
//		
//		try {
//			ArrayList<BangDia> list = new ArrayList<>();
//			list = quanLyBangDia.Database.getListBDH();
//			for(BangDia bd : list) {
//				tableModelBD.addRow(new Object[] {
//						//i++,  // là số thứ tự của table
//						bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(),
//						bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(),
//						bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
//				});
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	private void updatetableData() {
//		// TODO Auto-generated method stub
//		PtableModel = new PhieuThueTableModel(listPhieuThue.getListPhieuThue());
//		tableP.setModel(PtableModel);
//	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
