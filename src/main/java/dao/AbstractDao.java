package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class AbstractDao {
	protected EntityManagerFactory emf;
	protected EntityManager em;
	
	public AbstractDao(EntityManagerFactory emf) {
		super();
		this.emf = emf;
		em = emf.createEntityManager();
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public EntityManager getEm() {
		return em;
	}
}
