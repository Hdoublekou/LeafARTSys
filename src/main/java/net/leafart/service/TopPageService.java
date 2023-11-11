package net.leafart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.leafart.entity.BlogInfoEntity;
import net.leafart.repository.TopPageRepository;

@Service
public class TopPageService {

	@Autowired
	TopPageRepository topPageRepository;

	public List<BlogInfoEntity> findBlogInfoDataList() {

		return topPageRepository.findAll();
	}

}
