package simplefactory;

public class NotificationClient {

    static void main() {
        var notificationType = "slack";
        var recipient = "Marcus";
        var message = "Minha msg";
        var notifier = NotificationFactory.create(notificationType);
        notifier.send(message, recipient);
    }
}
