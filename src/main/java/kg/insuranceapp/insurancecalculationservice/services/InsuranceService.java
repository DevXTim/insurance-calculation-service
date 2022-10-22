package kg.insuranceapp.insurancecalculationservice.services;

import kg.insuranceapp.insurancecalculationservice.models.CalculateRequest;
import kg.insuranceapp.insurancecalculationservice.models.CalculateResponse;

public interface InsuranceService {
    CalculateResponse calculate(CalculateRequest calculateRequest);
}
