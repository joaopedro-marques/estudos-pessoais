const express = require('express');

const routes = express.Router();
const Usuario = require('./controller/usuarios.controllers')

routes.get('/', Usuario.index);
routes.post('/api/usuario', Usuario.create);


module.exports = routes;