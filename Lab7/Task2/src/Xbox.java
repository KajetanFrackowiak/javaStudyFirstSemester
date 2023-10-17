public class Xbox extends GameConsole{
    @Override
    protected void playGame(Game game) {
        if (game.CD.equals("Xbox")) {
            System.out.println("Gra zostala uruchomiona");
        } else {
            System.out.println("Blad odczytu");
        }
    }
}
