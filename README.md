Mesajlaşma Uygulaması
Bu proje, Android Studio ile Kotlin kullanılarak geliştirilmiş basit bir mesajlaşma uygulamasıdır. Kullanıcılar mesaj gönderip alabilir ve mesajlar farklı renklerde baloncuklarla gösterilir. Her gönderilen mesaja otomatik olarak "Mesaj alındı" yanıtı verilir.

Özellikler
Mesaj Gönderme: Kullanıcı, mesaj yazıp gönder butonuna tıklayarak mesaj gönderebilir.
Mesaj Listeleme: Gönderilen ve alınan mesajlar bir listede görüntülenir.
Farklı Baloncuk Renkleri: Kullanıcı mesajları ve otomatik yanıt mesajları farklı renklerde gösterilir.

Ekran Görüntüleri


![1](https://github.com/user-attachments/assets/b0047779-c664-44d1-8cd0-62fbf3fe7cef)

![2](https://github.com/user-attachments/assets/265e6297-676e-431d-8409-f57b42077604)

Gereksinimler
Android Studio Arctic Fox veya daha güncel bir sürüm
Min SDK: 21
Kurulum
Proje Dosyasını İndir veya Kopyala

Projeyi indirmek için, GitHub reposunun sağ üst köşesindeki Code butonuna tıklayın ve Download ZIP seçeneğini seçin.

Android Studio’da Projeyi Açın
Android Studio’yu açın ve Open seçeneğine tıklayarak proje klasörünü seçin.
Proje açıldığında gerekli bağımlılıkların yüklendiğinden emin olun.
Emülatör veya Fiziksel Cihaz Ayarı

Android emülatörünü başlatın veya fiziksel cihazınızı USB ile bağlayın ve USB Hata Ayıklama modunu açın.
Uygulamayı Çalıştırın

Android Studio’da sağ üst köşedeki Run butonuna basarak projeyi çalıştırın.

Kullanım

Mesaj Gönderme: Ana ekranda bulunan metin kutusuna bir mesaj yazın ve Gönder butonuna basın. Mesaj, ekranın sağ tarafında görüntülenecektir.
Otomatik Yanıt: Mesaj gönderildikten kısa bir süre sonra, otomatik yanıt olarak "Mesaj alındı" ifadesi ekranın sol tarafında belirecektir.

Proje Yapısı

MainActivity.kt: Uygulamanın ana aktivitelerini ve mesaj gönderme işlevlerini içerir.
MessageAdapter.kt: RecyclerView için oluşturulmuş bir adaptör sınıfıdır.
Message.kt: Her mesajın içeriğini ve gönderici bilgisini tutan veri sınıfıdır.
