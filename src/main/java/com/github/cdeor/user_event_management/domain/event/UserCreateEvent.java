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
public class UserCreateEvent implements Event {

    private static final String TYPE = "user.created";
    private UUID uuid;
    private Instant occurredAt;

    private UserStatus status;
    private String name;
    private String email;
    private String phoneNumber;

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
