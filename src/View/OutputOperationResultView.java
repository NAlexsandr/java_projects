package View;

public class OutputOperationResultView {
    private final double result;


    public OutputOperationResultView(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Результат операции" +
                " = " + result;
    }
}
