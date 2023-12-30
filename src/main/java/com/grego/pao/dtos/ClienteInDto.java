package com.grego.pao.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClienteInDto {
    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    private String cpf;
}
