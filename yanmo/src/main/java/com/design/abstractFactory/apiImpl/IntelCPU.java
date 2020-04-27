package com.design.abstractFactory.apiImpl;

import com.design.abstractFactory.api.CPUApi;

public class IntelCPU implements CPUApi {
    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("IntelCPU pins = " + pins);
    }
}
