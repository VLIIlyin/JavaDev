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

    public void setBynValue(double _bynValue){
        bynValue = _bynValue;
    }

    public double getBynValue(){
        return bynValue;
    }

    public USDConverter(double _bynValue){
        bynValue = _bynValue;
    }

    public double convert(){
        return bynValue * 0.38;
    }
}
