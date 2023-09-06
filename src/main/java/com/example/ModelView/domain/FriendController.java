package com.example.ModelView.domain;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.domain.*;

@Controller
public class FriendController {
 @RequestMapping("/listCars")
 public String listCars(Model model) {
	 System.out.println("STARTED TO EXECUTE LISTCARS METHOD");
	 friend friend1 = new friend("John West");
	 friend friend2 = new friend("Kate Bower ");
	 ArrayList<friend> cars = new ArrayList<friend>();
	 friend.add(friend1);
	 cars.add(toyota);
	 cars.add(nissan);
	 
	 
	 model.addAttribute("carList", cars);
	 return "cars";
	 
 	}
} 