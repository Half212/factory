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
public class Cliente {

    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        Carro carro = fabrica.criarCarro();
        carro.exibirInfo();
        carro.color();
        carro.exibirNportas();
        System.out.println();
        fabrica = new FabricaVolks();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        carro.exibirNportas();
        carro.color();
        System.out.println();
        fabrica = new FabricaFord();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        carro.color();
        carro.exibirNportas();
        System.out.println();
        fabrica = new FabricaChevrolet();
        carro = fabrica.criarCarro();
        carro.exibirInfo();
        carro.color();
        carro.exibirNportas();
    }
}
