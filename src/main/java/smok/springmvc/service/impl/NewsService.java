package smok.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import smok.springmvc.dao.INewsDao;
import smok.springmvc.model.tmodel.News;
import smok.springmvc.service.INewsService;

public class NewsService implements INewsService {

	@Autowired
	private INewsDao newsDao;

	@Override
	public List<News> getNewsList() throws Exception {
		return newsDao.getList(null);
	}

}
