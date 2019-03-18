package asystent_echo;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ActionEchoService {

	
	public String echoRespone(String jsonString) {
		log.info("*********Echo service: " + jsonString);
		return "echo backend";
	}
}
