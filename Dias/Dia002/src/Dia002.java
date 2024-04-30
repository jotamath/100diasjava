//Dia 002 - Formatar o objeto LocalDateTime

/* O intuito é fazer uma aplicação que busque o horário atual e já passe no formato aceitável de horário
* Checklist:
* 1) Importar os pacotes que lidam diretamente com horário (time.LocalDateTime e time.format.DateTimeFormat)
* 2) Iniciar a classe Dia002
* 3) Criar o formatador (public static)
* 4) Inicializar o main com os códigos
* 5) Fazer uma comparação utilizando a data e o formato adiquirido pelo computador e depois com a formatação!
* 6) Missão cumprida.*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dia002 {
    public static DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("HH:mm, dd/MM/yyyy");

    public static void main(String[] args) {
        LocalDateTime horarioAtual = LocalDateTime.now();
        String horarioFormatado = horarioAtual.format(FORMATADOR);

        System.out.println("O horário sem estar formatado é: \n"+horarioAtual);
        System.out.println("O horário com a formatação desejada é: \n"+horarioFormatado);
    }
}