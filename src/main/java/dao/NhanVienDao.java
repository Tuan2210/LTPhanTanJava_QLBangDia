package dao;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.NhanVien;
import service.NhanVienServices;

public class NhanVienDao extends AbstractDao implements NhanVienServices, Serializable{
<<<<<<< HEAD
<<<<<<< HEAD

	/**
	 * 
	 */
	private static final long serialVersionUID = -7565956755556641046L;

=======
=======

>>>>>>> parent of 8ab78b7 (fix all code sever)
	/**
	 * 
	 */
	private static final long serialVersionUID = -7565956755556641046L;

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	public NhanVienDao(EntityManagerFactory emf) throws RemoteException{
		super(emf);
	}

	@Override
	public void add(NhanVien n) {
		try {
			em.getTransaction().begin();
			em.persist(n);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<NhanVien> getAllNhanVien() {
		em.getTransaction().begin();
		String statement = "SELECT * FROM NhanVien";
		Query query = em.createNativeQuery(statement, NhanVien.class);
		List<NhanVien> list = query.getResultList();
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
	public void removeNhanVien(int id) {
		try {
			em.getTransaction().begin();
			NhanVien reference = em.getReference(NhanVien.class, id);
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
>>>>>>> parent of 8ab78b7 (fix all code sever)
//	@Override
//	public void updateNhanVien(NhanVien n) {
//		try {
//			em.getTransaction().begin();
//			em.merge(n);
//			em.getTransaction().commit();
//		} catch(Exception e) {
//			e.printStackTrace();
//			em.getTransaction().rollback();
//		}
//	}
	
<<<<<<< HEAD
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
	@Override
	public void updateNhanVien(int id, String ten, String moTa, String dienThoai) {
		em.getTransaction().begin();
		String statement = "UPDATE NhanVien SET tenNV = " + "'" + ten + "'" + "," + "moTa =" + "'" + moTa + "'" + ", dienThoai = " + "'" + dienThoai + "'" + " WHERE maNV = " + id;
		Query query = em.createNativeQuery(statement);
		query.executeUpdate();
		em.getTransaction().commit();
	}

<<<<<<< HEAD
<<<<<<< HEAD
=======
	@SuppressWarnings("unchecked")
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
>>>>>>> parent of 8ab78b7 (fix all code sever)
	@Override
	public List<NhanVien> findNhanVien(int id) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM NhanVien WHERE maNV LIKE " + "'%" + id + "%'";
		Query query = em.createNativeQuery(statement, NhanVien.class);
		List<NhanVien> l = query.getResultList();
		em.getTransaction().commit();
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		return l;
	}

	@Override
	public NhanVien getNhanVienByID(int id) {
		em.getTransaction().begin();
		NhanVien n = em.find(NhanVien.class, id);
		em.getTransaction().commit();
<<<<<<< HEAD
<<<<<<< HEAD
		
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
		
>>>>>>> parent of 8ab78b7 (fix all code sever)
		return n;
	}
}
