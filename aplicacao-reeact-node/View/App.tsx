import { useState } from 'react'
import './App.css'

function App() {
  const [usuario, setUsuario] = useState();
  
  function setNome(nome){
    this.usuario.nome = nome;
  }
  function setSenha(senha){
    this.usuario.senha = senha;
  }
  function setEmail(email){
    this.usuario.email = email;
  }
  function setTel(tel){
    this.usuario.telefone = tel;
  }
  return (
    <div>
      <form>
        <label>Escreva o nome do usuário:</label>
        <input type="text" placeholder="ex: fulana.dina" onChange={setNome}></input>
        <label>Escreva o email do usuário:</label>
        <input type="text" placeholder="ex: fulana.dina" onChange={setEmail}></input>
        <label>Escreva a senha do usuário:</label>
        <input type="text" placeholder="ex: fulana.dina" onChange={setSenha}></input>
        <label>Escreva o telefone do usuário:</label>
        <input type="text" placeholder="ex: fulana.dina" onChange={setTel}></input>
      </form>
    </div>
  )
}

export default App
