const express = require('express');
const cookieParser = require('cookie-parser');
const cors = require('cors');
const path = require('path');
const {MongoClient, ServerApiVersion} = require('mongodb');
const routes = require('./src/routes');
const port = 5000;

const uri = "mongodb+srv://joaoadmin:<PINi1f278IKl7xYm>@curso-basico-mern.hjd17wq.mongodb.net/?retryWrites=true&w=majority";
const client = new MongoClient(uri, { useNewUrlParser: true, useUnifiedTopology: true, serverApi: ServerApiVersion.v1 });
client.connect(err => {
   
  console.log("MongoDB conectado!")
  const collection = client.db("test").collection("devices");
  // perform actions on the collection object
  client.close();
});

const app = express();
app.use(cors());

app.use(cookieParser());

app.use(express.json());

app.use(routes);

app.listen(port,  function(){
    console.log(`Server runing on port ${port}`)
});