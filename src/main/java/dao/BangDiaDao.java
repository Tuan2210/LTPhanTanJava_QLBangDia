package dao;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.BangDia;
import entity.NhanVien;
import service.BangDiaServices;

public class BangDiaDao extends AbstractDao implements BangDiaServices, Serializable {
<<<<<<< HEAD
<<<<<<< HEAD
	
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
	
>>>>>>> parent of 8ab78b7 (fix all code sever)
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
<<<<<<< HEAD
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
	
>>>>>>> parent of 8ab78b7 (fix all code sever)
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
<<<<<<< HEAD
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
	
>>>>>>> parent of 8ab78b7 (fix all code sever)
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
<<<<<<< HEAD
	
=======

	@SuppressWarnings("unchecked")
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
	
>>>>>>> parent of 8ab78b7 (fix all code sever)
	@Override
	public List<BangDia> findBangDia(String ten) {
		em.getTransaction().begin();
<<<<<<< HEAD
		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> b = query.getResultList();
		em.getTransaction().commit();
<<<<<<< HEAD
<<<<<<< HEAD
		
		return b;
	}
	
	@Override
=======

=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		return b;
	}
	
	@Override
=======

<<<<<<< HEAD
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;
//		String statement1 = "SELECT * FROM BangDia WHERE tenBD = " +  "'" + ten + "'"  ;
//		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;
//		String statement = "SELECT * FROM BangDia WHERE tenBD = " +  "'" + ten + "'"  ;
		Query query = em.createNativeQuery(statement, BangDia.class);
		List<BangDia> b = query.getResultList();
		em.getTransaction().commit();
		return b;
	}
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
>>>>>>> parent of 8ab78b7 (fix all code sever)
	public BangDia getBangDiaByTen(String ten) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM BangDia WHERE tenBD LIKE " +  "'%" + ten + "%'"  ;
		Query query = em.createNativeQuery(statement, BangDia.class);
		BangDia bd = (BangDia) query.getSingleResult();
		em.getTransaction().commit();
		return bd;
	}
<<<<<<< HEAD
<<<<<<< HEAD
}
=======
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
}
=======

}

<<<<<<< HEAD
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
>>>>>>> parent of 8ab78b7 (fix all code sever)
