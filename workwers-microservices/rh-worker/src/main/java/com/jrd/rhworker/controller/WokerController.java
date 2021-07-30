package com.jrd.rhworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.rhworker.model.Worker;
import com.jrd.rhworker.service.WorkerService;

@RestController
@RequestMapping("/workers")
public class WokerController {

	@Autowired
	private WorkerService workerService;

	public WokerController(WorkerService workerService) {
		this.workerService = workerService;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Worker> create(@RequestBody Worker worker) {
		this.workerService.create(worker);

		return ResponseEntity.status(HttpStatus.CREATED).body(worker);
	}

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = this.workerService.findAll();

		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Worker> findById(@PathVariable(value = "id") Long id) {
		Worker obj = this.workerService.findById(id);

		return ResponseEntity.ok(obj);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Worker> update(@PathVariable(value = "id") Long id, @RequestBody Worker worker) {
		Worker obj = this.workerService.update(id, worker);

		return ResponseEntity.ok(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable(value = "id") Long id) {
		try {
			this.workerService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
