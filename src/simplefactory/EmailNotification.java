package simplefactory;

public class EmailNotification implements NotificationTypeInterface {

    @Override
    public void send(String message, String recipient) {
        System.out.printf("\nEmail\nRecipient: %s\nMessage: %s", recipient, message);
    }

}
