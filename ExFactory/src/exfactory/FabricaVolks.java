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
public class FabricaVolks implements FabricaDeCarro{
    @Override
    public Carro criarCarro() {
return new Gol();
}

}
