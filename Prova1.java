/*
 * Copyright (C) 2024 Lucas Gabriel <lucaslgstt@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package avaliacao.n1;
import java.util.Scanner;

public class Prova1 {
    public static void main(String[] args) {
        
        int opcao = 0, qde_expresso=0, qde_capuccino=0, //declaração de váriaveis
            qde_achocolatado=0, qde_cafes_vendidos;  //declaração de váriaveis
        double valor_expresso, valor_capuccino,  //declaração de váriaveis
            valor_achocolatado, valor_cafes_vendidos;  //declaração de váriaveis
        
        Scanner sc = new Scanner(System.in); // entrada
    
        // loop de opções à escolher
        
        do {                                                     
        
                System.out.println("Forneça uma opção: \n"+  // opções para escolher
                                    "1 ­ café expresso; \n"+  // opções para escolher
                                    "2 ­ café capuccino; \n"+  // opções para escolher
                                    "3 ­ achocolatado; \n"+  // opções para escolher
                                    "4 ­ totalizar vendas;");  // opções para escolher
      
                opcao = sc.nextInt();
      
                if ( opcao == 1 ) qde_expresso++;  
                else if (opcao == 2) qde_capuccino++;
                else if (opcao == 3) qde_achocolatado++;
                else if (opcao != 4) System.out.println("Opção inválida");
      
                // loop de valor
                
        } while ( opcao != 4);  
    
        valor_expresso = qde_expresso*0.75;
        valor_capuccino = qde_capuccino;    
        valor_achocolatado = qde_achocolatado*1.55;     
        qde_cafes_vendidos = qde_expresso + qde_capuccino + qde_achocolatado;
        valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_achocolatado;
    
        //saída de valores e produto
        
        System.out.println("Qde café expresso: "+qde_expresso+" ­ valor: "+valor_expresso);
        System.out.println("Qde café capuccino: "+qde_capuccino+" ­ valor: "+valor_capuccino);    
        System.out.println("Qde achocolatado: "+qde_achocolatado+
                            " ­ valor: "+valor_achocolatado);        
        System.out.println("Qde cafés vendidos: "+ qde_cafes_vendidos +
                            " ­ valor cafés vendidos: "+valor_cafes_vendidos);
        System.out.println("Valor Parcial"+ valor_cafes_vendidos);
        System.out.println("Qde cafés vendidos: "+ valor_cafes_vendidos);
    }
}
