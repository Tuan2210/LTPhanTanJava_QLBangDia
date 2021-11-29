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

import dao.ThongKeDao;
import entity.BangDia;

public class FrmThongKeDiaYeuThich extends JFrame {
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
	private DefaultTableModel tableModel;
	private JTable table;
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
					FrmThongKeDiaYeuThich frame = new FrmThongKeDiaYeuThich();
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
	public FrmThongKeDiaYeuThich() throws RemoteException{
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
		JLabel lblTitle = new JLabel("DANH SÁCH BĂNG ĐĨA ĐƯỢC YÊU THÍCH ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblTitle.setBounds(250, 30, 500, 30);
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
		String tenCot[] = {"Mã băng đĩa","Tên băng đĩa","Thể loại","Tình trạng","Số lượng","Số ngày mượn","Đơn giá","Hãng sản xuất","Ghi chú"};
		tableModel = new DefaultTableModel(tenCot, 0);
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		DocDuLieuVaoTableDiaYeuThich();
	}

	private void DocDuLieuVaoTableDiaYeuThich() {
		List<BangDia> l = new ArrayList<>();
<<<<<<< HEAD
<<<<<<< HEAD
		
		l = thongKeDao.getBangDiaYeuThich();
		
=======

		l = thongKeDao.getBangDiaYeuThich();

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
		l = thongKeDao.getBangDiaYeuThich();
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		for(BangDia bd : l) {
			tableModel.addRow(new Object[] {
					bd.getMaBD(), bd.getTenBD(), bd.getTheLoai(), bd.getTinhTrang(), bd.getSoLuong(), bd.getSoNgayMuon(), bd.getDonGia(), bd.getHangSX(), bd.getGhiChu()
			});
		}
	}

}
