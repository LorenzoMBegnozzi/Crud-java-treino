package com.logan.example.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    ATIVE(1L),
    INATIVE(0L);

    private final Long code;

}
