public enum RomArabNums {
    I("1", 1), II("2", 2), III("3", 3), IV("4", 4), V("5",5), VI("6",6), VII("7",7), VIII("8", 8), IX("9",9), X("10", 10);
    private String value;
    int key;
    RomArabNums(String value, int key){
        this.value = value;
        this.key = key;
    }
    String GetValue(){
        return value;
    }
    int GetKey(){
        return key;
    }
}
