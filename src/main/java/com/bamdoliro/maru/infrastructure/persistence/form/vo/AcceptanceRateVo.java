package com.bamdoliro.maru.infrastructure.persistence.form.vo;

import com.bamdoliro.maru.domain.form.domain.type.FormType;
import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

@Getter
public class AcceptanceRateVo {
    private String type;
    private Long count;

    @QueryProjection
    public AcceptanceRateVo(FormType type, Long count) {
        this.type = type.toString();
        this.count = count;
    }


}
