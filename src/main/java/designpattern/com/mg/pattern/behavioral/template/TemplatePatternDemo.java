package designpattern.com.mg.pattern.behavioral.template;

/**
 * Kalıp yordam, sınıf hiyerarşisinde üst sınıfta yer alır.
 * Bu yordam gerekli yöntemin adımlarını belirler. Bu yöntemin
 * hangi adımlardan oluşması gerektiğini ortaya koyarken, alt
 * sınıfların uyması gereken şablonu ortaya koyar. Alt sınıflar
 * detayları kendileri belirler. Fakat uyulması gereken yapı üst
 * sınıf tarafından, kalıp yordam ile belirlenir. Bu tasarım
 * deseni sayesinde alt sınıflarda yapılacak kod tekrarlarından
 * kaçınılır. Alt sınıfların ortak kodları üst sınıfta tek bir yerde
 * toplanır. Bu ortak kısımda bir değişikliğe ihtiyaç duyulduğunda,
 * bu tek noktada yapılır. Kısaca üst sınıfta yer alan kalıp yordam,
 * tüm alt sınıfların ihtiyaç duyduğu ortak adımları barındırır,
 * bunlar için bir kalıp oluşturur ve detayları alt sınıflara bırakır.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new FootBall();
        game.play();
    }
}
