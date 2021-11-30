package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.KhachHang;

public interface KhachHangServices extends Remote{
	public void add(KhachHang h) throws RemoteException;
	public List<KhachHang> getAllKhachHang() throws RemoteException;
	public void removeKhachHang(String cmnd) throws RemoteException;
	public void updateKhachHang(KhachHang k) throws RemoteException;
	public List<KhachHang> findKhachHang(String cmnd) throws RemoteException;
	public KhachHang getKhachHangByID(String cmnd) throws RemoteException;
	public List<String> getCMNDByPhieuThueID() throws RemoteException;
	public List<Integer> getMaNVByPhieuThueID() throws RemoteException;
	public void removePhieuThueByID(int soPhieu) throws RemoteException;
}
