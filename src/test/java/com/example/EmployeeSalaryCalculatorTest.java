
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeSalaryCalculatorTest {

    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    // Test Case 1: HRA Calculation
    @Test
    void testHRA() {
        assertEquals(6000.0, calculator.calculateHRA(30000), 0.01);
    }

    // Test Case 2: DA Calculation
    @Test
    void testDA() {
        assertEquals(3000.0, calculator.calculateDA(30000), 0.01);
    }

    // Test Case 3: Gross Salary Calculation
    @Test
    void testGrossSalary() {
        assertEquals(39000.0, calculator.calculateGrossSalary(30000), 0.01);
    }

    // Test Case 4: PF Deduction Calculation
    @Test
    void testDeductions() {
        assertEquals(3600.0, calculator.calculateDeductions(30000), 0.01);
    }

    // Test Case 5: Net Salary Calculation (Intentional Failure)
    @Test
    void testNetSalary() {
        assertEquals(40000.0, calculator.calculateNetSalary(30000), 0.01);
    }
}
