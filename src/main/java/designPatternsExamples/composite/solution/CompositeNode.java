package designPatternsExamples.composite.solution;

import java.util.ArrayList;

public class CompositeNode extends TreeNumbers {

    private String name;

    private ArrayList<TreeNumbers> components;

    public CompositeNode(String name) {
        super();
        this.name = name;
        this.components = new ArrayList<TreeNumbers>();
    }

    @Override
    public void add(TreeNumbers component) {
        this.components.add(component);
    }

    @Override
    public void remove(TreeNumbers component) {
        this.components.remove(component);
    }

    @Override
    public int numberOfNodes() {
        return this.components.size();
    }

    @Override
    public int sum() {
        int res = 0;
        for (TreeNumbers treeNumbers : components) {
            res += treeNumbers.sum();
        }
        return res;
    }

    @Override
    public int higher() {
        int res = Integer.MIN_VALUE;
        for (TreeNumbers treeNumbers : components) {
            int higher = treeNumbers.higher();
            if (higher > res) {
                res = higher;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "CompositeNode[" + name + "]";
    }

}
