package com.example;

import com.example.components.buttons.Button;
import com.example.components.labels.Label;
import com.example.components.panels.Panel;
import com.example.components.windows.Window;
import com.example.factories.ComponentFactory;
import com.example.factories.ComponentFactoryType;

public class Main {
    public static void main(String[] args) {
        for (ComponentFactoryType factoryType : ComponentFactoryType.values()) {
            testComponents(ComponentFactory.create(factoryType));
        }
    }

    public static void testComponents(ComponentFactory factory) {
        Button button = factory.createButton();
        Label label = factory.createLabel();
        Panel panel = factory.createPanel();
        Window window = factory.createWindow();

        button.click();
        label.showText();
        panel.showButtons();
        window.showElements();
    }
}