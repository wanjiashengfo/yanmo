package com.design.abstractFactory.apiImpl;

import com.design.abstractFactory.api.CPUApi;

public class AMDCPU implements CPUApi {
    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("AMDCUP pins = " + pins);
    }
}
