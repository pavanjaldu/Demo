package com.maps;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class MapController {



    private String message = "Hello World";

	@RequestMapping("/map")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "MapsJ";
	}
}
