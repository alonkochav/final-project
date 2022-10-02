package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;
import utilities.Log;

import java.util.LinkedList;

public class DesktopFlows extends CommonOps {



    public static void getCalcButtonObjects(int n) {
        switch (n) {
            case 0:
                UIActions.click(calcMain.getBtnZero());
            break;
            case 1:
                UIActions.click(calcMain.getBtnOne());
            break;
            case 2:
                UIActions.click(calcMain.getBtnTwo());
                break;
            case 3:
                UIActions.click(calcMain.getBtnThree());
                break;
            case 4:
                UIActions.click(calcMain.getBtnFour());
                break;
            case 5:
                UIActions.click(calcMain.getBtnFive());
                break;
            case 6:
                UIActions.click(calcMain.getBtnSix());
                break;
            case 7:
                UIActions.click(calcMain.getBtnSeven());
                break;
            case 8:
                UIActions.click(calcMain.getBtnEight());
                break;
            case 9:
                UIActions.click(calcMain.getBtnNine());
                break;

            // Default case
            default:
                Log.info("Not found");
        }
    }

    public static void getCalcButtonOperations(char o) {
        switch (o) {
            case '+':
                UIActions.click(calcMain.getBtnPlus());
                break;
            case '-':
                UIActions.click(calcMain.getBtnMinus());
                break;
            case '*':
                UIActions.click(calcMain.getBtnMultiply());
                break;
            case '/':
                UIActions.click(calcMain.getBtnDivide());
        }
    }

    public static LinkedList<Integer> getDigits(int n){
        LinkedList<Integer> stack = new LinkedList<>();
        while (n > 0) {
            stack.push( n % 10 );
            n = n / 10;
        }
        return stack;
    }

    public static void getMultipleDigits(int n){
        LinkedList<Integer> stack = getDigits(n);
        while (!stack.isEmpty()){
            getCalcButtonObjects(stack.getFirst());
            stack.pop();
        }
    }

    public static void calculateAny(int a, char o, int b) {
        UIActions.click(calcMain.getBtnClear());
        if (getDigits(a).size() == 1) {
            getCalcButtonObjects(a);
        } else {
            getMultipleDigits(a);
        }

        getCalcButtonOperations(o);

        if (getDigits(b).size() == 1) {
            getCalcButtonObjects(b);
        } else {
            getMultipleDigits(b);
        }

        UIActions.click(calcMain.getBtnEquals());
        Log.info(calcMain.getFieldResult().getText());

    }

    @Step("Calculate Addition of two numbers: a + b ")
    public static void calculateAddition(int a, int b) {
        Log.info("Number a is " + a);
        Log.info("Number b is "+ b);

        calculateAny(a,'+',b);
    }

    @Step("Calculate Subtraction of two numbers: a - b ")
    public static void calculateSubtraction(int a, int b) {
        Log.info("Number a is " + a);
        Log.info("Number b is "+ b);

        calculateAny(a,'-',b);

    }

    @Step("Calculate Multiplication of two numbers: a * b ")
    public static void calculateMultiplication(int a, int b) {
        Log.info("Number a is " + a);
        Log.info("Number b is "+ b);

        calculateAny(a,'*',b);

    }

    @Step("Calculate Division of two numbers: a / b ")
    public static void calculateDivision(int a, int b) {
        Log.info("Number a is " + a);
        Log.info("Number b is "+ b);

        calculateAny(a,'/',b);

    }

}
