package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.NhanVien;
import service.NhanVienServices;

public class NhanVienDao extends AbstractDao implements NhanVienServices{

	public NhanVienDao(EntityManagerFactory emf) {
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
	
	@Override
	public void updateNhanVien(int id, String ten, String moTa, String dienThoai) {
		em.getTransaction().begin();
		String statement = "UPDATE NhanVien SET tenNV = " + "'" + ten + "'" + "," + "moTa =" + "'" + moTa + "'" + ", dienThoai = " + "'" + dienThoai + "'" + " WHERE maNV = " + id;
		Query query = em.createNativeQuery(statement);
		query.executeUpdate();
		em.getTransaction().commit();
	}

	@Override
	public List<NhanVien> findNhanVien(int id) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM NhanVien WHERE maNV LIKE " + "'%" + id + "%'";
		Query query = em.createNativeQuery(statement, NhanVien.class);
		List<NhanVien> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}

	@Override
	public NhanVien getNhanVienByID(int id) {
		em.getTransaction().begin();
		NhanVien n = em.find(NhanVien.class, id);
		em.getTransaction().commit();
		
		return n;
	}
}
