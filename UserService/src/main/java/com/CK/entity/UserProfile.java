package com.CK.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UserProfile")
public class UserProfile extends BaseEntity{

    @Id
    private Long id;

    private String authId;
    private String idNum;
    private String username;
    private String email;
    private String phone;
    private String country;
    private String city;
    private String status;
}
