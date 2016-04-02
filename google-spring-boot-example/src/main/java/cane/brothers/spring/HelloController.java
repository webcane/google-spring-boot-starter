package cane.brothers.spring;

import javax.inject.Inject;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.google.api.Google;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	private Google google;
	private ConnectionRepository connectionRepository;
	
    @Inject
    public HelloController(Google google, ConnectionRepository connectionRepository) {
        this.google = google;
		this.connectionRepository = connectionRepository;
    }
	
	@RequestMapping(method = RequestMethod.GET)
	public String helloGoogle(Model model) {
        if (connectionRepository.findPrimaryConnection(Google.class) == null) {
            return "redirect:/connect/google";
        }
        
        model.addAttribute("googleProfile", google.plusOperations().getGoogleProfile());
        return "hello";
	}

}
