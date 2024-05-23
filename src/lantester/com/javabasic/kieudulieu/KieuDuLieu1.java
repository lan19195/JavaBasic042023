package lantester.com.javabasic.kieudulieu;

public class KieuDuLieu1 {
    int numberInt = 10333;
    long numberLong = 3000000000000l;
    double numberDouble = 1000.2898282209208;

    public static void main(String[] args) {
        //System.out.println(numberInt);
        KieuDuLieu1 kieudulieu = new KieuDuLieu1();
        System.out.println(kieudulieu.numberInt);
        System.out.println(kieudulieu.numberLong);
        System.out.println(kieudulieu.numberDouble);
        System.out.println(Bank.BANKNAME);
        System.out.println(Bank.VAT);
        System.out.println(Bank.INTEREST_RATE);
    }
}
