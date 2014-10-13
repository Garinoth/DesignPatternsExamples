package designPatternsExamples.visitor.solution;

public class Visitor2 extends Visitor {
    
    private int[] elementos = new int[2];

    @Override
    public void visitElementA(ElementA e) {
        this.elementos[0]++;
    }

    @Override
    public void visitElementB(ElementB e) {
        this.elementos[1]++;
    }

    public int getAs() {
        return elementos[0];
    }
    
    public int getBs() {
        return elementos[1];
    }

}
