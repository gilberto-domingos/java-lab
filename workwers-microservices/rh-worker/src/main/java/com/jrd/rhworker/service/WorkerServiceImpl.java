package com.jrd.rhworker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.rhworker.entity.Worker;
import com.jrd.rhworker.repository.WorkerRepository;

@Service
public class WorkerServiceImpl implements WorkerService {

	@Autowired
	private WorkerRepository workerRepository;

	public WorkerServiceImpl(WorkerRepository workerRepository) {
		this.workerRepository = workerRepository;
	}

	@Override
	public Worker create(Worker worker) {
		return this.workerRepository.save(worker);
	}

	@Override
	public List<Worker> findAll() {
		return this.workerRepository.findAll();
	}

	@Override
	public Worker findById(Long id) {
		return this.workerRepository.findById(id).get();
	}

	@Override
	public Worker update(Long id, Worker worker) {
		Worker workerExists = this.workerRepository.findById(id).get();

		if (workerExists != null) {
			worker.setId(workerExists.getId());
			this.workerRepository.save(worker);
		}

		return worker;
	}

	@Override
	public void delete(Long id) {
		this.workerRepository.deleteById(id);

	}

}
