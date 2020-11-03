public class ExchangeCurrencyApp {


    public static void main(String[] args) {
        ExchangerAPI ex = new ExchangerAPI();
        //test connection with THB
        if (ex.getConnection("THB")) {
            System.out.println(ex.getResult());
        }







    }
}
