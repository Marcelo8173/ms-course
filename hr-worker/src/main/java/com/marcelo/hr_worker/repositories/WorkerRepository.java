package com.marcelo.hr_worker.repositories;

import com.marcelo.hr_worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
