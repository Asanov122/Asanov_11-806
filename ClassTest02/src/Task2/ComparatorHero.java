package Task2;

import java.util.Comparator;

public class ComparatorHero implements Comparator<hero> {
    @Override
    public int compare(Hero n1, Hero n2) {
        if(n1.getManaPool() > n2.getManaPool()){
            return 1;
        }else if(n1.getManaPool() < n2.getManaPool()){
            return -1;
        }else{
            return 0;
        }
    }
}

