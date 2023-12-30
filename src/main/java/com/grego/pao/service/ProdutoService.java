package com.grego.pao.service;

import com.grego.pao.dtos.PedidoDto;
import com.grego.pao.dtos.ProdutoDto;
import com.grego.pao.model.Cliente;
import com.grego.pao.model.Produto;
import com.grego.pao.repository.ClienteRepository;
import com.grego.pao.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import static org.springframework.http.HttpStatus.*;

@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ClienteRepository clienteRepository;

    public PedidoDto salvaProduto(ProdutoDto produtoDto) {
        PedidoDto pedidoDto = null;

        try {
            Optional<Cliente> cliente = clienteRepository.findById(produtoDto.getIdCliente());
            String numPedido = UUID.randomUUID().toString();
            Produto produto = new Produto(numPedido, cliente.get());

            produtoRepository.save(produto);
            pedidoDto = new PedidoDto(numPedido, cliente.get().getNome(), cliente.get().getEmail());
        } catch (NoSuchElementException exception) {
            System.out.println("teste");
        }
        return pedidoDto;
    }
}