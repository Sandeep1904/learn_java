class Constructors {
//     this program also demonstrates constructor overloading.
    public Constructors(){
        System.out.println("this is a default constructor");
    }
    public Constructors(int a){
        System.out.println("this is a parameterized constructor");
    }
    public static void main(String[] args) {
        Constructors cons0 = new Constructors();
        Constructors cons1 = new Constructors(5);
    }
}