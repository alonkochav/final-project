package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;
import utilities.Log;

import java.util.LinkedList;

public class DesktopFlows extends CommonOps {

    @Step("Count digits in input")
    public static int getCountOfDouble(double n) {
        int count = getDigitsOfDouble(n)[0].length();
        return count;
    }

    @Step("Count digits in input")
    public static int getCountOfFraction(double n) {
        int count = getDigitsOfDouble(n)[1].length();
        return count;
    }

    @Step("Return digits of input as String Array")
    public static String[] getDigitsOfDouble(double n) {
        String[] nString = Double.toString(n).split("\\.");
        return nString;
    }

    @Step("Return digits of input as String Array")
    public static String[] getFractions(double n) {
        String[] nString = Double.toString(n).split("\\.");
        return nString;
    }

    public static void digitByDigit(double n) {
        for (int i = 0; i < getCountOfDouble(n); i++) {
            getCalcButtonObjects(getDigitsOfDouble(n)[0].toCharArray()[i]);
        }
        if (n % 1 != 0) {
            UIActions.clickNoWait(calcMain.getBtnPoint());
            for (int i = 0; i < getCountOfFraction(n); i++) {
                getCalcButtonObjects(getDigitsOfDouble(n)[1].charAt(i));
            }
        }
        if (n<0) {
            UIActions.clickNoWait(calcMain.getBtnPolarity());
        }
    }

    @Step("Calculate input operation of two numbers: a ? b ")
    public static void calculateAny(double a, char o, double b) {
        UIActions.clickNoWait(calcMain.getBtnClear());
        digitByDigit(a);
        getCalcButtonOperations(o);
        digitByDigit(b);
        UIActions.clickNoWait(calcMain.getBtnEquals());
    }

    @Step("Retrieve number digit and click relative button")
    public static void getCalcButtonObjects(char n) {
        switch (n) {
            case '0':
                UIActions.clickNoWait(calcMain.getBtnZero());
                break;
            case '1':
                UIActions.clickNoWait(calcMain.getBtnOne());
                break;
            case '2':
                UIActions.clickNoWait(calcMain.getBtnTwo());
                break;
            case '3':
                UIActions.clickNoWait(calcMain.getBtnThree());
                break;
            case '4':
                UIActions.clickNoWait(calcMain.getBtnFour());
                break;
            case '5':
                UIActions.clickNoWait(calcMain.getBtnFive());
                break;
            case '6':
                UIActions.clickNoWait(calcMain.getBtnSix());
                break;
            case '7':
                UIActions.clickNoWait(calcMain.getBtnSeven());
                break;
            case '8':
                UIActions.clickNoWait(calcMain.getBtnEight());
                break;
            case '9':
                UIActions.clickNoWait(calcMain.getBtnNine());
                break;
            default:
                Log.info("Not found");
                break;
        }
    }

    @Step("Retrieve operation character and click relative button")
    public static void getCalcButtonOperations(char o) {
        switch (o) {
            case '+':
                UIActions.clickNoWait(calcMain.getBtnPlus());
                break;
            case '-':
                UIActions.clickNoWait(calcMain.getBtnMinus());
                break;
            case '*':
                UIActions.clickNoWait(calcMain.getBtnMultiply());
                break;
            case '/':
                UIActions.clickNoWait(calcMain.getBtnDivide());
                break;

            // Default case
            default:
                Log.info("Operation Not found");
        }
    }

    @Step("Calculate Addition of two numbers: a + b ")
    public static void calculateAddition(double a, double b) {
        Log.info("Double a is " + a);
        Log.info("Double b is "+ b);
        calculateAny(a, '+', b);
    }

    @Step("Calculate Subtraction of two numbers: a - b ")
    public static void calculateSubtraction(double a, double b) {
        Log.info("Double a is " + a);
        Log.info("Double b is "+ b);
        calculateAny(a,'-',b);
    }

    @Step("Calculate Multiplication of two numbers: a * b ")
    public static void calculateMultiplication(double a, double b) {
        Log.info("Double a is " + a);
        Log.info("Double b is "+ b);
        calculateAny(a,'*',b);

    }

    @Step("Calculate Division of two numbers: a / b ")
    public static void calculateDivision(double a, double b) {
        Log.info("Double a is " + a);
        Log.info("Double b is "+ b);
        calculateAny(a,'/',b);

    }

}
