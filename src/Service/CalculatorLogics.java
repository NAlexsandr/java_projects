package Service;

public class CalculatorLogics {
    private double  firstNumber;
    private double secondNumber;

    public CalculatorLogics(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public CalculatorLogics() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double additionNumbers(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
    public double subtractionNumbers(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }
    public double multiplicationNumbers(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
}
