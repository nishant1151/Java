public class Area_calculator {

        double pi;

        public Area_calculator(){
            pi=3.14;
        }
        public double area(double radius){
            if(radius>0){

                return  pi*radius*radius;

            }
            else{
                return -1;
            }
        }
        public double area(double length,double breadth){
            if(length>0 && breadth>0){
                return length*breadth;
            }
            else{
                return -1;
            }
        }
    }

}
