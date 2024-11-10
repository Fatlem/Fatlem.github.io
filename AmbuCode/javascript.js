// Inisialisasi EmailJS dengan User ID Anda
emailjs.init("YOUR_USER_ID"); // Ganti dengan user ID Anda dari EmailJS

// Event listener untuk mengirim formulir
document
  .getElementById("contact-form")
  .addEventListener("submit", function (event) {
    event.preventDefault(); // Menghentikan pengiriman formulir standar

    // Ambil nilai dari input formulir
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var message = document.getElementById("message").value;

    // Kirim email menggunakan EmailJS
    emailjs
      .send("YOUR_SERVICE_ID", "YOUR_TEMPLATE_ID", {
        from_name: name,
        from_email: email,
        message: message,
        to_email: "4nimecom224@gmail.com", // Alamat email penerima
      })
      .then(
        function (response) {
          console.log("Email terkirim!", response);
          alert(
            "Pesan Anda telah terkirim. Kami akan menghubungi Anda segera."
          );
          // Kosongkan formulir setelah sukses
          document.getElementById("contact-form").reset();
        },
        function (error) {
          console.log("Gagal mengirim email", error);
          alert("Terjadi kesalahan. Coba lagi.");
        }
      );
  });
