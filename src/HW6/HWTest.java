package HW6;

import java.util.Random;

    public class HWTest {
        public static void main(String[] args) {
            Animal[] participants = {
            new Cat(),
            new Dog(),
            new Cat(300,3),
            new Dog(1000, 2, 100)
        };

        Random random = new Random() ;
        for (Animal participant : participants) {
            participant.printInfo();
            System.out.println(participant.run(random.nextInt(500)));
            System.out.println(participant.jump(random.nextInt(5)));
            System.out.println(participant.swim(random.nextInt(100)));
        }
    }
}
