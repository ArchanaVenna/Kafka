package com.wipro.archana;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LocationServer {
	
	@KafkaListener (topics="zomato-delivery-agent",groupId="user-group")
	public void zomatoAgentLocation(String updatedlocation) {
		log.warn(updatedlocation);
	}
	

}
