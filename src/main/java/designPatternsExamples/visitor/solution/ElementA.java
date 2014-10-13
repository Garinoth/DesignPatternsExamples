package designPatternsExamples.visitor.solution;

public class ElementA implements element {
    private String attributeA;

    public ElementA() {
        this.setAttributeA("A");
    }

    public String getAttributeA() {
        return this.attributeA;
    }

    public void setAttributeA(String attributeA) {
        this.attributeA = attributeA;
    }

    @Override
    public void accept(Visitor v) {
        v.visitElementA(this);
    }

}
