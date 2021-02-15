public class CorrectnessCheck {

    String expression;
    int len;
    String array[];
    String[] CorrArabNum = {"1", "2", "3","4", "5", "6", "7", "8","9", "10"};
    String[] CorrRomNum = {"I", "II", "III","IV", "V", "VI", "VII", "VII","IX", "X"};
    String NumSystem;

    CorrectnessCheck(String expression){
        this.expression = expression;
        this.array = expression.split(" ");
        this.len = array.length;
    }

    void Check(){

        try{
            if(len != 3){
                throw new Exception("Выражение должно состоять из двух аргументов и одной операции!");
            }
            try{
                String t = array[1];
                String arg1 = array[0];
                String arg2 = array[2];
                if(!t.equals("+") & !t.equals("-") & !t.equals("*") & !t.equals("/")){
                    throw new Exception("Допустимы только опреции '+', '-', '*' и '/' !");
                }

                try {
                    boolean IsArab = false;
                    for (String s : CorrArabNum) {
                        if (s.equals(arg1)) {
                            for (String value : CorrArabNum) {
                                if (value.equals(arg2)) {
                                    IsArab = true;
                                    NumSystem = "Arab";
                                    break;
                                }
                            }
                        }
                    }
                    boolean IsRom = false;
                    for (String s : CorrRomNum) {
                        if (s.equals(arg1)) {
                            for (String value : CorrRomNum) {
                                if (value.equals(arg2)) {
                                    IsRom = true;
                                    NumSystem = "Rom";
                                    break;
                                }
                            }
                        }
                    }

                    if (!IsRom & !IsArab) {
                        throw new Exception("В качестве аргументов допустимы только арабские и римские числа от 1 до 10 включительно,\nоба аргумента должны принадлежать одной системе счисления!");
                    }
                }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }


    }
    String GetNumSys(){
        return NumSystem;
    }
}
