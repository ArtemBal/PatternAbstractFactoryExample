package example.factories;

import example.buttons.Button;
import example.buttons.LinuxButton;
import example.checkbox.Checkbox;
import example.checkbox.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
