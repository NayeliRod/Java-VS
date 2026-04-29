import java.util.ArrayList;
import java.util.Scanner;
public class MiLista{
    public static void main(String[]args){
        Scanner Leer=new Scanner(System.in);
        ArrayList<String>GestionInvitados=new ArrayList<>();
       System.out.println("Ingrese el nombre del invitado 1:");
       String invitado1=Leer.nextLine();
       GestionInvitados.add(invitado1);
        System.out.println("Ingrese el nombre del invitado 2:");
        String invitado2=Leer.nextLine();
        GestionInvitados.add(invitado2);
         System.out.println("Ingrese el nombre del invitado 3:");
         String invitado3=Leer.nextLine();
         GestionInvitados.add(invitado3);
          System.out.println("Ingrese el nombre del invitado 4:");
          String invitado4=Leer.nextLine();
          GestionInvitados.add(invitado4);
System.out.println("¿Aqué numero de invitado desea eliminar?");
System.out.println("Recuerde: 0 es el primer invitado,1 es el segundo invido,...");
int IndiceBorar=Leer.nextInt();
if(IndiceBorar < GestionInvitados.size()){
    String Eliminado=GestionInvitados.remove(IndiceBorar);
System.out.println("El invitado "+Eliminado+" ha sido eliminado de la lista.");
}else{
    System.out.println("El número ingresado no es válido.");
}


       System.out.println("------------------------------------");
System.out.println("-------MI LISTA DE INVITADOS--------");
        for (int i=0;i<GestionInvitados.size();i++) {
            System.out.println(GestionInvitados.get(i));
        }
    }

}
