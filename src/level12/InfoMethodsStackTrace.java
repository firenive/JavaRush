package level12;

public class InfoMethodsStackTrace {
    public static void main(String[] args) {
        test();
    }

    static void test() {

        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for (StackTraceElement info : methods) {
            System.out.println(info.getClassName());
            System.out.println(info.getMethodName());

            System.out.println(info.getFileName());
            System.out.println(info.getLineNumber());

            System.out.println(info.getModuleName());
            System.out.println(info.getModuleVersion());
            System.out.println();
        }
    }
}

