package smok.springmvc.service;

import java.util.List;

import smok.springmvc.model.tmodel.News;

public interface INewsService {

	public List<News> getNewsList() throws Exception;

}
