/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceabstract;
public class InterfaceAbstract_MadeNandaWijaVahindra {

    public static void main(String[] args) {
        Account acc1 = new Account("Lendy Elhadi", "12345");
        System.out.println(acc1.getBankName());
        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.print();

    
    }
}
