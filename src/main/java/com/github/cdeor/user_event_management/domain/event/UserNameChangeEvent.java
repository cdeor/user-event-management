package com.github.cdeor.user_event_management.domain.event;

import com.github.cdeor.user_event_management.domain.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserNameChangeEvent implements Event {

    private static final String TYPE = "user.name.changed";
    private UUID uuid;
    private Instant occurredAt;

    private String name;

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public Instant getOccurredAt() {
        return this.occurredAt;
    }

    @Override
    public UUID getUUID() {
        return uuid;
    }
}
