package com.design.abstractFactory.schemas;

import com.design.abstractFactory.AbstractFactory;
import com.design.abstractFactory.api.CPUApi;
import com.design.abstractFactory.api.MainboardApi;
import com.design.abstractFactory.apiImpl.GAMainboard;
import com.design.abstractFactory.apiImpl.IntelCPU;

public class Schema1156 implements AbstractFactory{

    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    public MainboardApi createMainboardApi() {
        return new GAMainboard(1156);
    }
}
