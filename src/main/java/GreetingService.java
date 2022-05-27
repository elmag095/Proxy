public class GreetingService {
    public void hello() {
        System.out.println("hello");
    }

    @LogInvocation
    public void gloryToUkraine() {
        System.out.println("glory to Ukraine");
    }

}
