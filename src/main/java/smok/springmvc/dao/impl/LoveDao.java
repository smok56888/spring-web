package smok.springmvc.dao.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import smok.springmvc.dao.ILoveDao;
import smok.springmvc.model.tmodel.LovePicture;

public class LoveDao implements ILoveDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<LovePicture> getPictures(@Param("offset") int offset, @Param("count") int count) throws Exception {
		return sqlSession.selectList("LoveMapper.getList");
	}

}
