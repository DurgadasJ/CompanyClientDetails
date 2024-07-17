package com.joe.Repository;

import com.joe.Entity.EmailNotifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailNotifierRepository extends JpaRepository<EmailNotifier,Long> {
}
