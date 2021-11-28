package service;

import java.util.List;

import entity.KhachHang;

public interface KhachHangServices {
	public void add(KhachHang h);
	public List<KhachHang> getAllKhachHang();
	public void removeKhachHang(String cmnd);
	public void updateKhachHang(KhachHang k);
	public List<KhachHang> findKhachHang(String cmnd);
	public KhachHang getKhachHangByID(String cmnd);
}
