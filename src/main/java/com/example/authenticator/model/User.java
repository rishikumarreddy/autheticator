package com.example.authenticator.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, length = 200, unique = true)
  private String id;
  @Column(name = "invited_by", length = 200)
  private String invited_by;
  @Column(name = "first_name", length = 200)
  private String first_name;
  @Column(name = "last_name", length = 200)
  private String last_name = null;
  @Column(name = "email_id", length = 200, unique = true)
  private String email_id;
  @CreationTimestamp
  @Column(name = "registered_on")
  private Timestamp registered_on;
  @Column(name = "invite_code")
  private String invite_code;
  @Column(name = "expiry_date")
  private String expiry_date;
  @Column(name = "internal_user", length = 1)
  private int internal_user = 0;
  @Column(name = "is_deleted", length = 1)
  private int is_deleted = 0;
  @CreationTimestamp
  @Column(name = "created_at")
  private Timestamp created_at;
  @UpdateTimestamp
  @Column(name = "last_modified_at")
  private Timestamp last_modified_at;
  
}
