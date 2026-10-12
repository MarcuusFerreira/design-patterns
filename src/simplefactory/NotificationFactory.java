package simplefactory;

public class NotificationFactory {

    public static NotificationTypeInterface create(String notificationType) {
        return switch (notificationType) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "slack" -> new SlackNotification();
            default -> throw new IllegalArgumentException("Invalid NotificationType.");
        };
    }
}
