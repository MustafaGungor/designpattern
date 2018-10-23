package designpattern.com.mg.pattern.behavioral.state;

/**
 * Nesnenin durumu değiştiğinde, davranışı da değişiyorsa, yani nesneler farklı durumlarda,
 * farklı davranışlar gösteriyorsa, durum tasarım deseni kullanılabilir. Bu tasarım deseninin
 * kullanılması, nesnelerin durumlarına bağlı değişen davranışlarının karmaşık "if/else" veya
 * "switch" ifadeleriyle kontrol edilmesini önler.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
