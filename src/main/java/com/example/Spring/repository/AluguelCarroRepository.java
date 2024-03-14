package com.example.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring.entity.AluguelCarro;

public interface AluguelCarroRepository extends JpaRepository<AluguelCarro, Long> {
  
}
