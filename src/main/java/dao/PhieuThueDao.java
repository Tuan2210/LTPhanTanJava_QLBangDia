package dao;

import javax.persistence.EntityManagerFactory;

import service.PhieuThueServices;

public class PhieuThueDao extends AbstractDao implements PhieuThueServices {

	public PhieuThueDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

}
