document.addEventListener("DOMContentLoaded", () => {
  const cepInput = document.getElementById("cep");
  const form = document.getElementById("cadastroEnderecoForm");

  cepInput.addEventListener("input", async function () {
    const cep = this.value.replace(/\D/g, "");
    if (cep.length === 8) {
      try {
        const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
        if (!response.ok) throw new Error("Erro ao buscar o CEP");

        const dados = await response.json();
        if (dados.erro) {
          alert("CEP não encontrado.");
          return;
        }

        document.getElementById("rua").value = dados.logradouro || "";
        document.getElementById("bairro").value = dados.bairro || "";
        document.getElementById("cidade").value = dados.localidade || "";
        document.getElementById("UF").value = dados.uf || "";
        document.getElementById("complemento").value = dados.complemento || "";
        document.getElementById("numero").value = ""; // O usuário deve preencher manualmente
      } catch (error) {
        alert("Erro ao buscar o endereço: " + error.message);
      }
    }
  });

  form.addEventListener("submit", async (event) => {
    event.preventDefault();

    const cep = document.getElementById("cep").value;
    const rua = document.getElementById("rua").value;
    const numero = document.getElementById("numero").value;
    const bairro = document.getElementById("bairro").value;
    const cidade = document.getElementById("cidade").value;
    const UF = document.getElementById("UF").value;
    const complemento = document.getElementById("complemento").value;

    try {
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
          UF,
          complemento
        }),
      });

      if (response.ok) {
        window.location.href = "sucessocadastro.html";
      } else {
        alert("Erro ao cadastrar o endereço.");
      }
    } catch (error) {
      console.error("Erro ao cadastrar o endereço:", error);
      alert("Erro de conexão com o servidor.");
    }
  });
});
