package singleton;

public class LazyServer {

    private LazyServer(){};


    private static class LazyHolder {
        public static final LazyServer INSTANCE = new LazyServer();
        static {
            System.out.println("Init LazyServer with Lazy Holder Singleton");
        }
    }

    public static LazyServer getInstance(){
        return LazyHolder.INSTANCE;
    }

}
