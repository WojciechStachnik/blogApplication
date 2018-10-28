package com.stachnik.wojciech.blogApplication.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date added = new Date();
}