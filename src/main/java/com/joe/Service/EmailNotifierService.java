package com.joe.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EmailNotifierService {

    @PersistenceContext
    private EntityManager entityManager;

}
