package com.jrd.rhpayroll.service;

import org.springframework.stereotype.Service;

import com.jrd.rhpayroll.model.Payment;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public Payment getPayment(long id, Integer days) {
		return new Payment("Bob", 300.0, days);
	}
	
	
}
