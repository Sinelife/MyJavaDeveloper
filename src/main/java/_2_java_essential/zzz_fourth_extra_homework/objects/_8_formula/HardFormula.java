package _2_java_essential.zzz_fourth_extra_homework.objects._8_formula;

public class HardFormula extends Formula {
    private Double[] numbers;
    private Character[] operations;

    public HardFormula(Double[] numbers, Character[] operations) {
        this.numbers = numbers;
        this.operations = operations;
        this.result = getCountedFormulaResult();
    }

    @Override
    public Double getCountedFormulaResult() {
        return calculator.evaluate(calculator.getFormulaString(numbers, operations));
    }

    public HardFormula() { }

    @Override
    public String toString() {
        String res = "Hard(";
        for (int i = 0; i < numbers.length; i++) {
            res += (i == numbers.length - 1) ? numbers[i] : numbers[i] + " " + operations[i] + " ";
        }
        return res + " = " + result + ")\n";
    }

    @Override
    public Formula getGeneratedElem() {
        Integer size = service.getGeneratedInteger(4, 12);
        return new HardFormula(
                getGeneratedNumberArray(size),
                getGeneratedCharArray(size - 1)
        );
    }
}
