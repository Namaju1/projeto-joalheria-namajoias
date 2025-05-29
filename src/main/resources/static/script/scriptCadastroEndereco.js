document.getElementById("cep").addEventListener("input", async function() {
  const cep = this.value.replace(/\D/g, "");

  if (cep.length === 8) {
    const response = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
    const dados = await response.json();

    if (!dados.erro) {
      document.getElementById("rua").value = dados.logradouro;
      document.getElementById("bairro").value = dados.bairro;
      document.getElementById("cidade").value = dados.localidade;
      document.getElementById("UF").value = dados.uf;
      document.getElementById("complemento").value = dados.complemento;
    } else {
      alert("CEP não encontrado.");
    }
  }
});

document.getElementById("cadastroEnderecoForm").addEventListener("submit", async function(event) {
  event.preventDefault();

  const cep = document.getElementById("cep").value;
  const rua = document.getElementById("rua").value;
  const numero = document.getElementById("numero").value;
  const bairro = document.getElementById("bairro").value;
  const cidade = document.getElementById("cidade").value;
  const UF = document.getElementById("UF").value;
  const complemento = document.getElementById("complemento").value;

  const response = await fetch("http://localhost:8080/cadastroendereco", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({
      cep,
      rua,
      numero,
      bairro,
      cidade,
      estado: UF,
      complemento
    })
  });

  if (response.ok) {
    window.location.href = "sucessocadastro.html";  // Redireciona para a página de sucesso
	
  } else {
    alert("Erro ao cadastrar o endereço.");
  }
});
