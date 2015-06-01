package smok.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smok.springmvc.service.INewsService;

@Controller
@RequestMapping("/news/*")
public class NewsController {

	@Autowired
	private INewsService newsService;

	@RequestMapping("list")
	public ModelAndView getList() {
		ModelAndView mv = new ModelAndView("/news/list");
		try {
			mv.addObject("list", newsService.getNewsList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

}
