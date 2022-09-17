package call.hello;

public class App
{

    private final String message = "Hello World from Java Maven Project! I am modifiying my message";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}