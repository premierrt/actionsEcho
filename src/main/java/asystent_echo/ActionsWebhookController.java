package asystent_echo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ActionsWebhookController {

	@Autowired
	ActionEchoService actionEchoService;
	
	@PostMapping("/action")
	public String processAction(@RequestBody String jsonString) {
		
		return actionEchoService.echoRespone(jsonString);
	}
	
}
