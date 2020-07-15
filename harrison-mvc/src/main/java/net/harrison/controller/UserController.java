package net.harrison.controller;

import net.harrison.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author HarrisonLee
 * @date 2020/6/27 19:48
 */
@RestController
public class UserController {
	/*
	解析正常
	采用的是ServletModelAttributeMethodProcessor
	 */
	@GetMapping("user/get1")
	public User getUser(User user) {
		System.out.println(user);
		return user;
	}

	/*
	解析失败: 报错，响应状态码为400
	采用的是RequestParamMethodArgumentResolver
	 */
	@GetMapping("user/get2")
	public User getUser2(@RequestParam User user) {
		System.out.println(user);
		return user;
	}


	/*
	解析成功
	采用的是RequestResponseBodyMethodProcessor
	 */
	@PostMapping("user/post1")
	public User postUser(@RequestBody User user) {
		System.out.println(user);
		return user;
	}

	/*
	解析失败: 不报错，但是值为null
	采用的是ServletModelAttributeMethodProcessor
	 */
	@PostMapping("user/post2")
	public User postUser2(User user) {
		System.out.println(user);
		return user;
	}
}
