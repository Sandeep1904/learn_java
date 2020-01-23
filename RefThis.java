class RefThis {
    int instVar;

    RefThis(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = "+ this);
    }

    public static void main(String[] args) {
        RefThis xe = new RefThis(23423);
        System.out.println("object reference = " + xe);
    }


}