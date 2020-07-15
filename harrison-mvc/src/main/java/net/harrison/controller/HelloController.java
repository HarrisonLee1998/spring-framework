package net.harrison.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author HarrisonLee
 * @date 2020/6/18 21:47
 */
@RestController
public class HelloController {
	@PostMapping("hello")
	public String hello(@RequestBody Map<String, Object> map) {
		map.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});
		return "hello";
	}
}
