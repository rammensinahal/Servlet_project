package student_management_system.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import student_management_system.dto.Student;

public class Student_dao {
	public EntityManager getEntityManager() {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
		EntityManager m=f.createEntityManager();
		return m;
	}
	public Student saveStudent(Student student) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
		return student;
	}
	public Student loginStudent(String email) {
		EntityManager entityManager=getEntityManager();
		Query query= entityManager.createQuery("select s from Student s where s.email=?1");
		query.setParameter(1, email);
		Student student = (Student) query.getSingleResult();
		return student;
	}
	public Student update (Student student) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}
	public boolean delete(int id) {
		EntityManager m=getEntityManager();
		EntityTransaction t=m.getTransaction();
		Student s=m.find(Student.class, id);
		if(s!=null) {
			t.begin();
			m.remove(s);
			t.commit();
			return true;
		}else {
			return false;
		}
	}
	public Student featch(int id) {
		EntityManager m=getEntityManager();
		Student s=m.find(Student.class, id);
		return s;
	}
	public List<Student>  featchall() {
		EntityManager m=getEntityManager();
		Query list= m.createQuery("select x from Student x ");
		return list.getResultList();
	}
}
