package nl.tkeur;

import javax.inject.Inject;

public class Main {

    @Inject UserService userService;

    private MainComponent component;

    Main() {
        component = DaggerMainComponent.builder().build();
        component.inject(this);
    }

    void start() {
        userService.printUsers();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
