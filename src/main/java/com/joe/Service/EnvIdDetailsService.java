package com.joe.Service;

import com.joe.Entity.EnvIdDetails;
import com.joe.Repository.EnvIdDetailsRepository;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnvIdDetailsService {

    @Autowired
    private EnvIdDetailsRepository envIdDetailsRepository;

    @Transactional
    public EnvIdDetails createOrUpdateEnvIdDetails(Long projId, String projectName, String projectGroup, String emailGroup, String managerName) {
        EnvIdDetails envIdDetails = envIdDetailsRepository.findById(projId).orElse(new EnvIdDetails());

        // Set properties
        envIdDetails.setProjectName(projectName);
        envIdDetails.setProjectGroup(projectGroup);
        envIdDetails.setEmailGroup(emailGroup);
        envIdDetails.setManagerName(managerName);

        // Save and return the entity
        return envIdDetailsRepository.save(envIdDetails);
    }


    // Other methods as needed
}
