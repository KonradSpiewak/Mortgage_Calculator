package projectFiles;

import projectFiles.model.InputData;
import projectFiles.service.PrintingService;
import projectFiles.service.PrintingServiceImpl;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(160));

        PrintingService printingService = new PrintingServiceImpl();
        printingService.printInputDataInfo(inputData);




    }
}