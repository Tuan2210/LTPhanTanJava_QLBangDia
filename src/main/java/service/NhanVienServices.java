package service;

import java.util.List;

import entity.NhanVien;

public interface NhanVienServices {
	public void add(NhanVien n);
	public List<NhanVien> getAllNhanVien();
}
