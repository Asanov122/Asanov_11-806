package Task2;

public class Hero {
    private int health;
    private int manaPool;
    private String name;

    public Laptop(int health, int manaPool, String name) {
        this.health = health;
        this.manaPool = manaPool;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getManaPool() {
        return manaPool;
    }

    public void setManaPool(int manaPool) {
        this.manaPool = manaPool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero: " + "health " + health + " manaPool=" + manaPool + " name='" + name + '\'';
    }


}

