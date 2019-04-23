import java.util.*;
import Task2.ComparatorHero;
import Task2.Hero;
import Task3.ThreadReader;
public class Main {
    public static void task2() {
        Comparator<Hero> healthHero = new Comparator<Hero>() {
            @Override
            public int compare(Hero n1, Hero n2) {
                return Integer.compare(n1.getHealth(), n2.getHealth());
            }
        };
        ArrayList<Hero> heros = new ArrayList<>();
        heros.add(new Hero(9, 3, "Paladin"));
        heros.add(new Hero(3, 9, "Mag"));
        heros.add(new Hero(7, 5, "Knight"));
        heros.add(new Hero(6, 6, "Runner"));
        Collections.sort(heros, healthHero);
        for (Hero h1 : heros) { System.out.println(h1.toString()); }
        ComparatorHeros cm = new ComparatorHeros();
        for (Hero h1 :heros) {
            for (Hero h2 : heros) {
                cm.compare(h1, h2); } }
        for (Heros h1 : heros) { System.out.println(h1.toString()); } }



    public static void task3() {
        ThreadReader tr = new ThreadReader();
        tr.start();
    }
    public static void main(String[] args) {
        task2();
        task3();
    }
}
