package com.jrd.rhpayroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.rhpayroll.model.Payment;
import com.jrd.rhpayroll.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@GetMapping("/{workerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable(value = "workerId") Long workerId, @PathVariable(value = "days")  Integer days) {
	 Payment payment =	this.paymentService.getPayment(workerId, days);
		
		return ResponseEntity.ok(payment);
	}
	
	
	
	

}
