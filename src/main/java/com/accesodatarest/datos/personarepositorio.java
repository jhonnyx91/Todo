package com.accesodatarest.datos;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface personarepositorio extends PagingAndSortingRepository<Persona, Long> {

    List<Persona> findByLastName(@Param("name") String name);

}
