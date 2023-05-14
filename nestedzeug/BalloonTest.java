package nestedzeug;

public class BalloonTest {

    public static void main(String[] args) {
        Balloon neuerBalloon = new Balloon.BalloonBuilder("Heißluftballon").payload(700)
                .manufacturer("Dingens").color("Braun").price(2000).build();
    }
}
