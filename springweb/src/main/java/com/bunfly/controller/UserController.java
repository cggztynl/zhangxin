package com.bunfly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
/**
 * 类上面@RequestMapping("/hello")请求的根路径！
 * Url: id:port/项目名/请求路径
 * 
 * @author zhangxin
 *
 */
@RequestMapping("/hello")
public class UserController {
	/**
	 *  @RequestMapping("/login.do") 用来指明我们请求的映射地址 参数是对应的请求路径
	 *  url：ip ：port /项目名/请求路径
	 * @param uid
	 * @return
	 */

	@RequestMapping("/login.do")
	public String login(@RequestParam(value="id") Integer uid){
		System.out.println(uid);
	return "login";
	}
	
	@RequestMapping(value="/login/{uid}{name}",method=RequestMethod.GET)
	public String login(@PathVariable(value="uid") String uid,@PathVariable("name") String name) {
		System.out.println(uid+name);
		return "login";
	}
	
	
	
}
