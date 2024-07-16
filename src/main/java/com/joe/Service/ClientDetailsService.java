package com.joe.Service;

import com.joe.Entity.ClientDetails;
import com.joe.Repository.ClientDetailsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientDetailsService {

    private final ClientDetailsRepository clientDetailsRepository;

    public ClientDetailsService(ClientDetailsRepository clientDetailsRepository) {
        this.clientDetailsRepository = clientDetailsRepository;
    }

    @Transactional
    public ClientDetails createOrUpdateEnvIdDetails(Long clientId, String clientName, String clientGroup, String emailGroup, String managerName, String location) {
        ClientDetails clientIdDetails = clientDetailsRepository.findById(clientId).orElse(new ClientDetails());

        // Set properties using Lombok-generated setters
        clientIdDetails.setClientName(clientName);
        clientIdDetails.setClientGroup(clientGroup);
        clientIdDetails.setEmailGroup(emailGroup);
        clientIdDetails.setManagerName(managerName);
        clientIdDetails.setLocation(location);

        // Save and return the entity
        return clientDetailsRepository.save(clientIdDetails);
    }


    // Other methods as needed
}
