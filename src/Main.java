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
        for (int i = 0; i < 1000000; i++) {
            randArray.add(i, rand.nextInt(999999));
        }

        AbstractAlgorithm alg1 = AbstractAlgorithm.getInstance(Realization.TREE_MOD_2);
        AbstractAlgorithm alg2 = AbstractAlgorithm.getInstance(Realization.TREE_MOD_2);
        AbstractAlgorithm alg3 = AbstractAlgorithm.getInstance(Realization.TREE_MOD_2);
        AbstractAlgorithm alg4 = AbstractAlgorithm.getInstance(Realization.TREE_MOD_2);
        AbstractAlgorithm alg5 = AbstractAlgorithm.getInstance(Realization.TREE_MOD_2);
        AbstractAlgorithm alg6 = AbstractAlgorithm.getInstance(Realization.TREE_MOD_2);
        AbstractAlgorithm alg7 = AbstractAlgorithm.getInstance(Realization.TREE_MOD_2);
        long timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            alg1.make(i);
        }
        for (int i = 0; i < 1000; i++) {
            alg1.union(i, 500);
        }
        for (int i = 0; i < 1000; i++) {
            alg1.find(randArray.get(i) % 1000);
        }
        long timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 1000: " + (timeStopForArray - timeStartForArray));
        //////////////////1000/////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            alg2.make(i);
        }
        for (int i = 0; i < 5000; i++) {
            alg2.union(i, 500);
        }
        for (int i = 0; i < 5000; i++) {
            alg2.find(randArray.get(i) % 5000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 5000: " + (timeStopForArray - timeStartForArray));
        ///////////////////5000////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            alg3.make(i);
        }
        for (int i = 0; i < 10000; i++) {
            alg3.union(i, 500);
        }
        for (int i = 0; i < 10000; i++) {
            alg3.find(randArray.get(i) % 10000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 10000: " + (timeStopForArray - timeStartForArray));
        ///////////////////10000////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            alg4.make(i);
        }
        for (int i = 0; i < 50000; i++) {
            alg4.union(i, 500);
        }
        for (int i = 0; i < 50000; i++) {
            alg4.find(randArray.get(i) % 50000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 50000: " + (timeStopForArray - timeStartForArray));
        //////////////////50000/////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            alg5.make(i);
        }
        for (int i = 0; i < 100000; i++) {
            alg5.union(i, 500);
        }
        for (int i = 0; i < 100000; i++) {
            alg5.find(randArray.get(i) % 100000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 100000: " + (timeStopForArray - timeStartForArray));
        ///////////////////100000////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            alg6.make(i);
        }
        for (int i = 0; i < 500000; i++) {
            alg6.union(i, 500);
        }
        for (int i = 0; i < 500000; i++) {
            alg6.find(randArray.get(i) % 500000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 500000: " + (timeStopForArray - timeStartForArray));
        ///////////////////500000////////////////////
        timeStartForArray = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            alg7.make(i);
        }
        for (int i = 0; i < 1000000; i++) {
            alg7.union(i, 500);
        }
        for (int i = 0; i < 1000000; i++) {
            alg7.find(randArray.get(i) % 1000000);
        }
        timeStopForArray = System.currentTimeMillis();
        System.out.println("Time for all methods for Tree with one euristic algorithm for 1000000: " + (timeStopForArray - timeStartForArray));
        ///////////////////1000000////////////////////

    }
}
