class Bank{
    int PA,time;
    static int no=0;
    static int roi=10;
    Bank(int p,int t)
    {
        no++;
        PA=p;time = t;
        if(no>10)
            Change2();
        else if(no >20)
            Change1();
        display();

    }
    static void Change1(){
        roi = 20;

    }
    static void Change2(){
        roi = 30;

    }
    void display(){
        int t= PA*roi*time;
        System.out.println("S.I ="+t/100);
    }
    public static void main(String[] args){
        Bank bl = new Bank(500,2);
        Bank b = new Bank(60000,7);
    }

}