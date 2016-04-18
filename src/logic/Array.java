package logic;

import java.util.ArrayList;

/**
 * Created by Paul on 10.04.2016.
 */
public class Array extends AbstractAlgorithm {
    ArrayList<Integer> graph;

    Array() {
        graph = new ArrayList<>();
    }

    @Override
    public void make(Integer x) throws Exception {
        graph.add(x, x);
    }

    @Override
    public void union(Integer x, Integer y) {
        for (int i = 0; i < graph.size(); i++) {
            if (x > y) {
                if (graph.get(i) == y)
                    graph.set(i, x);
            } else if (graph.get(i) == x)
                graph.set(i, y);
        }
    }

    @Override
    public Integer find(Integer x) {
        return graph.get(x);
    }
}
