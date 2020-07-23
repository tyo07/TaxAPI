package com.project.taxutil.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "tax")
public class TaxEntity {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tax_rate", nullable = false)
    private Float taxRate;

    @Column(name = "is_active", nullable = false)
    private Integer isActive;

    @Column(name = "creator", nullable = false)
    private String creator;

    @Column(name = "updater", nullable = false)
    private String updater;

    @Column(name = "creation_date_time", nullable = false)
    private Date creationDateTime;

    @Column(name = "updating_date_time", nullable = false)
    private Date updatingDateTime;
}
