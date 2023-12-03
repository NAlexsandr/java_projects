package Controler;

import Service.CalculatorLogics;
import View.GettingNumbersView;
import View.OutputOperationResultView;

public class Controler {

    private double firstNumber;
    private double secondNumber;
    private String operation;

    public Controler() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.operation = null;
    }

    CalculatorLogics calculator = new CalculatorLogics();
    GettingNumbersView gettingNumbersView = new GettingNumbersView();

   public void GetNumbersPlusOperation(){
       gettingNumbersView.GettingNumbers();
       firstNumber = gettingNumbersView.getFirstNumber();
       secondNumber = gettingNumbersView.getSecondNumber();
       operation = gettingNumbersView.getOperation();
   }
   public double ResultOperation(){
       if (operation.equals("+")) {return calculator.additionNumbers(firstNumber,secondNumber);};
       if (operation.equals("-")){return calculator.subtractionNumbers(firstNumber,secondNumber);};
       if (operation.equals("*")){return calculator.multiplicationNumbers(firstNumber,secondNumber);};
       return 0;
   }
   public void OutputResultView(){
       OutputOperationResultView outputOperationResultView = new OutputOperationResultView(ResultOperation());
       System.out.println(outputOperationResultView.toString());
   }
}
