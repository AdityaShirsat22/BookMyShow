package com.cfs.bms.model_entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true)
    private String BookingNumber;

    @Column(nullable = false)
    private LocalDateTime bookingtime;


    @ManyToOne
    @Column(name="show_id",nullable = false)
    private User user;

    @Column(nullable = false)
    private String status; // confirm, cancel,pending

    @Column(nullable = false)
    private Double totalAmount;

    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<Showseat> showseats;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "payment_id")
    private Payment payment;


}
