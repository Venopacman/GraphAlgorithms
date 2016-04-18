package logic;

import java.util.ArrayList;


/**
 * Created by Paul on 10.04.2016.
 */
public class Tree extends AbstractAlgorithm {
    ArrayList<Integer> graph;

    Tree() {
        graph = new ArrayList<>();
    }

    @Override
    public void make(Integer x) throws Exception {
            graph.add(x, x);
    }

    @Override
    public void union(Integer x, Integer y) throws Exception {
            graph.set(x, graph.get(y));
    }

    @Override
    public Integer find(Integer x) {
        while (graph.get(x) != x)
            x = graph.get(x);
        return graph.get(x);
    }
}