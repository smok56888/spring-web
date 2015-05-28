package smok.springmvc.dao;

import java.util.List;

import smok.springmvc.model.tmodel.User;

public interface IUserDao {

	public User getUserById(long id);
	
	public void insertUser(User user);
	
	public void deleteUser(long id);
	
	public void updateUser(User user);

	public List<User> getUser(User user) throws Exception;
}
