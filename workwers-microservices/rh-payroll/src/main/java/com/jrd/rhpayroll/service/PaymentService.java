package com.jrd.rhpayroll.service;

import com.jrd.rhpayroll.entity.Payment;

public interface PaymentService {
	public Payment getPayment(long workerId, Integer days) ;
}
