/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfactory;

/**
 *
 * @author 182130914
 */
public class Celta implements Carro{

    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Celta\nFabricante:\n" +"Chevrolet");
    }

    @Override
    public void exibirNportas() {
        System.out.println("O Nº de Portas é 4");
    }

    @Override
    public void color() {
        System.out.println("A cor é Preto");
    }
    
}
