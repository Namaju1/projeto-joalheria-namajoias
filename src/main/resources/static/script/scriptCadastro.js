// Aguarda o carregamento da página
document.addEventListener("DOMContentLoaded", function() {

	// Seleciona o formulário pelo ID
	const form = document.getElementById("cadastroClienteForm");

	// Adiciona um evento de submit no formulário
	form.addEventListener("submit", function(event) {
		event.preventDefault(); // Impede o envio padrão do formulário

		// Captura os valores digitados nos campos

		const nomeUsuario = document.getElementById("nomeUsuario").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const data_nascimento = document.getElementById("data_nascimento").value;
		const senha = document.getElementById("senha").value;

		// Envia os dados para o backend usando fetch
		fetch('http://localhost:8080/cadastrocliente', { // <-- URL do seu backend Spring Boot
			method: 'POST', // Método HTTP
			headers: {
				'Content-Type': 'application/json' // Tipo de conteúdo enviado
			},
			body: JSON.stringify({
				nomeUsuario,
				cpf,
				email,
				telefone,
				data_nascimento,
				senha
			})
		})
			.then(response => {
				if (!response.ok) {
					throw new Error('Erro ao cadastrar pessoa');
				}
				return response.json(); // Pega o corpo da resposta (esperando que venha o objeto com id)
			})
			.then(data => {
				// Armazena o ID da pessoa no localStorage
				localStorage.setItem('clienteId', data.id); // Supondo que o backend retorne { id: 1, ... }

				// Redireciona para a página de endereço
				window.location.href = 'endereco.html';
			})

	})
		.catch(error => {
			// Mostra o erro no console
			console.error('Erro no cadastro:', error);
			alert('Falha ao cadastrar pessoa. Tente novamente.');
		});
});

