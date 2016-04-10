package logic;

import logic.AbstractAlgorithm;

import java.util.ArrayList;

/**
 * Created by Paul on 10.04.2016.
 */
public class TreePlusEuristic extends AbstractAlgorithm {
    ArrayList<Integer> graph;
    ArrayList<Integer> evristic;

    TreePlusEuristic() {
        graph = new ArrayList<>();
        evristic = new ArrayList<>();
    }

    @Override
    public void make(Integer x) throws Exception {
        if (!graph.contains(x)) {
            graph.add(x, x);
            evristic.add(x, 0);
        } else throw new Exception("This element already exist!");
    }

    @Override
    public void union(Integer x, Integer y) throws Exception {
        if (evristic.get(x) < evristic.get(y))
            graph.set(x, y);
        else if (evristic.get(x) > evristic.get(y))
            graph.set(y, x);
        else {
            graph.set(x, y);
            evristic.set(y, evristic.get(y) + 1);
        }
    }

    @Override
    public Integer find(Integer buff) {
        int x = buff;
        while (graph.get(x) != x)
            x = graph.get(x);
        return graph.get(x);
    }
}
