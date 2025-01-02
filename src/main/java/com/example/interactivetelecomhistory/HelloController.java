package com.example.interactivetelecomhistory;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;

    @FXML
    private void initialize() {
        // Criando os eventos históricos e associando aos botões
        button1.setUserData(new HistoricalEvent(1837, "Invenção do Telégrafo", "O telégrafo foi inventado por Samuel Morse, revolucionando a comunicação a longa distância. Usando sinais elétricos para transmitir mensagens codificadas em um alfabeto de pontos e traços, o telégrafo permitiu a comunicação rápida entre cidades distantes."));
        button2.setUserData(new HistoricalEvent(1876, "Invenção do Telefone", "Alexander Graham Bell inventou o telefone, um dispositivo que converte ondas sonoras em sinais elétricos e os transmite por fios. Esta invenção possibilitou a comunicação verbal em tempo real entre pessoas em locais distantes, transformando a maneira como o mundo se conectava."));
        button3.setUserData(new HistoricalEvent(1895, "Primeira Transmissão de Rádio", "Guglielmo Marconi fez a primeira transmissão de rádio sem fio, marcando o início da comunicação sem fio. Ele foi pioneiro na transmissão de sinais de rádio a longa distância, um avanço crucial para as futuras inovações na radiodifusão."));
        button4.setUserData(new HistoricalEvent(1927, "Primeira Ligação Telefônica Transatlântica", "A primeira ligação telefônica transatlântica foi realizada entre Nova York e Londres. Esta conquista foi um grande passo na comunicação global, superando as limitações da comunicação por cabo e abrindo o caminho para futuras inovações na telefonia internacional."));
        button5.setUserData(new HistoricalEvent(1962, "Lançamento do Satélite Telstar 1", "O Telstar 1, o primeiro satélite de comunicação ativo, foi lançado com sucesso, permitindo transmissões de TV ao vivo para os Estados Unidos e Europa. O satélite abriu um novo capítulo nas comunicações globais, facilitando a transmissão de sinais através do espaço."));
        button6.setUserData(new HistoricalEvent(1983, "Introdução do Telefone Celular", "O Motorola DynaTAC 8000X foi o primeiro telefone celular comercialmente disponível, marcando o início da revolução móvel. Ele permitiu que as pessoas se comunicassem em movimento, mudando para sempre o modo como a comunicação pessoal era realizada."));
        button7.setUserData(new HistoricalEvent(1989, "Criação da World Wide Web (WWW)", "Tim Berners-Lee inventou a World Wide Web (WWW), um sistema de hipertextos que facilita a navegação e o compartilhamento de informações através da internet. Esta invenção foi fundamental para a popularização da internet e a transformação digital do mundo."));
        button8.setUserData(new HistoricalEvent(1991, "Chegada das Redes 2G", "A introdução das redes móveis 2G trouxe a comunicação digital, substituindo os sistemas analógicos. Com isso, foi possível a transmissão de voz digitalizada, mensagens de texto e maior segurança nas comunicações móveis, impulsionando a telefonia celular para novos horizontes."));
        button9.setUserData(new HistoricalEvent(2007, "Lançamento do iPhone", "O lançamento do iPhone pela Apple revolucionou o mercado de smartphones, integrando funcionalidades de telefone, computador e mídia em um único dispositivo. O iPhone popularizou o conceito de dispositivos móveis inteligentes e mudou a forma como interagimos com a tecnologia."));
        button10.setUserData(new HistoricalEvent(2019, "Implementação da Rede 5G", "A chegada da rede 5G trouxe uma nova era para as comunicações móveis, oferecendo velocidades de internet ultrarrápidas e maior capacidade de conectar dispositivos simultaneamente. Isso permitiu avanços em tecnologias como Internet das Coisas (IoT), veículos autônomos e realidade aumentada."));
    }

    @FXML
    private void handleTimelineClick(MouseEvent event) {
        // Obtém o botão clicado
        Button buttonClicked = (Button) event.getSource();

        // Recupera o evento histórico associado ao botão
        HistoricalEvent eventClicked = (HistoricalEvent) buttonClicked.getUserData();

        // Exibe os detalhes do evento
        showEventDetails(eventClicked);
    }

    private void showEventDetails(HistoricalEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Detalhes do Evento");
        alert.setHeaderText(event.getTitle());
        alert.setContentText(event.getDescription());
        alert.showAndWait();
    }
}
