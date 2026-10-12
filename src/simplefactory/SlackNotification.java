package simplefactory;

public class SlackNotification implements NotificationTypeInterface {

    @Override
    public void send(String message, String recipient) {
        System.out.printf("\nSlack\nRecipient: %s\nMessage: %s", recipient, message);
    }

}
