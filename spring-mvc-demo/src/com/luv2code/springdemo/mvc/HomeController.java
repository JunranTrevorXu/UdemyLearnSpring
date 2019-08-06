package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * please use utf-8 here to read the chinese comment
 * 所以说这个框架的url解析。。。很迷
 * 把controller path 和 method path拼在一起然后与url严格对照
 * 并且不负责在尾部补全 "/"
 * 不过 "/" 可以duplicate，这个会被处理掉
 * 最迷的还是 href
 * 不记得html里是什么样的了
 * 这里的href是替换掉path里最后一个element
 * 从root开始的话就是替换 "/", 看起来比较像append
 */

@Controller
public class HomeController {
	
	public HomeController() {
		System.out.println("controller initialize");
		return;
	}
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
