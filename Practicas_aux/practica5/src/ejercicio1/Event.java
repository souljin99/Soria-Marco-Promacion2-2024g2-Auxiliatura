package ejercicio1;

public class Event {
    private String nombre;
    private EventNotification notification;
    
    public Event(String nombre) {
        this.nombre = nombre;
    }
    public void notificationRecord(EventNotification notification) {
    	this.notification = notification;
    }
    public void activate() {
        String mensaje = "Event activated: " + nombre;
        notification.Notify(mensaje);
    }
}
