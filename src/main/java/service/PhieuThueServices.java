package service;

<<<<<<< HEAD
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.PhieuThue;

public interface PhieuThueServices extends Remote{
	public void add(PhieuThue pt) throws RemoteException;
	public List<PhieuThue> getAllPhieuThue() throws RemoteException;
	public void removePhieuThue(int id) throws RemoteException;
	public void updatePhieuThue(PhieuThue pt) throws RemoteException;
	public List<PhieuThue> findPhieuThue(int id) throws RemoteException;
	public List<String> getTenBangDia() throws RemoteException;
	public List<PhieuThue> getPhieuThueByCMND(String cmnd) throws RemoteException;
	public List<String> getTenBangDiaByCMND(String cmnd) throws RemoteException;
=======
import java.util.List;

import entity.PhieuThue;

public interface PhieuThueServices {
	public void add(PhieuThue pt);
	public List<PhieuThue> getAllPhieuThue();
	public void removePhieuThue(int id);
	public void updatePhieuThue(PhieuThue pt);
	public List<PhieuThue> findPhieuThue(int id);
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
}
