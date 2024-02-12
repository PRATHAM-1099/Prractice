package DesignPatterns.Facade;

public class HomeTheaterFacade {
    CDPlayer cdPlayer;
    Amplifier amplifier;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(CDPlayer cdPlayer, Amplifier amplifier, Projector projector, Screen screen) {
        this.cdPlayer = cdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie() {
        cdPlayer.on();
        amplifier.on();
        screen.down();
        projector.play();
    }

    public void stopMovie() {
        cdPlayer.off();
        amplifier.off();
        screen.up();
        projector.stop();

    }
}
