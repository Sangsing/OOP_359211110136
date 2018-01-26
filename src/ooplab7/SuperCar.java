package ooplab7;

// Instance variable ของ super car คือ
// car brand ,
// car color,
// car engine size,
// max speed และ
// country of origin และ SuperCar Class

public class SuperCar {
    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforgin;

    public SuperCar(){}
    public SuperCar(String brand, String color, String size, String speed, String origin) {
        this.carbrand = brand;
        this.carcolor = color;
        this.carenginesize = size;
        this.maxspeed = speed;
        this.countryoforgin = origin;

    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carenginesize='" + carenginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforgin='" + countryoforgin + '\'' +
                '}';
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforgin() {
        return countryoforgin;
    }

    public void setCountryoforgin(String countryoforgin) {
        this.countryoforgin = countryoforgin;
    }

    public String getSuperCarInfo(){
        return getSuperCarInfo();
    }

}//class