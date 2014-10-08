package designPatternsExamples.composite.solution;

public class Leaf extends TreeNumbers {
    
    private int number;

    public Leaf(int number) {
        this.number = number;
    }

    @Override
    public void add(TreeNumbers component) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void remove(TreeNumbers component) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public int numberOfNodes() {
        return 1;
    }

    @Override
    public int sum() {
        return this.number;
    }

    @Override
    public int higher() {
        return this.number;
    }

}
