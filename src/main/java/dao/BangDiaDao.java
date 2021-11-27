package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.BangDia;
import service.BangDiaServices;

public class BangDiaDao extends AbstractDao implements BangDiaServices {
	
	public BangDiaDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public void add(BangDia b) {
		try {
			em.getTransaction().begin();
			em.persist(b);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<BangDia> getAllBangDia() {
		
		em.getTransaction().begin();
		String statement = "SELECT * FROM BangDia";
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> list = query.getResultList();
		em.getTransaction().commit();
		
		return list;
	}
	
	@Override 
	public void removeBangDia(int id) {
		try {
			em.getTransaction().begin();
			BangDia reference = em.getReference(BangDia.class, id);
			em.remove(reference);
			em.getTransaction().commit(); 
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
	
	@Override
	public void updateBangDia(BangDia b) {
		try {
			em.getTransaction().begin();
			em.merge(b);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
	
	@Override
	public List<BangDia> findBangDia(String ten) {
		em.getTransaction().begin();

		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;

//		String statement = "SELECT * FROM BangDia WHERE tenBD = " +  "'" + ten + "'"  ;

		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> b = query.getResultList();
		em.getTransaction().commit();
		
		return b;
	}


}

