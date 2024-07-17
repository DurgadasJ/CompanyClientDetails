package com.joe.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "emailNotify_details")
public class EmailNotifier {

    @Id
    @Column(name = "client_id")
    private long clientId;

    @Column(name = "sender_emailAddress")
    private String senderEmail;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "receiver_emailAddress")
    private String receiverEmail;

    @ManyToOne
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private ClientDetails clientDetails;

}
