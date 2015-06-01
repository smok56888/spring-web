package smok.springmvc.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import smok.springmvc.dao.INewsDao;
import smok.springmvc.model.tmodel.News;

public class NewsDao implements INewsDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<News> getList(News news) throws Exception {
		return sqlSession.selectList("NewsMapper.getList", news);
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
