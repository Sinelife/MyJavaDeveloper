package _2_java_essential.zzz_fourth_extra_homework.objects._8_formula;

public class EasyFormula extends Formula {
    private Double a;
    private Double b;
    private Character op;

    public EasyFormula(Double a, Double b, Character op) {
        this.a = a;
        this.b = b;
        this.op = op;
        this.result = getCountedFormulaResult();
    }

    public EasyFormula() { }

    @Override
    public Double getCountedFormulaResult() {
        return op == '+' ? a + b : op == '-' ? a - b : op == '*' ? a * b : a / b;
    }

    @Override
    public String toString() {
        return "Easy(" + a + " " + op + " " + b + " = " + result + ")\n";
    }

    @Override
    public Formula getGeneratedElem() {
        return new EasyFormula(
                service.getGeneratedDouble(-100, 100),
                service.getGeneratedDouble(-100, 100),
                service.getGeneratedCharFromCharArray(new Character[] {'+', '-', '*', '/'})
        );
    }
}
