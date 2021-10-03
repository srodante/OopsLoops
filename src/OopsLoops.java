import java.text.NumberFormat;

public class OopsLoops {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double futureValue = 0.0, monthlyInterest = 0.0;
        int months, monthly = 100;
        String row="Year    5%           5.5%         6.0%";
        System.out.println(row);

        for (int year = 1; year <= 3; year++){
            row = year + "\t\t";
            months = 12 * year;

            for (double rate = 5.0; rate <= 6; rate += .5) {
                monthlyInterest = rate / 12 / 100;

                for (int i = 1; i <= months; i++){
                    futureValue = (futureValue + monthly) * (1 + monthlyInterest);
                }
                row = row + currency.format(futureValue) + "    ";
                futureValue = 0;
                monthlyInterest = 0.0;
            }
            System.out.println(row);
        }
    }

}
