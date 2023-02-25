package com.cotenote.backend.domain.rds.domain.account;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum AccountSocialType {
    GOOGLE("구글"),
    ;

    private final String description;

}
