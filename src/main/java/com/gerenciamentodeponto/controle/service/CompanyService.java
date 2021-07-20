package com.gerenciamentodeponto.controle.service;

import com.gerenciamentodeponto.controle.domain.Company;
import com.gerenciamentodeponto.controle.dto.CompanyDTO;
import com.gerenciamentodeponto.controle.exception.CompanyNotFoundException;
import com.gerenciamentodeponto.controle.repository.AddressRepository;
import com.gerenciamentodeponto.controle.repository.CompanyRepository;
import com.gerenciamentodeponto.controle.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    private CompanyRepository repository;
    private AddressRepository addressRepository;

    @Autowired
    public CompanyService(CompanyRepository repository, AddressRepository addressRepository) {
        this.repository = repository;
        this.addressRepository = addressRepository;
    }

    @Transactional(readOnly = true)
    public List<CompanyDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(Mapper::toDTO)
                .collect(Collectors.toList());
    }


    @Transactional
    public CompanyDTO create(CompanyDTO dto) {
        addressRepository.save(dto.getAddress());
        Company companySaved = repository.save(Mapper.toEntity(dto));
        return Mapper.toDTO(companySaved);
    }

    @Transactional(readOnly = true)
    public CompanyDTO listById(Long id) throws CompanyNotFoundException {
        return Mapper.toDTO(findById(id));
    }

    @Transactional
    public CompanyDTO replace(CompanyDTO dto) throws CompanyNotFoundException {
        findById(dto.getId());
        return create(Mapper.toDTO(dto));
    }

    @Transactional(readOnly = true)
    public CompanyDTO findByCNPJ(String cnpj) {
        Company companyByCnpj = repository.findCompanyByCnpj(cnpj);
        return Mapper.toDTO(companyByCnpj);
    }

    @Transactional
    public void delete(Long id) throws CompanyNotFoundException {
        Company companyForDelete = findById(id);
        repository.delete(companyForDelete);
    }

    private Company findById(Long id) throws CompanyNotFoundException {
        return repository.findById(id).orElseThrow(() -> new CompanyNotFoundException(id));
    }
}
