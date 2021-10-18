package principle.open_close.after;

import principle.open_close.before.AlertRule;
import principle.open_close.before.Notification;
import principle.open_close.before.NotificationEmergencyLevel;

/**
 * @author zhanglei211 on 2021/9/12.
 */
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification){
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
