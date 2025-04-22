document.getElementById("cep").addEventListener("input", async function () {
    const cep = this.value.replace(/\D/g, "");  // Remove qualquer caractere não numérico

    // Verifica se o CEP tem 8 caracteres (o formato correto)
    if (cep.length === 8) {
        try {
            // Faz a requisição à API do ViaCEP
            const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);

            if (!response.ok) throw new Error("Erro ao buscar o CEP");

            const dados = await response.json();

<<<<<<< HEAD
			if (dados.erro) {
				alert("CEP não encontrado.");
				return;
			}
			document.getElementById("rua").value = dados.logradouro;
			document.getElementById("numero").value = dados.numero;
			document.getElementById("numero").value = dados.bairro;
			document.getElementById("bairro").value = dados.bairro;
			document.getElementById("cidade").value = dados.localidade;
			document.getElementById("UF").value = dados.uf;
			document.getElementById("complemento").value = dados.complemento;
			
			document.getElementById("rua").value = dados.logradouro || "";
			document.getElementById("numero").value = ""; // Não vem da API, o usuário preenche
			document.getElementById("bairro").value = dados.bairro || "";
			document.getElementById("cidade").value = dados.localidade || "";
			document.getElementById("UF").value = dados.uf || "";
			document.getElementById("complemento").value = dados.complemento || "";
		} catch (error) {
			alert("Erro ao buscar o endereço: " + error.message);
		}
	}
=======
            if (dados.erro) {
                alert("CEP não encontrado.");
                return;
            }

            // Preenche os campos do formulário com os dados retornados da API
            document.getElementById("rua").value = dados.logradouro || "";
            document.getElementById("numero").value = ""; // Campo para o usuário preencher
            document.getElementById("bairro").value = dados.bairro || "";
            document.getElementById("cidade").value = dados.localidade || "";
            document.getElementById("UF").value = dados.uf || "";
            document.getElementById("complemento").value = dados.complemento || "";

        } catch (error) {
            alert("Erro ao buscar o endereço: " + error.message);
        }
    }
>>>>>>> bdc1805856d27e1b3682ce5485812135fff05580
});

document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("cadastroEnderecoForm");

    // Verifica se o formulário foi encontrado
    if (form) {
        // Adiciona o ouvinte de evento para o envio do formulário
        form.addEventListener("submit", async (event) => {
            event.preventDefault();  // Impede o envio tradicional do formulário

            // Captura os dados do formulário
            const cep = document.getElementById("cep").value;
            const rua = document.getElementById("rua").value;
            const numero = document.getElementById("numero").value;
            const bairro = document.getElementById("bairro").value;
            const cidade = document.getElementById("cidade").value;
            const UF = document.getElementById("UF").value;

            try {
                // Faz a requisição para salvar os dados
                const response = await fetch("http://localhost:8080/cadastroendereco", {
                    method: "POST",
                    headers: {
                        "Content-Type": "application/json"
                    },
                    body: JSON.stringify({
                        cep,
                        rua,
                        numero,
                        bairro,
                        cidade,
                        UF
                    }),
                });

                // Verifica se a requisição foi bem-sucedida
                if (response.ok) {
                    window.location.href = "sucessocadastro.html";  // Redireciona para a página de sucesso
                } else {
                    alert("Erro ao cadastrar o endereço.");  // Exibe mensagem de erro
                }
            } catch (error) {
                console.error("Erro ao cadastrar o endereço:", error);
                alert("Erro de conexão com o servidor.");  // Exibe mensagem de erro de conexão
            }
        });
    } else {
        console.error('Formulário não encontrado.');
    }
});
