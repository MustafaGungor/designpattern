package designpattern.com.mg.pattern.behavioral.interpreter;


/**
 * Bu tasarım desenindeki amaç, özelleşmiş bir bilgisayar dilinin yorumlanmasının gerçekleştirilmesidir.
 * Ana fikir, bu özelleşmiş dilin her bir sembolü için ayrı bir sınıf yaratmaktır. Bu tasarım deseni,
 * veritabanı yönetim sistemlerindeki SQL tarzı dillerin yorumlanmasında kullanılabilir. Bir başka örnek
 * olarak, bilgisayar ağlarındaki iletişim protokollerindeki özel dillerin çözümlenmesinde kullanılabilir.
 */
public class InterpreterPatternDemo {

    //Rule : Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return  new OrExpression(robert,john);
    }

    //Rule : Julie is a married women
    public static Expression getMarriedWomenExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomenExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "+ isMarriedWomen.interpret("Married Julie"));
    }

}
