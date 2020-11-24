package expulsion.secondaryExpulsion;

public enum SecondaryParameters {
    RANDOM,
    FULLMOON;

    private boolean isActive;

    public void setActive(boolean isActive){
        this.isActive = isActive;
    }

    public boolean getActive(){
        return isActive;
    }
}
