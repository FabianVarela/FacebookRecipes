package com.developer.fabian.facebookrecipes.libs.eventbus;

public interface IEventBus {
    void register(Object subscriber);

    void unregister(Object subscriber);

    void post(Object event);
}
