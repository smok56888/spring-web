package smok.springmvc.service;

import java.util.List;

import smok.springmvc.model.tmodel.User;
import smok.springmvc.model.vo.UserVo;

public interface IUserService {

	public User getUser();

	public List<User> getUser(UserVo userVo) throws Exception;

}
