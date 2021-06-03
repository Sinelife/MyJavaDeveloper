package _2_java_essential.zzz_fourth_extra_homework.objects._8_formula;

public class MediumFormula extends Formula{
    private Double[] numbers;
    private Character operation;

    public MediumFormula(Double[] numbers, Character operation) {
        this.numbers = numbers;
        this.operation = operation;
        this.result = getCountedFormulaResult();
    }

    @Override
    public Double getCountedFormulaResult() {
        return calculator.evaluate(calculator.getFormulaString(numbers, operation));
    }

    public MediumFormula() { }

    @Override
    public String toString() {
        String res = "Medium(";
        for (int i = 0; i < numbers.length; i++) {
            res += (i == numbers.length - 1) ? numbers[i] : numbers[i] + " " + operation + " ";
        }
        return res + " = " + result + ")\n";
    }

    @Override
    public Formula getGeneratedElem() {
        return new MediumFormula(
                getGeneratedNumberArray(service.getGeneratedInteger(3, 12)),
                service.getGeneratedCharFromCharArray(new Character[]{'+', '-', '*', '/'})
        );
    }
}
