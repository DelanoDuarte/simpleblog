/**
 * 
 */
package br.com.simpleblog.repositoryimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import br.com.simpleblog.domain.Post;
import br.com.simpleblog.repository.PostRepository;

/**
 * @author Delano Jr
 *
 */
@RequestScoped
@Transactional
public class PostRepositoryImpl implements PostRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.simpleblog.repository.PostRepository#salvar(br.com.simpleblog.
	 * domain.Post)
	 */

	@Inject
	private EntityManager em;

	@Override
	public void salvar(Post post) {
		try {
			if (post.getId() == null) {
				em.persist(post);
			} else {
				em.merge(post);
			}

		} catch (Exception e) {

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.simpleblog.repository.PostRepository#remover(br.com.simpleblog.
	 * domain.Post)
	 */
	@Override
	public void remover(Post post) {
		try {
			Post postTemp = em.find(Post.class, post.getId());
			em.remove(postTemp);
		} catch (Exception e) {

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.simpleblog.repository.PostRepository#buscarTodos()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Post> buscarTodos() {
		try {
			return em.createQuery("from Post p").getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.simpleblog.repository.PostRepository#buscaPorId(java.lang.Long)
	 */
	@Override
	public Post buscaPorId(Long id) {
		try {
			return em.find(Post.class, id);
		} catch (Exception e) {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.simpleblog.repository.PostRepository#buscaPorNome(java.lang.
	 * String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Post> buscaPorTitulo(String titulo) {
		try {
			return em.createQuery("from Post p where p.titulo = :titulo").setParameter(titulo, "titulo")
					.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

}
