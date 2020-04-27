package com.design.abstractFactory;

import com.design.abstractFactory.api.CPUApi;
import com.design.abstractFactory.api.MainboardApi;

public class ComputerEngineer {
    private CPUApi cpu = null;
    private MainboardApi mainboard = null;

    public void prepareHardware(AbstractFactory schema){
        this.cpu = schema.createCPUApi();
        this.mainboard = schema.createMainboardApi();

        cpu.calculate();
        mainboard.installCpu();
    }
}
