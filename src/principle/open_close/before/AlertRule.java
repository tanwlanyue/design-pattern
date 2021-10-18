package principle.open_close.before;

/**
 * @author zhanglei211 on 2021/9/12.
 */
public class AlertRule {

    public Long getMaxTps() {
        return 1000L;
    }

    public Long getMaxErrorCount() {
        return 50L;
    }

    public AlertRule getMatchedRule(String api){
        return this;
    }
}
