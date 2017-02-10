/**
 * 
 */
package br.com.simpleblog.businessimpl;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.simpleblog.business.PostBusiness;
import br.com.simpleblog.domain.Post;
import br.com.simpleblog.repository.PostRepository;

/**
 * @author Delano Jr
 *
 */
@RequestScoped
public class PostBusinessImpl implements PostBusiness, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.simpleblog.business.PostBusiness#salvarPost(br.com.simpleblog.
	 * domain.Post)
	 */

	@Inject
	private PostRepository postRepository;

	@Override
	public void salvarPost(Post post) {
		try {
			post.setDataPublicacao(new Date());
			postRepository.salvar(post);
		} catch (Exception e) {

		}
	}

}
