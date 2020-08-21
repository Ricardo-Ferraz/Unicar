package view;

import java.util.Scanner;
import exception.ElementoNaoExistente;
import exception.ElementoJaExistente;
import manutenção.IFachada;

public class App{
    private static IFachada fachada = new Fachada();
    
    public void menuPrincipal(){
        fachada.iniciaContador();
        int opcao;
        
        do{
            System.out.println("**************************************************");
            System.out.println("Bem vindo ao Unicar, o estacionamento da Unicap!!");
            System.out.println("1- Cadastrar na Unicar");
            System.out.println("2- CheckIn");
            System.out.println("3- CheckOut");
            System.out.println("4- Checar quantidade de vagas livres");
            System.out.println("5- Checar se meu carro está cadastrado");
            System.out.println("6- Checar a quanto tempo o Carro está no estacionamento");
            System.out.println("7- Fechar Menu");
            System.out.println("Escolha a opção desejada: ");
            opcao= input.nextInt();
            input.nextLine();
            
            switch(opcao){ 
                case 1:
                    System.out.println("Informe seu Nome: ");
                    String nome = input.nextLine();
                    System.out.println("Informe sua matrícula: ");
                    int matricula = input.nextInt();
                    System.out.println("Informe sua idade: ");
                    int idade = input.nextInt();
                    System.out.println("Informe a cor do seu Carro: ");
                    input.nextLine();
                    String cor= input.nextLine();
                    System.out.println("Informe o modelo do seu Carro: ");
                    String modelo = input.nextLine();
                    System.out.println("Informe a placa do seu Carro: ");
                    String placa = input.nextLine();
                    try{
                        fachada.inserirAluno(nome, matricula, idade, cor, modelo, placa);
                        System.out.println("Permitida a entrega do adesivo!");
                    }catch(ElementoJaExistente e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 2: 
                    System.out.println("Informe a placa do seu Carro: ");
                    String a = input.nextLine();
                    try{
                        fachada.checkIn(a);
                        System.out.println("Check-In efetuado com sucesso!");
                    }catch(ElementoJaExistente e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 3:
                     System.out.println("Informe a placa do seu Carro: ");
                     String b = input.nextLine();
                     try{
                        int i= fachada.getTempoVaga(b);
                        fachada.checkOut(b);
                         System.out.println("Check-Out realizado com sucesso!");
                        System.out.println("Seu Carro permaneceu no estacionamento por: "+i+" segundos!");
                     }catch(ElementoNaoExistente e){
                         System.out.println(e.getMessage());
                     }
                     break;
                    
                case 4:
                    System.out.println("Quantidade de vagas livres: "+fachada.qtdVagasLivres());
                    break;
                    
                case 5:
                    System.out.println("Informe a placa do seu Carro: ");
                    String c = input.nextLine();
                    try{
                        fachada.buscarCarro(c);
                        System.out.println("O Carro de placa "+c+" está Cadastrado!");
                    }catch(ElementoNaoExistente e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 6:
                    System.out.println("Informe a placa do seu Carro: ");
                    String d = input.nextLine();
                    try{
                        fachada.getTempoVaga(d);
                        System.out.println("Seu Carro está estacionado fazem: "+fachada.getTempoVaga(d)+" segundos!");
                    }catch(ElementoNaoExistente e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    
                case 7:
                    fachada.finalizaContador();
                    fachada.finalizaContadorVaga();
                    System.out.println("Obrigado por visitar a Unicar!!");
                    System.out.println("Tempo total gasto na Aplicação: "+fachada.getTempo()+" segundos!");
                    System.out.println("**************************************************");
                    return;
                    
                default:
                    System.out.println("Opção inválida!");
            } 
        }while(opcao != 7);
    }
    public static Scanner input = new Scanner(System.in); 
}
