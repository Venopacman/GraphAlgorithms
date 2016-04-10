import logic.AbstractAlgorithm;
import logic.Array;
import logic.Realization;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Paul on 10.04.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        ArrayList<Integer> randArray = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            randArray.add(i, rand.nextInt(999999));
        }

        AbstractAlgorithm alg1 = AbstractAlgorithm.getInstance(Realization.ARRAY);
        AbstractAlgorithm alg2 = AbstractAlgorithm.getInstance(Realization.ARRAY);
        AbstractAlgorithm alg3 = AbstractAlgorithm.getInstance(Realization.ARRAY);
        AbstractAlgorithm alg4 = AbstractAlgorithm.getInstance(Realization.ARRAY);
        long timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            alg1.make(i);
        }
        for (int i = 0; i < 500; i++) {
            alg1.union(i, 99);
        }
        for (int i = 0; i < 500; i++) {
            alg1.find(randArray.get(i) % 500);
        }
        long timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 500: " + (timeStopForArray - timeStartForArray));
        ///////////////////////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            alg2.make(i);
        }
        for (int i = 0; i < 5000; i++) {
            alg2.union(i, 99);
        }
        for (int i = 0; i < 5000; i++) {
            alg2.find(randArray.get(i) % 5000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 5000: " + (timeStopForArray - timeStartForArray));
        ///////////////////////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            alg3.make(i);
        }
        for (int i = 0; i < 50000; i++) {
            alg3.union(i, 99);
        }
        for (int i = 0; i < 50000; i++) {
            alg3.find(randArray.get(i) % 50000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 50000: " + (timeStopForArray - timeStartForArray));

    }
}
