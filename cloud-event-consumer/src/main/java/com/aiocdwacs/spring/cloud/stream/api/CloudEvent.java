package com.aiocdwacs.spring.cloud.stream.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudEvent {

	private int id;
	private String name;
	private String source;
	private String type;
}
