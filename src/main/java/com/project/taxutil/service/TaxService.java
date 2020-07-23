package com.project.taxutil.service;


import com.project.taxutil.dto.TaxRequestDto;
import com.project.taxutil.entity.TaxEntity;

import java.util.List;

public interface TaxService {

    List<TaxEntity> getTaxRate();

    void updateTaxRate(TaxRequestDto taxRequestDto);
}
