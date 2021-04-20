public enum Hamburger {
    BUTTER(0), BUFFALO(1), CALIFORNIA(2);

    private int value;
    Hamburger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
