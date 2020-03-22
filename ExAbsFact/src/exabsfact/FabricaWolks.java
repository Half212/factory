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
public class FabricaWolks implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Cronos();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Gol();
    }

    @Override
    public CarroSUV criarCarroSUV() {
        return new TCross();
    }
    
}
