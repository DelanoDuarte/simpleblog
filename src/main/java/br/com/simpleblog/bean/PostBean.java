/**
 * 
 */
package br.com.simpleblog.bean;

import java.io.Serializable;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.simpleblog.domain.Post;
import br.com.simpleblog.repository.PostRepository;

/**
 * @author Delano Jr
 *
 */
@Model
public class PostBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Post post = new Post();

	@Inject
	private PostRepository postRepository;

	public String salvar() {
		postRepository.salvar(post);
		return "/paginas/administrativo/gerenciamento/posts/list";
	}

	public void buscarPostPorId() {
		this.post = postRepository.buscaPorId(this.post.getId());
	}

	public String removerPost() {
		postRepository.remover(post);
		return "";
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
