public class OutputData {

    void OutputData(String[] array, String NumSys){
        if (NumSys == "Rom"){
            int x = new CalcArab(array[1], RomArabNums.valueOf(array[0]).GetKey(), RomArabNums.valueOf(array[2]).GetKey()).GetRes();
            if ( x < 0){
                System.out.println("-"+NumberConvertManager.transform_number_to_roman_numeral(-x));
            }
            else if (x == 0){
                System.out.println("0");
            }
            else {
                System.out.print(NumberConvertManager.transform_number_to_roman_numeral(x));
            }
        }
        if (NumSys == "Arab"){
            if (array[1].equals("/")) {
                double x = new CalcArab(" ", Integer.parseInt(array[0]), Integer.parseInt(array[2])).GetDivRes();
                System.out.println(x);

            }
            else {
                int x = new CalcArab(array[1], Integer.parseInt(array[0]), Integer.parseInt(array[2])).GetRes();
                System.out.println(x);

            }
        }
    }
}
