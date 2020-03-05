package br.com.to.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.to.codeblog.model.Post;
import br.com.to.codeblog.repository.CodeBlogRepository;
import br.com.to.codeblog.service.CodeBlogService;

@Service
public class CodeBlogServiceImpl implements CodeBlogService {

	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	@Override
	public List<Post> findAll() {
		return codeBlogRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeBlogRepository.save(post);
	}
}
