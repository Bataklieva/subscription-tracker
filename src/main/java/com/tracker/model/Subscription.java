package com.tracker.model;

import com.tracker.model.enums.BillingCycle;
import com.tracker.model.enums.Role;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "subscriptions")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    BigDecimal amount;
    String password;
    BillingCycle billingCycle;
    LocalDate nextPaymentDate;
    int reminderDaysBefore;
    boolean active;
    LocalDateTime created_at;
    Long userId;

}
