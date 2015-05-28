package smok.springmvc.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import smok.springmvc.dao.IUserDao;
import smok.springmvc.model.tmodel.User;

public class UserDao implements IUserDao {

	private SqlSessionTemplate sqlSession;

	@Override
	public User getUserById(long id) {
		return sqlSession.selectOne("UserMapper.getUserById", id);
	}

	@Override
	public void insertUser(User user) {
		int code = sqlSession.insert("UserMapper.insertUser", user);
		System.out.println("insert code : " + code);
	}

	@Override
	public void deleteUser(long id) {
		int code = sqlSession.delete("UserMapper.deleteUser", id);
		System.out.println("delete code : " + code);

	}

	@Override
	public void updateUser(User user) {
		int code = sqlSession.update("UserMapper.updateUser", user);
		System.out.println("update code : " + code);
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<User> getUser(User user) throws Exception {
		return sqlSession.selectList("UserMapper.getUserList", user);
	}

}
