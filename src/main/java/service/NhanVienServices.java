package service;

import java.util.List;

import entity.NhanVien;

public interface NhanVienServices {
	public void add(NhanVien n);
	public List<NhanVien> getAllNhanVien();
	public void removeNhanVien(int id);
//	public void updateNhanVien(NhanVien n);
	public void updateNhanVien(int id, String ten, String moTa, String dienThoai);
	public List<NhanVien> findNhanVien(int id);
	public NhanVien getNhanVienByID(int id);
}
