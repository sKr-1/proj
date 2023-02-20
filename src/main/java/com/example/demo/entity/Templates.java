package com.example.demo.entity;


import jakarta.xml.bind.annotation.*;



public class Templates {
    private String issueName;
    private String category;
    private String title;
    private String description;
    private String assignedFolder;

    public Templates(){
        super();
    }

    public Templates(String issueName, String category, String title, String description, String assignedFolder) {
        this.issueName = issueName;
        this.category = category;
        this.title = title;
        this.description = description;
        this.assignedFolder = assignedFolder;
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getAssignedFolder() {
        return assignedFolder;
    }

    public void setAssignedFolder(String assignedFolder) {
        this.assignedFolder = assignedFolder;
    }

    @Override
    public String toString() {
        return "TemplateCreation{" +
                "issueName='" + issueName + '\'' +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedFolder='" + assignedFolder + '\'' +
                '}';
    }
}
