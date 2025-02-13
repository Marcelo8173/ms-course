package com.marcelo.hr_worker.controller;

import com.marcelo.hr_worker.entities.Worker;
import com.marcelo.hr_worker.repositories.WorkerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

    @Autowired
    Environment environment;

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> listWorkes () {
        List<Worker> list = this.workerRepository.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> listWorker (@PathVariable Long id) {

        logger.info("port12=" + environment.getProperty("local.server.port"));

        Worker worker = this.workerRepository.findById(id).get();
        return new ResponseEntity<>(worker, HttpStatus.OK);
    }

}
