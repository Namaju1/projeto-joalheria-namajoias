document.addEventListener("DOMContentLoaded",()=>{
    
    const form = document.getElementById("cadastroClienteForm");
    
    form.addEventListener("submit", async(event) =>{
        event.preventDefault();
        
        const nomeUsuario = document.getElementById("nomeUsuario").value;
        const cpf= document.getElementById("cpf").value;
        const email = document.getElementById("email").value;
        const telefone = document.getElementById("telefone").value;
        const data_nascimento = document.getElementById("data_nascimento").value;
		const senha = document.getElementById("senha").value;
        
        try{
            const response = await fetch ("http://localhost:8080/cadastrocliente", {
                method: "POST",
                headers: {
                    "content-type":"application/json"
                },
                body:JSON.stringify({
                    nomeUsuario,
                    cpf,
                    email, 
                    telefone, 
                    data_nascimento,
					senha,
					tipoUsuario:{
						id_usuario: 2
					}
                }),
            });
            
            if (response.ok){
                window.location.href = "cadastroendereco.html";
            }else{
                alert("Erro ao cadastrar o cliente");
            }
        }catch (error) {
            console.error("Erro ao cadastrar o cliente:", error);
        }
    });
});