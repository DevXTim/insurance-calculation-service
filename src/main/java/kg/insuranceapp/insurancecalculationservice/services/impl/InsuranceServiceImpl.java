package kg.insuranceapp.insurancecalculationservice.services.impl;

import kg.insuranceapp.insurancecalculationservice.models.CalculateRequest;
import kg.insuranceapp.insurancecalculationservice.models.CalculateResponse;
import kg.insuranceapp.insurancecalculationservice.services.InsuranceService;
import org.springframework.stereotype.Service;
//        Создайте проект по подсчету страхования имущества, входные данные
//        количество квадрат * количество проживающих * коэффициент квадратуры(от 1
//        о,1, от 20 0,2; от 40: 0,4ж; от 80 0,72) * коэффициент газа если есть газ(0,5) =
//        сумма страхования;
@Service
public class InsuranceServiceImpl implements InsuranceService {
    @Override
    public CalculateResponse calculate(CalculateRequest calculateRequest) {
        double coeficent = 0.1;

        if (calculateRequest.getSquareM() >= 80) {
            coeficent = 0.72;
        } else if (calculateRequest.getSquareM() >= 40) {
            coeficent = 0.4;
        } else if (calculateRequest.getSquareM() >= 20) {
            coeficent = 0.2;
        }

        double tempInsurance = calculateRequest.getSquareM() * calculateRequest.getTenantsCount() * coeficent;

        if (calculateRequest.isGasPresent()) {
            tempInsurance *= 0.5;
        }

        return new CalculateResponse(calculateRequest, tempInsurance);
    }
}
