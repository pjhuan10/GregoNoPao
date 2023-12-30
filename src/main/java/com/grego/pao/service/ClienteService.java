package com.grego.pao.service;
import com.grego.pao.dtos.ClienteInDto;
import com.grego.pao.model.Cliente;
import com.grego.pao.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ModelMapper mapper;

    public void salvaCliente(ClienteInDto clienteInDto) {
        Cliente cliente = mapper.map(clienteInDto, Cliente.class);
        clienteRepository.save(cliente);
    }
}
