public class EURConverter {
    private static EURConverter instance;
    private double bynValue;

    private EURConverter(){

    }

    public static EURConverter getInstance(){
        if (instance == null){
            instance = new EURConverter();
        }

        return instance;
    }

    public void setBynValue(double bynValue){
        this.bynValue = bynValue;
    }

    public double getBynValue(){
        return bynValue;
    }

    public EURConverter(double bynValue){
        this.bynValue = bynValue;
    }

    public double convert(){
        return bynValue * 0.33;
    }
}
