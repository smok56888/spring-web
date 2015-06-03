package smok.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smok.springmvc.model.tmodel.LovePicture;
import smok.springmvc.service.ILoveService;
import smok.springmvc.utils.HttpServletUtil;
import smok.springmvc.utils.StringUtil;

@Controller
@RequestMapping("/love/*")
public class LoveController {

	@Autowired
	private ILoveService loveService;

	@RequestMapping("our")
	public ModelAndView getOurStory() {
		ModelAndView mv = new ModelAndView("/love/our_index");

		try {
			String pageStr = HttpServletUtil.getRequest().getParameter("page");
			int page = 1;
			if (StringUtil.isDigital(pageStr)) {
				page = Integer.parseInt(pageStr);
			}
			List<LovePicture> pictures = loveService.getPictures(page);

			mv.addObject("pictures", pictures);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mv;
	}
}
