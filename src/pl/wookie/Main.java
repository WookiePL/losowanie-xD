package pl.wookie;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    private enum Person {
        Patryczke,
        Opos,
        Wookie
    }

    public static void main(String[] args) {
        int min = 0;
        System.out.println("minimum to:" + min);
        int max = 2;
        System.out.println("maximum to:" + max);

        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("wylosowano:" + randomNum);

        List<Person> values = Arrays.asList(Person.values());
        System.out.println("Patryczke ma numer " + Person.Patryczke.ordinal());
        System.out.println("Opos ma numer " + Person.Opos.ordinal());
        System.out.println("Wookie ma numer " + Person.Wookie.ordinal());
        System.out.println(values.get(randomNum));

    }
}
