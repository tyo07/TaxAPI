package com.project.taxutil.controller;

import com.project.taxutil.dto.TaxRequestDto;
import com.project.taxutil.dto.TaxResponseDto;
import com.project.taxutil.entity.TaxEntity;
import com.project.taxutil.service.TaxService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TaxController {

    final TaxService taxService;

    public TaxController(final TaxService taxService) {
        this.taxService = taxService;
    }


    @GetMapping("/getTax")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public TaxResponseDto<List<TaxEntity>> getTax() {
        TaxResponseDto<List<TaxEntity>> taxResponseDto = new TaxResponseDto<>();
        taxResponseDto.setResponseCode(200);
        taxResponseDto.setMessage("Success");
        taxResponseDto.setData(taxService.getTaxRate());
        return taxResponseDto;
    }

    @PostMapping("/updateTax")
    @ResponseBody
    public TaxResponseDto<List<TaxEntity>> updateTax(@RequestBody TaxRequestDto taxRequestDto) {
        taxService.updateTaxRate(taxRequestDto);
        TaxResponseDto<List<TaxEntity>> taxResponseDto = new TaxResponseDto<>();
        taxResponseDto.setResponseCode(201);
        taxResponseDto.setMessage("Success");
        taxResponseDto.setData(taxService.getTaxRate());
        return taxResponseDto;
    }


}
