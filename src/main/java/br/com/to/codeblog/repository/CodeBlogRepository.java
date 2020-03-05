package br.com.to.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.to.codeblog.model.Post;

public interface CodeBlogRepository extends JpaRepository<Post, Long> { }
