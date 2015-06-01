package smok.springmvc.dao;

import java.util.List;

import smok.springmvc.model.tmodel.News;

public interface INewsDao {

	public List<News> getList(News news) throws Exception;

}
