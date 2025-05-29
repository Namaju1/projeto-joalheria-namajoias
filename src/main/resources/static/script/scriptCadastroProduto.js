document.addEventListener("DOMContentLoaded", () => {

	const form = document.getElementById("cadastroProduto");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

        const nomeProduto = document.getElementById("nomeProduto").value;
		const descricao = document.getElementById("descricao").value;
		const preco = parseFloat(document.getElementById("preco").value);
		const imgUrl = document.getElementById("imgUrl").value;
		const tipoProduto = {	
			idTipoProduto: parseInt(document.getElementById("categoria").value)
		}
	
		try {
			const response = await fetch("http://localhost:8080/cadastroproduto", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
                    nomeProduto,
					descricao,
					preco,
					imgUrl,
					tipoProduto
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