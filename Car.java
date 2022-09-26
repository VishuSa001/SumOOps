// Question 2: create a abstract class car with default constructor and print car is built in that.
// create abstract void drive method,gearchange method and print gear changed in that method.

// Create another class Tesla which extends car and has void drive method with drive safely print.
// create an object of class and call drive and gearchange method.

abstract class Car {
    Car() {
        System.out.println("car is built in that");
    }

    abstract void drive();

    abstract void gearchange();

    {
        System.out.println("gear changed");
    }
}