package com.endava.javaInternship;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class OperationsOnNumbers {
    private AppProperties appProperties = new AppProperties();
    private final Properties props = appProperties.loadProps("app.properties");

    public void parseAllValues() {

        Set<String> keys = props.stringPropertyNames();
        String value;

        for (String key : keys) {
            {
                value = props.getProperty(key);
                try {
                    int intValue = Integer.parseInt(value);
                    System.out.println(key + " " + intValue + " is an integer value");
                    System.out.println("========================================");
                } catch (NumberFormatException e) {
                    try {
                        double doubleValue = Double.parseDouble(value);
                        System.out.println(key + " " + doubleValue + " is a double value.");
                        System.out.println("========================================");
                    } catch (NumberFormatException e1) {
                        System.out.println(key + " " + value + " is neither int nor double.");
                        System.out.println(e.getMessage());
                        System.out.println("=========================================");
                    }
                }
            }
        }
    }

    public double parseDoubleValue(String key) {
        String value = props.getProperty(key);
        try {
            double doubleValue = Double.parseDouble(value);
            return doubleValue;
        } catch (NumberFormatException e) {
            System.out.println("This is not a double");
            System.out.println(e.getMessage());
            return -1;
        }catch (NullPointerException e) {
            System.out.println("You've enetered the wrong key.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public int parseIntValue(String key) {
        String value = props.getProperty(key);
        try {
            int intValue = Integer.parseInt(value);
            return intValue;
        } catch (NumberFormatException e) {
            System.out.println("This is not a double");
            System.out.println(e.getMessage());
            return -1;
        } catch (NullPointerException e) {
            System.out.println("You've enetered the wrong key.");
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public double divideNumbers(int i, double d) {
        try {
            return i / d;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed. Please, provide another value for the second number.");
            return -1;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return -2;
        }
    }
}
