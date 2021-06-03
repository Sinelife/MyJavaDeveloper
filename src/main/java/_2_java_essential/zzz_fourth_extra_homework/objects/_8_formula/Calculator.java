package _2_java_essential.zzz_fourth_extra_homework.objects._8_formula;

import java.util.*;

public class Calculator {

    public String getFormulaString(Double[] numbers, Character[] operations) {
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            res += (i == numbers.length - 1) ? numbers[i] : numbers[i] + " " + operations[i] + " ";
        }
        return res;
    }

    public String getFormulaString(Double[] numbers, Character operation) {
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            res += (i == numbers.length - 1) ? numbers[i] : numbers[i] + " " + operation + " ";
        }
        return res;
    }

    public Double evaluate(String expression) {
        List<String> list = getListFromExpression(expression);
        for (String operation : Arrays.asList("/", "*", "+")) {
            makeAllExpressionsWithChosenOperation(list, operation);
        }
        return Double.parseDouble(list.get(0));
    }

    private List<String> getListFromExpression(String expression) {
        List<String> list = new ArrayList<>(Arrays.asList(expression.split(" ")));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("-")) {
                list.set(i, "+");
                String elem = list.get(i + 1);
                list.set(i + 1, elem.contains("-") ? elem.substring(1) : "-" + elem);
            }
        }
        return list;
    }

    private void makeAllExpressionsWithChosenOperation(List<String> list, String operation) {
        int i = 0;
        while(list.contains(operation)) {
            i = i + 1 >= list.size() ? 0 : i;
            if (list.get(i).equals(operation)) {
                Double res = getOperationResult(list.get(i - 1), list.get(i + 1), list.get(i));
                list.remove(i - 1);
                list.remove(i - 1);
                list.remove(i - 1);
                list.add(i - 1, String.valueOf(res));
                i--;
            }
            i++;
        }
    }

    private Double getOperationResult(String paramA, String paramB, String op) {
        double a = Double.parseDouble(paramA);
        double b = Double.parseDouble(paramB);
        return op.equals("/") ? a / b : op.equals("*") ? a * b : a + b;
    }
}