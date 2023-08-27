package ru.fedzeeor.clientservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.fedzeeor.clientservice.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {}
