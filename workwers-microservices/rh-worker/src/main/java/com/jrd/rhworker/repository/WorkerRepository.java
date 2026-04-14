package com.jrd.rhworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jrd.rhworker.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>  {

}
