package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.KhachHang;
import service.KhachHangServices;

public class KhachHangDao extends AbstractDao implements KhachHangServices {

	public KhachHangDao(EntityManagerFactory emf) {
		super(emf);
	}

	@Override
	public void add(KhachHang h) {
		try {
			em.getTransaction().begin();
			em.persist(h);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<KhachHang> getAllKhachHang() {
		em.getTransaction().begin();
		String statement = "SELECT * FROM KhachHang";
		Query query = em.createNativeQuery(statement, KhachHang.class);
		List<KhachHang> list = query.getResultList();
		em.getTransaction().commit();
		
		return list;
	}

}
