/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exabsfact;

/**
 *
 * @author 182130914
 */
public class Client {

    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroPopular popular = fabrica.criarCarroPopular();
        CarroSUV suv = fabrica.criarCarroSUV();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();
        suv.exibirInfoSUV();
        System.out.println();
        fabrica = new FabricaFord();
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();
        suv = fabrica.criarCarroSUV();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();
        suv.exibirInfoSUV();
        System.out.println();
        fabrica = new FabricaWolks();
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();
        suv = fabrica.criarCarroSUV();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();
        suv.exibirInfoSUV();
        System.out.println();
       
    }

}
