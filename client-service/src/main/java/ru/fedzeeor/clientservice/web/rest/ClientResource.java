package ru.fedzeeor.clientservice.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.fedzeeor.clientservice.dto.ClientDto;
import ru.fedzeeor.clientservice.mapper.client.ClientMapper;
import ru.fedzeeor.clientservice.service.ClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ClientResource {

    private final ClientService clientService;
    private final ClientMapper clientMapper;

    @GetMapping("/client")
    public ResponseEntity<List<ClientDto>> getAllClients() {
        return ResponseEntity.ok(clientMapper.toDtoList(clientService.findAll()));
    }

    @PostMapping("/client")
    public ResponseEntity<?> saveClient(@RequestBody ClientDto clientDto) {
        clientService.save(clientMapper.toEntity(clientDto));
        return ResponseEntity.ok().build();
    }
}
