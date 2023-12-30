package com.grego.pao.controller;
import com.grego.pao.dtos.ClienteInDto;
import com.grego.pao.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping("/salvar/cliente")
    public ResponseEntity salvarCliente(@Valid @RequestBody ClienteInDto clienteInDto) {
        clienteService.salvaCliente(clienteInDto);

        return ResponseEntity.status(CREATED).build();
    }
}
