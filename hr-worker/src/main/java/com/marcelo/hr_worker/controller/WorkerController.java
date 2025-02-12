package com.marcelo.hr_worker.controller;

import com.marcelo.hr_worker.entities.Worker;
import com.marcelo.hr_worker.repositories.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> listWorkes () {
        List<Worker> list = this.workerRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> listWorker (@PathVariable Long id) {
        Worker worker = this.workerRepository.findById(id).get();
        return new ResponseEntity<>(worker, HttpStatus.OK);
    }

}
