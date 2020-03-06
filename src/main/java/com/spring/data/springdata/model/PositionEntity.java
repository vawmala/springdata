package com.spring.data.springdata.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "positions", schema = "it_workers")
@Data
public class PositionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "position_id_seq")
    @SequenceGenerator(name="position_id_seq", sequenceName = "it_workers.position_id_seq",allocationSize = 1)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;


}
