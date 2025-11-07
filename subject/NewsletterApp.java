package subject;
import observers.EmailSubscriber;
import observers.SMSSubscriber;
import observers.PushSubscriber;

public class NewsletterApp {
    public static void main(String[] args) {
        Blog techBlog = new Blog();
        
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   SISTEMA DE NEWSLETTER - TECH BLOG   ║");
        System.out.println("║      Patrón Observer en Acción        ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        System.out.println("➤ Registrando suscriptores iniciales...\n");
        
        EmailSubscriber alice = new EmailSubscriber("alice@ejemplo.com");
        EmailSubscriber bob = new EmailSubscriber("bob@ejemplo.com");
        SMSSubscriber carlos = new SMSSubscriber("+57-300-1234567");
        PushSubscriber diana = new PushSubscriber("device-ABC-123");
        
        techBlog.subscribe(alice);
        techBlog.subscribe(bob);
        techBlog.subscribe(carlos);
        techBlog.subscribe(diana);
        
        techBlog.publishArticle(
            "Introducción al Patrón Observer",
            "El patrón Observer es un patrón de diseño de comportamiento que define una dependencia uno-a-muchos entre objetos..."
        );
        
        System.out.println("\n➤ Carlos se desuscribe del blog...\n");
        techBlog.unsubscribe(carlos);
        
        techBlog.publishArticle(
            "Java 21: Nuevas Características",
            "Java 21 trae emocionantes características como Pattern Matching mejorado, Virtual Threads estables..."
        );
        
        System.out.println("\n➤ Nueva suscriptora se une...\n");
        PushSubscriber eva = new PushSubscriber("device-XYZ-789");
        techBlog.subscribe(eva);
        
        techBlog.publishArticle(
            "Arquitectura de Microservicios",
            "Los microservicios son un estilo arquitectónico que estructura una aplicación como una colección de servicios..."
        );
        
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║      ✓ Demostración completada        ║");
        System.out.println("╚════════════════════════════════════════╝");
    }
}