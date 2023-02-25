package com.cotenote.backend.domain.rds.domain.account;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
@Embeddable
public class AccountSocialInfo {

    @Column(length = 100)
    private String socialId;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private AccountSocialType socialType;

    @Builder(access = AccessLevel.PACKAGE)
    private AccountSocialInfo(@NonNull String socialId, @NonNull AccountSocialType socialType) {
        this.socialId = socialId;
        this.socialType = socialType;
    }
}
