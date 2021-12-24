public class main {
    public static void main(String[] args) {
        int ticketCost = 20;
        int ticketQuantity = 2;
        int totalBonusMiles = ticketCost*ticketQuantity/20;
        System.out.println("Сумма начисленых бонусов: " + totalBonusMiles + " миль(и)");
    }
}
