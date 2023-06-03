package example.factories;

import example.buttons.Button;
import example.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
