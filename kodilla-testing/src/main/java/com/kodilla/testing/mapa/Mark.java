package com.kodilla.testing.mapa;

import java.util.Objects;

public class Mark {

    private double markIt;
    private double markMath;
    private double markChemistry;

    public Mark(double markIt, double markMath, double markChemistry) {
        this.markIt = markIt;
        this.markMath = markMath;
        this.markChemistry = markChemistry;
    }

    public double getMarkIt() {
        return markIt;
    }

    public double getMarkMath() {
        return markMath;
    }

    public double getMarkChemistry() {
        return markChemistry;
    }

}
