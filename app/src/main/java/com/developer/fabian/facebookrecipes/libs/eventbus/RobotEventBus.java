package com.developer.fabian.facebookrecipes.libs.eventbus;

import org.greenrobot.eventbus.EventBus;

public class RobotEventBus implements IEventBus {

    private EventBus eventBus;

    public RobotEventBus(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void register(Object subscriber) {
        eventBus.register(subscriber);
    }

    @Override
    public void unregister(Object subscriber) {
        eventBus.unregister(subscriber);
    }

    @Override
    public void post(Object event) {
        eventBus.post(event);
    }
}
