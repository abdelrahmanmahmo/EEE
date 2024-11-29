package com.EEE;

public class Correlation {
    private int n;              
    private int[] arrX, arrY;    
    private double sumX, sumY, sumXY, sumX2, sumY2; 

    public Correlation(int n) {
        this.n = n;
        arrX = new int[n];
        arrY = new int[n];
    }

    public void inputXValues(int[] x) {
        for (int i = 0; i < n; i++) {
            arrX[i] = x[i];
            sumX += x[i];
        }
    }

    public void inputYValues(int[] y) {
        for (int i = 0; i < n; i++) {
            arrY[i] = y[i]; 
            sumY += y[i];
        }
    }

    private void calculateIntermediateValues() {
        for (int i = 0; i < n; i++) {
            sumXY += arrX[i] * arrY[i];
            sumX2 += arrX[i] * arrX[i];
            sumY2 += arrY[i] * arrY[i];
        }
    }

    public double calculateCorrelationCoefficient() {
        calculateIntermediateValues();
        double part1 = n * sumXY - sumX * sumY;
        double part2 = Math.sqrt((n * sumX2 - sumX * sumX)) * Math.sqrt( (n * sumY2 - sumY * sumY));
        return part1 / part2;
    }

    public double calculate_a() {
        return (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
    }

    public double calculate_b(double a) {
        return (sumY - a * sumX) / n;
    }

    public String getStraightLineEquation() {
        double a = calculate_a();
        double b = calculate_b(a);
        return "y^ = " + a + " * X + " + b;
    }
}
