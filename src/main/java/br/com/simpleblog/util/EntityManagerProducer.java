/**
 * 
 */
package br.com.simpleblog.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Delano Jr
 *
 */
@ApplicationScoped
public class EntityManagerProducer {

	@PersistenceContext
	private EntityManager entityManager;

	@Produces
	@RequestScoped
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
