package com.github.cdeor.user_event_management.domain.common;

import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode
public abstract class Entity {

    private UUID uuid;

    protected Entity() {}

    public UUID getUuid() {
        return uuid;
    }

    protected void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
