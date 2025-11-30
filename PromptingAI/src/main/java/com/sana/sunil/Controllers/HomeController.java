package com.sana.sunil.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sana.sunil.PojoClass.user;
import com.sana.sunil.ServiceLayer.AiService;

@RestController
public class HomeController {
	
	@Autowired
	private AiService a;

	public AiService getA() {
		return a;
	}

	public void setA(AiService a) {
		this.a = a;
	}
	
	@PostMapping("/home")
	public List<user> GetAIdetails(@RequestBody String q)
	{
		return a.getDetails(q);
	}

}
