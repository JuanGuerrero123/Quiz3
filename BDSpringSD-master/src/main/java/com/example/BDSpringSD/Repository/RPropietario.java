package com.example.BDSpringSD.Repository;

import com.example.BDSpringSD.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Rpropietario extends JpaRepository<Propietario, Integer> {
}