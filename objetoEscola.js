class NotaEscolas {
    constructor(nome, notaPrimeiroS, notaSegundaS, cargaHoraria, numeroFaltas) {
        this.nome = nome;
        this.notaPrimeiroS = notaPrimeiroS;
        this.notaSegundaS = notaSegundaS;
        this.cargaHoraria = cargaHoraria;
        this.numeroFaltas = numeroFaltas;
    }
    media() {
        return (this.notaPrimeiroS + this.notaSegundaS) / 2;
    }
    calcularFaltas() {
        return (this.numeroFaltas / this.cargaHoraria) * 100;
    }
    situacao() {
        if (this.calcularFaltas() > 30) {
            return `o aluno ${this.nome} está reprovado por faltas`;
        } else if (this.media() < 7) {
            return `o aluno ${this.nome} foi reprovado por nota`;
        }  else if (this.media() === 10) {
            return `parabens aluno ${this.nome} aprovado com distinção`;
        }
        else {
            return `o aluno ${this.nome} foi aprovado com a media ${this.media()} e com ${this.calcularFaltas()}% de faltas`;
        }
    }
    }

const aluno1 = new NotaEscolas("Pedro", 10, 10, 400, 25);
const aluno2 = new NotaEscolas("Paulo", 7, 6, 400, 75);
const aluno3 = new NotaEscolas("Renata", 9, 6, 400, 85);
console.log(aluno1.situacao());
console.log(aluno2.situacao());
console.log(aluno3.situacao());


