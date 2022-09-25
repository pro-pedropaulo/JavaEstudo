let nome = "pedro paulo barros correia da silva";
let nomeMae = "maria maria MARIA";
let nomePai = "antonio antOnIo ANtonio";
let diaNascimento = "02";
let mesNascimento = "11";
let anoNascimento = "1995";

// deixar todas as letras maiusculas
let nomeMaisculo = nome.toUpperCase();
let nomeMaeMaisculo = nomeMae.toUpperCase();
let nomePaiMaisculo = nomePai.toUpperCase();

// deixar todas as primeiras letras de cada palavra maiusculas
let nomePrimeiraMaiuscula = nome.replace(/(^\w{1})|(\s{1}\w{1})/g, match => match.toUpperCase());
let nomeMaePrimeiraMaiuscula = nomeMae.replace(/(^\w{1})|(\s{1}\w{1})/g, match => match.toUpperCase());
let nomePaiPrimeiraMaiuscula = nomePai.replace(/(^\w{1})|(\s{1}\w{1})/g, match => match.toUpperCase());

// escrever mes da data de nascimento por extenso
let mesExtenso = "";
switch (mesNascimento) {
    case "01":
        mesExtenso = "Janeiro";
        break;
    case "02":
        mesExtenso = "Fevereiro";
        break;
    case "03":
        mesExtenso = "Março";
        break;
    case "04":
        mesExtenso = "Abril";
        break;
    case "05":
        mesExtenso = "Maio";
        break;
    case "06":
        mesExtenso = "Junho";
        break;
    case "07":
        mesExtenso = "Julho";
        break;
    case "08":
        mesExtenso = "Agosto";
        break;
    case "09":
        mesExtenso = "Setembro";
        break;
    case "10":
        mesExtenso = "Outubro";
        break;
    case "11":
        mesExtenso = "Novembro";
        break;
    case "12":
        mesExtenso = "Dezembro";
        break;
    default:
        mesExtenso = "Mês inválido";
        break;
}

console.log(nomeMaisculo);
console.log(nomeMaeMaisculo);
console.log(nomePaiMaisculo);
console.log(nomePrimeiraMaiuscula);
console.log(nomeMaePrimeiraMaiuscula);
console.log(nomePaiPrimeiraMaiuscula);
console.log(`${diaNascimento} de ${mesExtenso} de ${anoNascimento}`);