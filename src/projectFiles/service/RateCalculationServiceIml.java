package projectFiles.service;

import projectFiles.model.*;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class RateCalculationServiceIml implements RateCalculationService {

    private final TimePointService timePointService;
    private final AmountCalculationService amountCalculationService;
    private final ResidualCalculationService residualCalculationService;

    public RateCalculationServiceIml(TimePointService timePointService, AmountCalculationService amountCalculationService, ResidualCalculationService residualCalculationService) {
        this.timePointService = timePointService;
        this.amountCalculationService = amountCalculationService;
        this.residualCalculationService = residualCalculationService;
    }

    @Override
    public List<Rate> calculate(InputData inputData) {
        List<Rate> rates = new LinkedList<>();

        BigDecimal rateNumber = BigDecimal.ONE;
        Rate firstRate = caluclateRate(rateNumber, inputData);
        rates.add(firstRate);

        Rate previousRate = firstRate;

        for (BigDecimal index = rateNumber.add(BigDecimal.ONE);
             index.compareTo(inputData.getMonthsDuration()) <= 0;
             index = index.add(BigDecimal.ONE)
        ) {
            Rate nextRate = calculateRate(index, inputData, previousRate);
            rates.add(nextRate);
            previousRate = nextRate;
        }
        return rates;
    }

    private Rate caluclateRate(BigDecimal rateNumber, InputData inputData) {
        TimePoint timePoint = timePointService.calculate(rateNumber,inputData);
        RateAmounts rateAmounts =  amountCalculationService.calculate();
        MortgageResidual mortgageResidual = residualCalculationService.calculate();
        return new Rate(rateNumber, timePoint, rateAmounts,mortgageResidual);
    }


    private Rate calculateRate(BigDecimal rateNumber, InputData inputData, Rate previousRate) {
        TimePoint timePoint = timePointService.calculate(rateNumber, inputData);
        RateAmounts rateAmounts =  amountCalculationService.calculate();
        MortgageResidual mortgageResidual = residualCalculationService.calculate();
        return new Rate(rateNumber, timePoint, rateAmounts,mortgageResidual);
    }

}