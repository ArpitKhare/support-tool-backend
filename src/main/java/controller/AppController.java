package controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
@RequestMapping("/hortonworks/support-tool/v1/*")
public class AppController {
		

		@CrossOrigin(origins = "*")
		@RequestMapping(value = "/test", method = RequestMethod.GET)
		public @ResponseBody String cancelReservation(){
			System.out.println("hi");
			return "<html><h1>Support Tool RESTful web service.</h1><p><font color='blue'>Hello Team! This is a sample RESTful API which would download the logs at backend "
					+ "and would respond with the recommendations</font></p><p>- akhare@hortonworks.com</p>";
		}
		

}
