package singleton;

public class SingletonClient {

    void main() {
        var logger = Logger.getInstance();
        logger.log("teste de log");
    }

}
