public class Zad3 {

    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.chanel(1);

        remote.volume(5);

        remote.on(1);
        remote.on(0);


    }
}