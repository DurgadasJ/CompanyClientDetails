package com.joe.Entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;


@Entity
@Table(name = "email_notifydetails")
public class EmailNotifier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "sender_emailAddress")
    private String senderEmail;


}
