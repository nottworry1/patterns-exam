package com.example.factories;

import com.example.components.buttons.Button;
import com.example.components.buttons.WindowsButton;
import com.example.components.labels.Label;
import com.example.components.labels.WindowsLabel;
import com.example.components.panels.Panel;
import com.example.components.panels.WindowsPanel;
import com.example.components.windows.Window;
import com.example.components.windows.WindowsWindow;

public class WindowsComponentFactory extends ComponentFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }

    @Override
    public Panel createPanel() {
        return new WindowsPanel();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
