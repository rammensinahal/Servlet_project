package Employ_details.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import Employ_details.dto.Employ;

public class Employ_dao {

	public EntityManager getEntityManager() {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		return m;
	}

	public Employ save_employ(Employ employ) {
		EntityManager m=getEntityManager();
		EntityTransaction t=m.getTransaction();
		t.begin();
		m.persist(employ);
		t.commit();
		return employ;
	}

	public Employ login_employ(String email) {
		EntityManager m=getEntityManager();
		Query query=m.createQuery("select s from Employ s where s.email=?1");
		query.setParameter(1, email);	
		Employ employ=(Employ) query.getSingleResult();
		return employ;

	}
	public Employ update_employ(Employ employ) {
		EntityManager m=getEntityManager();
		EntityTransaction transaction=m.getTransaction();
		transaction.begin();
		m.merge(employ);
		transaction.commit();
		return employ;
	}
	public Employ getEmployById(int id) {
		EntityManager m=getEntityManager();
		Employ employ=m.find(Employ.class, id);

		return employ;

	}
	public List<Employ> featchall(){
		EntityManager m=getEntityManager();
		Query q=m.createQuery("select x from Employ x");
		return q.getResultList();
	}
	public boolean delete (int id) {
		EntityManager m=getEntityManager();
		EntityTransaction t=m.getTransaction();
		Employ e=m.find(Employ.class, id);
		if(e!=null) {
			t.begin();
			m.remove(e);
			t.commit();
			return true;
		}else {
			return false;
		}
	}

}
