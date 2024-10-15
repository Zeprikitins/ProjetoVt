package animal;

import java.util.Calendar;
import java.util.Date;

public class Animal {
    private int identificador;
private String nome;
private Date dataNascimento;
private char sexo;
private String tamanho;
private double peso;
private String situacao;
private String recinto;
//construtores


public Animal(int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso,
        String situacao, String recinto) {
    this.identificador = identificador;
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.sexo = sexo;
    this.tamanho = tamanho;
    this.peso = peso;
    this.situacao = situacao;
    this.recinto = recinto;
}


//principais
public void imprimir(){

}


public void alimentar(){
    System.out.println("Alimentado!!");
}

public void mover(){
    System.out.println("Moveu!!");
}

public void emitirSom(){
    System.out.println("Emitu um barulho!!");
}



public int calcularIdade(){
    Calendar calendarioNascimento = Calendar.getInstance();
    calendarioNascimento.setTime(dataNascimento);
    int anoNascimento = calendarioNascimento.get(Calendar.YEAR);

    Calendar calendarioAtual = Calendar.getInstance();
    int anoAtual = calendarioAtual.get(Calendar.YEAR);

    int idade = anoAtual - anoNascimento;


    return idade;
}


//getter&setter
public int getIdentificador() {
    return identificador;
}

public void setIdentificador(int identificador) {
    this.identificador = identificador;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    if (nome != null && !nome.isEmpty()) {
        this.nome = nome;
    } else {
        System.out.println("Nome inválido");
    }
}

public Date getDataNascimento() {
    return dataNascimento;
}

public void setDataNascimento(Date dataNascimento) {
    if (dataNascimento != null) {
        this.dataNascimento = dataNascimento;
    } else {
        System.out.println("Data de nascimento inválida");
    }
}

public char getSexo() {
    return sexo;
}

public void setSexo(char sexo) {
    if (sexo == 'M' || sexo == 'F') {
        this.sexo = sexo;
    } else {
        System.out.println("Sexo inválido. O sexo deve ser 'M' (masculino) ou 'F' (feminino).");
    }
}

public String getTamanho() {
    return tamanho;
}

public void setTamanho(String tamanho) {
    if (tamanho != null && !tamanho.isEmpty()) {
        this.tamanho = tamanho;
    } else {
        System.out.println("Tamanho inválido");
    }
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    if (peso > 0) {
        this.peso = peso;
    } else {
        System.out.println("Peso inválido.");
    }
}

public String getSituacao() {
    return situacao;
}

public void setSituacao(String situacao) {
    if (situacao != null && !situacao.isEmpty()) {
        this.situacao = situacao;
    } else {
        System.out.println("Situação inválida.");
    }
}

public String getRecinto() {
    return recinto;
}

public void setRecinto(String recinto) {
    if (recinto != null && !recinto.isEmpty()) {
        this.recinto = recinto;
    } else {
        System.out.println("Recinto inválido.");}
}
}
