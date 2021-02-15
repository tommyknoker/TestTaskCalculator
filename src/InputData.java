import java.util.Scanner;
public class InputData {

    private String arr[];
    private String args[];
    private String operation[];

    void QueryInputData() {
        Scanner in = new Scanner(System.in);
        //System.out.println("\nвведите выражение: ");
        String expression = in.nextLine().trim();
        CorrectnessCheck obj = new CorrectnessCheck(expression);
        obj.Check();
        String[] array = expression.split(" ");
        this.arr = array;
        OutputData Out = new OutputData();
        Out.OutputData(array, obj.GetNumSys());
    }
}
