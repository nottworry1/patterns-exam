package com.example.factories;

import com.example.components.buttons.Button;
import com.example.components.buttons.LinuxButton;
import com.example.components.labels.Label;
import com.example.components.labels.LinuxLabel;
import com.example.components.panels.LinuxPanel;
import com.example.components.panels.Panel;
import com.example.components.windows.LinuxWindow;
import com.example.components.windows.Window;

public class LinuxComponentFactory extends ComponentFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Label createLabel() {
        return new LinuxLabel();
    }

    @Override
    public Panel createPanel() {
        return new LinuxPanel();
    }

    @Override
    public Window createWindow() {
        return new LinuxWindow();
    }
}
