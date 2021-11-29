package dao;

import java.rmi.RemoteException;
<<<<<<< HEAD
import java.rmi.server.RemoteObject;
=======
//import java.rmi.server.RemoteObject;
>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
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
<<<<<<< HEAD
	
=======

>>>>>>> 8ab78b7df95e5ab02eed23b0958127c208b42927
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
