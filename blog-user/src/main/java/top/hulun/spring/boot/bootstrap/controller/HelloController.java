package top.hulun.spring.boot.bootstrap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World 控制器
 * @author hulun
 * @date 2019年3月4日
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
	    return "Hello World! Welcome to visit waylau.com!";
	}
}
