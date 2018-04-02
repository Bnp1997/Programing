

public class OOP {
    public static void main(String[] args){
        foo y = new foo();
        foo2 z = new foo2();
        z.test(y);

    }
}

class foo{
    int dodaj(int a, int b){
        return a+b;
    }

    double dodaj(double a, double b){
        return a+b;
    }
}


class foo2{
    static void test(foo x){
        System.out.println(x.dodaj(5,4));
        System.out.println(x.dodaj(5.5,3.69));
    }
}