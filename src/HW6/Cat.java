package HW6;

    public class Cat extends Animal {

        public static final int defaultMaxRunDistanse = 200;
        public static final int defaultMaxJumpHeight = 2;
        public static final int defaultMaxSwimDistanse = 0;

        public Cat(int maxRunDistanse, int maxJumpeHeight) {
            super(maxRunDistanse, maxJumpeHeight, defaultMaxSwimDistanse);
        }

        public Cat() {
            super(defaultMaxRunDistanse, defaultMaxJumpHeight,defaultMaxSwimDistanse);
        }

        @Override
        public boolean run(int distanse) {
            if (this.maxRunDistanse >= distanse) {
                System.out.printf("Кот пробежал дистанцию %d. Max = %d%n", distanse, maxRunDistanse);
                return true;
            }

            System.out.printf("Кот не смог пробежать дистанцию %d. Max = %d%n", distanse, maxRunDistanse);
            return false;
        }

        @Override
        public boolean swim (int distanse) {
            System.out.println("Кот не умеет плавать!");
            return false;
        }


        @Override
        public boolean jump(int height) {
            if (this.maxJumpeHeight >= height) {
                System.out.printf("Кот перепрыгнул препятствие %d. Max = %d%n", height, maxJumpeHeight);
                return true;
            }

            System.out.printf("Кот не смог перепрыгнуть препятствие %d. Max = %d%n", height, maxJumpeHeight);
            return false;
        }
    }
