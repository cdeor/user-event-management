package com.github.cdeor.user_event_management.domain.event;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.Instant;
import java.util.UUID;



@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
public interface Event {
    String getType();

    Instant getOccurredAt();

    UUID getUUID();
}
