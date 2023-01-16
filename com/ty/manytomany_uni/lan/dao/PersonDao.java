package com.ty.manytomany_uni.lan.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.manytomany_uni.lan.dto.Language;
import com.ty.manytomany_uni.lan.dto.Person;



public class PersonDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void save(List<Person> list, List<Language> list2) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		for (Person p : list) {
			entityManager.persist(p);
			entityManager.persist(p);
			entityManager.persist(p);

		}
		for (Language p : list2) {

			entityManager.persist(p);
			entityManager.persist(p);
			entityManager.persist(p);

		}
		entityTransaction.commit();
		System.out.println("insert data sucessfully");
	}

	public void update(int id, String name) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person personfind = entityManager.find(Person.class, id);

		if (personfind != null) {

			personfind.setName(name);
			entityTransaction.begin();
			entityManager.merge(personfind);
			entityTransaction.commit();
		}
		System.out.println("update sucessfully");
	}

	public void delete(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person personfind = entityManager.find(Person.class, id);
		entityTransaction.begin();
		entityManager.remove(personfind);
		entityTransaction.commit();
		System.out.println("delete data sucessfully");
	}

	public void retriveById(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person personfind = entityManager.find(Person.class, id);
		System.out.println(personfind);
		System.out.println("retrive data sucessfully by id ");
	}
	public void retriveALl() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select p from Person p");
		List resultList = query.getResultList();
		System.out.println(resultList);
		System.out.println("retrive data sucessfully");
	}
}

