package 자바의신.chap_3;

public class Calculate {
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int divide(int a, int b){
        return a / b;
    }
    
    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("계산기를 시작합니다.");
        Calculate calc = new Calculate();
        int a = 10;
        int b = 5;

        System.out.println(calc.add(a,b));
        System.out.println(calc.subtract(a,b));
        System.out.println(calc.divide(a,b));
        System.out.println(calc.multiply(a,b));        
    }
    
}
