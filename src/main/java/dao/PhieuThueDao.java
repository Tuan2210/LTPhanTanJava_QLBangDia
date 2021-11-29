package dao;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.NhanVien;
import entity.PhieuThue;
import service.PhieuThueServices;

public class PhieuThueDao extends AbstractDao implements PhieuThueServices, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7751360999565582856L;

	public PhieuThueDao(EntityManagerFactory emf) throws RemoteException{
		super(emf);
	}

	@Override
	public void add(PhieuThue pt) {
		try {
			em.getTransaction().begin();
			em.persist(pt);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<PhieuThue> getAllPhieuThue() {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue";
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> list = query.getResultList();
		em.getTransaction().commit();
		return list;
	}

	@Override
	public void removePhieuThue(int id) {
	}

	@Override
	public void updatePhieuThue(PhieuThue pt) {
		try {
			em.getTransaction().begin();
			em.merge(pt);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<PhieuThue> findPhieuThue(int id) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue WHERE soPhieu = " + "'" + id + "'";
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override
	public List<String> getTenBangDia() {
		em.getTransaction().begin();
		String statement = "SELECT BangDia.tenBD FROM PhieuThue \r\n"
				+ "JOIN ChiTietPhieuThue ON PhieuThue.soPhieu = ChiTietPhieuThue.soPhieu\r\n"
				+ "JOIN BangDia ON ChiTietPhieuThue.maBD = BangDia.maBD";
		Query query = em.createNativeQuery(statement);
		List<String> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<PhieuThue> getPhieuThueByCMND(String cmnd) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<String> getTenBangDiaByCMND(String cmnd) {
		em.getTransaction().begin();
		String statement = "SELECT BangDia.tenBD FROM PhieuThue \r\n"
				+ "JOIN ChiTietPhieuThue ON PhieuThue.soPhieu = ChiTietPhieuThue.soPhieu\r\n"
				+ "JOIN BangDia ON ChiTietPhieuThue.maBD = BangDia.maBD WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement);
		List<String> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}

}
