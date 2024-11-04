package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Event event1 = new Event("The game is closing....");
        event1.notificationRecord(mensaje -> System.out.println("Notification 1: " + mensaje));
        event1.activate();
        Event event2 = new Event("New game mode available.");
        event2.notificationRecord(mensaje -> System.out.println("Notificition 2: " + mensaje));
        event2.activate();
    }
}