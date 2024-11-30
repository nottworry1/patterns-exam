package com.example.components.buttons;

public class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Click: Linux");
    }
}
