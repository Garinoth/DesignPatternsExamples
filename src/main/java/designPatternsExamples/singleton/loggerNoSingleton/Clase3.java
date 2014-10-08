package designPatternsExamples.singleton.loggerNoSingleton;

public class Clase3 {
    private Logger logger;

    public Clase3(Logger logger) {
        this.logger = logger;
    }

    public void method1() {
        // ...
        this.logger.addLog("Clase3:method1");
    }

}
