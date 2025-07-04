package by.mf27;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.implementation.FixedValue;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Injector {

    /*
    * @mf27: Example of ByteBuddy hook that can intercept return value in the method
    */
    @SuppressWarnings("unchecked")
    public void inject(Class clazz) {
        new ByteBuddy()
                .redefine(clazz)
                .method(named("isAdmin"))
                .intercept(FixedValue.value(true))
                .make()
                .load(clazz.getClassLoader(), ClassReloadingStrategy.fromInstalledAgent());
    }

}
