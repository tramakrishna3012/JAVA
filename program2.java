class A {
    String name ;
    A(){
        name = "Rama";
        System.out.println(name);
    }
    A(A ref){
        name = ref.name;
        System.out.println(name);
    }
}

public class program2 {
    public static void main(String args[]) {
        A r = new A();
        new A(r);
    }
}
