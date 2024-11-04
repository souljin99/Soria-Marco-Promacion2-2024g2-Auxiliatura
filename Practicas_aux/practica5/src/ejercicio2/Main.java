package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jane Doe", 100);
        Player player2 = new Player("Jhon Doe", 150);
        System.out.println("Player information:");
        player1.showData();
        player2.showData();
        
        BonusCalculator doubleBonus = basePoints -> basePoints * 2;
        BonusCalculator percentageBonus = basePoints -> (int)(basePoints * 1.5);
        BonusCalculator fixedBonus = basePoints -> basePoints + 50;
        
        player1.applyBonus(doubleBonus);
        player2.applyBonus(percentageBonus);
        
        System.out.println("Player information after applying bonuses:");
        player1.showData();
        player2.showData();
        
        player1.applyBonus(fixedBonus);
        System.out.println("Player information after applying 'fixed bonus' to " + player1.getName() +": ");
        player1.showData();
    }
}

