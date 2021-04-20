public enum Hambuger {
    BUTTER(0), BUFFALO(1), CALIFORNIA(2);

    private int value;
    Hambuger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
