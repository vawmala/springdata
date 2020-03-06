package com.spring.data.springdata.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee", schema = "it_workers")
@Data
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name="my_seq", sequenceName = "it_workers.my_seq",allocationSize = 1)
    @Column(nullable = false)
    private long id;
    @Column (nullable = false)
    private String name;
    @Column(nullable = false)
    private long position_id;
    @Column
    private LocalDate registreation_date;
    @Column
    private String address = "Бомж";
    @Column
    private long skill_id;
}
