package com.ccf.marelvi.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")
public class User {
    @Id
    private String articleId;
    
    private String articleTitle;
}
