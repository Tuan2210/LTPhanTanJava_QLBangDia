package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
import java.util.ArrayList;
>>>>>>> parent of 8ab78b7 (fix all code sever)
import java.util.List;

import entity.KhachHang;

<<<<<<< HEAD
public interface KhachHangServices extends Remote{
	public void add(KhachHang h) throws RemoteException;
	public List<KhachHang> getAllKhachHang() throws RemoteException;
	public void removeKhachHang(String cmnd) throws RemoteException;
	public void updateKhachHang(KhachHang k) throws RemoteException;
	public List<KhachHang> findKhachHang(String cmnd) throws RemoteException;
	public KhachHang getKhachHangByID(String cmnd) throws RemoteException;
=======
public interface KhachHangServices {
	public void add(KhachHang h);
	public List<KhachHang> getAllKhachHang();
	public void removeKhachHang(String cmnd);
	public void updateKhachHang(KhachHang k);
	public List<KhachHang> findKhachHang(String cmnd);
	public KhachHang getKhachHangByID(String cmnd);
//	public boolean updateMkSdt(String cmnd, String sdt);
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
}
