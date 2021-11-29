package app;

<<<<<<< HEAD
<<<<<<< HEAD
import java.awt.BorderLayout;
import java.awt.EventQueue;

=======
import java.awt.EventQueue;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
import java.awt.BorderLayout;
import java.awt.EventQueue;

>>>>>>> parent of 8ab78b7 (fix all code sever)
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
<<<<<<< HEAD
import dao.NhanVienDao;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
import dao.NhanVienDao;
>>>>>>> parent of 8ab78b7 (fix all code sever)
import dao.ThongKeDao;
import entity.BangDia;

import javax.swing.JLabel;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class FrmThongKeDiaHong extends JFrame {
<<<<<<< HEAD
<<<<<<< HEAD

=======
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======

>>>>>>> parent of 8ab78b7 (fix all code sever)
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tableModel;
	ThongKeDao thongKeDao = new ThongKeDao(FrmMain.factory);

<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * Launch the application.
	 */
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
	/**
	 * Launch the application.
	 */
>>>>>>> parent of 8ab78b7 (fix all code sever)
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmThongKeDiaHong frame = new FrmThongKeDiaHong();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

<<<<<<< HEAD
<<<<<<< HEAD
	/**
	 * Create the frame.
	 */
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
	/**
	 * Create the frame.
	 */
>>>>>>> parent of 8ab78b7 (fix all code sever)
	public FrmThongKeDiaHong() throws RemoteException{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 30, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		JLabel lblTitle = new JLabel("DANH SÁCH BĂNG ĐĨA HỎNG ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblTitle.setBounds(350, 30, 350, 30);
		contentPane.add(lblTitle);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(100, 100, 800, 600);
		contentPane.add(scrollPane);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		String tenCot[] = {"Tên băng đĩa", "Số ngày mượn", "Số lượng", "Đơn giá", "Tình trạng"};
		tableModel = new DefaultTableModel(tenCot, 0);
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		DocDuLieuVaoTableBangDiaHong();
	}

	private void DocDuLieuVaoTableBangDiaHong() {
		List<BangDia> listBDHong = new ArrayList<>();
<<<<<<< HEAD
<<<<<<< HEAD
		
		listBDHong = thongKeDao.getBangDiaHong();
		
		for(BangDia b : listBDHong) {
			tableModel.addRow(new Object[] {
				b.getTenBD(), b.getSoNgayMuon(), b.getSoLuong(), b.getDonGia(), b.getTinhTrang()
=======

=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		listBDHong = thongKeDao.getBangDiaHong();
		
		for(BangDia b : listBDHong) {
			tableModel.addRow(new Object[] {
<<<<<<< HEAD
					b.getTenBD(), b.getSoNgayMuon(), b.getSoLuong(), b.getDonGia(), b.getTinhTrang()
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
				b.getTenBD(), b.getSoNgayMuon(), b.getSoLuong(), b.getDonGia(), b.getTinhTrang()
>>>>>>> parent of 8ab78b7 (fix all code sever)
			});
		}
	}
}
