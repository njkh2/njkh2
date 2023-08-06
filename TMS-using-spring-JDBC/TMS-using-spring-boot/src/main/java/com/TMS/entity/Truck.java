package com.TMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String truckNumber;
    private String passingExpire;
    private String permitExpire;
    private String insuranceExpire;

    @OneToOne
    @JoinColumn(
            name="driver_id",
            referencedColumnName = "id"
    )
    private Driver driver;
}
