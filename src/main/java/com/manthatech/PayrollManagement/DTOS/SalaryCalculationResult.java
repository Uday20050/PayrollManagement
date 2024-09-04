package com.manthatech.PayrollManagement.DTOS;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class SalaryCalculationResult {
    private final BigDecimal baseSalary;
    private final BigDecimal allowances;
    private final BigDecimal benefits;
    private final BigDecimal lossOfPay;
    private final BigDecimal deductions;
    private final BigDecimal grossSalary;
    private final BigDecimal netSalary;

    //  add toString method
}