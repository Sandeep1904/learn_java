class Shape{
    int length;
    int breadth;
}

class Rectangle extends Shape {
    int area;
    public void claculateArea () {
        area = length*breadth;

    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 20;
        r.claculateArea();
        System.out.println("the area of the rectangle is: "+ r.area);
    }
}