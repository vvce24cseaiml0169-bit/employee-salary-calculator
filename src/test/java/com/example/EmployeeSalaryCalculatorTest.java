
package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeSalaryCalculatorTest {

    EmployeeSalaryCalculator calculator = new EmployeeSalaryCalculator();

    // Test Case 1: Check HRA calculation
    @Test
    void testHRA() {
        assertEquals(6000.0, calculator.calculateHRA(30000), 0.01);
    }

    // Test Case 2: Check DA calculation
    @Test
    void testDA() {
        assertEquals(3000.0, calculator.calculateDA(30000), 0.01);
    }

    // Test Case 3: Check Gross Salary calculation
    @Test
    void testGrossSalary() {
        assertEquals(39000.0, calculator.calculateGrossSalary(30000), 0.01);
    }

    // Test Case 4: Intentionally incorrect expected value
    @Test
    void testNetSalary() {
        assertEquals(40000.0, calculator.calculateNetSalary(30000), 0.01);
    }
}
