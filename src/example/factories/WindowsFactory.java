package example.factories;

import example.buttons.Button;
import example.buttons.WindowsButton;
import example.checkbox.Checkbox;
import example.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
