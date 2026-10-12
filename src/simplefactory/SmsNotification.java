package simplefactory;

public class SmsNotification implements NotificationTypeInterface {

    @Override
    public void send(String message, String recipient) {
        System.out.printf("\nSms\nRecipient: %s\nMessage: %s", recipient, message);
    }

}
