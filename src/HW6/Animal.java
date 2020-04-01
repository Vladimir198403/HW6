package HW6;

public abstract class Animal {
    protected int maxRunDistanse;
    protected int maxJumpeHeight;
    protected int maxSwimDistanse;

    public Animal(int maxRunDistanse, int maxJumpeHeight, int maxSwimDistanse) {
        this.maxRunDistanse = maxRunDistanse;
        this.maxJumpeHeight = maxJumpeHeight;
        this.maxSwimDistanse = maxSwimDistanse;
    }

    public abstract boolean run(int distanse);

    public abstract boolean swim(int distanse);

    public abstract boolean jump(int height);

    public void printInfo() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "maxRunDistanse" + maxRunDistanse +
                ", maxJumpeHeight" + maxJumpeHeight +
                ", maxSwimDistanse" + maxSwimDistanse +
                "}";
    }
}

