public class Main {
    public static void main(String[] args) {
        int currentamount = 100;
        int amountofreplenishment = 1100;
        int finishamount;
        int startbonus = 1000;
        int bonus = amountofreplenishment / 100;
        if (amountofreplenishment > startbonus)
            finishamount = currentamount + amountofreplenishment + bonus;
        else finishamount = currentamount + amountofreplenishment;
        int finishbonus = finishamount - currentamount - amountofreplenishment;
        System.out.println("Итоговая сумма на счету клиента  " + finishamount + " рублей.");
        System.out.println(" Итоговый бонус " + finishbonus + " рублей. ");
    }
}
