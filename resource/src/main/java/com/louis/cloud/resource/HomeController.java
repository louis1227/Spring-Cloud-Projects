/**
 * 
 */
package com.louis.cloud.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author huanglu
 *
 */
@Controller
public class HomeController {

	@ResponseBody
	@GetMapping(value="/")
	public String home() {
		
		return "resource home";
	}
	
	@ResponseBody
	@GetMapping(value="/test")
	public String test() {
		
		return "resource test";
	}
}
