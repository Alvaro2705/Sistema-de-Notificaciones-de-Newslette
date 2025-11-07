package observers;

import interfaces.Observer;

public class SMSSubscriber implements Observer {
    private String phoneNumber;
    
    public SMSSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void update(String articleTitle, String articleContent) {
        System.out.println("📱 SMS enviado a: " + phoneNumber);
        System.out.println("   Mensaje: Nuevo artículo: " + articleTitle);
        System.out.println();
    }
}