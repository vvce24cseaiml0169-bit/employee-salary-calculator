
package com.example;

public class EmployeeSalaryCalculator {

    // Salary percentages (sample assignment values)
    private static final double HRA_RATE = 0.20;
    private static final double DA_RATE = 0.10;
    private static final double PF_RATE = 0.12;

    public double calculateHRA(double basicSalary) {
        validateSalary(basicSalary);
        return basicSalary * HRA_RATE;
    }

    public double calculateDA(double basicSalary) {
        validateSalary(basicSalary);
        return basicSalary * DA_RATE;
    }

    public double calculateGrossSalary(double basicSalary) {
        validateSalary(basicSalary);

        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);

        return basicSalary + hra + da;
    }

    public double calculateDeductions(double basicSalary) {
        validateSalary(basicSalary);

        return basicSalary * PF_RATE;
    }

    public double calculateNetSalary(double basicSalary) {
        double grossSalary = calculateGrossSalary(basicSalary);
        double deductions = calculateDeductions(basicSalary);

        return grossSalary - deductions;
    }

    private void validateSalary(double basicSalary) {
        if (basicSalary <= 0 || Double.isNaN(basicSalary)
                || Double.isInfinite(basicSalary)) {
            throw new IllegalArgumentException(
                    "Basic salary must be a positive valid number");
        }
    }
}
