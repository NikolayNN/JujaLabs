package fff;

/**
 * Created by Nikol on 3/1/2016.
 */
class Parent {
    void method(){
        System.out.println("method Parent");
    }
}



class Child extends Parent {
    @Override
    void method() {
        System.out.println("method Child");
    }
    void method2(){}

    public static void main(String[] args) {

        Parent ref = new Child();
        Child child = new Child();





    }
}