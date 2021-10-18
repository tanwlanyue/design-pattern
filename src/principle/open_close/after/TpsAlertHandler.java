package principle.open_close.after;

import principle.open_close.before.AlertRule;
import principle.open_close.before.Notification;
import principle.open_close.before.NotificationEmergencyLevel;

/**
 * @author zhanglei211 on 2021/9/12.
 */
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}