package com.joe.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class EmailNotifierService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void upsertEmailNotifications() {
        String sql = """
            INSERT INTO email_notify_details (client_id, receiver_email_address, sender_email_address, client_name)
            SELECT client_id, email_group, 'defaultSender@example.com', client_name
            FROM company_client_details
            ON DUPLICATE KEY UPDATE
                receiver_email_address = VALUES(receiver_email_address),
                sender_email_address = VALUES(sender_email_address),
                client_name = VALUES(client_name);
        """;

        entityManager.createNativeQuery(sql).executeUpdate();
    }
}
