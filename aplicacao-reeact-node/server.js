import app from './server/src/app'


const port = process.env.PORT || 5000;

app.listen(port, () =>{
  console.log(`Servidor escutando na porta ${port}`)
})