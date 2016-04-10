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
        if (!graph.contains(x)) {
            graph.add(x, x);
        } else throw new Exception("This element already exist!");
    }

    @Override
    public void union(Integer x, Integer y) throws Exception {
            graph.set(x, graph.get(y));
    }

    @Override
    public Integer find(Integer buff) {
        int x = buff;
        while (graph.get(x) != x)
            x = graph.get(x);
        return graph.get(x);
    }
}