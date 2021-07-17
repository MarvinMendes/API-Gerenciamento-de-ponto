package com.gerenciamentodeponto.controle.controller;

import com.gerenciamentodeponto.controle.dto.CompanyDTO;
import com.gerenciamentodeponto.controle.exception.CompanyNotFoundException;
import com.gerenciamentodeponto.controle.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.openmbean.CompositeData;
import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    private CompanyService service;

    @Autowired
    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CompanyDTO>> listAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<CompanyDTO> create(@RequestBody CompanyDTO dto) {
        return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> listById(@PathVariable Long id) throws CompanyNotFoundException {
        return new ResponseEntity<>(service.listById(id), HttpStatus.ACCEPTED);
    }

    @PutMapping
    public ResponseEntity<CompanyDTO> replace(@RequestBody CompanyDTO dto) throws CompanyNotFoundException {
        return new ResponseEntity<>(service.replace(dto), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) throws CompanyNotFoundException {
        service.delete(id);
    }




}
