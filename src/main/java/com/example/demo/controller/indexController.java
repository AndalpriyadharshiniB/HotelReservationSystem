package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hotel;
import com.example.demo.entity.Hotelreq;
import com.example.demo.service.HotelService;

@Controller
public class indexController {
	@GetMapping("/resources/static/index")
    String index(){
        return "index";
    }
    
    @RequestMapping(value="/resources/static/Login1",method=RequestMethod.GET)
    String Login1(){
        return "Login1";
    }
    
  @Autowired
  	private HotelService hotService;

//  	@RequestMapping(value = "/add", method = RequestMethod.GET)
//  	public void add() //handler method
//  	{
//  	hotService.addHotel();
//  	}
//  	
//  	@RequestMapping(value = "/delete", method = RequestMethod.GET)
//  	public void delete() {
//  	hotService.deleteAllData();
//  	}
//  	
//  	@GetMapping("/findall")
//  	public ArrayList<Hotel> getAllHotel() {
//  	return hotService.findAllHotel();
//  	}
  	
  	
  	@RequestMapping("/adddetails")
	public String shownewstudent(Model model) {
	   Hotel  details=new Hotel();
		model.addAttribute("addclass", details);
		return "CustomerDetails";
	}
  	
  	@RequestMapping(value="/register", method = RequestMethod.POST)
	public  String saveClassDetails(@RequestParam Map<String,Object> map  ) {
//	hotService.save(details);
  		System.out.println("hi");
  		Hotelreq  details=new Hotelreq();
  		
  		
  		
  		details.setName((String)map.get("name"));
  		details.setPhnno((String)map.get("phnno"));
  		details.setProof_idno((String)map.get("proof_idno"));
  		details.setNo_of_persons((String)map.get("no_of_persons"));
  		details.setAddress((String)map.get("address"));
  		details.setType_of_room((String)map.get("type_of_room"));
  		details.setType_of_bed((String)map.get("type_of_bed"));
  		
  		
		System.out.println("hi");
	System.out.println(details.getName());
	System.out.println(details.getAddress());
	System.out.println(details.getNo_of_persons());
	System.out.println(details.getPhnno());
	System.out.println(details.getProof_idno());
	System.out.println(details.getType_of_bed());
	System.out.println(details.getType_of_room());
	hotService.addHotelreq(details);
	
		return "redirect:/FinalPage.html";
	}
}
