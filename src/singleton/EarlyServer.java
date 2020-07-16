package singleton;

public class EarlyServer {

    private EarlyServer(){};

    private static final EarlyServer INSTANCE;

    static{
        try{
            INSTANCE = new EarlyServer();
            System.out.println("Init EarlyServer with Early Singleton");
        } catch(Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static EarlyServer getInstance(){
        return INSTANCE;
    }
}
