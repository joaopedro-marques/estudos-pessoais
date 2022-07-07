import express from 'express';

const usuario = [];

const app = express();

app.use(express.json());

app.get('/', (req,res) => {
  res.status(200).send('Bem vindo ao cadastro de de estudantes!')
})

app.post('/usuario', (req, res) => {
  usuario.push(req.body);
  res.send("Usuário salvo com sucesso!")
})