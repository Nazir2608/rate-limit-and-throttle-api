package com.nazir.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nazir.api.entity.Plan;

@Repository
public interface PlanRepository extends JpaRepository<Plan, UUID> {

}