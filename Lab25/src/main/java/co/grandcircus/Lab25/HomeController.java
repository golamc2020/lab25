package co.grandcircus.Lab25;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	@Autowired
	ApiService apiServ;

	@RequestMapping("/")
	public String home() {
		return "/select";
	}


	@RequestMapping("/location")

	public String showLocation(@RequestParam String data, @RequestParam String location, Model model) {


			model.addAttribute("data", data);
			model.addAttribute("data", location);

		
		return "location";
	}

	

}