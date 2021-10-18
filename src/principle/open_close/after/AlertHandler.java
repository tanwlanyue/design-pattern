package principle.open_close.after;

import principle.open_close.before.AlertRule;
import principle.open_close.before.Notification;

/**
 * @author zhanglei211 on 2021/9/12.
 */
public abstract class AlertHandler {

    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
