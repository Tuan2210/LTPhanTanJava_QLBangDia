package service;

import java.util.List;

import entity.KhachHang;

public interface KhachHangServices {
	public void add(KhachHang h);
	public List<KhachHang> getAllKhachHang();
	public void removeKhachHang(int cmnd);
	public void updateKhachHang(KhachHang k);
	public List<KhachHang> findKhachHang(int cmnd);
<<<<<<< HEAD
	public KhachHang getKhachHangByID(int cmnd);
=======
>>>>>>> 82af7f23d77324cfbff68462e799a0589b5f1231
}
