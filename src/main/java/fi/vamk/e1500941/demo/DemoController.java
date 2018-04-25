package fi.vamk.e1500941.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/test")
	public String welcome() {
		return "welcome";
	}
}
