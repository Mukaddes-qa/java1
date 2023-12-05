public class TemperatureImpl implements Temperature{
    private double defaultTemp=0.0;

    public double Temperature(double defaultTemp){
        return this.defaultTemp=defaultTemp;
    }
    @Override
    public double getCurrentTemp() {
        return defaultTemp;
    }

    @Override
    public double getCurrentWindDirection() {
        return 0;
    }

    @Override
    public double getCurrentHumidity() {
        return 0;
    }

    @Override
    public double getCurrentPrecipitation() {
        return 0;
    }

    public double getWind(double wind){
        return  this.getCurrentWindDirection();
    }

    public double getHumidity(double humidity){
        return  this.getCurrentHumidity();
    }
    public double getPrecipitation(double Precipitation){
        return  this.getCurrentPrecipitation();
    }


}
