package dao;

import java.rmi.RemoteException;
//import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class AbstractDao extends UnicastRemoteObject{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8641145938453840572L;
	protected EntityManagerFactory emf;
	protected EntityManager em;

	public AbstractDao(EntityManagerFactory emf) throws RemoteException {
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
