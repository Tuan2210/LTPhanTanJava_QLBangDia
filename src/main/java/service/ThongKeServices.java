package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.BangDia;

public interface ThongKeServices extends Remote{
	public List<BangDia> getBangDiaHong() throws RemoteException;
	public List<BangDia> getBangDiaYeuThich() throws RemoteException;
	public List<String> getDate() throws RemoteException;
	public List<String> getDateByCMND(String cmnd) throws RemoteException;
}
