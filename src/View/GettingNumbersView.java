package View;

import java.util.Scanner;

public class GettingNumbersView {
    private double  firstNumber;
    private double secondNumber;
    private String operation;

    public GettingNumbersView() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.operation = null;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public String getOperation() {
        return operation;
    }

    public void GettingNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        firstNumber = in.nextDouble();

        System.out.print("Введите второе число: ");
        secondNumber = in.nextDouble();
        System.out.print("Введите одну из математических операций:  +  -  * : ");
        operation = in.next();
        while (!(operation.equals("+")) && !(operation.equals("-")) & !(operation.equals("*"))) {
            System.out.print("Вы ввели неправильную операцию, введите еще раз:  +  -  * : ");
            operation = in.next();
        }

    }
}
