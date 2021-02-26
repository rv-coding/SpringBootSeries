/**
 * 
 */
package com.rv.SampleSpringRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * Our rest controller.
 * 
 * 
 * @author rvcoding
 *
 */
@RestController
public class SpringRestController {
	
	/**
	 * Controller end point to accept query params.
	 * 
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	@GetMapping("/helloMapper")
	public String helloMapper(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName) {
		
		String template="Hello %s %s";
		
		return String.format(template, firstName, lastName);
	}
	
	
	/**
	 * Controller end point to accept path params.
	 * 
	 * 
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	@GetMapping("/helloPathMapper/{firstName}/{lastName}")
	public String helloPathMapper(@PathVariable(name="firstName") String firstName, @PathVariable(name="lastName") String lastName)
	{
		String template="Hello %s %s";
		
		return String.format(template, firstName, lastName);
	}
	
	

}
