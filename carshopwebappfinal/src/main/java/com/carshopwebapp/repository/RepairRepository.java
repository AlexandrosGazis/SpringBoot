package com.carshopwebapp.repository;

import com.carshopwebapp.entitities.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepairRepository extends JpaRepository<Repair, Integer> {
    List<Repair> findByIdEquals(int id); //delete it was used for login in memory altered method

    List<Repair> findTop10ByDateLike(String date);

}
