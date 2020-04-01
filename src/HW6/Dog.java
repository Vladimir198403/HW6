package HW6;

public class Dog extends Animal {

    public static final int defaultMaxRunDistanse = 500;
    public static final int defaultMaxJumpHeight = 1;
    public static final int defaultMaxSwimDistanse = 10;

    public Dog(int maxRunDistanse, int maxJumpeHeight, int maxSwimDistanse) {
        super(maxRunDistanse, maxJumpeHeight, maxSwimDistanse);
    }

    public Dog() {
        super(defaultMaxRunDistanse, defaultMaxJumpHeight,defaultMaxSwimDistanse);
    }

    @Override
    public boolean run(int distanse) {
        if (this.maxRunDistanse >= distanse) {
            System.out.printf("Собака пробежала дистанцию %d. Max = %d%n", distanse, maxRunDistanse);
            return true;
        }

        System.out.printf("Собака не смогла пробежать дистанцию %d. Max = %d%n", distanse, maxRunDistanse);
        return false;
    }

    @Override
    public boolean swim(int distanse) {
        if (this.maxSwimDistanse >= distanse) {
            System.out.printf("Собака проплыла дистанцию %d. Max = %d%n", distanse, maxSwimDistanse);
            return true;
        }

        System.out.printf("Собака не смогла проплыть дистанцию %d. Max = %d%n", distanse, maxSwimDistanse);
        return false;
    }


    @Override
    public boolean jump(int height) {
        if (this.maxJumpeHeight >= height) {
            System.out.printf("Собака перепрыгнула препятствие %d. Max = %d%n", height, maxJumpeHeight);
            return true;
        }

        System.out.printf("Собака не смогла перепрыгнуть препятствие %d. Max = %d%n", height, maxJumpeHeight);
        return false;
    }
}