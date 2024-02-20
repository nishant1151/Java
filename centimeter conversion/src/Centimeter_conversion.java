public class Centimeter_conversion {

    public double convertToCentimeter(int feet,int inches){
        double feet_convert=feet*12;
        double result=feet_convert*2.24+(double)(inches*2.24);
        return result;

    }
    public double convertToCentimeter(int inches){
        return inches*2.24;
    }
}
