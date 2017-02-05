/**
 * 
 */
package br.com.simpleblog.bean;

import java.io.Serializable;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

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

	@Inject
	private PostRepository postRepository;
}
