package com.bamdoliro.maru.presentation.analysis.dto.response;

import com.bamdoliro.maru.infrastructure.persistence.form.vo.AcceptanceRateVo;
import lombok.Getter;

@Getter
public class AcceptanceRateResponse {
    private String type;
    private Long count;

    public AcceptanceRateResponse(AcceptanceRateVo vo){
        this.type = vo.getType();
        this.count = vo.getCount();
    }
}