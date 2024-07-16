package com.joe.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "company_Details")
public class EnvIdDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proj_id")
    private Long projId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_group")
    private String projectGroup;

    @Column(name = "email_group")
    private String emailGroup;

    @Column(name = "manager")
    private String managerName;

    public EnvIdDetails() {
    }

    public Long getProjId() {
        return projId;
    }

    public void setProjId(Long projId) {
        this.projId = projId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public String getEmailGroup() {
        return emailGroup;
    }

    public void setEmailGroup(String emailGroup) {
        this.emailGroup = emailGroup;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
