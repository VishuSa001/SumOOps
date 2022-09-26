// create a class Sum, 
// with method sum with return type int and parameter int x and int y and return addition of the two integers.
// create a method Sum with return type int and parameter int x, int y,int z and return addition of three integers.
// create sum method with with return type double and with parameter double x,double y
// and return addition of two numbers.
// create object of class and pass the values by calling method and print the output.

class Sum {
    int x;
    int y;
    int z;

    // create method x,y
    public int Sum() {
        return x + y;
    }
    // create a method Sum x,y,z

    public int Sum2() {
        return x + y + z;
    }

    // create double x ,y method
    public double Sum3() {
        return x + y;
    }

}

public class Add {
    public static void main(String[] args) {
        Sum vishu = new Sum();
        vishu.x = 7;
        vishu.y = 8;
        System.out.println(vishu.Sum());

        // create a object Sum2
        vishu.x = 94;
        vishu.y = 84;
        vishu.z = 74;
        System.out.println(vishu.Sum2());

        // object sum 3 double x,y
        vishu.x = 87;
        vishu.y = 59;
        System.out.println(vishu.Sum3());

    }
}