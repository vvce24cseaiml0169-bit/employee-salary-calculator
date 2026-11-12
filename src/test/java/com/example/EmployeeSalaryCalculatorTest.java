package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeSalaryCalculatorTest {

    EmployeeSalaryCalculator calculator =
            new EmployeeSalaryCalculator();

    @Test
    void testHRACalculation() {
        assertEquals(6000.0, calculator.calculateHRA(30000), 0.01);
    }

    @Test
    void testDACalculation() {
        assertEquals(3000.0, calculator.calculateDA(30000), 0.01);
    }

    @Test
    void testGrossSalaryCalculation() {
        assertEquals(39000.0,
                calculator.calculateGrossSalary(30000), 0.01);
    }

    @Test
    void testDeductionCalculation() {
        assertEquals(3600.0,
                calculator.calculateDeductions(30000), 0.01);
    }

    @Test
    void testNetSalaryCalculation() {
        assertEquals(35400.0,
                calculator.calculateNetSalary(30000), 0.01);
    }

    @Test
    void testMinimumPositiveSalary() {
        assertEquals(1.18,
                calculator.calculateNetSalary(1), 0.01);
    }

    @Test
    void testZeroSalary() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateNetSalary(0));
    }

    @Test
    void testNegativeSalary() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateNetSalary(-5000));
    }

    @Test
    void testInvalidNaNSalary() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculateNetSalary(Double.NaN));
    }
}

