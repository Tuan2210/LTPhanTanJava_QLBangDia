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
<<<<<<< HEAD
<<<<<<< HEAD
	public List<String> getCMNDByPhieuThueID() throws RemoteException;
	public List<Integer> getMaNVByPhieuThueID() throws RemoteException;
	public void removePhieuThueByID(int soPhieu) throws RemoteException;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
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
>>>>>>> parent of 8ab78b7 (fix all code sever)
}
