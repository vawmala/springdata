package com.spring.data.springdata.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "skils", schema = "it_workers")
@Data
public class SkilsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "skils_id_seq")
    @SequenceGenerator(name="skils_id_seq", sequenceName = "it_workers.skils_id_seq",allocationSize = 1)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String description;

    @Column
    private String level;
}

