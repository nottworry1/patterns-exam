package com.example.factories;

import com.example.components.buttons.Button;
import com.example.components.labels.Label;
import com.example.components.panels.Panel;
import com.example.components.windows.Window;

public abstract class ComponentFactory {
    protected ComponentFactory() {}

    public abstract Button createButton();
    public abstract Label createLabel();
    public abstract Panel createPanel();
    public abstract Window createWindow();

    public static ComponentFactory create(ComponentFactoryType factoryType) {
        return switch (factoryType) {
            case LINUX -> new LinuxComponentFactory();
            case WINDOWS -> new WindowsComponentFactory();
        };
    }
}
