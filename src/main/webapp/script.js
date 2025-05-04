function validarFormulario() {
  const usuario = document.getElementById('usuario').value;
  const senha = document.getElementById('senha').value;

  if (usuario.length < 3 || senha.length < 3) {
    alert("Usuário e senha devem ter pelo menos 3 caracteres.");
    return false;
  }

  alert("Login validado!");
  return true;
}
function validarFormulario() {
  const usuario = document.getElementById('usuario').value;
  const senha = document.getElementById('senha').value;

  if (usuario.length < 3 || senha.length < 3) {
    alert("Usuário e senha devem ter pelo menos 3 caracteres.");
    return false;
  }

  alert("Login validado!");
  return true;
}



