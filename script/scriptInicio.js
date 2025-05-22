document.addEventListener("DOMContentLoaded", function() {
   
    const btnCadastro = document.querySelector('.btn-cadastro');
    const bannerContent = document.querySelector('.banner-content');

   
    btnCadastro.addEventListener('click', function(event) {
        event.preventDefault(); //
        bannerContent.innerHTML = 
            <a href="index.html" class="btn-cadastro">Ir para Cadastro</a>
        ;
    });
});