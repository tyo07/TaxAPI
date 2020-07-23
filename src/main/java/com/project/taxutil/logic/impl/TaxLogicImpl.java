package com.project.taxutil.logic.impl;

import com.project.taxutil.dto.TaxRequestDto;
import com.project.taxutil.entity.TaxEntity;
import com.project.taxutil.logic.TaxLogic;
import com.project.taxutil.repository.TaxRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaxLogicImpl implements TaxLogic {

    private final TaxRepository taxRepository;

    public TaxLogicImpl(TaxRepository taxRepository) {
        this.taxRepository = taxRepository;
    }

    @Override
    public List<TaxEntity> getActiveTaxRate() {
        return  taxRepository.findOneByIsActive(1);
    }

    @Override
    public void updateActiveTaxRate(TaxRequestDto taxRequestDto) {
        //TODO: update first
        taxRepository.findOneByIsActive(1);
    }
}
