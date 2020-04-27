package com.design.abstractFactory;

import com.design.abstractFactory.schemas.Schema939;

public class Client {
    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory schema = new Schema939();
        computerEngineer.prepareHardware(schema);
    }
}
