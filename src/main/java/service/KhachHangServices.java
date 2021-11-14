package service;

import java.util.List;

import entity.KhachHang;

public interface KhachHangServices {
	public void add(KhachHang h);
	public List<KhachHang> getAllKhachHang();
}
