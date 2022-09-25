// language javascript

// regex para aceitar letras maisculas //
const letrasMaisculas = /[A-Z]/;
const palavra1 = 'PEDRO PAULO';
const palavra2 = 'hoje é domingo'
console.log(letrasMaisculas.test(palavra1));
console.log(letrasMaisculas.test(palavra2));


// criar regex para aceitar palavras terminadas com 'id' //
const regexId = /\w+id/;
const palavra3 = 'pedro';
const palavra4 = 'esse é meuid';
console.log(regexId.test(palavra3));
console.log(regexId.test(palavra4));
if (regexId.test(palavra4) === true) {
    console.log('a palavra termina com id');
} else {
    console.log('a palavra não termina com id');
}


//  regex para colocar pelo menos 2 caracter e depois dois pontos, apos isso o item//
const regexCaracteres = /\w{2}:/;
const palavra5 = 'adidas: tenis';
const palavra6 = 'nike: camisa';
const palavra7 = 'roupa stefanini';
console.log(regexCaracteres.test(palavra5));
console.log(regexCaracteres.test(palavra6));
console.log(regexCaracteres.test(palavra7));

// regex para validar endereço de ip //
const regexIp = /\d{3}\.\d{1,3}\.\d{1,3}\.\d{1,3}/;
const ip1 = '127.0.0.1'
const ip2 = '1666.4.13.2'
const ip3 = '12.0.0.1'
console.log(regexIp.test(ip1));
console.log(regexIp.test(ip2));
console.log(regexIp.test(ip3));

// regex para validar usuario aceitar letras de a a z, aceitar _ e - aceitar numeros de 0 a 9  minimos 3 caracteres e maximo 16 caracteres //
const regexUsuario = /[a-z0-9_-]{3,16}/;
const usuario1 = 'pedro_paulo';
const usuario2 = 'pe';
const usuario3 = 'pedro_paulo123';
const usuario4 = 'pedro_paulo123456700000000000009';
console.log(regexUsuario.test(usuario1) == true && usuario1.length >= 3 && usuario1.length <= 16);
console.log(regexUsuario.test(usuario2));
console.log(regexUsuario.test(usuario3));
console.log(regexUsuario.test(usuario1) == true && usuario4.length >= 3 && usuario4.length <= 16);

// criando um array com os usuarios, percorrendo o array e validando se o usuario é valido ou nao
const usuarios = ['pedro_paulo', 'pe', 'pedro_paulo123', 'pedro_paulo123456700000000000009', 'renata__2124'];
for (let i = 0; i < usuarios.length; i++) {
    if (regexUsuario.test(usuarios[i]) == true && usuarios[i].length >= 3 && usuarios[i].length <= 16) {
        console.log(usuarios[i] + ' é um usuario valido');
    } else {
        console.log(usuarios[i] + ' não é um usuario valido');
    }
}

