function mostrarOpcoes(linguagem) {
    const opcoesDiv = document.getElementById('opcoes');
    opcoesDiv.innerHTML = '';
    const botoes = ['Primos', 'Somatório', 'Fibonacci', 'MDC', 'QuickSort', 'Contagem'];

    botoes.forEach(op => {
        const botao = document.createElement('button');
        botao.innerText = `${op} (${linguagem})`;
        botao.onclick = () => {
            if (linguagem === 'javascript') {
                executarOperacaoJS(op);
            } else {
                executarOperacaoJava(op);
            }
        };
        opcoesDiv.appendChild(botao);
    });
}

function executarOperacaoJS(operacao) {
    let resultado = '';
    switch (operacao) {
        case 'Primos':
            resultado = calcularPrimos(10); // exemplo para os primeiros 10 números
            break;
        case 'Somatório':
            resultado = somatorio(10); // somatório de 1 a 10
            break;
        case 'Fibonacci':
            resultado = fibonacci(10); // décimo número de Fibonacci
            break;
        case 'MDC':
            resultado = mdc(48, 18); // exemplo com 48 e 18
            break;
        case 'QuickSort':
            resultado = quicksort([3, 6, 8, 10, 1, 2, 1]);
            break;
        case 'Contagem':
            resultado = contagem([1, 2, 3, 4, 5]);
            break;
        default:
            resultado = 'Operação não encontrada';
    }
    document.getElementById('resultado').innerText = `Resultado JavaScript: ${resultado}`;
}

function calcularPrimos(n) {
    const primos = [];
    for (let i = 2; primos.length < n; i++) {
        if (primos.every(p => i % p !== 0)) primos.push(i);
    }
    return primos;
}

function somatorio(n) {
    return (n * (n + 1)) / 2;
}

function fibonacci(n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

function mdc(a, b) {
    return b === 0 ? a : mdc(b, a % b);
}

function quicksort(arr) {
    if (arr.length <= 1) return arr;
    const pivot = arr[0];
    const menores = arr.slice(1).filter(x => x <= pivot);
    const maiores = arr.slice(1).filter(x => x > pivot);
    return [...quicksort(menores), pivot, ...quicksort(maiores)];
}

function contagem(arr) {
    return arr.length;
}

function executarOperacaoJava(operacao) {
    fetch(`http://localhost:8080/operacao?tipo=${operacao}`)
        .then(response => response.text())
        .then(data => {
            document.getElementById('resultado').innerText = `Resultado Java: ${data}`;
        })
        .catch(error => console.error('Erro:', error));
}

