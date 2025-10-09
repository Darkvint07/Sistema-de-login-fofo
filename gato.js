function mostrarGato() {
    var img = document.getElementById('gatoImg');
    img.style.display = 'none';
    fetch("https://api.thecatapi.com/v1/images/search?size=full&mime_types=jpg,png")
        .then(r => r.json())
        .then(dados => {
            img.src = dados[0].url;
            img.onload = () => img.style.display = 'block';
        });
}
