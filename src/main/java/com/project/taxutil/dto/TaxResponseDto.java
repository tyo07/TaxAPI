package com.project.taxutil.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class TaxResponseDto<ResponseDto> {

    private Integer responseCode;
    private String message;
    private ResponseDto data;
}
