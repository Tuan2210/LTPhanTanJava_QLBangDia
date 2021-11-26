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
<<<<<<< HEAD
		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;
=======
		String statement = "SELECT * FROM BangDia WHERE tenBD = " +  "'" + ten + "'"  ;
>>>>>>> 82af7f23d77324cfbff68462e799a0589b5f1231
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> b = query.getResultList();
		em.getTransaction().commit();
		
		return b;
	}
<<<<<<< HEAD
}
=======
<<<<<<< HEAD
}
=======
}
>>>>>>> a0b97d703cb4e06aef4a38001f28fa3283ab80d2
>>>>>>> 82af7f23d77324cfbff68462e799a0589b5f1231
