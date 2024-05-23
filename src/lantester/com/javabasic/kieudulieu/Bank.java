package lantester.com.javabasic.kieudulieu;

public class Bank {
    static int VAT = 1000;
    static String BANKNAME = "Vietcombank";
    static String ADDRESS = "Hà Nội";
    static String PHONE = "03277285792";
    static float INTEREST_RATE = 1000.5F;


    public static void getBankInfo(){
        System.out.println("Bank Name:" + BANKNAME);
        System.out.println("Bank Address:" + ADDRESS);
        System.out.println("Bank Phone:" + PHONE);
        System.out.println("Bank Interest rate:" + INTEREST_RATE);

    }

    public static double getInterestRate(){
        return INTEREST_RATE;

    }

}
