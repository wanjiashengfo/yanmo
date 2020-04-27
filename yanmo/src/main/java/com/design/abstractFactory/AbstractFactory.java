package com.design.abstractFactory;

import com.design.abstractFactory.api.CPUApi;
import com.design.abstractFactory.api.MainboardApi;

public interface AbstractFactory {
    public CPUApi createCPUApi();

    public MainboardApi createMainboardApi();
}
