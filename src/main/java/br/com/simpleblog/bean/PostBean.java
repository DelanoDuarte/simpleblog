/**
 * 
 */
package br.com.simpleblog.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.simpleblog.business.PostBusiness;
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
	private List<Post> posts = null;

	@Inject
	private PostRepository postRepository;

	@Inject
	private PostBusiness postBusiness;

	public String salvar() {
		postBusiness.salvarPost(post);
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

	public List<Post> getPosts() {
		if (this.posts == null)
			this.posts = postRepository.buscarTodos();
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}
