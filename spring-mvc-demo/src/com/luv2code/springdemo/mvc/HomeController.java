package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * ����˵�����ܵ�url��������������
 * ��controller path �� method pathƴ��һ��Ȼ����url�ϸ����
 * ���Ҳ�������β����ȫ "/"
 * ���� "/" ����duplicate������ᱻ�����
 * ���ԵĻ��� href
 * ���ǵ�html����ʲô������
 * �����href���滻��path�����һ��element
 * ��root��ʼ�Ļ������滻 "/", �������Ƚ���append
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
