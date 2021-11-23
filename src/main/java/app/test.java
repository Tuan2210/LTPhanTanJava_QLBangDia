package app;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.BangDiaDao;
import dao.NhanVienDao;
import entity.BangDia;
import entity.NhanVien;
import service.BangDiaServices;

public class test {
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("QLBangDia");

	public static void main(String[] args) {
		BangDiaServices dao = new BangDiaDao(factory);
		BangDia b = new BangDia("T1", "TL1", "TT1", 1, 1,
				2000000, "H1", "G1");
		NhanVienDao n = new NhanVienDao(factory);
		NhanVien nhanVien = new NhanVien("T1", "DT1", "MT1");
		
//		dao.add(b);
//		
//		n.add(nhanVien);
		
		List<NhanVien> list = n.getAllNhanVien();;
		
		for(NhanVien nh : list) {
			System.out.println(nh.getMaNV() + nh.getTenNV() + nh.getDienThoai() + nh.getMoTa());
		}
		
		List<BangDia> l = dao.findBangDia("T6");
		
		for(BangDia d : l) {
			System.out.println(d.getMaBD() + d.getTenBD());
		}
		
//		dao.add(b);
//		
//		List<BangDia> list = dao.query();
//		
//		for(BangDia d : list) {
//			System.out.println(d.toString());
//		}
//		
//		for(BangDia d : list) {
//			System.out.println(d.toString());
//		}
		
	}

}
