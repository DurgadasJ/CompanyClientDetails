package com.joe.Repository;

import com.joe.Entity.ClientDetails;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDetailsRepository extends JpaRepository<ClientDetails, Long> {
    // You can define custom query methods here if needed
}
