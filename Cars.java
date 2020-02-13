class Cars {
    public Cars(){
        System.out.println("Class cars");
    }
    public void vehicalType(){
        System.out.println("Vehical type: car");
    }
    class Maruti extends Cars{
        public Maruti(){
            System.out.println("class Maruti");

        }
        public void brand(){
            System.out.println("brand maruti");

        }
        public void speed1(){
            System.out.println("Max: 90kmph");
        }
    }
    public class Maruti800 extends Maruti{
        public Maruti800(){
            System.out.println("model number 800");
        }
        public void speed(){
            System.out.println("ma 80kmph");
        }

        public static void main(String[] args) {
            Maruti800 obj = new Maruti800();
            obj.vehicalType();
            obj.brand();
            obj.speed();
        }
    }
}