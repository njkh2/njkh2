package com.TMS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transporterId;
    private String transporterName;
    private String Mobile;
    private String address;
}
