package projectFiles.service;

import projectFiles.model.InputData;
import projectFiles.model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {

    TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
