// script.js
function showGreeting() {
    const name = document.getElementById('nameInput').value;
    const greetingElement = document.getElementById('greeting');

    if (name) {
        greetingElement.innerHTML = `🎂Happy birthday🎂 ${name}! Muachhhh😘😘`;
    } else {
        greetingElement.textContent = 'Pakek Nama Lue Ini!';
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