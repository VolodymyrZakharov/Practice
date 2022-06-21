package com.example.demo.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "building")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "street")
    public String street;

    @Column(name = "houseNumber")
    private String houseNumber;

    @Column(name = "floorsCount")
    private Integer floorsCount;


}
