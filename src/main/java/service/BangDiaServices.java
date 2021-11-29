package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.BangDia;

public interface BangDiaServices extends Remote{
	public void add(BangDia b) throws RemoteException;
	public List<BangDia> getAllBangDia() throws RemoteException;
	public void removeBangDia(int id) throws RemoteException;
	public void updateBangDia(BangDia b) throws RemoteException;
	public List<BangDia> findBangDia(String ten) throws RemoteException;
	public BangDia getBangDiaByTen(String ten) throws RemoteException;
}
