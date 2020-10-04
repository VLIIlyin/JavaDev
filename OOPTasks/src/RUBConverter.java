public class RUBConverter {
    private static RUBConverter instance;
    private double bynValue;

    private RUBConverter(){

    }

    public static RUBConverter getInstance(){
        if (instance == null){
            instance = new RUBConverter();
        }

        return instance;
    }

    public void setBynValue(double _bynValue){
        bynValue = _bynValue;
    }

    public double getBynValue(){
        return bynValue;
    }

    public RUBConverter(double _bynValue){
        bynValue = _bynValue;
    }

    public double convert(){
        return bynValue * 29.81;
    }
}
