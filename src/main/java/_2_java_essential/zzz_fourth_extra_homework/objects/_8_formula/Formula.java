package _2_java_essential.zzz_fourth_extra_homework.objects._8_formula;

import _2_java_essential.zzz_fourth_extra_homework.objects.AbstractEntity;

public class Formula extends AbstractEntity<Formula> {
    protected Double result;

    public Formula() {}

    public Double getResult() {
        return result;
    }

    public Double getCountedFormulaResult() {
        return 0.0;
    }

    @Override
    public Formula getGeneratedElem() {
        Class[] classes = {EasyFormula.class, MediumFormula.class, HardFormula.class};
        Class clazz = classes[random.nextInt(classes.length)];
        Formula formula = null;
        try {
            formula = (Formula) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return formula.getGeneratedElem();
    }

    @Override
    public int compareTo(Formula o) {
        return this.result.compareTo(o.result);
    }

    protected Double[] getGeneratedNumberArray(Integer size) {
        Double[] array = new Double[size];
        for (int i = 0; i < size; i++) {
            array[i] = service.getGeneratedDouble(-100, 100);
        }
        return array;
    }

    protected Character[] getGeneratedCharArray(Integer size) {
        Character[] array = new Character[size];
        for (int i = 0; i < size; i++) {
            array[i] = service.getGeneratedCharFromCharArray(new Character[]{'+', '-', '*', '/'});
        }
        return array;
    }

    protected final static Calculator calculator = new Calculator();
}
