package designpattern.com.mg.pattern.behavioral.chainOfResponsibility;

/**
 * Bu tasarım deseni, bir dizi işlev sınıflarıyla, bu sınıfların işlevlerini başlatmak için gereken komut sınıflarından
 * oluşur. İşlev sınıfları, ne tür işler yapacağını kendi bünyesinde tutar, ayrıca dizideki diğer bir işlev sınıfının
 * ne olacağını da belirler. Bir işlemin, belli miktarda işlevlerden sırayla geçmesi gerektiğinde bu tasarım deseni kullanılabilir.
 */
public class ChainPatternDemo {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        errorLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger abstractLogger = getChainOfLoggers();

        abstractLogger.logMessage(AbstractLogger.INFO, "This is information");

        abstractLogger.logMessage(AbstractLogger.DEBUG, "This is debug level information");

        abstractLogger.logMessage(AbstractLogger.ERROR, "This is error level information");

    }
}
