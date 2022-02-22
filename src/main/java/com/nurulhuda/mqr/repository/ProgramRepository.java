package com.nurulhuda.mqr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nurulhuda.mqr.models.Program;

import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

}
