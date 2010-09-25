package org.quartz;

import org.quartz.utils.Key;

public class TriggerKey extends Key<Trigger> {

    public TriggerKey(String name) {
        super(name, null);
    }

    public TriggerKey(String name, String group) {
        super(name, group);
    }

    public TriggerKey(Trigger trigger) {
        super(trigger.getName(), trigger.getGroup());
    }
    
    public static TriggerKey triggerKey(String name) {
        return new TriggerKey(name, null);
    }
    
    public static TriggerKey triggerKey(String name, String group) {
        return new TriggerKey(name, group);
    }
    
}
