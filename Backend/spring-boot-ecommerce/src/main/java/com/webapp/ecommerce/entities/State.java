package com.webapp.ecommerce.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "state")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

}
