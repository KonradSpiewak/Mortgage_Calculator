package projectFiles.service;

import projectFiles.model.InputData;
import projectFiles.model.Rate;

import java.util.List;

public interface RateCalculationService {

    List<Rate> calculate (final InputData inputData);

}
