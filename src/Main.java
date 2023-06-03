import example.app.Application;
import example.factories.GUIFactory;
import example.factories.LinuxFactory;
import example.factories.MacOSFactory;
import example.factories.WindowsFactory;

public class Main {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        factory = switch (osName) {
            case "mac" -> new MacOSFactory();
            case "linux" -> new LinuxFactory();
            default -> new WindowsFactory();
        };
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}