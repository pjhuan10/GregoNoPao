package com.grego.pao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {

    @Id @NotBlank
    private String idProduto;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Cliente cliente;

}
