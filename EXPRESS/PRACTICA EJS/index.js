const express = require('express');
const app = express();
const sobre_mi = ["Soy apasionado por Linux, los sistemas operativos y la seguridad.", "También soy aprendiz en el desarrollo web.", "Tengo muchas ganas de aprender y mejorar cada día." ];
const intereses = ["Programación", "Linux", "Aprender nuevas tecnologías"];
const objetivos = ["Mejorar mis habilidades en desarrollo web.", "Construir páginas modernas y funcionales."];

app.use(express.static('assets',));
app.use(express.static('views',));
app.use(express.static('fonts',));

app.set('view engine', 'ejs');

app.get('/', (req, res) => {
    res.render('index', { nombre: 'TOMAS', sobre_mi, intereses, objetivos });
});

app.listen(3000, () => console.log("Servidor en http://localhost:3000"));