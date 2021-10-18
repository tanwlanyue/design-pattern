package principle.open_close.before;

/**
 * @author zhanglei211 on 2021/9/12.
 */
public class Notification {

    public void notify(int a, String msg) {
        switch (a) {
            case NotificationEmergencyLevel.SEVERE:
                System.out.println("SEVERE-" + msg);
                return;
            case NotificationEmergencyLevel.URGENCY:
                System.out.println("URGENCY-" + msg);
                return;
            case NotificationEmergencyLevel.NORMAL:
                System.out.println("NORMAL-" + msg);
                return;
            case NotificationEmergencyLevel.TRIVIAL:
                System.out.println("TRIVIAL-" + msg);
                return;
            default:
                System.out.println(msg);
        }
    }
}
