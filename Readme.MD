## Tasarım Desenleri

### 1 - Singleton
####    Bu tasarım deseninde , bir sınıfın içinbde yalnızca bir tane nesnesi oluşturulabilir.Tek bir arayüz sunularak, bu nesneye yalnızca buradan erişim sağlanabilir. Bu desen kullanılarak, sistem içinde değeri değişmeyen, genel değişkenler bu oluşturulan tek nesneye konulabilir.Sistemde tek nesne yaratılabilme , statik değişken ve tordamlar sayesinde olur.

### 2 - Fabrika Yordam 
####    Fabrika yordam tasarım deseni, nesne yaratma sorumluluğunun bir yordama verilmesidir. Yaratılan nesne, bir sınıf hiyerarşisindeki alt sınıflardan biridir. Hangi alt sınıfın yaratılacağı kararı fabrika yordam içinde verilir. Bu yordam ile belirli bir sınıf hiyerarşisindeki alt nesnelerden birinin yaratma sorumluluğu belirli bir arayüze verilerek sistemden soyutlanmış olur. Böylece nesneleri yaratma kodlarında, kod tekrarları önlenmiş olur. Sistem içinde sınıfların yaratılacağı yer tek olduğu için, ilgili mantıklar tek bir yerde toplanabilir.
###### 
    "Örnek uygulamamız" bir resim işleyici programıdır. Bu programdaki resimler oluşturulurken,
     resimlerin hangi "resim formatında" olacağının da belirlenmesi gerekmektedir. 
     Uygulama üzerinde "gif" ve "jpeg" olmak üzere iki tip resim formatı bulunmaktadır. 
     Resimleri oluşturan JpegResimFormatı ve GifResimFormatı sınıflarıdır. 
     Bu sınıflar IResimFormatı isimli bir arayüz sınıfından türemektedirler. 
     Bu sınıfların resmiOluştur isminde soyut bir yordamları bulunur. 
     Resimİşleyici istemci sınıfının IResimFormatı tipinde bir sınıfa ihtiyacı vardır. 
     Bu istemci sınıf bu tipten bir sınıfı alır ve resmiOluştur yordamını çalıştırır. 
     Fakat Resimİşleyici istemci sınıfı IResimFormatı sınıfının yaratılma sorumluluğu üstlenmek istememektedir. 
     İşte burada devreye Fabrika Yordam tasarım deseni girer. 
     IResimFormatı tipindeki nesnenin yaratılma sorumluluğu FormatSeçici sınıfının formatAl isimli yordamına verilmiştir. 
     Bu yordam Fabrika Yordamdır. Bu sınıfın "FormatSeçici" gibi ayrı sınıfta olması gerekmemektedir. 
     Bu örnekte bu yordam örneğin "Resimİşleyici" istemci sınıfında da bulunabilirdi. 
     Fakat daha da esnek olsun diye bunu ayrı sınıfa aldım.
     'Fabrika Yordam' tasarım desenindeki istenen sınıfı yaratan yordamın tek görevi sınıfı yaratıp bunu istemciye dönmek olmayabilir. 
     Nesne yaratılırken ilgili mantık kodları da bu sınıfta toplanabilir. 
     Böylece sınıf yaratılma ile ilgili tüm sorumluluklar bu yordamda toplanmış olur. 
     Örneği incelediğimizde fabrika yordam olan formatAl yordamı oluşturulacak resmin "uzunluk" ve "genişlik" değiştirgelerini de almaktadır. 
     Fabrika yordam üzerinde şöyle bir mantık oluşturulmuştur: 
        Üretilecek olan resmin alanı 100 birimden büyükse "jpeg", değilse "gif" formatında olsun. 
        Nesne yaratma ile ilgili bu mantığın da fabrika yordamda bulunduğuna dikkat edin.

### 3 - Soyut Yordam(Abstract Factory)
####    Yaratılma sorumluluklarının çeşitli sınıf hiyerarşileri ile sağlandığı bir tasarım desenidir. İstemci sınıf, çeşitli kategorideki sınıflara ihtiyaç duyar. Bu sınıflar, sistemde alt/üst sınıf hiyerarşileri şeklinde bulunurlar. "Soyut Fabrika" tasarım deseni bu karmaşık ve farklı hiyerarşideki sınıfların yaratılma sorumluluğunu çeşitli fabrika sınıflarına verir. İstemci ilk önce verdiği kriterlere göre uygun bir fabrika sınıfını seçer. Ardından seçtiği fabrika nesnesi, istemcinin ihtiyaç duyduğu sınıfları yaratıp istemciye döner. İstemci sınıf, kullandığı sınıfların sadece üst sınıflarını, yani soyut sınıflarını bilir. Bu sınıfları ona yaratıp döndüren fabrika sınıfının da sadece soyut sınıfını içerir. Alttaki detaylar istemci sınıftan gizlenmiş, sorumluluk "Soyut Fabrika" tasarım deseni ile fabrika sınıflarına verilmiştir. Bu tasarım deseni Fabrika Yordam tasarım desenine benzer. Fakat bu tasarım deseninde yaratılacak birden fazla sınıf hiyerarşisi tipi bulunur. Fakat "fabrika yordam" tasarım deseninde tek tip nesne yaratılması ihtiyacı bulunur.Kısaca bu tasarım deseni ile birden fazla sınıf hiyerarşisi nesneleri, kurulacak birden fazla fabrika nesneleri ile yaratılır. İstemci kendisine uygun fabrika nesnesini yarattırır. İhtiyacı olan nesnelerin yaratılma sorumluluğunu fabrika nesnelerine bırakır.
######
    "Örnek uygulamamızda "Sipariş Gönderici" bir sistem tasarlıyoruz. 
    Sipariş sisteme verildikten sonra, bir ödeme yöntemi ve siparişin durumu hakkında bilgi vermek için bir de bildirim yöntemi seçilmek zorundadır. 
    Sistemde siparişler hızlı ve normal olarak ikiye ayrılmıştır.
     
     Bildirim yöntemleri ve ödeme yöntemlerinin oluşturulmaları soyut fabrika sınıflarına verilmiştir. 
     Ayrıca sipariş yöntemini oluşturmak da yine bir soyut fabrika sınıfına verilmiştir. 
     Sistemde çalışacak ve farklı kategorilerdeki sınıfları oluşturmak için burada soyut fabrika tasarım deseni kullanılabilir. 
     Siparişin yöntemine göre ( hızlı veya normal ) bildirim ve ödeme yöntemi değişmektedir. 
     Normal gönderimlerde bildirim yöntemi olarak "e-posta", ödeme yöntemi olarak da "posta çeki" kullanılmaktadır. 
     Hızlı sipariş yönteminde ise bildirim yöntemi olarak "sms", ödeme yöntemi olarak da "havale" kullanılmaktadır. 
     Soyut fabrika tasarım desenimiz bu şekilde tasarlanacaktır. 
     Görüldüğü gibi sistemde farklı kategorilerde birden fazla sınıf hiyerarşisinden ihtiyaç duyulan sınıfların yaratılma gereksinimi bulunmaktadır.
     
     Sistem şöyle çalışmaktadır: İlk önce istemci sınıf olan SiparişGönderici sınıfına iki adet değiştirge geçilmektedir. 
     Bu değiştirgelerden birincisi sipariş yöntemini ( "hızlı", "normal" ) seçmektedir. 
     İkinci değiştirge ise sipariş tutarını belirlemektedir. 
     Birinci değiştirge girildikten sonra, bu değiştirgenin değerine göre sipariş yöntemi sınıflarından biri yaratılarak dönülecektir. ( HızlıSiparişNesneFabrikası veya NormalSiparişNesneFabrikası ). 
     Bu iki sınıf da ödeme tipi ve bildirim sınıf hiyerarşilerinden bir tane sınıf yaratarak dönmektedir. 
     HızlıSiparişNesneFabrikası sınıfı ÖdemeTipi sınıfı olarak Havale'yi, Bildirim sınıfı olarak da Sms'i dönmektedir. 
     NormalSiparişNesneFabrikası sınıfı ÖdemeTipi sınıfı olarak PostaÇeki'ni, Bildirim sınıfı olarak da Eposta'yı dönmektedir
     
     Örnek uygulamamızda birinci parametre olarak "hızlı", ikinci parametre olarak da 105 girilmiştir."
     
### 4 - ProtoType(Kopya Nesne)
####    Var olan bir nesneden, kopyalama yöntemi ile yeni nesne yaratmak için bu tasarım deseni kullanılır. Nesne yaratmak için "new" operatörü kullanılmaz. Yazılım dillerindeki "clone" gibi, nesne kopyalama yordamlarından faydalanılır. Örneğin java programlama dilinde, bir nesnenin kopyalanabilmesi için, nesnenin "Cloneable" arayüzünden türemiş olması gereklidir. Bazı nesneler çok büyük olup, çok kaynak harcıyor olabilir. Bu nesnelerin yeniden yaratılması yerine, kolonlanması performans ve kaynak kullanımı açısından tasarruf edilmesine yarar. Bu durumlarda "Kopya Nesne" tasarım deseni kullanılabilir.
######
     Örnekte, kopyalanabilme özelliğine sahip ( Java Cloneable arayüzünden türemiş ) bir Resim sınıfı bulunmaktadır. 
     Bu sınıfın renk, boy, en gibi sınıf değişkenleri bulunmakta ve bir de kopyasının alınmasına yarayan ve dışarıdan çağırılabilen ( public ) bir "kopyaAl" yordamı vardır. 
     İstemci sınıf (ResimÜretici) bu yordam ile sınıfın kopyasını oluşturabilmektedir.

### 5 - Builder(Kurucu)
####    Bu tasarım deseni ile bir nesneyi, bir sınıfı, aşama aşama farklı özellikleri ile oluşturabiliriz. Nesneyi farklı özellikler ile oluşturmaya yarayan bu sınıfa Kurucu nesne ismi verilir. Kurucu nesneden farklı özelliklerde alt sınıflar da türeyebilir. Kurucunun oluşturduğu nesneye ihtiyaç duyan istemci sınıf, istediği özelliklerde nesneyi oluşturabilecek kurucu oluşturur ve kurucuya istediği nesnenin oluşması için isteklerde bulunur. En sonunda da bu nesneyi alır ve kullanır. İstemci böylece nesne yaratma sorumluluğunu kurucu nesneye bırakmış olur. Tabi her basit nesnenin, bir de kurucusunu oluşturmaya gerek yoktur. Kurucu nesne genelde, içinde çok özellik barındıran, karmaşık nesnelerin oluşumunda görev alması daha yerindedir.
######
     Örnek uygulamada, yaratılacak nesne Pide nesnesidir. 
     Pide sınıfının kurucusu, PideKurucusu ismindeki sınıftır. 
     Pide kurucusu, Lahmacun ve KuşbaşılıPide şeklinde iki çeşittir. 
     İstemci nesne yani Aşçı, Pide sınıfının yaratılma sorumluluğunu PideKurucu kurucu sınıfına bırakmıştır. 
     Pide kurucusu, "malzemeKur", "hamurKur" ve "baharatKur" yordamları ile nesnenin kademe kademe kurulumuna ve yeni özellikler kazanmasına imkan kılar. 
     Örnekte PideSalonu nesnesi, kurucusunu "LahmacunPideKurucu" olarak seçer ve bunu Aşçı sınıfına geçer. 
     Aşçı kademe kademe nesneyi ( Pide ) yi oluşturur ve istemciye geri döner.