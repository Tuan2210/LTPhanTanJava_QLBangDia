package app;

<<<<<<< HEAD
<<<<<<< HEAD
import java.awt.BorderLayout;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
import java.awt.BorderLayout;
>>>>>>> parent of 8ab78b7 (fix all code sever)
import java.awt.EventQueue;
import java.awt.Font;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.PhieuThueDao;
import dao.ThongKeDao;
<<<<<<< HEAD
<<<<<<< HEAD
import entity.BangDia;
import entity.PhieuThue;

public class FrmThongKeHetHan extends JFrame {

=======
import entity.PhieuThue;

public class FrmThongKeHetHan extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
import entity.BangDia;
import entity.PhieuThue;

public class FrmThongKeHetHan extends JFrame {

>>>>>>> parent of 8ab78b7 (fix all code sever)
	private JPanel contentPane;
	private DefaultTableModel tableModel;
	private JTable table;
	ThongKeDao thongKeDao = new ThongKeDao(FrmMain.factory);
	PhieuThueDao phieuThueDao = new PhieuThueDao(FrmMain.factory);

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
					FrmThongKeHetHan frame = new FrmThongKeHetHan();
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
	public FrmThongKeHetHan() throws RemoteException{
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
		JLabel lblTitle = new JLabel("DANH SÁCH PHIẾU THUÊ HẾT HẠN HAY CHƯA ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblTitle.setBounds(230, 30, 550, 30);
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
		String tenCot[] = {"Số phiếu", "Số CMND", "Ngày thuê", "Số ngày mượn", "Số lượng", "Đơn giá", "Hạn"};
		tableModel = new DefaultTableModel(tenCot, 0);
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
<<<<<<< HEAD
<<<<<<< HEAD
		
		DocDuLieuVaoTableHetHan();
		
	}
	
	private void DocDuLieuVaoTableHetHan() {
		List<PhieuThue> l = new ArrayList<>();
		List<String> lHetHan = new ArrayList<>();
		List<String> lCMND = new ArrayList<>();
		
		l = phieuThueDao.getAllPhieuThue();
		lHetHan = thongKeDao.getDate();
		lCMND = phieuThueDao.getCMNDByPhieuThueID();
		
		for(int i = 0; i < l.size(); i++) {
			tableModel.addRow(new Object[] {
					l.get(i).getSoPhieu(), lCMND.get(i).toString(), l.get(i).getNgayThue(), l.get(i).getSoNgayMuon(), l.get(i).getSoluong(), l.get(i).getDonGia(), lHetHan.get(i)
=======

=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		DocDuLieuVaoTableHetHan();
		
	}
	
	private void DocDuLieuVaoTableHetHan() {
		List<PhieuThue> l = new ArrayList<>();
		List<String> lHetHan = new ArrayList<>();
		
		l = phieuThueDao.getAllPhieuThue();
		lHetHan = thongKeDao.getDate();
		
		for(int i = 0; i < l.size(); i++) {
			tableModel.addRow(new Object[] {
					l.get(i).getSoPhieu(), l.get(i).getCMND().toString(), l.get(i).getNgayThue(), l.get(i).getSoNgayMuon(), l.get(i).getSoluong(), l.get(i).getDonGia(), lHetHan.get(i)
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
			});
		}
	}

}
