package com.cotenote.backend.domain.rds.domain.account;

import com.cotenote.backend.domain.rds.domain.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.DynamicUpdate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicUpdate
@Entity
public class Account extends BaseEntity {

    @Column(length = 50, unique = true)
    private String nickname;

    @Embedded
    private AccountSocialInfo socialInfo;

    @Builder(access = AccessLevel.PACKAGE)
    private Account(
        @NonNull Long id,
        @NonNull AccountSocialInfo socialInfo,
        @NonNull String nickname
    ) {
        super.id = id;
        this.socialInfo = socialInfo;
        this.nickname = nickname;
    }
}
