package store;

public class Cashier extends AbstractStoreEmployee {
    private int numberOfTransactions;

    public Cashier(double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay, String employeeName, int numberOfTransactions) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
        this.numberOfTransactions = numberOfTransactions;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    @Override
    public double calculatePay() {
        // Gaji kasir dihitung berdasarkan jumlah jam kerja dan jumlah transaksi yang dilakukan
        return super.getNumberOfHoursWorked() * super.getHourlyRate() + (numberOfTransactions * 0.25);
    }

    @Override
    public boolean checkPromotionEligibility() {
        // Kasir dapat dipromosikan jika jumlah transaksi yang dilakukan mencapai target tertentu
        return numberOfTransactions > 1000;
    }

    @Override
    public String toString() {
        return super.toString() + "Number of Transactions: " + numberOfTransactions + "\n";
    }

    // Implementasi method calculateBonus()
    @Override
    public double calculateBonus() {
        // Cashier mungkin mendapatkan bonus berdasarkan kinerjanya
        // Implementasi logika perhitungan bonus di sini
        return 0.0; // Misalnya, defaultnya tidak mendapatkan bonus
    }

    // Implementasi method calculateExpenses()
    @Override
    public double calculateExpenses() {
        // Implementasi logika perhitungan pengeluaran toko untuk Cashier di sini
        return 0.0; // Misalnya, defaultnya tidak ada pengeluaran
    }
}
