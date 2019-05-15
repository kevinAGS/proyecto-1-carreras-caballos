package FuncionCliente;

import SuperClase.Persona;
//import java.util.Scanner;

public class Cliente  extends Persona  {
//private static Scanner sc =new Scanner (System.in);
    public void AsientosVacios() {
        int TotalAsientos=0;
        int matriz[][]= new int [25][25];
        int con=1;
        if (TotalAsientos<=25){
        for (int i=0;i<25;i++)
        {
            
            for (int k=0;k<25;k++)
            {
            matriz[i][k]= con;
            con++;
            }
        }
        }
    }
    
    

    public void ApuestaCaballo() {
    }
}
