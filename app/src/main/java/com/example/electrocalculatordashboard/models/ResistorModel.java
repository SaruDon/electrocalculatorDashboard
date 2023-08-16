package com.example.electrocalculatordashboard.models;

import java.util.Objects;

public class ResistorModel {
    private String colorName;
    private int colorCode;
    private int multiplierCode;

    public ResistorModel(String colorName, int colorCode, int multiplierCode) {
        this.colorName = colorName;
        this.colorCode = colorCode;
        this.multiplierCode = multiplierCode;
    }

    public int getMultiplierCode() {
        return multiplierCode;
    }

    public void setMultiplierCode(int multiplierCode) {
        this.multiplierCode = multiplierCode;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return this.colorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResistorModel that = (ResistorModel) o;
        return Objects.equals(colorName, that.colorName) && Objects.equals(colorCode, that.colorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorName, colorCode);
    }
}
