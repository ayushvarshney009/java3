class shape{
    int length;
    int breadth;
    shape(int l , int b){
        this.breadth=b;
        this.length=l;
    }
    public int area(){
        return length*breadth ;

    }
}

public class Rectangle {


    public static void main(String[] args) {


     shape obj = new shape(4,5);
     shape obj1 = new shape(5 ,8);
        System.out.println(obj.area());
        System.out.println(obj1.area());

    }
}
