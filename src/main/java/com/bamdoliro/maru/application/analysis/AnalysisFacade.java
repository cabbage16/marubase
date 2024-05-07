package com.bamdoliro.maru.application.analysis;

import com.bamdoliro.maru.infrastructure.persistence.form.FormRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnalysisFacade {
    private final FormRepository formRepository;

    public Object[] getAcceptanceRate() {
        return formRepository.findTypeAndCountGroupByType().toArray();
    }
}
