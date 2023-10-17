public class Playstation extends GameConsole{
    @Override
    protected void playGame(Game game) {
        if (game.CD.equals("Playstation")) {
            System.out.println("Gra zostala uruchomiona");
        } else {
            System.out.println("Gra nie moze odczytac plyty");
        }
    }
}
