public class USDConverter implements Converter{
    private static USDConverter instance;
    private double bynValue;

    private USDConverter(){

    }

    public static USDConverter getInstance(){
        if (instance == null){
            instance = new USDConverter();
        }

        return instance;
    }

    public void setBynValue(double bynValue){
        this.bynValue = bynValue;
    }

    public double getBynValue(){
        return bynValue;
    }

    public USDConverter(double bynValue){
        this.bynValue = bynValue;
    }

    public double convert(){
        return bynValue * 0.38;
    }
}
