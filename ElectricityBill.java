import java.lang.String;

public class ElectricityBill {

    private String consumerNo;
    private String consumerName;
    private int prevMonthReading;
    private int currMonthReading;
    private String typeConnection;

    public ElectricityBill  (String cNo, String cName, String typeCon, int prvMonthReading, int curMonthReading) {
        consumerNo = cNo;
        consumerName = cName;
        typeConnection = typeCon;
        prevMonthReading = prvMonthReading;
        currMonthReading = curMonthReading;
    }

    public void setConsumerNo(String cNo) {
        consumerNo = cNo;
    }

    public void setConsumerName(String cName) {
        consumerName = cName;
    }

    public void setTypeConnection(String typeCon) {
        typeConnection = typeCon;
    }

    public void setPrevMonthReading(int prvMonthReading) {
        prevMonthReading = prvMonthReading;
    }

    public void setCurrMonthReading(int curMonthReading) {
        currMonthReading = curMonthReading;
    }

    public String getConsumerNo() {
        return consumerNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public String getTypeConnection() {
        return typeConnection;
    }

    public int getPrevMonthReading() {
        return prevMonthReading;
    }

    public int getCurrMonthReading() {
        return currMonthReading;
    }

    public double billAmount() {
        int units = currMonthReading - prevMonthReading;
        double amount = 0;
        if (typeConnection.toLowerCase().equals("domestic")) {
            if (units <= 100) {
                amount = units;
            }
            else if (units <= 200) {
                amount = 100 + (units - 100) * 2.50;
            }
            else if (units <= 500) {
                amount = 100 + 100 * 2.50 + (units - 200) * 4;
            }
            else {
                amount = 100 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;
            }
        }
        else {
            if (units <= 100) {
                amount = units * 2;
            }
            else if (units <= 200) {
                amount = 100 + (units - 100) * 2.50;
            }
            else if (units <= 500) {
                amount = 100 * 2 + 100 * 4.50 + (units - 200) * 6;
            }
            else {
                amount = 100 * 2 + 100 * 4.50 + 300 * 4 + (units - 500) * 7;
            }
        }

        return amount;
    }

    public static void main (String[] args) {
        ElectricityBill eb = new ElectricityBill("19BQ1AK1", "Lathisha", "Commercial", 4000, 4600);

        System.out.println("Customer ID: " + eb.getConsumerNo());
        System.out.println("Customer Name: " + eb.getConsumerName());
        System.out.println("Type of EB Connection: " + eb.getTypeConnection());
        System.out.println("Previous Month Reading: " + eb.getPrevMonthReading());
        System.out.println("Current Month Reading " + eb.getCurrMonthReading());


        double bill = eb.billAmount();
        System.out.println("Your Bill: " + bill);


        System.out.println("\nChaging the type of EB account...\n");
        eb.setTypeConnection("Domestic");

        bill = eb.billAmount();
        System.out.println("Your Bill: " + bill);

    }

}