package ru.fedzeeor.clientservice.mapper.client;

import org.mapstruct.Mapper;
import ru.fedzeeor.clientservice.domain.Client;
import ru.fedzeeor.clientservice.dto.ClientDto;
import ru.fedzeeor.clientservice.mapper.GenericMapper;

@Mapper(componentModel = "spring")
public interface ClientMapper extends GenericMapper<ClientDto, Client> {
}
