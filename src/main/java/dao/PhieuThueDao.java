package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.KhachHang;
import entity.NhanVien;
import entity.PhieuThue;
import service.PhieuThueServices;

public class PhieuThueDao extends AbstractDao implements PhieuThueServices {

	public PhieuThueDao(EntityManagerFactory emf) {
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

}
