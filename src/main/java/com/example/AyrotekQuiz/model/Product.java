package com.example.AyrotekQuiz.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "product")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")//UUID bizim generate et dediğimiz zaman o zmaan timespand i alır ve bir hascode üretir ve bu hascode bizim uuid miz olur
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String productName;

    private String brand;

    private Long price;

    private Integer unitsInStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}
