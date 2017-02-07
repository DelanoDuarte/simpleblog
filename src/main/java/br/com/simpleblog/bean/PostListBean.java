/**
 * 
 */
package br.com.simpleblog.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import br.com.simpleblog.domain.Post;
import br.com.simpleblog.repository.PostRepository;

/**
 * @author Delano Jr
 *
 */
@Model
public class PostListBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Post> posts = null;

	@Inject
	private PostRepository postRepository;

	public List<Post> getPosts() {
		if (this.posts == null)
			this.posts = postRepository.buscarTodos();
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}
