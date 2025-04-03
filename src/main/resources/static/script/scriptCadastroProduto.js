document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastroProdutoForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

        const nomeProduto = document.getElementById("nomeProduto").value;
		const preco = document.getElementById("preco").value;
		const cor = document.getElementById("cor").value;

		try {
			const response = await fetch("http://localhost:8080/cadastroproduto", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
                    nomeProduto,
					preco,
					cor
				}),
			});

			if (response.ok) {
				window.location.href = "sucessocadastro.html";
			} else {
				alert("Erro ao cadastrar o produto do cliente");
			}
		} catch (error) {
			console.error("Erro ao cadastrar o produto do cliente", error);
		}

	});

});