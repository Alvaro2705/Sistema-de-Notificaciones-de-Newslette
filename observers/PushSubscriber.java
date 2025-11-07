package observers;

import interfaces.Observer;

public class PushSubscriber implements Observer {
    private String deviceId;
    
    public PushSubscriber(String deviceId) {
        this.deviceId = deviceId;
    }
    
    @Override
    public void update(String articleTitle, String articleContent) {
        System.out.println("🔔 PUSH enviada al dispositivo: " + deviceId);
        System.out.println("   Notificación: " + articleTitle);
        System.out.println();
    }
}