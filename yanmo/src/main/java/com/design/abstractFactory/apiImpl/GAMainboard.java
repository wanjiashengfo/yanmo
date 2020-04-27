package com.design.abstractFactory.apiImpl;

import com.design.abstractFactory.api.MainboardApi;

public class GAMainboard implements MainboardApi {
    private int cpuHoles = 0;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    public void installCpu() {
        System.out.println("GAMainboard cpuHoles = " + cpuHoles);
    }
}
