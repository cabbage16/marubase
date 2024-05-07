package com.bamdoliro.maru.application.analysis;

import com.bamdoliro.maru.domain.form.service.FormFacade;
import com.bamdoliro.maru.presentation.analysis.dto.response.AcceptanceRateResponse;
import com.bamdoliro.maru.shared.annotation.UseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

@RequiredArgsConstructor
@UseCase
public class QueryAcceptanceRateUseCase {
    private final AnalysisFacade analysisFacade;

    public void execute() {
        System.out.println(Arrays.toString(analysisFacade.getAcceptanceRate()));
    }
}
