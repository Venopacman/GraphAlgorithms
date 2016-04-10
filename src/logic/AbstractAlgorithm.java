package logic;

/**
 * Created by Paul on 10.04.2016.
 */
public abstract class AbstractAlgorithm {
   public static AbstractAlgorithm getInstance(Realization realization) {
        switch (realization) {
            case ARRAY:
                return new Array();
            case TREE:
                return new Tree();
            case TREE_MOD_1:
                return new TreePlusEuristic();
            case TREE_MOD_2:
                return new TreePlusPathMinimize();
            default:
                return null;
        }
    }

    public void make(Integer x) throws Exception {
    }

    public void union(Integer x, Integer y) throws Exception {
    }

    public Integer find(Integer x) {
        return 0;
    }
}
