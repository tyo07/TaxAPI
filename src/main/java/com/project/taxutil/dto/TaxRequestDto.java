package com.project.taxutil.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class TaxRequestDto {
    private Float newTaxRate;
    private String creator;
    private Date creationDateTime;
}
