package com.bamdoliro.maru.presentation.analysis;

import com.bamdoliro.maru.application.analysis.QueryAcceptanceRateUseCase;
import com.bamdoliro.maru.presentation.analysis.dto.response.AcceptanceRateResponse;
import com.bamdoliro.maru.shared.response.CommonResponse;
import com.bamdoliro.maru.shared.response.SingleCommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/analysis")
@RestController
public class AnalysisController {
    QueryAcceptanceRateUseCase queryAcceptanceRateUseCase;

    @GetMapping("/acceptance-rate")
    public void getAcceptanceRate() {
        queryAcceptanceRateUseCase.execute();
    }
}
