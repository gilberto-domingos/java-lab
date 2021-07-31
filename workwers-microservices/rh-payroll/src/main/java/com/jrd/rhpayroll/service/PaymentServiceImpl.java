package com.jrd.rhpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.rhpayroll.feignClient.WorkerFignClient;
import com.jrd.rhpayroll.model.Payment;
import com.jrd.rhpayroll.model.Worker;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private WorkerFignClient workerFignClient;

	public PaymentServiceImpl(WorkerFignClient workerFignClient) {
		this.workerFignClient = workerFignClient;
	}

	public Payment getPayment(long workerId, Integer days) {

		Worker worker = workerFignClient.findById(workerId).getBody();

		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
