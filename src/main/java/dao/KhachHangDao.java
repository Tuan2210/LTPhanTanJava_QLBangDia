package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.KhachHang;
import entity.NhanVien;
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
	
	@Override
	public void removeKhachHang(int cmnd) {
		try {
			em.getTransaction().begin();
			KhachHang reference = em.getReference(KhachHang.class, cmnd);
			em.remove(reference);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
	
	@Override
	public void updateKhachHang(KhachHang k) {
		try {
			em.getTransaction().begin();
			em.merge(k);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
	
	@Override
	public List<KhachHang> findKhachHang(int cmnd) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM KhachHang WHERE soCMND = " + "'" + cmnd + "'";
		Query query = em.createNativeQuery(statement, KhachHang.class);
		List<KhachHang> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
<<<<<<< HEAD

	@Override
	public KhachHang getKhachHangByID(int cmnd) {
		em.getTransaction().begin();
		KhachHang n = em.find(KhachHang.class, cmnd);
		em.getTransaction().commit();
		
		return n;
	}
=======
>>>>>>> 82af7f23d77324cfbff68462e799a0589b5f1231

}