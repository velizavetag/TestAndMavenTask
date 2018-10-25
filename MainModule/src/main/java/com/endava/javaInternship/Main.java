package com.endava.javaInternship;

public class Main {
    private static AppProperties appProperties = new AppProperties();
    public static void main(String[] args) {

        OperationsOnNumbers operationsOnNumbers = new OperationsOnNumbers();
//        operationsOnNumbers.parseAllValues();
        int number1 =  operationsOnNumbers.parseIntValue("number1");
        double number2 = operationsOnNumbers.parseDoubleValue("number2");
        System.out.println(operationsOnNumbers.divideNumbers(number1,number2));

    }
}
