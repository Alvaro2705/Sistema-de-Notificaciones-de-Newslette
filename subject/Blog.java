package subject;

import interfaces.Subject;
import interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {
    private List<Observer> subscribers;
    private String latestArticle;
    private String latestContent;
    
    public Blog() {
        this.subscribers = new ArrayList<>();
    }
    
    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        System.out.println("✓ Nuevo suscriptor agregado");
    }
    
    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println("✓ Suscriptor removido");
    }
    
    @Override
    public void notifySubscribers() {
        System.out.println("\n📢 Notificando a " + subscribers.size() + " suscriptores...\n");
        for (Observer subscriber : subscribers) {
            subscriber.update(latestArticle, latestContent);
        }
    }
    
    public void publishArticle(String title, String content) {
        System.out.println("\n════════════════════════════════════════");
        System.out.println("📝 NUEVO ARTÍCULO PUBLICADO");
        System.out.println("════════════════════════════════════════");
        System.out.println("Título: " + title);
        System.out.println("════════════════════════════════════════");
        
        this.latestArticle = title;
        this.latestContent = content;
        notifySubscribers();
    }
}