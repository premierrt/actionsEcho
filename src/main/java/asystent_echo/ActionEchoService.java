package asystent_echo;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Service
public class ActionEchoService {

	private static final String jsonResponse = "{\n" + 
			"  \"expectUserResponse\": true,\n" + 
			"  \"expectedInputs\": [\n" + 
			"    {\n" + 
			"      \"possibleIntents\": [\n" + 
			"        {\n" + 
			"          \"intent\": \"actions.intent.TEXT\"\n" + 
			"        }\n" + 
			"      ],\n" + 
			"      \"inputPrompt\": {\n" + 
			"        \"richInitialPrompt\": {\n" + 
			"          \"items\": [\n" + 
			"            {\n" + 
			"              \"simpleResponse\": {\n" + 
			"                \"textToSpeech\": \"Howdy, this is GeekNum. I can tell you fun facts about almost any number, my favorite is 42. What number do you have in mind?\",\n" + 
			"                \"displayText\": \"Howdy! I can tell you fun facts about almost any number. What do you have in mind?\"\n" + 
			"              }\n" + 
			"            }\n" + 
			"          ]\n" + 
			"        }\n" + 
			"      }\n" + 
			"    }\n" + 
			"  ]\n" + 
			"}"; 
	
	public String echoRespone(String jsonString) {
		log.info("*********Echo service: " + jsonString);
		return jsonResponse;
	}
}
