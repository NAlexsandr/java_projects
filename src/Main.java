import Controler.Controler;
import Service.CalculatorLogics;

public class Main {

    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.GetNumbersPlusOperation();
        controler.ResultOperation();
        controler.OutputResultView();
    }
}