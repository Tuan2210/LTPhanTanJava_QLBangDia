package app;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import dao.BangDiaDao;
import entity.BangDia;
import service.BangDiaServices;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.rmi.RemoteException;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 *NgÆ°ï¿½?i viáº¿t: ï¿½?inh Quang Tuáº¥n - MSSV: 19468641 - NhĂ³m 13
 *NgĂ y viáº¿t: 11/5/2021 
 * */

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
public class FrmBangDia extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMa, txtTen, txtTheLoai, txtTinhTrang, txtSoLuong, txtSoNgayMuon, txtDonGia, txtHangSX, txtTim;
	private JTextArea txtGhiChu;
	private Border borderVien;
	private JScrollPane scrlpaneGhiChu, scrlPane;
	private JSplitPane split1, split2;
	private JButton btnThem, btnXoa, btnCapNhat, btnLuu, btnTim, btnXoaTrang;
	//	private QLBangDia listBD;
	private JTable tableBD;
	private DefaultTableModel tableModelBD, tableModel;
	private String maCanSua;
	BangDiaDao bangDiaDao = new BangDiaDao(FrmMain.factory);
<<<<<<< HEAD
<<<<<<< HEAD
	
	//	private ArrayList<BangDia> listData;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
	
	//	private ArrayList<BangDia> listData;
>>>>>>> parent of 8ab78b7 (fix all code sever)

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrmBangDia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

<<<<<<< HEAD
	public FrmBangDia() throws RemoteException{
=======
	public FrmBangDia(){
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
		super("THÔNG TIN CD");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(1120, 650);
		setLocationRelativeTo(null);
		contentPane = new JPanel(new BorderLayout());
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		////////////////////////////////////////////////////
		JPanel pNorth = new JPanel();												//north
		pNorth.setBackground(Color.PINK);
		pNorth.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		pNorth.setPreferredSize(new Dimension(150, 50));

		JLabel lbltITitle = new JLabel("THÔNG TIN BĂNG ĐĨA");
		lbltITitle.setVerticalAlignment(SwingConstants.TOP);
		lbltITitle.setFont(new Font("SansSerif", Font.BOLD, 30));
		pNorth.add(lbltITitle);
		contentPane.add(pNorth, BorderLayout.NORTH);
		////////////////////////////////////////////////////
<<<<<<< HEAD
<<<<<<< HEAD
		split1=new JSplitPane(JSplitPane.VERTICAL_SPLIT);			//chia Ä‘Ă´i vĂ¹ng center chĂ­nh
		split1.setPreferredSize(new Dimension(900, 600));

		JPanel pTop=new JPanel(new BorderLayout());								//top nhï¿½?
		borderVien=BorderFactory.createLineBorder(Color.ORANGE);
		split2=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);			// chia Ä‘Ă´i vĂ¹ng tt chi tiáº¿t
=======
		split1=new JSplitPane(JSplitPane.VERTICAL_SPLIT);			
=======
		split1=new JSplitPane(JSplitPane.VERTICAL_SPLIT);			//chia Ä‘Ă´i vĂ¹ng center chĂ­nh
>>>>>>> parent of 8ab78b7 (fix all code sever)
		split1.setPreferredSize(new Dimension(900, 600));

		JPanel pTop=new JPanel(new BorderLayout());								//top nhï¿½?
		borderVien=BorderFactory.createLineBorder(Color.ORANGE);
<<<<<<< HEAD
		split2=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);			
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		split2=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);			// chia Ä‘Ă´i vĂ¹ng tt chi tiáº¿t
>>>>>>> parent of 8ab78b7 (fix all code sever)
		split2.setPreferredSize(new Dimension(15, 3));
		//split2.setPreferredSize(new Dimension(15, 5));
		pTop.setBorder(BorderFactory.createTitledBorder(borderVien, "THÔNG TIN CHI TIẾT"));

		Box b,b1,b2,b3,b4,b5,b6,b7,b8,b9,bA,bB,bC;
		b=Box.createVerticalBox();
		bA=Box.createVerticalBox();
		bB=Box.createVerticalBox();
		bC=Box.createVerticalBox();
		bC.setAlignmentX(Component.CENTER_ALIGNMENT);
		//bC.setAlignmentY(Component.TOP_ALIGNMENT);
		b1=Box.createHorizontalBox();
		b2=Box.createHorizontalBox();
		b3=Box.createHorizontalBox();
		b4=Box.createHorizontalBox();
		b5=Box.createHorizontalBox();
		b6=Box.createHorizontalBox();
		b7=Box.createHorizontalBox();
		b8=Box.createHorizontalBox();
		b9=Box.createHorizontalBox();

<<<<<<< HEAD
<<<<<<< HEAD
		JLabel lblMa=new JLabel("Mã băng đĩa: ");			//mĂ£
=======
		JLabel lblMa=new JLabel("Mã băng đĩa: ");			
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JLabel lblMa=new JLabel("Mã băng đĩa: ");			//mĂ£
>>>>>>> parent of 8ab78b7 (fix all code sever)
		b1.add(lblMa);
		b1.add(Box.createHorizontalStrut(16));
		b1.add(txtMa=new JTextField(10));
		b1.add(Box.createHorizontalStrut(5));
		bA.add(b1);
		bA.add(Box.createVerticalStrut(10));
<<<<<<< HEAD
<<<<<<< HEAD
		JLabel lblTen=new JLabel("Tên băng đĩa: ");			//tĂªn
=======
		JLabel lblTen=new JLabel("Tên băng đĩa: ");			
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JLabel lblTen=new JLabel("Tên băng đĩa: ");			//tĂªn
>>>>>>> parent of 8ab78b7 (fix all code sever)
		b2.add(lblTen);
		b2.add(Box.createHorizontalStrut(12));
		b2.add(txtTen=new JTextField(15));
		b2.add(Box.createHorizontalStrut(5));
		bA.add(b2);
		bA.add(Box.createVerticalStrut(10));
<<<<<<< HEAD
<<<<<<< HEAD
		JLabel lblTheLoai=new JLabel("Thể loại: ");			//thá»ƒ loáº¡i
=======
		JLabel lblTheLoai=new JLabel("Thể loại: ");			
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JLabel lblTheLoai=new JLabel("Thể loại: ");			//thá»ƒ loáº¡i
>>>>>>> parent of 8ab78b7 (fix all code sever)
		b3.add(lblTheLoai);
		b3.add(Box.createHorizontalStrut(40));
		b3.add(txtTheLoai=new JTextField(15));
		b3.add(Box.createHorizontalStrut(5));
		bA.add(b3);
		bA.add(Box.createVerticalStrut(10));
<<<<<<< HEAD
<<<<<<< HEAD
		JLabel lblTinhTrang=new JLabel("Tình trạng: ");		//tĂ¬nh tráº¡ng
=======
		JLabel lblTinhTrang=new JLabel("Tình trạng: ");		
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JLabel lblTinhTrang=new JLabel("Tình trạng: ");		//tĂ¬nh tráº¡ng
>>>>>>> parent of 8ab78b7 (fix all code sever)
		b4.add(lblTinhTrang);
		b4.add(Box.createHorizontalStrut(27));
		b4.add(txtTinhTrang=new JTextField(15));
		b4.add(Box.createHorizontalStrut(5));
		bA.add(b4);
		bA.add(Box.createVerticalStrut(10));
		////
<<<<<<< HEAD
<<<<<<< HEAD
		JLabel lblSoLuong=new JLabel("Số lượng: ");			//sá»‘ lÆ°á»£ng
=======
		JLabel lblSoLuong=new JLabel("Số lượng: ");			
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JLabel lblSoLuong=new JLabel("Số lượng: ");			//sá»‘ lÆ°á»£ng
>>>>>>> parent of 8ab78b7 (fix all code sever)
		b5.add(lblSoLuong);
		b5.add(Box.createHorizontalStrut(76));
		b5.add(txtSoLuong=new JTextField(30));
		b5.add(Box.createHorizontalStrut(5));
		bB.add(b5);
		bB.add(Box.createVerticalStrut(10));
<<<<<<< HEAD
<<<<<<< HEAD
		JLabel lblSoNgayMuon=new JLabel("Số ngày mượn: "); //sá»‘ ngĂ y Ä‘c mÆ°á»£n
		//lblSoNgayMuon.setPreferredSize(new Dimension(40, 25));
=======
		JLabel lblSoNgayMuon=new JLabel("Số ngày mượn: "); 
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JLabel lblSoNgayMuon=new JLabel("Số ngày mượn: "); //sá»‘ ngĂ y Ä‘c mÆ°á»£n
		//lblSoNgayMuon.setPreferredSize(new Dimension(40, 25));
>>>>>>> parent of 8ab78b7 (fix all code sever)
		b6.add(lblSoNgayMuon);
		b6.add(Box.createHorizontalStrut(10));
		b6.add(txtSoNgayMuon=new JTextField(10));
		b6.add(Box.createHorizontalStrut(5));
		bB.add(b6);
		bB.add(Box.createVerticalStrut(10));
		JLabel lblDonGia=new JLabel("Đơn giá: ");			//Ä‘Æ¡n giĂ¡
		b7.add(lblDonGia);
		b7.add(Box.createHorizontalStrut(84));
		b7.add(txtDonGia=new JTextField(10));
		b7.add(Box.createHorizontalStrut(5));
		bB.add(b7);
		bB.add(Box.createVerticalStrut(10));
		JLabel lblHangSX=new JLabel("Hãng sản xuất: ");		//hĂ£ng
		b8.add(lblHangSX);
		b8.add(Box.createHorizontalStrut(48));
		b8.add(txtHangSX=new JTextField(15));
		b8.add(Box.createHorizontalStrut(5));
		bB.add(b8);
		bB.add(Box.createVerticalStrut(10));

		JLabel lblGhiChu=new JLabel("Ghi chú: ");			//ghi chĂº
		b9.add(lblGhiChu);
		b9.add(Box.createHorizontalStrut(43));
		b9.add(txtGhiChu=new JTextArea());
		b9.add(scrlpaneGhiChu=new JScrollPane(txtGhiChu));
		txtGhiChu.setPreferredSize(new Dimension(15, 70));
		//b6.add(bGC);
		b9.add(Box.createHorizontalStrut(5));

		b1.setPreferredSize(new Dimension(0, 1));
		b2.setPreferredSize(new Dimension(0, 1));
		b3.setPreferredSize(new Dimension(0, 1));
		b4.setPreferredSize(new Dimension(0, 1));
		b5.setPreferredSize(new Dimension(0, 1));
		b6.setPreferredSize(new Dimension(0, 1));
		b7.setPreferredSize(new Dimension(0, 1));
		b8.setPreferredSize(new Dimension(0, 1));
		b9.setPreferredSize(new Dimension(100, 70));
		bA.setPreferredSize(new Dimension(500, HEIGHT));
		bB.setPreferredSize(new Dimension(500, HEIGHT));
		b.setPreferredSize(new Dimension(450, 200));

		split2.setLeftComponent(bA);
		split2.setRightComponent(bB);
		bC.add(split2);
		b.add(bC);
		b.add(b9);
		b.add(Box.createHorizontalStrut(100));
		pTop.add(b);
		////////////////////////////////////////////////////
		JPanel pBottom=new JPanel(new GridLayout(0, 2, 15, 15));										//bottom
		//pSouth.setBackground(Color.LIGHT_GRAY);
		JPanel pBottomLeft=new JPanel();
		JPanel pBottomRight=new JPanel();
		JPanel pL=new JPanel();
		JPanel pR=new JPanel();
		pBottom.setBorder(BorderFactory.createTitledBorder("CHỌN TÍNH NĂNG:"));

		JLabel lblTim=new JLabel("Nhập tên băng đĩa cần tìm:");
		pBottomLeft.add(lblTim);
		pBottomLeft.add(txtTim=new JTextField(15));
		pL.add(btnTim=new JButton("Tìm kiếm"));
		pL.setBackground(new Color(152, 251, 152));
		pBottomLeft.setBorder(BorderFactory.createEtchedBorder());
		pBottomLeft.add(pL);

		pR.add(btnThem=new JButton("Thêm"));
		pR.add(btnXoa=new JButton("Xóa"));
		pR.add(btnXoaTrang=new JButton("Xóa trắng"));
		pR.add(btnCapNhat=new JButton("Cập nhật"));
		pR.add(btnLuu=new JButton("Lấy dữ liệu"));
		pR.setBackground(new Color(152, 251, 152));
		pBottomRight.setBorder(BorderFactory.createEtchedBorder());
		pBottomRight.add(pR);

		pBottom.add(pBottomLeft);
		pBottom.add(pBottomRight);
		pBottom.setPreferredSize(new Dimension(50, 10));
		split1.setLeftComponent(pTop);
		split1.setRightComponent(pBottom);
		contentPane.add(split1, BorderLayout.CENTER);
		////////////////////////////////////////////////
		////////////////////////////////////////////////
<<<<<<< HEAD
<<<<<<< HEAD
		JPanel pSouth = new JPanel(new BorderLayout());						//bottom nhï¿½? pSouth
		pSouth.setPreferredSize(new Dimension(0, 40));

		//		listBD=new QLBangDia();
		//		Database db=new Database();
		//ArrayList<ArrayList<String>> data = new ArrayList<>();
		//		Database.getInstance().connect();
		//		listData = new Database().getAllFromSQL();


=======
		JPanel pSouth = new JPanel(new BorderLayout());						
		pSouth.setPreferredSize(new Dimension(0, 40));

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JPanel pSouth = new JPanel(new BorderLayout());						//bottom nhï¿½? pSouth
		pSouth.setPreferredSize(new Dimension(0, 40));

		//		listBD=new QLBangDia();
		//		Database db=new Database();
		//ArrayList<ArrayList<String>> data = new ArrayList<>();
		//		Database.getInstance().connect();
		//		listData = new Database().getAllFromSQL();


>>>>>>> parent of 8ab78b7 (fix all code sever)
		String []tenCot = {"Mã băng đĩa","Tên băng đĩa","Thể loại","Tình trạng","Số lượng","Số ngày mượn","Đơn giá","Hãng sản xuất","Ghi chú"};
		tableModelBD = new DefaultTableModel(tenCot, 0);
		tableBD = new JTable(tableModelBD);
		tableBD.setPreferredSize(new Dimension(680, 250));
		//tableBD.getColumnModel().getColumn(4).setCellEditor(null);
		tableBD.setRowHeight(15);
		//tableBD.setVisible(true);
		//pCenter.add(tableBD);
		DocDuLieuVaoTableBangDia();

		pSouth.add(new JScrollPane(tableBD),BorderLayout.CENTER);
		pSouth.setPreferredSize(new Dimension(100, 250));
		//pSouth.setPreferredSize(new Dimension(WIDTH, 250));
		contentPane.add(pSouth, BorderLayout.SOUTH);

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
		//listBD = db.getAllFromSQL();

		//try {
		//listBD = (QLBangDia)db.getAllFromSQL();
		//Database.con= (Connection) db.getAllFromSQL();
		//tableBD = db.getAllFromSQL();
		//}catch (Exception e) {
		// TODO: handle exception
		//JOptionPane.showMessageDialog(null, "KhĂ´ng hiá»‡n dá»¯ liá»‡u lĂªn báº£ng ");
		//}
		//((DefaultTableModel) tableBD.getModel()).setDataVector(data, tenCot);;
		//		tableModel = (DefaultTableModel) tableBD.getModel();

		//		try {
		//			dsBD = (QLBangDia) l.loadFile("data/BangDia.txt");
		//		}catch(Exception e) {
		//			JOptionPane.showMessageDialog(null, "KhĂ´ng tĂ¬m tháº¥y file");
		//		}

		//		LayDuLieuTuSQLChoModel();
		
<<<<<<< HEAD
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXoaTrang.addActionListener(this);
		btnCapNhat.addActionListener(this);
		btnLuu.addActionListener(this);
		btnTim.addActionListener(this);
		tableBD.addMouseListener(this);

	}

	private void xoaTrang() {
		// TODO Auto-generated method stub
		txtMa.setText("");
		txtTen.setText("");
		txtTheLoai.setText("");
		txtTinhTrang.setText("");
		txtSoLuong.setText("");
		txtSoNgayMuon.setText("");
		txtDonGia.setText("");
		txtHangSX.setText("");
		txtGhiChu.setText("");
		txtMa.requestFocus();
		txtMa.selectAll();
	}

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
	//	private void LayDuLieuTuSQLChoModel() {
	//		for(BangDia bd : listData) {
	//			tableModelBD.addRow(new Object[] {
	//					//i++,  // lĂ  sá»‘ thá»© tá»± cá»§a table
	//					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(),
	//					bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(),
	//					bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
	//			});
	//		}
	//	}

<<<<<<< HEAD
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		
		Object o = e.getSource();

		//		String ma = txtMa.getText();
		//		String ten = txtTen.getText();
		//		String theLoai = txtTheLoai.getText();
		//		String tinhTrang = txtTinhTrang.getText();
		//		String sl = txtSoLuong.getText();
		//		String snm = txtSoNgayMuon.getText();
		//		String dg = txtDonGia.getText();
		//		String hangSX = txtHangSX.getText();
		//		String ghiChu = txtGhiChu.getText();

		//		int soLuong = Integer.parseInt(sl);
		//		int soNgayMuon = Integer.parseInt(snm);
		//		double donGia = Double.parseDouble(dg);

//		int ma = Integer.parseInt(txtMa.getText());

=======
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		
		Object o = e.getSource();

<<<<<<< HEAD
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		//		String ma = txtMa.getText();
		//		String ten = txtTen.getText();
		//		String theLoai = txtTheLoai.getText();
		//		String tinhTrang = txtTinhTrang.getText();
		//		String sl = txtSoLuong.getText();
		//		String snm = txtSoNgayMuon.getText();
		//		String dg = txtDonGia.getText();
		//		String hangSX = txtHangSX.getText();
		//		String ghiChu = txtGhiChu.getText();

		//		int soLuong = Integer.parseInt(sl);
		//		int soNgayMuon = Integer.parseInt(snm);
		//		double donGia = Double.parseDouble(dg);

//		int ma = Integer.parseInt(txtMa.getText());

>>>>>>> parent of 8ab78b7 (fix all code sever)
		if(o.equals(btnThem)) {
			String ten = txtTen.getText();
			String theLoai = txtTheLoai.getText();
			String tinhTrang = txtTinhTrang.getText();
			int soLuong = Integer.parseInt(txtSoLuong.getText());
			int soNgayMuon = Integer.parseInt(txtSoNgayMuon.getText());
			double donGia = Double.parseDouble(txtDonGia.getText());
			String hangSX = txtHangSX.getText();
			String ghiChu = txtGhiChu.getText();
			BangDia bd=new BangDia(ten, theLoai, tinhTrang, soLuong, soNgayMuon, donGia, hangSX, ghiChu);
<<<<<<< HEAD
<<<<<<< HEAD
			
			
			bangDiaDao.add(bd);
			
			
=======

			bangDiaDao.add(bd);
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
			
<<<<<<< HEAD
			
			bangDiaDao.add(bd);
			
			
=======
			FrmMain.bangDiaDao.add(bd);
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
>>>>>>> parent of 8ab78b7 (fix all code sever)
			tableModelBD.addRow(new Object[] {bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(), bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(), bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()});
		}

		if(o.equals(btnXoa)) {
			int ma = Integer.parseInt(txtMa.getText());
<<<<<<< HEAD
			bangDiaDao.removeBangDia(ma);
			tableModelBD.setRowCount(0);
			try {
				DocDuLieuVaoTableBangDia();
			} catch (RemoteException e1) {
<<<<<<< HEAD
<<<<<<< HEAD
				// TODO Auto-generated catch block
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
				// TODO Auto-generated catch block
>>>>>>> parent of 8ab78b7 (fix all code sever)
				e1.printStackTrace();
			}
=======
			FrmMain.bangDiaDao.removeBangDia(ma);
			tableModelBD.setRowCount(0);
			DocDuLieuVaoTableBangDia();
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
		}
		if(o.equals(btnXoaTrang)) {
			xoaTrang();
		}
		if(o.equals(btnLuu)) {		
			tableModelBD.setRowCount(0);
<<<<<<< HEAD
			try {
				DocDuLieuVaoTableBangDia();
			} catch (RemoteException e1) {
<<<<<<< HEAD
<<<<<<< HEAD
				// TODO Auto-generated catch block
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
				// TODO Auto-generated catch block
>>>>>>> parent of 8ab78b7 (fix all code sever)
				e1.printStackTrace();
			}
=======
			tableModelBD.setRowCount(0);
			DocDuLieuVaoTableBangDia();
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
		}
		if(o.equals(btnTim)) {
			String pos = txtTim.getText();
			if(pos != null && pos.trim().length()>0) {
<<<<<<< HEAD
				List<BangDia> list = bangDiaDao.findBangDia(pos);
=======
				List<BangDia> list = FrmMain.bangDiaDao.findBangDia(pos);
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
				tableModelBD.setRowCount(0);
				for(BangDia d : list) {
					tableModelBD.addRow(new Object[] {d.getMaBD(), d.getTenBD(), d.getTheLoai(), d.getTinhTrang(), d.getSoLuong(), d.getSoNgayMuon(), d.getDonGia(), d.getHangSX(), d.getGhiChu()});
				}
<<<<<<< HEAD
<<<<<<< HEAD
				
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
				
>>>>>>> parent of 8ab78b7 (fix all code sever)
			} else {
				tableModelBD.setRowCount(0);
			}
		}
		if(o.equals(btnCapNhat)) {
			int maCapNhat = Integer.parseInt(txtMa.getText());
			String tenCapNhat = txtTen.getText();
			String theLoaiCapNhat = txtTheLoai.getText();
			String tinhTrangCapNhat = txtTinhTrang.getText();
			int soLuongCapNhat = Integer.parseInt(txtSoLuong.getText());
			int soNgayMuonCapNhat = Integer.parseInt(txtSoNgayMuon.getText());
			double donGiaCapNhat = Double.parseDouble(txtDonGia.getText());
			String hangSXCapNhat = txtHangSX.getText();
			String ghiChuCapNhat = txtGhiChu.getText();
			BangDia bdCapNhat = new BangDia(maCapNhat, tenCapNhat, theLoaiCapNhat, tinhTrangCapNhat, soLuongCapNhat, soNgayMuonCapNhat, donGiaCapNhat, hangSXCapNhat, ghiChuCapNhat);
<<<<<<< HEAD
<<<<<<< HEAD
			
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
			
<<<<<<< HEAD
>>>>>>> parent of 8ab78b7 (fix all code sever)
			bangDiaDao.updateBangDia(bdCapNhat);
			tableModelBD.setRowCount(0);
			try {
				DocDuLieuVaoTableBangDia();
			} catch (RemoteException e1) {
<<<<<<< HEAD
<<<<<<< HEAD
				// TODO Auto-generated catch block
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
				// TODO Auto-generated catch block
>>>>>>> parent of 8ab78b7 (fix all code sever)
				e1.printStackTrace();
			}
=======
			FrmMain.bangDiaDao.updateBangDia(bdCapNhat);
			tableModelBD.setRowCount(0);
			DocDuLieuVaoTableBangDia();
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
		}
	}

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
	private BangDia revertFromTextField() {
		int MaBD = Integer.parseInt(txtMa.getText());
		String TenBD = txtTen.getText().trim();
		String TheLoai	= txtTheLoai.getText().trim();
		String tinhTrang = txtTinhTrang.getText().trim();
		int Soluong = Integer.parseInt(txtSoLuong.getText());
		int SoNM = Integer.parseInt(txtSoNgayMuon.getText());
		double DonGia = Double.parseDouble(txtDonGia.getText());
		String hangSX = txtHangSX.getText().trim();
		String GhiChu = txtGhiChu.getText().trim();
		return new BangDia(MaBD, TenBD, TheLoai, tinhTrang, Soluong, SoNM, DonGia, hangSX, GhiChu);
	}
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
	//		ArrayList<BangDia> list = new ArrayList<>();
	//		try {
	//			list = Database.getAllFromSQL();
	//		} catch (SQLException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//		XoaHetDuLieuTableModel(tableModelBD);
	//		for(BangDia bd : list) {
	//			tableModelBD.addRow(new Object[] {
	//					//i++,  // lĂ  sá»‘ thá»© tá»± cá»§a table
	//					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(),
	//					bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(),
	//					bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
	//			});
	//		}
	//	}
<<<<<<< HEAD
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int row = tableBD.getSelectedRow();
		txtMa.setText(tableModelBD.getValueAt(row, 0).toString());
		txtTen.setText(tableModelBD.getValueAt(row, 1).toString());
		txtTheLoai.setText(tableModelBD.getValueAt(row, 2).toString());
		txtTinhTrang.setText(tableModelBD.getValueAt(row, 3).toString());
		txtSoLuong.setText(tableModelBD.getValueAt(row, 4).toString());
		txtSoNgayMuon.setText(tableModelBD.getValueAt(row, 5).toString());
		txtDonGia.setText(tableModelBD.getValueAt(row, 6).toString());
		txtHangSX.setText(tableModelBD.getValueAt(row, 7).toString());
		txtGhiChu.setText(tableModelBD.getValueAt(row, 8).toString());
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

	public void DocDuLieuVaoTableBangDia() throws RemoteException {
<<<<<<< HEAD
<<<<<<< HEAD
//		BangDiaDao bangDiaDao = new BangDiaDao(FrmMain.factory);
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
//		BangDiaDao bangDiaDao = new BangDiaDao(FrmMain.factory);
>>>>>>> parent of 8ab78b7 (fix all code sever)
		List<BangDia> list = bangDiaDao.getAllBangDia();

		for(BangDia bd : list) {
			tableModelBD.addRow(new Object[] {
					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(), bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(), bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
			});
		}
	}

}
