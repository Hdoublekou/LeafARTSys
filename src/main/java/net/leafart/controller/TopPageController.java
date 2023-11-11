package net.leafart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import net.leafart.entity.BlogInfoEntity;
import net.leafart.service.TopPageService;

@Controller
public class TopPageController {

	@Autowired
	TopPageService topPageService;

	@GetMapping("/top")
	public ModelAndView top(Model model) {

		ModelAndView mav = new ModelAndView("test");

		List<BlogInfoEntity> list = topPageService.findBlogInfoDataList();

		model.addAttribute("list", list);
		System.out.println(789);
		return mav;

	}

}
