package app;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel tableModel;
	ThongKeDao thongKeDao = new ThongKeDao(FrmMain.factory);

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

	public FrmThongKeDiaHong() throws RemoteException{
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 30, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("DANH SÁCH BĂNG ĐĨA HỎNG ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblTitle.setBounds(350, 30, 350, 30);
		contentPane.add(lblTitle);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(100, 100, 800, 600);
		contentPane.add(scrollPane);

		String tenCot[] = {"Tên băng đĩa", "Số ngày mượn", "Số lượng", "Đơn giá", "Tình trạng"};
		tableModel = new DefaultTableModel(tenCot, 0);
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);

		DocDuLieuVaoTableBangDiaHong();
	}

	private void DocDuLieuVaoTableBangDiaHong() {
		List<BangDia> listBDHong = new ArrayList<>();

		listBDHong = thongKeDao.getBangDiaHong();

		for(BangDia b : listBDHong) {
			tableModel.addRow(new Object[] {
					b.getTenBD(), b.getSoNgayMuon(), b.getSoLuong(), b.getDonGia(), b.getTinhTrang()
			});
		}
	}
}
