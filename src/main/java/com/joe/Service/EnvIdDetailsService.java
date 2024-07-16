package com.joe.Service;

import com.joe.Entity.EnvIdDetails;
import com.joe.Repository.EnvIdDetailsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnvIdDetailsService {

    private final EnvIdDetailsRepository envIdDetailsRepository;

    public EnvIdDetailsService(EnvIdDetailsRepository envIdDetailsRepository) {
        this.envIdDetailsRepository = envIdDetailsRepository;
    }

    @Transactional
    public EnvIdDetails createOrUpdateEnvIdDetails(Long clientId, String clientName, String clientGroup, String emailGroup, String managerName,String location) {
        EnvIdDetails clientIdDetails = envIdDetailsRepository.findById(clientId).orElse(new EnvIdDetails());

        // Set properties using Lombok-generated setters
        clientIdDetails.setClientName(clientName);
        clientIdDetails.setClientGroup(clientGroup);
        clientIdDetails.setEmailGroup(emailGroup);
        clientIdDetails.setManagerName(managerName);
        clientIdDetails.setLocation(location);

        // Save and return the entity
        return envIdDetailsRepository.save(clientIdDetails);
    }


    // Other methods as needed
}
