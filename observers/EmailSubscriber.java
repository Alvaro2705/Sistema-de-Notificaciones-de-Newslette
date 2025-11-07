package observers;

import interfaces.Observer;

public class EmailSubscriber implements Observer {
    private String email;
    
    public EmailSubscriber(String email) {
        this.email = email;
    }
    
    @Override
    public void update(String articleTitle, String articleContent) {
        System.out.println("📧 EMAIL enviado a: " + email);
        System.out.println("   Asunto: Nuevo artículo - " + articleTitle);
        System.out.println("   Vista previa: " + articleContent.substring(0, Math.min(50, articleContent.length())) + "...");
        System.out.println();
    }
}
