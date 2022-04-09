package com.finalproject.carapp.repository;

import com.finalproject.carapp.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
