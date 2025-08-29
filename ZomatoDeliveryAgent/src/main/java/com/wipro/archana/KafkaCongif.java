package com.wipro.archana;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaCongif {
	
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("zomato-delivery-agent")
		                   .replicas(1)
		                   .partitions(4)
		                   .config("retention.ms","604800000")//7 days
		                   .config("cleanup.policy","delete")
		                   .build();
		
	}
	
	

}
 