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
}
