package designpattern.com.mg.pattern.structural.proxy;

/**
 * Yaratılması pahalı bir çok işlem yapan bir nesneyi taklit eden bir başka nesnenin kullanılmasıdır.
 * Örneğin bir nesne yarattığımızda veya bir nesnenin bir yordamını çağırdığımızda, bu çağırım bellekte
 * çok yer tutan daha başka bir çok nesne yaratabilir veya ağa bağlanma, veritabanından büyük bir veri
 * alma gibi pahalı işlemler yapabilir. Fakat uygulamanın akışına göre, bu işlemleri gerçekten yapmaya
 * ihtiyaç olmayabilir. İşte bu durumlarda, bu pahalı işlemlerden doğan zaman ve kaynak kayıplarını
 * önlemek için özdeş nesne kullanılır. Gerçekten bu pahalı işlem çağırılırsa, gerçek nesne oluşturulup,
 * bu pahalı işlemler ihtiyaç olduğunda yapılır. Bu tasarım deseni kullanılarak, sisteme yük getiren
 * gereksiz pahalı işlemler önlenir, böylece sistem daha hızlı ve sağlıklı hale gelir.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("testImage.jpg");

        image.display();
        System.out.println();
        image.display();
    }
}
