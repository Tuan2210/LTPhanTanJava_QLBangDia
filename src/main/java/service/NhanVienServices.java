package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.NhanVien;

<<<<<<< HEAD
public interface NhanVienServices extends Remote{
	public void add(NhanVien n) throws RemoteException;
	public List<NhanVien> getAllNhanVien() throws RemoteException;
	public void removeNhanVien(int id) throws RemoteException;
//	public void updateNhanVien(NhanVien n);
	public void updateNhanVien(int id, String ten, String moTa, String dienThoai) throws RemoteException;
	public List<NhanVien> findNhanVien(int id) throws RemoteException;
	public NhanVien getNhanVienByID(int id) throws RemoteException;
=======
public interface NhanVienServices {
	public void add(NhanVien n);
	public List<NhanVien> getAllNhanVien();
	public void removeNhanVien(int id);
//	public void updateNhanVien(NhanVien n);
	public void updateNhanVien(int id, String ten, String moTa, String dienThoai);
	public List<NhanVien> findNhanVien(int id);
	public NhanVien getNhanVienByID(int id);
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
}
