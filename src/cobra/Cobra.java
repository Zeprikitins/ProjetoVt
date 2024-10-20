package modelo;

import java.util.Date;

import modelo.Animal;

public class Cobra extends Animal{

private String especie;


//construtor

public Cobra(int identificador, String nome, Date dataNascimento, char sexo, String tamanho, double peso,
        String situacao, String recinto, String especie) {
    super(identificador, nome, dataNascimento, sexo, tamanho, peso, situacao, recinto);
    this.especie = especie;
        }

//getter&setter



public String getEspecie() {
    return especie;
}





public void setEspecie(String especie) {
    if(especie != null){
        this.especie = especie;    
    }else{
        System.out.println("Espécie Inválida");
    }
    
}
}


