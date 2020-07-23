package com.project.taxutil.logic;


import com.project.taxutil.dto.TaxRequestDto;
import com.project.taxutil.entity.TaxEntity;

import java.util.List;

public interface TaxLogic {

    List<TaxEntity> getActiveTaxRate();

    void updateActiveTaxRate(TaxRequestDto taxRequestDto);
}
