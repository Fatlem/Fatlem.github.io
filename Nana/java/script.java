// script.js
function showGreeting() {
    const name = document.getElementById('nameInput').value;
    const greetingElement = document.getElementById('greeting');

    if (name) {
        greetingElement.textContent = `Selamat Ulang Tahun, ${name}!  yang spesial untuk teman terbaikku! Hari ini adalah hari yang luar biasa karena kita merayakan keberadaanmu, sosok yang luar biasa dan penuh kebaikan. Dalam setiap langkah hidupmu, kamu telah menunjukkan kekuatan, kecantikan, dan ketulusan yang luar biasa.

        Dalam cahayamu, aku menemukan inspirasi yang tak terbatas. Setiap kali kita bersama, kamu membawa sinar kebahagiaan yang mencerahkan hari-hariku. Kamu memiliki kekuatan untuk membuat orang-orang di sekitarmu tersenyum dan merasa diterima. Kamu adalah pilar kekuatan dan ketenangan, bahkan di tengah badai kehidupan.

        Dengan segala kelembutan dan keanggunanmu, kamu memancarkan kecantikan yang sejati. Tapi lebih dari itu, kamu memiliki keindahan dalam hati yang tulus dan baik. Kamu selalu siap untuk mendengarkan, memberikan nasihat yang bijaksana, dan memberikan dukungan tanpa syarat. Kamu adalah teladan yang luar biasa tentang kebaikan dan kebaikan hati.

        Sebagai teman, kamu tidak pernah ragu untuk menunjukkan dukunganmu. Kamu adalah teman yang setia dan tidak pernah kenal lelah. Dalam setiap langkah hidupmu, kamu telah menjadi inspirasi bagi banyak orang, termasuk aku. Aku bersyukur atas kehadiranmu dalam hidupku.

        Hari ini adalah kesempatan bagi kita semua untuk merayakan keberadaanmu yang luar biasa. Kamu adalah sumber kegembiraan, kebahagiaan, dan kebanggaan bagi kita semua. Semoga setiap hari yang kamu lalui membawa berkah dan kebahagiaan yang tak terhitung jumlahnya. Semoga impian dan harapanmu terwujud dalam setiap langkah hidupmu.

        Selamat Ulang Tahun, temanku tercinta! Terima kasih atas semua kebaikan, dan keanggunan yang kamu bagikan dengan dunia ini. Semoga tahun ini dan seterusnya membawa kesuksesan, kesehatan, dan kebahagiaan yang melimpah bagimu.

        Teruslah bersinar, seperti bintang yang selalu menyinari langit malam. Kamu adalah cahaya dalam hidupku.`;
    } else {
        greetingElement.textContent = 'Tolong masukkan nama terlebih dahulu!';
    }
}

document.getElementById('envelope').addEventListener('click', function() {
    const cover = document.querySelector('.envelope-cover');
    const letter = document.querySelector('.envelope-letter');
    cover.style.top = '-50%';
    letter.style.top = '100%';

    setTimeout(() => {
        document.getElementById('envelope').style.display = 'none';
        document.getElementById('container').style.display = 'block';
    }, 500);
});
