package com.TMS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bill {
    @Id
    private int billNumber;
    private String transporterName;
    private String sourceAndDestination;
    private int truckCharge;
    private int LessAdvance;
    private int extra;
    private int balance;
    private String truckNumber;
    private String ContainerNumber;
    private String pickupDate;
    private String emptyDate;
}
