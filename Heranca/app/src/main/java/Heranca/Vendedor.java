/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.Date;

/**
 *
 * @author joaop
 */
public class Vendedor extends Funcionario{
   private int totalItensVendidos;
   private int comissaoPorItem;
   
   public Vendedor(){
       super();
   }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public int getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(int comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
}
