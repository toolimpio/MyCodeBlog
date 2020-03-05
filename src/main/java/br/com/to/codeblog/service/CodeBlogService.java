package br.com.to.codeblog.service;

import java.util.List;

import br.com.to.codeblog.model.Post;

public interface CodeBlogService {
	
	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);

}
