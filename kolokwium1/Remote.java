/*
Dodaj metody do klasy Remote które mogą:-zmieniać kanał w górę /
w dół ( w przedziale 1-20)-zmieniać głośność w górę / w dół (w przedziale 1-10)-włączać /
wyłączać telewizor
 */

public class Remote {
    TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }
    public void chanel(int channel) {
        if (tv.on) {
            System.out.println("Włącz najpierw telewizor");
        }
        if ( channel >= 1 && channel <= 20) {
            tv.chanel += channel;
        }
        System.out.println("kanał twoj teraz to numer : " + channel);
    }

    public void volume(int zmiana) {
        int obecny = 0;
        if (obecny + zmiana >= 1 & obecny + zmiana <=10) {
            obecny += zmiana;
        }
        System.out.println("glosnosc wynosi: " + obecny);
    }
    public void on(int a) {
        if(a == 1) {
            System.out.println("telewizor jest włączony");
        } else {
            System.out.println("telewizor jest wyłączony");
        }
    }
}
