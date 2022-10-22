package kg.insuranceapp.insurancecalculationservice.controllers;

import kg.insuranceapp.insurancecalculationservice.models.CalculateRequest;
import kg.insuranceapp.insurancecalculationservice.models.CalculateResponse;
import kg.insuranceapp.insurancecalculationservice.services.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/insurance")
public class InsuranceController {

    private final InsuranceService insuranceService;

    @Autowired
    public InsuranceController(InsuranceService insuranceService) {
        this.insuranceService=insuranceService;
    }

    @PostMapping("/calculate")
    public CalculateResponse calculate(@RequestBody CalculateRequest calculateRequest) {
        return insuranceService.calculate(calculateRequest);
    }
}
