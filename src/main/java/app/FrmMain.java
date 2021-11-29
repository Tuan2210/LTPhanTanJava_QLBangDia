package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
<<<<<<< HEAD
<<<<<<< HEAD
import java.rmi.server.UnicastRemoteObject;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
import java.rmi.server.UnicastRemoteObject;
>>>>>>> parent of 8ab78b7 (fix all code sever)
import java.sql.SQLException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dao.BangDiaDao;
import dao.KhachHangDao;
import dao.NhanVienDao;
import dao.PhieuThueDao;
import dao.ThongKeDao;
import service.BangDiaServices;
import service.KhachHangServices;
import service.NhanVienServices;
import service.PhieuThueServices;
import service.ThongKeServices;

public class FrmMain extends JFrame implements ActionListener, Remote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
<<<<<<< HEAD
		JLabel lblTitle ;
		JButton btnQLNV, btnQLKH, btnQLPDK, btnQLBD,btnThoat,btnBaoCao, btnYeuThich, btnHetHan;
		
	public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLBangDia");
//	public static BangDiaServices bangDiaDao = new BangDiaDao(factory); 
//	public static NhanVienServices nhanVienDao = new NhanVienDao(factory);
//	public static KhachHangServices khachHangDao = new KhachHangDao(factory);
//	public static PhieuThueServices phieuThueDao = new PhieuThueDao(factory);
//	public static ThongKeServices thongKeDao = new ThongKeDao(factory);
		
=======
	JLabel lblTitle ;
	JButton btnQLNV, btnQLKH, btnQLPDK, btnQLBD,btnThoat,btnBaoCao, btnYeuThich, btnHetHan;

	public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLBangDia");
	//	public static BangDiaServices bangDiaDao = new BangDiaDao(factory); 
	//	public static NhanVienServices nhanVienDao = new NhanVienDao(factory);
	//	public static KhachHangServices khachHangDao = new KhachHangDao(factory);
	//	public static PhieuThueServices phieuThueDao = new PhieuThueDao(factory);
	//	public static ThongKeServices thongKeDao = new ThongKeDao(factory);

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		JLabel lblTitle ;
		JButton btnQLNV, btnQLKH, btnQLPDK, btnQLBD,btnThoat,btnBaoCao, btnYeuThich, btnHetHan;
		
	public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLBangDia");
//	public static BangDiaServices bangDiaDao = new BangDiaDao(factory); 
//	public static NhanVienServices nhanVienDao = new NhanVienDao(factory);
//	public static KhachHangServices khachHangDao = new KhachHangDao(factory);
//	public static PhieuThueServices phieuThueDao = new PhieuThueDao(factory);
//	public static ThongKeServices thongKeDao = new ThongKeDao(factory);
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
	public FrmMain() {
		// TODO Auto-generated constructor stub
		setTitle("CHƯƠNG TRÌNH QUẢN LÝ BĂNG ĐĨA");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	factory.close();
		    }
		});
		
		buildUI();
		
	}
	private void buildUI() {
		JPanel pNorth = new JPanel();
		JLabel lblTitle;
		pNorth.add(lblTitle = new JLabel("HỆ THỐNG BĂNG ĐĨA BUSAN"));
		pNorth.setBorder(BorderFactory.createTitledBorder(" "));
		//set Font-text
		Font fpNorth = new Font("Time New Roman" , Font.BOLD , 30);
		lblTitle.setFont(fpNorth);
		pNorth.setBackground(Color.CYAN);
		add(pNorth, BorderLayout.NORTH);
		
		JPanel pCen = new JPanel(); 
		pCen.setBackground(Color.WHITE);
		pCen.setBorder(BorderFactory.createTitledBorder(" "));
		Box b , b1,b2, b3,b4 ,b5, b6, b7, b8;
		b = Box.createVerticalBox();
		
		b.add(Box.createVerticalStrut(10));
		b.add(b1 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b2 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b3 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b4 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b5 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b6 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b7 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		b.add(b8 = Box.createHorizontalBox());
		b.add(Box.createVerticalStrut(10));
		pCen.add(b);
		add(pCen, BorderLayout.CENTER);
		
		b1.add(btnQLNV = new JButton("Quản lý nhân viên"));
		b1.add(Box.createVerticalStrut(25));
		
		b2.add(btnQLKH = new JButton("Quản lý khách hàng"));
		b2.add(Box.createVerticalStrut(25));
	
		b3.add(btnQLBD = new JButton("Quản lý băng đĩa"));
		b3.add(Box.createVerticalStrut(25));
		
		b4.add(btnQLPDK = new JButton("Quản lý phiếu đăng ký thuê"));
		b4.add(Box.createVerticalStrut(25));
		btnQLPDK.setSize(150, 20);
		b5.add(btnBaoCao = new JButton("Thống kê Tổng hợp Băng Đĩa hỏng"));
		b5.add(Box.createVerticalStrut(25));
<<<<<<< HEAD
<<<<<<< HEAD
		
		b6.add(btnYeuThich = new JButton("Tổng hợp Băng Đĩa được yêu thích"));
		b6.add(Box.createVerticalStrut(25));
		
		b7.add(btnHetHan = new JButton("Thống kê Phiếu Thuê hết hạn"));
		b7.add(Box.createVerticalStrut(25));
		
		b8.add(btnThoat = new JButton("Thoát chương trình"));
		b8.add(Box.createVerticalStrut(25));
		
=======

=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		b6.add(btnYeuThich = new JButton("Tổng hợp Băng Đĩa được yêu thích"));
		b6.add(Box.createVerticalStrut(25));
		
		b7.add(btnHetHan = new JButton("Thống kê Phiếu Thuê hết hạn"));
		b7.add(Box.createVerticalStrut(25));
		
		b8.add(btnThoat = new JButton("Thoát chương trình"));
		b8.add(Box.createVerticalStrut(25));
<<<<<<< HEAD

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		btnQLBD.setPreferredSize(btnBaoCao.getPreferredSize());
		btnQLKH.setPreferredSize(btnBaoCao.getPreferredSize());
		btnQLNV.setPreferredSize(btnBaoCao.getPreferredSize());
		btnThoat.setPreferredSize(btnBaoCao.getPreferredSize());
		btnQLPDK.setPreferredSize(btnBaoCao.getPreferredSize());
		btnHetHan.setPreferredSize(btnBaoCao.getPreferredSize());
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		btnQLBD.addActionListener(this);
		btnQLKH.addActionListener(this);
		btnQLNV.addActionListener(this);
		btnQLPDK.addActionListener(this);
		btnThoat.addActionListener(this);
		btnBaoCao.addActionListener(this);
		btnYeuThich.addActionListener(this);
		btnHetHan.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o.equals(btnQLNV)) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
					try {
						new FrmNhanVien().setVisible(true);
					} catch (SQLException | RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					};
			
<<<<<<< HEAD
=======
			try {
				new FrmNhanVien().setVisible(true);
			} catch (SQLException | RemoteException e1) {
				e1.printStackTrace();
			};

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
		}
		if (o.equals(btnQLPDK)) {
			try {
				new FrmPhieuThue().setVisible(true);
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
		}
		if (o.equals(btnQLBD)) {
			try {
				new FrmBangDia().setVisible(true);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (o.equals(btnQLKH)) {
			try {
				new FrmKhachHang().setVisible(true);
			} catch (SQLException | RemoteException e1) {
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
		}
		if (o.equals(btnBaoCao)) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
		
				try {
					new FrmThongKeDiaHong().setVisible(true);
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
<<<<<<< HEAD
=======

			try {
				new FrmThongKeDiaHong().setVisible(true);
			} catch (RemoteException e1) {
				e1.printStackTrace();
			}

=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
		}
		if(o.equals(btnYeuThich)) {
			try {
				new FrmThongKeDiaYeuThich().setVisible(true);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(o.equals(btnHetHan)) {
			try {
				new FrmThongKeHetHan().setVisible(true);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
		}
		if(o.equals(btnYeuThich)) {
			try {
				new FrmThongKeDiaYeuThich().setVisible(true);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(o.equals(btnHetHan)) {
			try {
				new FrmThongKeHetHan().setVisible(true);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (o.equals(btnThoat)) {
			int out = JOptionPane.showConfirmDialog(null,"Muốn thoát?","WARNING",JOptionPane.YES_NO_OPTION);
			if (out == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		try {
			BangDiaServices bdDao = new BangDiaDao(factory);
			KhachHangServices khDao = new KhachHangDao(factory);
			NhanVienServices nvDao = new NhanVienDao(factory);
			PhieuThueServices ptDao = new PhieuThueDao(factory);
			ThongKeServices tkDao = new ThongKeDao(factory);
			LocateRegistry.createRegistry(6543);
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
            Registry reg = LocateRegistry.getRegistry(6543);
            reg.bind("rmi://localhost:6543/CalServiceTest", bdDao);
            reg.bind("rmi://localhost:6543/CalServiceTest1", khDao);
            reg.bind("rmi://localhost:6543/CalServiceTest2", nvDao);
            reg.bind("rmi://localhost:6543/CalServiceTest3", ptDao);
            reg.bind("rmi://localhost:6543/CalServiceTest4", tkDao);
            
<<<<<<< HEAD
            System.out.println("Server ready");
            
            new FrmMain().setVisible(true);
=======
			Registry reg = LocateRegistry.getRegistry(6543);
			reg.bind("rmi://localhost:6543/CalServiceTest", bdDao);
			reg.bind("rmi://localhost:6543/CalServiceTest1", khDao);
			reg.bind("rmi://localhost:6543/CalServiceTest2", nvDao);
			reg.bind("rmi://localhost:6543/CalServiceTest3", ptDao);
			reg.bind("rmi://localhost:6543/CalServiceTest4", tkDao);

			System.out.println("Server ready");

			new FrmMain().setVisible(true);
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
            

            System.out.println("Server ready");
            
            new FrmMain().setVisible(true);
>>>>>>> parent of 8ab78b7 (fix all code sever)
		} catch (RemoteException | AlreadyBoundException e) {
			e.printStackTrace();
		}	
	}
}
