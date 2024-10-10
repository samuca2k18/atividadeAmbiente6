package com.example.atividadeambiente4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    // Definição de campos de entrada e botões da interface
    public TextField entrada2;
    public TextField entrada1;
    public Button openJsWindowButton;
    public Button resultadoContagem;
    public Button resultadoSerie;
    public Button resultadoConversao;
    public Button botaoResultadoCactere;

    @FXML
    private Button quickSortBtn;           // Botão para executar o QuickSort
    @FXML
    private Label resultadoQuickSort;      // Label para exibir o resultado do QuickSort
    @FXML
    private Button mdc;                    // Botão para o cálculo do MDC
    @FXML
    private Button fibonacci;              // Botão para calcular a sequência de Fibonacci
    @FXML
    private Button trocaVariaveis;         // Botão para trocar variáveis
    @FXML
    private Button contagem;               // Botão para contagem
    @FXML
    private Button somaDeNumeros;          // Botão para somar números
    @FXML
    private Button serieInfinita;          // Botão para série infinita
    @FXML
    private Button fatorial;               // Botão para cálculo de fatorial
    @FXML
    private Button inverterDigitos;        // Botão para inverter dígitos
    @FXML
    private Button numeroPrimo;            // Botão para verificar se o número é primo
    @FXML
    private Button caractereParaNumero;    // Botão para converter caractere para número
    @FXML
    private Button conversaoBase;          // Botão para conversão de base
    @FXML
    private Button voltar;                 // Botão para retornar ao menu principal
    @FXML
    private Button resultadoMdc;           // Botão para mostrar o resultado do MDC
    @FXML
    private Label resultadoMdc2;           // Label para exibir o resultado do MDC
    @FXML
    private Label labelIgual;              // Label que exibe o símbolo de igualdade
    @FXML
    private Button resultadoPrimo;         // Botão para mostrar o resultado de número primo
    @FXML
    private Button resultadoFibonacci;     // Botão para mostrar o resultado de Fibonacci
    @FXML
    private Button resultadoSoma;
    @FXML
    private Button calcularFatorial;
    @FXML
    private Button resultadoInverterDigitos;
    @FXML

    private SomaDeNumeros somaDeNumerosObj;

    @FXML
    protected void botaoConverterCaracter() {
        ocultarTodosBotoes();
        entrada1.setVisible(true); // Campo para valor de entrada
        botaoResultadoCactere.setVisible(true); // Botão para realizar a conversão
        resultadoMdc2.setVisible(true);
    }

    // Método para converter os caracteres em decimal
    @FXML
    protected void botaoResultadoConversaoCaractere() {
        // Pega o valor de entrada
        String string = entrada1.getText();

        // Inicializa o objeto CaractereParaNumero com a string
        CaractereParaNumero caractereObj = new CaractereParaNumero(string);

        // Converte para decimal
        int resultado = caractereObj.converterParaDecimal();

        // Exibe o resultado
        resultadoMdc2.setText("O formato decimal de \"" + string + "\" é: " + resultado);
        voltar.setVisible(true); // Mostra o botão de voltar
    }


    // Método para iniciar a funcionalidade de conversão
    @FXML
    protected void botaoConverterBase() {

        ocultarTodosBotoes();
        entrada1.setVisible(true);  // Campo para valor de entrada
        resultadoConversao.setVisible(true);     // Botão para realizar a conversão
        resultadoMdc2.setVisible(true);
    }

    // Método para converter o número para binário
    @FXML
    protected void botaoResultadoConversao() {
        // Pega o valor de entrada
        int n = Integer.parseInt(entrada1.getText());

        // Inicializa o objeto ConversaoBase com o valor
        ConversaoBase conversaoObj = new ConversaoBase(n);

        // Converte para binário
        String resultado = conversaoObj.converterParaBinario();

        // Exibe o resultado
        resultadoMdc2.setText("O número " + n + " em binário é: " + resultado);
        voltar.setVisible(true);  // Mostra o botão de voltar
    }




    @FXML
    protected void botaoInverterDigitos() {
        ocultarTodosBotoes();
        entrada1.setVisible(true);  // Campo para valor de entrada
        resultadoInverterDigitos.setVisible(true);  // Botão para inverter
        resultadoMdc2.setVisible(true);
    }

    // Método para inverter os dígitos do número inserido
    @FXML
    protected void botaoResultadoInverter() {
        // Pega o valor de entrada
        int n = Integer.parseInt(entrada1.getText());

        // Inicializa o objeto InverterDigitos com o valor
        InverterDigitos inverterObj = new InverterDigitos(n);

        // Inverte os dígitos
        int resultado = inverterObj.inverter();

        // Exibe o resultado
        resultadoMdc2.setText("O número invertido é: " + resultado);
        voltar.setVisible(true);  // Mostra o botão de voltar
    }


    @FXML
    protected void botaoCalcularFatorial() {
        ocultarTodosBotoes();
        entrada1.setVisible(true);  // Campo para valor de entrada
        calcularFatorial.setVisible(true); // Botão para cálculo
        resultadoMdc2.setVisible(true);
    }
    @FXML
    protected void botaoResultadoFatorial() {
        // Pega o valor de entrada
        int n = Integer.parseInt(entrada1.getText());

        // Inicializa o objeto Fatorial com o valor
        Fatorial fatorialObj = new Fatorial(n);

        // Calcula o fatorial
        int resultado = fatorialObj.calcularFatorial();

        // Exibe o resultado
        resultadoMdc2.setText("O fatorial de " + n + " é: " + resultado);
        voltar.setVisible(true);  // Mostra o botão de voltar
    }
    @FXML
    protected void botaoCalcularSerie() {
        ocultarTodosBotoes();
        entrada1.setVisible(true);  // Campo para número de termos
        entrada2.setVisible(true);  // Campo para valor de x
        resultadoMdc2.setVisible(true);
        resultadoSerie.setVisible(true);
    }
    @FXML
    protected void botaoResultadoSerie() {
        // Pega os valores de entrada
        int n = Integer.parseInt(entrada1.getText());
        float x = Float.parseFloat(entrada2.getText());

        // Inicializa o objeto SerieInfinita com os valores
        SerieInfinita serieInfinitaObj = new SerieInfinita(n, x);

        // Calcula o valor da série
        float resultado = serieInfinitaObj.calcularSerie();

        // Exibe o resultado
        resultadoMdc2.setText("O valor da série é: " + resultado);
        voltar.setVisible(true);  // Mostra o botão de voltar
    }
    @FXML
    protected void botaoSomaDeNumeros() {
        ocultarTodosBotoes();
        entrada1.setVisible(true);  // Para a quantidade de números
        entrada2.setVisible(true);  // Para o valor de cada número
        resultadoSoma.setVisible(true);
        resultadoMdc2.setVisible(true);
        voltar.setVisible(true);
    }
    @FXML
    protected void botaoResultadoSoma() {
        if (somaDeNumerosObj == null) {
            // Inicializa o objeto SomaDeNumeros com o número de entradas
            int n = Integer.parseInt(entrada1.getText());
            somaDeNumerosObj = new SomaDeNumeros(n);
            resultadoMdc2.setText("Adicione " + n + " números.");
        } else {
            // Adiciona o próximo número à soma
            int num = Integer.parseInt(entrada2.getText());
            somaDeNumerosObj.adicionarNumero(num);

            // Verifica se finalizou a soma
            if (somaDeNumerosObj.finalizado()) {
                // Exibe o resultado final
                resultadoMdc2.setText("A soma dos números é: " + somaDeNumerosObj.getResultado());
                voltar.setVisible(true);  // Mostra o botão de voltar
            } else {
                resultadoMdc2.setText("Número " + somaDeNumerosObj.getResultado() + " adicionado. Faltam " + (Integer.parseInt(entrada1.getText()) - somaDeNumerosObj.i) + " números.");
            }
        }
    }
    // Método para executar o QuickSort
    @FXML
    protected void botaoQuickSort() {
        // Oculta todos os botões e exibe o botão "voltar"
        ocultarTodosBotoes();
        voltar.setVisible(true);
        resultadoMdc2.setVisible(true);

        // Executa o algoritmo QuickSort
        QuickSort quickSortAlgoritmo = new QuickSort();
        String resultado = quickSortAlgoritmo.executarQuickSort();

        // Exibe o resultado no rótulo
        resultadoMdc2.setText(resultado);
    }

    // Método para voltar ao menu principal
    @FXML
    protected void botaoVoltar() {
        // Exibe os botões novamente e limpa os campos e resultados
        exibirTodosBotoes();
        limparCampos();
        voltar.setVisible(false);
    }

    // Método para executar o cálculo do MDC
    @FXML
    protected void botaoMdc() {
        ocultarTodosBotoes();
        labelIgual.setVisible(true);
        entrada1.setVisible(true);
        entrada2.setVisible(true);
        resultadoMdc.setVisible(true);
        resultadoMdc2.setVisible(true);
    }

    // Método para exibir o resultado do MDC
    @FXML
    protected void botaoResultadoMdc() {
        // Pega os números de entrada
        int num1 = Integer.parseInt(entrada1.getText());
        int num2 = Integer.parseInt(entrada2.getText());

        // Executa o cálculo do MDC
        Mdc mdcAlgoritmo = new Mdc();
        String resultado = mdcAlgoritmo.calcularMdc(num1, num2);

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
        voltar.setVisible(true);
    }

    // Método para verificar se o número é primo
    @FXML
    protected void botaoPrimo() {
        ocultarTodosBotoes();
        entrada1.setVisible(true);
        resultadoPrimo.setVisible(true);
        resultadoMdc2.setVisible(true);
    }

    // Método para exibir o resultado do número primo
    @FXML
    protected void botaoResultadoPrimo() {
        // Pega o número de entrada
        int numero = Integer.parseInt(entrada1.getText());

        // Verifica se o número é primo
        NumeroPrimo primoAlgoritmo = new NumeroPrimo();
        String resultado = primoAlgoritmo.verificarPrimo(numero);

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
        voltar.setVisible(true);
    }

    // Método para trocar os valores das variáveis
    @FXML
    protected void botaoTrocaDeVariaveis() {
        ocultarTodosBotoes();
        resultadoMdc2.setVisible(true);

        // Realiza a troca de variáveis
        TrocaDeVariaveis troca = new TrocaDeVariaveis();
        String resultado = troca.trocaDeValores();

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
        voltar.setVisible(true);
    }

    // Método para calcular a sequência de Fibonacci
    @FXML
    protected void botaoFibonacci() {
        ocultarTodosBotoes();
        voltar.setVisible(true);
        resultadoFibonacci.setVisible(true);
        entrada1.setVisible(true);
        resultadoMdc2.setVisible(true);
    }

    // Método para exibir o resultado da sequência de Fibonacci
    @FXML
    protected void botaoResultadoFibonacci() {
        // Pega o número de termos
        int termos = Integer.parseInt(entrada1.getText());

        // Calcula a sequência de Fibonacci
        Fibonacci fibonacci = new Fibonacci();
        String resultado = fibonacci.sequenciaFibonacci(termos);

        // Exibe o resultado
        resultadoMdc2.setText(resultado);
    }
    @FXML
    protected void botaoContagem() {
        ocultarTodosBotoes();
        resultadoContagem.setVisible(true);
        entrada1.setVisible(true); // Para o número de alunos
        entrada2.setVisible(true); // Para as notas
        resultadoMdc2.setVisible(true);
    }

    @FXML
    protected void botaoResultadoContagem() {
        int n = Integer.parseInt(entrada1.getText()); // Número de alunos

        // Aqui assumimos que as notas são inseridas separadas por vírgulas, ex: "55,70,40"
        String[] notasString = entrada2.getText().split(",");
        int[] notas = new int[notasString.length];

        // Conversão das notas para inteiros
        for (int i = 0; i < notasString.length; i++) {
            notas[i] = Integer.parseInt(notasString[i].trim());
        }

        // Instanciando a classe Contagem e chamando o método
        Contagem contagem = new Contagem();
        String resultado = contagem.contarAprovados(n, notas);

        // Exibindo o resultado
        resultadoMdc2.setText(resultado);
        voltar.setVisible(true);
    }

    @FXML


    // Função auxiliar para ocultar todos os botões
    private void ocultarTodosBotoes() {
        quickSortBtn.setVisible(false);
        mdc.setVisible(false);
        fibonacci.setVisible(false);
        trocaVariaveis.setVisible(false);
        contagem.setVisible(false);
        somaDeNumeros.setVisible(false);
        serieInfinita.setVisible(false);
        fatorial.setVisible(false);
        inverterDigitos.setVisible(false);
        numeroPrimo.setVisible(false);
        caractereParaNumero.setVisible(false);
        conversaoBase.setVisible(false);
        resultadoContagem.setVisible(false);
    }

    // Função auxiliar para exibir todos os botões
    private void exibirTodosBotoes() {
        quickSortBtn.setVisible(true);
        mdc.setVisible(true);
        fibonacci.setVisible(true);
        trocaVariaveis.setVisible(true);
        contagem.setVisible(true);
        somaDeNumeros.setVisible(true);
        serieInfinita.setVisible(true);
        fatorial.setVisible(true);
        inverterDigitos.setVisible(true);
        numeroPrimo.setVisible(true);
        caractereParaNumero.setVisible(true);
        conversaoBase.setVisible(true);
        resultadoQuickSort.setText("");
    }

    // Função auxiliar para limpar os campos de entrada e resultados
    private void limparCampos() {
        entrada1.setVisible(false);
        entrada2.setVisible(false);
        labelIgual.setVisible(false);
        resultadoMdc2.setVisible(false);
        entrada1.setText("");
        entrada2.setText("");
        resultadoMdc2.setText("");
        resultadoPrimo.setVisible(false);
        resultadoFibonacci.setVisible(false);
        resultadoMdc.setVisible(false);
        resultadoContagem.setVisible(false);
        botaoResultadoCactere.setVisible(false);
        resultadoConversao.setVisible(false);
        resultadoInverterDigitos.setVisible(false);
        calcularFatorial.setVisible(false);
        resultadoSerie.setVisible(false);
        resultadoSoma.setVisible(false);
        

    }
    @FXML
    protected void abrirJanelaJS() {
        HelloApplication app = new HelloApplication();
        try {
            app.abrirNovaJanela();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}