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
}
