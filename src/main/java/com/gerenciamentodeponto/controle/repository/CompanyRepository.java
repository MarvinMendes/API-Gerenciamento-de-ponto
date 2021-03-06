package com.gerenciamentodeponto.controle.repository;

import com.gerenciamentodeponto.controle.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    public Company findCompanyByCnpj(String cnpj);
}