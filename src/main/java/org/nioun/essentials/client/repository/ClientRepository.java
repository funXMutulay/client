package org.nioun.essentials.client.repository;

import org.nioun.essentials.client.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	Client findByFirstNameAndLastName (String firstName , String lastName);
}
