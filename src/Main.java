public class Main {
    public static void main(String[] args) {
        int currentAmount = 100;
        int amountOfReplenishment = 1100;
        int finishAmount;
        int startBonus = 1000;
        int bonus = amountOfReplenishment / 100;
        if (amountOfReplenishment > startBonus) {
            finishAmount = currentAmount + amountOfReplenishment + bonus;
        } else {
            finishAmount = currentAmount + amountOfReplenishment;
        }
        int finishBonus = finishAmount - currentAmount - amountOfReplenishment;
        System.out.println("Итоговая сумма на счету клиента  " + finishAmount + " рублей.");
        System.out.println(" Итоговый бонус " + finishBonus + " рублей. ");
    }
}
