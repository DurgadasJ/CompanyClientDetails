package com.joe.Repository;

import com.joe.Entity.EnvIdDetails;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvIdDetailsRepository extends JpaRepository<EnvIdDetails, Long> {
    // You can define custom query methods here if needed
}
