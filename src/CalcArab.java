public class CalcArab {
    String operator;
    int arg1;
    int arg2;
    int res;

    CalcArab(String operator, int arg1, int arg2) {
        this.operator = operator;
        this.arg1 = arg1;
        this.arg2 = arg2;
        switch (this.operator) {
            case "+" -> addition();
            case "-" -> subtraction();
            case "*" -> multiplication();
            case "/" -> division();
        }
    }

    int GetRes(){
        return res;
    }

    void addition() {
        res = arg1 + arg2;
    }

    void subtraction() {
        res = arg1 - arg2;
    }

    void multiplication() {
        res = arg1 * arg2;
    }
    void division() {
        res = arg1 / arg2;
    }
    double GetDivRes(){
        double x = arg1;
        return x / arg2;
    }
}
