package kg.insuranceapp.insurancecalculationservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//количество квадрат * количество проживающих * коэффициент квадратуры(от 1
//        о,1, от 20 0,2; от 40: 0,4ж; от 80 0,72) * коэффициент газа если есть газ(0,5)
@Getter
@Setter
@NoArgsConstructor
public class CalculateRequest {
    private double squareM;
    private int tenantsCount;
    private boolean gasPresent;
}
