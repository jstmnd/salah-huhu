1.  Jenis-jenis automation testing tool 
    **Selenium**
    Selenium merupakan salah satu automation testing tool web yang paling populer dan fleksibel. Selenium diciptakan oleh Jason Huggins pada tahun 2004 dengan nama awal JS Test Runner dengan lisensi opern source dan bertujuan untuk mengganti testing dari manual menjadi automation. Setelah itu namanya diganti menjadi Selenium 1 RC (Remote Control). Namun seiring berjalannya perkembangan zaman, berkembang pula sistem keamanan pada browser sehingga Selenium melakukan merge dengan WebDriver dan membentuk Selenium 2. Seiring berjalannya waktu, pada tahun 2016 Selenium 3 dirilis dan Selenium 1 atau Selenium Remote Control (RC) sudah tidak didukung lagi. Lalu pada tahun 2021, muncul Selenium 4 versi Beta.
    Selenium sendiri dibagi menjadi beberapa jenis, diantaranya:
    a.  Selenium WebDriver
        Selenium WebDriver dapat dikatakan base on code, yang dimana script automation ditulis dengan menggunakan bahasa pemrograman tertentu seperti Java atau Python dengan menggunakan library Selenium WebDriver
    b.  Selenium Integrated Development Environment (IDE)
        Selenium IDE merupakan tools automation testing paling sederhana dan dapat dibilang merupakan yang paling mudah untuk dipelajari. Dengan menggunakan Selenium IDE kita tidak perlu memiliki keahlian pemrograman untuk melakukan testing. Karena pada dasarnya Selenium IDE ini hanya merekam tindakan kita di browser dan dari tindakan yang kita rekam kita dapat menjalankannya berulang-ulang.
    c.  Selenium Grid
        Selenium Grid dapat dikatakan sebagai produk Selenium yang paling canggih karena pengujiannya dapat dijalankan secara paralel, yakni dapat dijalankan di beberapa browser yang berbeda secara bersamaan. Tujuannya adalah untuk menghemat waktu. Misalnya kita mempunyai 100 test yang harus dijalankan untuk 3 browser, maka Selenium Grid adalah solusinya karena apabila kita lakukan satu-satu akan memakan waktu yang cukup lama.

    **Appium**
    Appium adalah automation testing tool open-source yang digunakan untuk aplikasi mobile, baik native, hybrid, maupun web apps. Appium memiliki filosofi "write once, test anywhere", sehingga Appium memungkinkan kita untuk menulis script pengujian yang dapat dijalankan di berbagai platform seluler, seperti iOS, Android, dan juga Windows, tanpa perlu mengubah kode untuk setiap platform. Hal ini berarti bahwa kode yang sama dapat digunakan untuk menguji aplikasi di berbagai perangkat dan sistem operasi, yang secara signifikan menghemat waktu dan upaya dalam developeran dan pemeliharaan script pengujian. Appium menggunakan protokol WebDriver (bagian dari Selenium WebDriver) untuk komunikasi dengan perangkat mobile, yang memungkinkan interoperabilitas dan penggunaan tool yang sama untuk pengujian web dan mobile.
    Namun, Appium tentu memiliki beberapa kekurangan. Meskipun Appium dirancang untuk memudahkan pengujian otomatisasi, masih ada kurva pembelajaran, terutama bagi yang baru mengenal pengujian otomatisasi atau pengujian seluler. Selain itu, karena bekerja di atas platform dan menggunakan protokol WebDriver, memungkinkan terjadinya latensi dalam eksekusi tes, terutama pada pengujian yang memerlukan interaksi intensif dengan perangkat.

    **Postman**
    Postman adalah sebuah platform yang digunakan untuk developeran API (Application Programming Interface) yang memungkinkan kita untuk merancang, menguji, mendokumentasikan, dan memantau API dengan mudah dan efisien. Jadi dapat dikatakan Postman merupakan sebuah aplikasi yang berfungsi sebagai REST CLIENT untuk uji coba REST API. Postman mengukur bagaimana request kita masuk atau tidak ke dalam server dan sever tersebut melakukan respon untuk mengimplementasikan hasil dari request tadi. Sehingga Postman biasa digunakan oleh developer pembuat API sebagai tools untuk menguji API yang telah mereka buat. Ada beberapa method yang terdapat pada Postman, yang paling sering digunakan contohnya:
    a.  GET
        GET merupakan perintah untuk menampilkan data dan parameter yang dikirim dapat terlihat. Jadi method ini digunakan untuk mendapatkan data yang telah ada pada database. GET ini mirip dengan istilah Read dari CRUD dalam implementasi pemrograman web. Seperti implementasi pada web, pada Postman pun penggunaan method GET juga berlaku untuk memperoleh data. Mengingat Postman berperan sebagai API Caller, hasil dari request GET akan menampilkan data sesuai dengan route atau endpoint yang dituju.
    b.  POST
        POST merupakan perintah untuk menambahkan data tetapi parameter yang dikirim tidak terlihat. Jadi POST ini mirip dengan fungsi Insert. Method ini bertugas untuk mengirimkan data ke resource tertentu. Karena fungsinya adalah untuk mengirimkan data, seringkali masukan data melalui API Caller dapat mengakibatkan perubahan pada data.
    c.  PUT
        PUT merupakan perintah untuk mengubah data dan parameter yang dikirim tidak terlihat. PUT ini mirip dengan istilah Update dari CRUD dalam implementasi pemrograman web. Sederhananya, method ini digunakan untuk menggantikan data lama dengan data baru.
    d.  DELETE
        DELETE merupakan perintah untuk menghapus data dan parameter yang dikirim tidak terlihat. DELETE ini mirip dengan istilah Delete dari CRUD dalam implementasi pemrograman web. Sederhananya, method ini digunakan untuk menghapus data pada resource yang telah ada.

    **Katalon**
    Katalon merupakan platform automation testing yang digunakan untuk melakukan automisasi pada pengujiam software secara fungsional. Salah satu kelebihan dari Katalon adalah penggunaan tool yang cukup mudah dimengerti dan tidak mengharuskan penggunanya untuk menguasai bahasa pemrograman secara mendalam. Katalon menggunakan Groovy sebagai engine untuk script mereka. Fitur-fitur yang terdapat pada toolbar Katalon yang sering digunakan misalnya:
    •   Spy Web 
        Tools yang memungkinkan pengguna untuk mengidentifikasi dan merekam objek-objek yang ada dalam aplikasi berbasis web
    •   Spy Mobile 
        Tools yang digunakan untuk tujuan serupa pada aplikasi berbasis mobile.
    •   Record Web
        Fungsi yang memungkinkan pengguna merekam semua aktivitas pengujian yang dilakukan pada aplikasi web.
    •   Record Mobile
        Fungsi yang memungkinkan pengguna merekam semua aktivitas pengujian yang dilakukan pada aplikasi mobile.
    •   Run
        Fitur ini digunakan untuk mengeksekusi skrip pengujian yang telah disusun.
    •   Debug 
        Fitur ini membantu pengguna dalam menemukan dan memperbaiki bug atau kesalahan dalam kode.

    **K6**
    K6 adalah salah satu tools yang bersifat open source yang dapat digunakan untuk melakukan Performance Testing sebuah software. K6 menggunakan bahasa JavaScript untuk melaksanakan testingnya. Ini memudahkan pengembang dan pengujian yang sudah menguasai JavaScript untuk membuat skenario pengujian yang kompleks sesuai kebutuhan proyek mereka. Hal ini memudahkan developer dan tester yang sudah menguasai bahasa JavaScript untuk membuat skenario pengujian yang kompleks sesuai kebutuhan mereka. Selain itu K6 juga dirancang untuk menguji aplikasi di bawah beban tinggi. Sehingga kita dapat dengan mudah mengatur jumlah pengguna virtual yang akan mengakses aplikasi dalam satu pengujian. Hal ini memungkinkan kita untuk mengukur kinerja aplikasi dalam berbagai skenario beban. K6 memberikan kemampuan untuk memantau kinerja aplikasi secara real-time selama pengujian. Sehingga kita dapat mengidentifikasi masalah atau bottleneck yang muncul selama pengujian dan mengambil tindakan perbaikan segera. Untuk penggunaan K6 dalam testing adalah sebagai berikut:
    •   Load Testing
        K6 memungkinkan pengguna untuk dengan cepat dan mudah mensimulasikan beban tinggi pada aplikasi, mengukur kinerja aplikasi dalam kondisi beban maksimum, dan menganalisis hasil uji untuk mengidentifikasi dan memperbaiki bottlenecks.
    •   Performance dan Synthetic Monitoring
        K6 memungkinkan pengguna untuk memantau kinerja aplikasi secara real-time dan membuat skenario tes yang mensimulasikan tindakan pengguna nyata, memungkinkan identifikasi masalah dan perubahan kinerja serta pemberitahuan otomatis.
    •   Chaos dan Reliability Testing
        K6 memungkinkan pengguna untuk mensimulasikan gangguan dan kegagalan sistem, mengukur reliabilitas sistem, serta meningkatkan resiliensi sistem dengan mengidentifikasi dan memperbaiki potensi titik lemah.


2. Pentingnya proses pengujian pada software
    -   Memastikan Kualitas Produk
        Pengujian software merupakan langkah penting untuk memastikan bahwa produk akhir memiliki tingkat kualitas yang baik. Dengan melakukan pengujian menyeluruh, tim developeran dapat mengidentifikasi dan memperbaiki bug serta kesalahan logika yang dapat mempengaruhi kinerja dan keandalan produk.
    -   Mengidentifikasi Bug dan Kekurangan Lainnya
        Proses pengujian membantu dalam mengidentifikasi bug, kesalahan logika, atau kekurangan dalam software. Dengan menemukan masalah ini sebelum perilisan ke pengguna akhir, tim developeran dapat memperbaikinya secara efektif, mengurangi kemungkinan ketidakpuasan pengguna dan kerugian bisnis.
    -   Memenuhi Kebutuhan Pengguna
        Melalui proses pengujian, developer dapat memastikan bahwa software yang dikembangkan dapat memenuhi kebutuhan dan ekspektasi pengguna dengan baik. Dengan memvalidasi fitur dan fungsionalitas produk, pengujian membantu dalam memastikan bahwa produk yang dihasilkan dapat memberikan nilai tambah kepada pengguna.
    -   Meningkatkan Keamanan
        Pengujian juga memainkan peran penting dalam meningkatkan keamanan software. Dengan melakukan pengujian keamanan secara menyeluruh, tim developeran dapat mengidentifikasi dan memperbaiki kerentanan yang dapat dieksploitasi oleh pihak yang tidak bertanggung jawab, sehingga meningkatkan tingkat keamanan produk.
    -   Mengurangi Risiko
        Melalui pengujian yang cermat, tim developeran dapat mengurangi risiko terkait dengan perilisan produk. Dengan mendeteksi dan memperbaiki bug serta masalah potensial sebelum produk diluncurkan ke pasar, risiko kerugian bisnis akibat penggunaan produk yang tidak stabil atau cacat dapat diminimalkan.
    -   Pemeliharaan yang Efisien
        Proses pengujian yang baik dapat membantu dalam menciptakan produk yang lebih mudah untuk dipelihara di masa mendatang. Dengan mengidentifikasi dan memperbaiki masalah software sejak awal, tim developeran dapat mengurangi biaya dan waktu yang diperlukan untuk pemeliharaan jangka panjang, serta meningkatkan daya tahan produk terhadap perubahan lingkungan dan kebutuhan pengguna.


**REFERENSI**
1. https://youtu.be/lENfINbB3Hw?si=0nY2brChqXW7DdNU
2. https://youtu.be/j9EQ3ggZxXs?si=htmva9QFLNv-9X-I 
3. https://danaharum.medium.com/request-rest-api-menggunakan-postman-f260afa54a73#:~:text=Namun%20method%20yang%20paling%20sering%20digunakan%20untuk%20melakukan,data%20via%20postman%20yaitu%20GET%2C%20POST%2C%20PUT%2C%20DELETE.
4. https://hariatylumbantobing.medium.com/mengenal-apa-itu-katalon-studio-d07bb5f1b37d
5. https://medium.com/@myskill.id/k6-for-performance-test-4109f61df03a
6. https://rpl.upi.edu/pentingnya-pengujian-perangkat-lunak-dalam-rekayasa-perangkat-lunak/ 