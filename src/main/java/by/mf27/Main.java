package by.mf27;

import by.mf27.samples.User;
import net.bytebuddy.agent.ByteBuddyAgent;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        ByteBuddyAgent.install();
        new Injector().inject(User.class);

        System.out.println(new User("fsadfsd", "fadsfsd").isAdmin());
    }
}
