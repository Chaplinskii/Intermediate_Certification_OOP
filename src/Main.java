import Logger.Logger_;
import View.CalculatorComplexNumbersView;


import java.io.IOException;

import java.util.logging.*;

public class Main {
    private static Logger_ logger = new Logger_();
    private static Logger log = Logger.getLogger(Logger_.class.getName());

    public static void main(String[] args) throws IOException {
        logger.setLog();
        log.log(Level.INFO, "Point 1.1: Start Main");
        CalculatorComplexNumbersView calculatorComplexNumbersView = new CalculatorComplexNumbersView();
        log.log(Level.FINE, "Point 1.2: Created calculatorComplexNumberView");
        calculatorComplexNumbersView.start();
        log.log(Level.FINE, "stop");

    }
}
//calculator - калькулятор
//operations - операции
//logger