package com.design.abstractFactory.apiImpl;

import com.design.abstractFactory.api.MainboardApi;

public class MSIMainboard implements MainboardApi {
    private int cpuHoles = 0;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCpu() {
        System.out.println("MSIMainboard cpuHoles = " + cpuHoles);
    }
}
