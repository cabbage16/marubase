package com.bamdoliro.maru.presentation.analysis;

import com.bamdoliro.maru.application.analysis.QueryAcceptanceRateUseCase;
import com.bamdoliro.maru.domain.user.domain.User;
import com.bamdoliro.maru.presentation.analysis.dto.response.AcceptanceRateResponse;
import com.bamdoliro.maru.shared.auth.AuthenticationPrincipal;
import com.bamdoliro.maru.shared.auth.Authority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/analysis")
@RestController
public class AnalysisController {
    QueryAcceptanceRateUseCase queryAcceptanceRateUseCase;

    @GetMapping("/acceptance-rate")
    public List<AcceptanceRateResponse> getAcceptanceRate(
            @AuthenticationPrincipal(authority = Authority.ADMIN)User user
            ) {
        return queryAcceptanceRateUseCase.execute();
    }
}