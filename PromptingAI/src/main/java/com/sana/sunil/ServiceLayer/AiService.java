package com.sana.sunil.ServiceLayer;

import java.util.List;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import com.sana.sunil.PojoClass.user;

@Service
public class AiService {
	
	private ChatClient ai;
	public AiService(ChatClient.Builder builder)
	{
		this.ai=builder.build();
	}
	
	public List<user> getDetails(String q)
	{
		Prompt p=new Prompt(q);
		List<user> obj=ai.prompt(p).call().entity(new ParameterizedTypeReference<List<user>>() {
		});
		return obj;
	}

}
