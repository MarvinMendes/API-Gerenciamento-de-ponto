package com.gerenciamentodeponto.controle.dto;

import com.gerenciamentodeponto.controle.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO {
    private Long id;

    private String cnpj;

    private String description;

    private Address address;

    private String phoneNumber;
}
