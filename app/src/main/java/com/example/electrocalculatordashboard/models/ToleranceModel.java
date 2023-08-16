package com.example.electrocalculatordashboard.models;

public class ToleranceModel {
    private String toleranceName;
    private String toleranceValue;

    public ToleranceModel(String toleranceName, String toleranceValue) {
        this.toleranceName = toleranceName;
        this.toleranceValue = toleranceValue;
    }

    public String getToleranceName() {
        return toleranceName;
    }

    public void setToleranceName(String toleranceName) {
        this.toleranceName = toleranceName;
    }

    public String getToleranceValue() {
        return toleranceValue;
    }

    public void setToleranceValue(String toleranceValue) {
        this.toleranceValue = toleranceValue;
    }

    @Override
    public String toString() {
        return this.toleranceName;
    }
}
