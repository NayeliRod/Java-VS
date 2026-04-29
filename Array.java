public class Array{
    public static void main(String[]args){

        double[]NOTAS={16,17,18,19,20,15,14,13,12,11};

        for(int i=1; i<NOTAS.length;i++){
            if (NOTAS[i]>=16) {
                System.out.println("La nota es:"+NOTAS[i]);
                System.out.println("Estado: Aprobado");

            }else{
                System.out.println("La nota es:"+NOTAS[i]);
                System.out.println("Estado: Desaprobado");
            }
}
    }

}