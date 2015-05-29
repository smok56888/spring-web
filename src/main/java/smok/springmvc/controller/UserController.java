package smok.springmvc.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smok.springmvc.model.tmodel.User;
import smok.springmvc.model.vo.UserVo;
import smok.springmvc.service.IUserService;

@Controller
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	private IUserService userService;

	// private static Log log = LogFactory.getLog(UserController.class);
	private static Logger log = Logger.getLogger(UserController.class);

	@RequestMapping("/info")
	public ModelAndView getUserInfo(UserVo userVo) {
		log.debug("user request : " + userVo);
		ModelAndView mv = new ModelAndView("user");
		try {
			List<User> userList = userService.getUser(userVo);
			mv.addObject("userlist", userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	private static Logger newlog = Logger.getLogger("NewLogger");
	public static void testLog(){
		newlog.info("this is new log");
	}
}
