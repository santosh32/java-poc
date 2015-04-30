package com.valuelabs.poc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SingularDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void save(Singular singular) {
		entityManager.persist(singular);
	}

	public void delete(Singular singular) {
		if (entityManager.contains(singular))
			entityManager.remove(singular);
		else
			entityManager.remove(entityManager.merge(singular));
	}

	@SuppressWarnings("unchecked")
	public List<Singular> getAll() {
		return entityManager.createQuery("from Singular").getResultList();
	}

	public Singular getById(long sid) {
		return entityManager.find(Singular.class, sid);
	}

	public void update(Singular singular) {
		entityManager.merge(singular);
	}
}
