package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;

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
		return null;
	}

	@Override
	public void removePhieuThue(int id) {
	}

	@Override
	public void updatePhieuThue(PhieuThue pt) {
	}

	@Override
	public List<PhieuThue> findPhieuThue(int id) {
		return null;
	}

}
