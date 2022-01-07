public class Main {
    public static void main(String[] args) {
        int ticketCost = 2000;
        int ticketQuantity = 1;
        int totalBonusMiles = ticketCost * ticketQuantity / 20;
        System.out.println("Сумма начисленых бонусов: " + totalBonusMiles + " миль(и)");
    }
}
