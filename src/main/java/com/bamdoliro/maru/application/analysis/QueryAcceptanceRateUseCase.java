package com.bamdoliro.maru.application.analysis;

import com.bamdoliro.maru.infrastructure.persistence.form.FormRepository;
import com.bamdoliro.maru.presentation.analysis.dto.response.AcceptanceRateResponse;
import com.bamdoliro.maru.shared.annotation.UseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@UseCase
public class QueryAcceptanceRateUseCase {
    private final FormRepository formRepository;
    public List<AcceptanceRateResponse> execute() {
        return formRepository.findTypeAndCountGroupByType()
                .stream()
                .map(AcceptanceRateResponse::new)
                .toList();
    }
}