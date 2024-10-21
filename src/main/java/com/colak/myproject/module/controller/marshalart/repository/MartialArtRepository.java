package com.colak.myproject.module.controller.marshalart.repository;

import java.util.Optional;

import com.colak.myproject.module.controller.marshalart.jpa.MartialArt;
import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;

@Repository
public interface MartialArtRepository extends CrudRepository<MartialArt, Long> {

    Optional<MartialArt> findByNameIgnoreCase(String name);
    void deleteById(Long id);
}
