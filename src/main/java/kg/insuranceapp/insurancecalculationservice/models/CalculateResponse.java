package kg.insuranceapp.insurancecalculationservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CalculateResponse {
    private CalculateRequest calculateRequest;
    private double insuranceCoverage;
}
