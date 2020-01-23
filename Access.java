//package defaultPackage;
public class Access {
    public static void message(){
        System.out.println("This is a message");
    }

    public static void main(String[] args) {
        message();
        Data d = new Data();
        d.setName("Programiz");
        System.out.println(d.getName());
    }
}

//this is an example of private access modifiers
class Data {
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name1) {
        this.name = name1;

    }
}

