package com.jrd.rhworker.service;

import java.util.List;

import com.jrd.rhworker.model.Worker;

public interface WorkerService {
	
	public Worker create(Worker worker);

	public List<Worker> findAll();

	public Worker findById(Long id);

	public Worker update(Long id, Worker worker);

	public void delete(Long id);
}
