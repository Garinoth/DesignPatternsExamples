package designPatternsExamples.composite.solution;

public abstract class TreeNumbers {

    public TreeNumbers() {
    }

    // Esta clase es parte de una librería pública para su distribución por
    // Internet
    public abstract void add(TreeNumbers component);
    public abstract void remove(TreeNumbers component);
    public abstract int numberOfNodes();
    public abstract int sum();
    public abstract int higher();
}
