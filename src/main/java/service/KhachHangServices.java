package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
import java.util.List;

import entity.KhachHang;

public interface KhachHangServices extends Remote{
	public void add(KhachHang h) throws RemoteException;
	public List<KhachHang> getAllKhachHang() throws RemoteException;
	public void removeKhachHang(String cmnd) throws RemoteException;
	public void updateKhachHang(KhachHang k) throws RemoteException;
	public List<KhachHang> findKhachHang(String cmnd) throws RemoteException;
	public KhachHang getKhachHangByID(String cmnd) throws RemoteException;
}
