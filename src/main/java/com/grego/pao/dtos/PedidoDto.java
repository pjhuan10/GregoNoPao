package com.grego.pao.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDto {

    private String numeroPedido;
    private String nomeCliente;
    private String emailCliente;

}
