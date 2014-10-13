package designPatternsExamples.visitor.solution;

public class Visitor2 extends Visitor {
    
    private static final int TIPOS_ELEMENTOS = 2;
    
    private int[] elementos = new int[TIPOS_ELEMENTOS];

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
