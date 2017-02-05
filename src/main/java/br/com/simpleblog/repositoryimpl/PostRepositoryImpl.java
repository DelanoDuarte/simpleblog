/**
 * 
 */
package br.com.simpleblog.repositoryimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.simpleblog.domain.Post;
import br.com.simpleblog.repository.PostRepository;

/**
 * @author Delano Jr
 *
 */
@RequestScoped
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

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.simpleblog.repository.PostRepository#buscarTodos()
	 */
	@Override
	public List<Post> buscarTodos() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.simpleblog.repository.PostRepository#buscaPorNome(java.lang.
	 * String)
	 */
	@Override
	public List<Post> buscaPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
