package com.animax.demo.repo;

import com.animax.demo.model.HelloModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<HelloModel, Long> {

}
