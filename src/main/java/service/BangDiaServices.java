package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.BangDia;

<<<<<<< HEAD
public interface BangDiaServices extends Remote{
	public void add(BangDia b) throws RemoteException;
	public List<BangDia> getAllBangDia() throws RemoteException;
	public void removeBangDia(int id) throws RemoteException;
	public void updateBangDia(BangDia b) throws RemoteException;
	public List<BangDia> findBangDia(String ten) throws RemoteException;
	public BangDia getBangDiaByTen(String ten) throws RemoteException;
=======
public interface BangDiaServices {
	public void add(BangDia b);
	public List<BangDia> getAllBangDia();
	public void removeBangDia(int id);
	public void updateBangDia(BangDia b);
	public List<BangDia> findBangDia(String ten);
	public BangDia getBangDiaByTen(String ten);
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
}
