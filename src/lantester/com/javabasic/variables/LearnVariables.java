package lantester.com.javabasic.variables;

public class LearnVariables {
    public void sayHello() {
        int n = 10;      // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }
    public static void main(String[] args) {
        LearnVariables bienLocal = new LearnVariables();
        bienLocal.sayHello();
    }
}
