# Tech_Career_TodoApp
 Tech Career Full Stack Web Developer BootCamp Final Task


 #Proje Tanıtımı
 Bootcamp için yapıldı, Java Spring boot backend, React frontend ve Mysql veritabanından yararlanıldı. Projenin amacı full stack web development.
 Proje Todolist app. Kullanıcının yapılacaklar listesini tutmasına listeyi güncellemesine eklemesine olanak sağlar.

 #Fronted
 React js kullanıldı, css kütüphanesi olarak bootsrap5'den yararlanıldı.
 
![GitHub Images](./images/frontend.png)

 Frontend Ayaklandırmak için 
 1-NodeJs yüklemelisiniz ve Npm yüklemelisiniz.
 2-cd frontend
 3-npm install
 4-npm- start


 #Backend
 Spring boot, Java SE 17 ve Mysql. Spring boot proje bağımlılıkları pom.xml mevcuttur.
 
<blockquote class="imgur-embed-pub" lang="en" data-id="a/WO9ASfo"  ><a href="//imgur.com/a/WO9ASfo">Backend</a></blockquote><script async src="//s.imgur.com/min/embed.js" charset="utf-8"></script>

  Mysql bağlantıları için terminal açıp create database todolist yazın.

API Sorguları
1- Post /users :Kullanıcı ekler
2- Post /users/{userId}/todos :Kullanıcı id sine göre yapılcak ekler
3- Post /users/todos/{todoId} :Yapılacakları günceller yapılıp yapılmadığını kontrol eder
4- Get /users/{userId} :Kullanıcı id sine verileri çeker.
5- Delete /users/{userId} :Kullanıcı id sine göre veritabanından kullanıcıyı kaldırır
6- Delete /users/{userId}/todos/{todoId} :Kullanıcı id ve yapılacak id ye göre yapılacakları siler


Not:Projeyi 4 saatte hazırlamaya çalıştım saat 18:30 iş çıkışından itibaren devam ettim yetiştiremediğim için kullanıcı girişi yapamadım bundan dolayı kullanıcı kendi veritabanımdaki olan kullanıcıdan gelmektedir. Geri kalan frontend ve backend bağlantılarını oluşturamadım yetiştiremediğim için üzgünüm. Bootcamp başlangıcında freelancer olarak çalışıyordum fakat son haftalar bir yazılım firmasından işe bağlamamdan dolayı projeyi yetiştiremedim.
