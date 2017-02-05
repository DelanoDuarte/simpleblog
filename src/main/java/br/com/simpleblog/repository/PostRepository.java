/**
 * 
 */
package br.com.simpleblog.repository;

import java.util.List;

import br.com.simpleblog.domain.Post;

/**
 * @author Delano Jr
 *
 */
public interface PostRepository {

	public void salvar(Post post);

	public void remover(Post post);

	public List<Post> buscarTodos();

	public Post buscaPorId(Long id);

	public List<Post> buscaPorNome(String nome);
}
