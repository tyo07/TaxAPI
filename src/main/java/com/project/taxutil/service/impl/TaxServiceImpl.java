package com.project.taxutil.service.impl;

import com.project.taxutil.dto.TaxRequestDto;
import com.project.taxutil.entity.TaxEntity;
import com.project.taxutil.logic.TaxLogic;
import com.project.taxutil.service.TaxService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class TaxServiceImpl implements TaxService {

    private final TaxLogic taxLogic;

    public TaxServiceImpl(TaxLogic taxLogic){
        this.taxLogic = taxLogic;
    }

    @Override
    public List<TaxEntity> getTaxRate() {
        return taxLogic.getActiveTaxRate();
    }

    @Override
    public void updateTaxRate(TaxRequestDto taxRequestDto) {
         taxLogic.updateActiveTaxRate(taxRequestDto);
    }
}
