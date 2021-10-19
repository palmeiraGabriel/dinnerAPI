package com.example.dinnerAPI.model;

import javax.persistence.*;


@Entity
@Table(name="DINING")
public class Dining {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private Long idRestaurant;

    @Column(name="EGG_SCORE")
    private Integer eggScore;
    @Column(name="DAIRY_SCORE")
    private Integer dairyScore;
    @Column(name="PEANUT_SCORE")
    private Integer peanutScore;
    @Column(name="COMMENTARY")
    private String commentary;

    

}
