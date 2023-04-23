package com.tms.loader.payloads.order;

import java.time.LocalDateTime;

import com.tms.loader.entities.Client;
import com.tms.loader.entities.Status;
import com.tms.loader.entities.driver.Driver;
import com.tms.loader.entities.payment.Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OrderDto {
	private Long orderId;
	private Integer noOfLabors;
	private float totalWeight;
	private float totalSize;
	private boolean fragility;
	private Status status;
	private float price;
	private Client client;
	private Driver driver;
	private Payment payment;
	private String pickUp;
	private String dropOff;
	private LocalDateTime schedule;
	
}
