const result = document.getElementById("result");
const lados = document.getElementById("NumeroDeLados");

function rolarDados(){
    var numLados = lados.value;
    if(numLados<0) {
        alert("Não a como rodar um dado com 0 lados ou menor!")
        return;
    }
    var resultado = Math.floor(Math.random()* numLados) + 1;

    result.innerHTML = resultado;

}