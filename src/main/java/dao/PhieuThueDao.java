package dao;

<<<<<<< HEAD
import java.io.Serializable;
import java.rmi.RemoteException;
=======
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

<<<<<<< HEAD
<<<<<<< HEAD
import entity.KhachHang;
import entity.NhanVien;
=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======
=======
import entity.KhachHang;
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
import entity.NhanVien;
>>>>>>> parent of 8ab78b7 (fix all code sever)
import entity.PhieuThue;
import service.PhieuThueServices;

public class PhieuThueDao extends AbstractDao implements PhieuThueServices, Serializable {
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
=======

>>>>>>> parent of 8ab78b7 (fix all code sever)
	/**
	 * 
	 */
	private static final long serialVersionUID = 7751360999565582856L;

	public PhieuThueDao(EntityManagerFactory emf) throws RemoteException{
		super(emf);
<<<<<<< HEAD
=======
	}

	@Override
	public void add(PhieuThue pt) {
		try {
			em.getTransaction().begin();
			em.persist(pt);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<PhieuThue> getAllPhieuThue() {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue";
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> list = query.getResultList();
		em.getTransaction().commit();
		return list;
	}

	@Override
	public void removePhieuThue(int id) {
	}

	@Override
	public void updatePhieuThue(PhieuThue pt) {
		try {
			em.getTransaction().begin();
			em.merge(pt);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<PhieuThue> findPhieuThue(int id) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue WHERE soPhieu = " + "'" + id + "'";
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
<<<<<<< HEAD
	}
	
	@Override
	public List<String> getTenBangDia() {
		em.getTransaction().begin();
		String statement = "SELECT BangDia.tenBD FROM PhieuThue \r\n"
				+ "JOIN ChiTietPhieuThue ON PhieuThue.soPhieu = ChiTietPhieuThue.soPhieu\r\n"
				+ "JOIN BangDia ON ChiTietPhieuThue.maBD = BangDia.maBD";
		Query query = em.createNativeQuery(statement);
		List<String> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<PhieuThue> getPhieuThueByCMND(String cmnd) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<String> getTenBangDiaByCMND(String cmnd) {
		em.getTransaction().begin();
		String statement = "SELECT BangDia.tenBD FROM PhieuThue \r\n"
				+ "JOIN ChiTietPhieuThue ON PhieuThue.soPhieu = ChiTietPhieuThue.soPhieu\r\n"
				+ "JOIN BangDia ON ChiTietPhieuThue.maBD = BangDia.maBD WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement);
		List<String> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
<<<<<<< HEAD
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
	}

	@Override
	public void add(PhieuThue pt) {
		try {
			em.getTransaction().begin();
			em.persist(pt);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
=======
=======
>>>>>>> 530a450164c67f72a14e903d974c06ac8d0b9522
>>>>>>> parent of 8ab78b7 (fix all code sever)
	}

	@Override
	public List<PhieuThue> getAllPhieuThue() {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue";
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> list = query.getResultList();
		em.getTransaction().commit();
		return list;
	}

	@Override
	public void removePhieuThue(int id) {
	}

	@Override
	public void updatePhieuThue(PhieuThue pt) {
		try {
			em.getTransaction().begin();
			em.merge(pt);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}

	@Override
	public List<PhieuThue> findPhieuThue(int id) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue WHERE soPhieu = " + "'" + id + "'";
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override
	public List<String> getTenBangDia() {
		em.getTransaction().begin();
		String statement = "SELECT BangDia.tenBD FROM PhieuThue \r\n"
				+ "JOIN ChiTietPhieuThue ON PhieuThue.soPhieu = ChiTietPhieuThue.soPhieu\r\n"
				+ "JOIN BangDia ON ChiTietPhieuThue.maBD = BangDia.maBD";
		Query query = em.createNativeQuery(statement);
		List<String> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<PhieuThue> getPhieuThueByCMND(String cmnd) {
		em.getTransaction().begin();
		String statement = "SELECT * FROM PhieuThue WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement, PhieuThue.class);
		List<PhieuThue> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<String> getTenBangDiaByCMND(String cmnd) {
		em.getTransaction().begin();
		String statement = "SELECT BangDia.tenBD FROM PhieuThue \r\n"
				+ "JOIN ChiTietPhieuThue ON PhieuThue.soPhieu = ChiTietPhieuThue.soPhieu\r\n"
				+ "JOIN BangDia ON ChiTietPhieuThue.maBD = BangDia.maBD WHERE soCMND = " + cmnd;
		Query query = em.createNativeQuery(statement);
		List<String> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<String> getCMNDByPhieuThueID() {
		em.getTransaction().begin();
		String statement = "SELECT KhachHang.soCMND FROM KhachHang "
				+ "JOIN PhieuThue ON KhachHang.soCMND = PhieuThue.soCMND";
		Query query = em.createNativeQuery(statement);
		List<String> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public List<Integer> getMaNVByPhieuThueID() {
		em.getTransaction().begin();
		String statement = "SELECT NhanVien.maNV FROM PhieuThue "
				+ "JOIN NhanVien ON PhieuThue.maNV = NhanVien.maNV";
		Query query = em.createNativeQuery(statement);
		List<Integer> l = query.getResultList();
		em.getTransaction().commit();
		
		return l;
	}
	
	@Override 
	public void removePhieuThueByID(int soPhieu) {
		try {
			em.getTransaction().begin();
			PhieuThue reference = em.getReference(PhieuThue.class, soPhieu);
			em.remove(reference);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
}
