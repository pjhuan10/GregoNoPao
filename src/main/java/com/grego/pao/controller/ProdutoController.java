package com.grego.pao.controller;
import com.grego.pao.dtos.PedidoDto;
import com.grego.pao.dtos.ProdutoDto;
import com.grego.pao.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.HttpStatus.CREATED;
import jakarta.validation.Valid;

@RequiredArgsConstructor
@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping("/salvar/produto")
    public ResponseEntity<PedidoDto> salvarProduto(@Valid @RequestBody ProdutoDto produtoDto) {
       PedidoDto pedidoDto = produtoService.salvaProduto(produtoDto);

       return ResponseEntity.status(CREATED).body(pedidoDto);
    }
}
