package dao;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.BangDia;
import service.BangDiaServices;

public class BangDiaDao extends AbstractDao implements BangDiaServices, Serializable {
<<<<<<< HEAD
	
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	/**
	 * 
	 */
	private static final long serialVersionUID = -4839613320916279087L;

	public BangDiaDao(EntityManagerFactory emf) throws RemoteException{
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

	@SuppressWarnings("unchecked")
	@Override
	public List<BangDia> getAllBangDia() {

		em.getTransaction().begin();
		String statement = "SELECT * FROM BangDia";
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> list = query.getResultList();
		em.getTransaction().commit();

		return list;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
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
<<<<<<< HEAD
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
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
<<<<<<< HEAD
	
=======

	@SuppressWarnings("unchecked")
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	@Override
	public List<BangDia> findBangDia(String ten) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> b = query.getResultList();
		em.getTransaction().commit();
<<<<<<< HEAD
		
		return b;
	}
	
	@Override
=======

		return b;
	}

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	public BangDia getBangDiaByTen(String ten) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;
		Query query = em.createNativeQuery(statement, BangDia.class);
		BangDia bd = (BangDia) query.getSingleResult();
		em.getTransaction().commit();
		return bd;
	}
<<<<<<< HEAD
}
=======
}


>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
