package com.gerenciamentodeponto.controle.utils;

import com.gerenciamentodeponto.controle.domain.Company;
import com.gerenciamentodeponto.controle.dto.CompanyDTO;

public abstract class Mapper {

    public static Company toEntity(CompanyDTO dto) {
        Company company = new Company();
        company.setId(dto.getId());
        company.setAddress(dto.getAddress());
        company.setCnpj(dto.getCnpj());
        company.setPhoneNumber(dto.getPhoneNumber());
        company.setCnpj(dto.getCnpj());
        company.setDescription(dto.getDescription());

        return company;
    }



    public static CompanyDTO toDTO(Company company) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setId(company.getId());
        companyDTO.setAddress(company.getAddress());
        companyDTO.setCnpj(company.getCnpj());
        companyDTO.setPhoneNumber(company.getPhoneNumber());
        companyDTO.setCnpj(company.getCnpj());
        companyDTO.setDescription(company.getDescription());

        return companyDTO;
    }

    public static CompanyDTO toDTO(CompanyDTO dto) {
        CompanyDTO companyDTO = new CompanyDTO();
        companyDTO.setId(dto.getId());
        companyDTO.setAddress(dto.getAddress());
        companyDTO.setCnpj(dto.getCnpj());
        companyDTO.setPhoneNumber(dto.getPhoneNumber());
        companyDTO.setCnpj(dto.getCnpj());
        companyDTO.setDescription(dto.getDescription());

        return companyDTO;
    }

}
