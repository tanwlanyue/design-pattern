package principle.open_close.after;

import principle.open_close.before.AlertRule;
import principle.open_close.before.Notification;

/**
 * @author zhanglei211 on 2021/9/12.
 */
public class ApplicationContext {

    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    public void initializeBeans() {
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule, notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
    }

    public Alert getAlert() {
        return alert;
    }

    /**
     * 实例
     */
    private static final ApplicationContext INSTANCE = new ApplicationContext();

    private ApplicationContext() {
        initializeBeans();
    }

    public static ApplicationContext getInstance() {
        return INSTANCE;
    }
}