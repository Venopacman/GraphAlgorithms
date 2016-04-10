package logic;

import logic.AbstractAlgorithm;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Paul on 10.04.2016.
 */
public class TreePlusPathMinimize extends AbstractAlgorithm {
    ArrayList<Integer> graph;
    ArrayList<Integer> rang;

    TreePlusPathMinimize() {
        graph = new ArrayList<>();
        rang = new ArrayList<>();
    }

    @Override
    public void make(Integer x) throws Exception {
        if (!graph.contains(x)) {
            graph.add(x, x);
            rang.add(x, 0);
        } else throw new Exception("This element already exist!");
    }

    @Override
    public void union(Integer x, Integer y) throws Exception {
        if (rang.get(x) < rang.get(y))
            graph.set(x, y);
        else if (rang.get(x) > rang.get(y))
            graph.set(y, x);
        else {
            graph.set(x, y);
            rang.set(y, rang.get(y) + 1);
        }
    }
// TODO the reason for temp1???
    @Override
   public Integer find(Integer x) {
        Integer temp = x;
        while (graph.get(x) != x)
            x = graph.get(x);
        Integer y = x;
        Integer temp1;
        while (graph.get(temp) != temp) {
            temp1 = temp;
            temp = graph.get(temp);
            graph.set(temp1, y);
        }
        return x;
    }
}
