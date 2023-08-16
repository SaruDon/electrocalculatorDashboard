package com.example.electrocalculatordashboard.models;

import java.util.Objects;

public class MultiplierModel {
    private String multiplierName;
    private int multiplierValue;

    public String getMultiplierName() {
        return multiplierName;
    }

    public void setMultiplierName(String multiplierName) {
        this.multiplierName = multiplierName;
    }

    public int getMultiplierValue() {
        return multiplierValue;
    }

    public void setMultiplierValue(int multiplierValue) {
        this.multiplierValue = multiplierValue;
    }

    public MultiplierModel(String multiplierName, int multiplierValue) {
        this.multiplierName = multiplierName;
        this.multiplierValue = multiplierValue;
    }

    @Override
    public String toString() {
        return this.multiplierName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplierModel that = (MultiplierModel) o;
        return multiplierValue == that.multiplierValue && Objects.equals(multiplierName, that.multiplierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiplierName, multiplierValue);
    }
}
