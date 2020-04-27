package com.design.abstractFactory.schemas;

import com.design.abstractFactory.AbstractFactory;
import com.design.abstractFactory.api.CPUApi;
import com.design.abstractFactory.api.MainboardApi;
import com.design.abstractFactory.apiImpl.AMDCPU;
import com.design.abstractFactory.apiImpl.GAMainboard;
import com.design.abstractFactory.apiImpl.IntelCPU;
import com.design.abstractFactory.apiImpl.MSIMainboard;

public class Schema939 implements AbstractFactory{

    public CPUApi createCPUApi() {
        return new AMDCPU(1156);
    }

    public MainboardApi createMainboardApi() {
        return new MSIMainboard(1156);
    }
}
