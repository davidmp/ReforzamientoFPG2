package pe.edu.upeu.reforz;

import pe.edu.upeu.util.LeerTeclado;

public class Ejercicios {
    
    LeerTeclado teclado=new LeerTeclado();

    public void tipoFocos(){
        //definir variables
        int numVerde=0, numBlanco=0, numRojo=0, numTotal=0;
        String colorFoco, opcionCont="si";
        while(opcionCont.toUpperCase().equals("SI")){
            colorFoco=teclado.leer("", "Defina el Color de Foco (Verde, Blanco, Rojo):");
            switch(colorFoco.toUpperCase()){
                case "VERDE": numVerde++;break;
                case "BLANCO": numBlanco++;break;
                case "ROJO": numRojo++;break;
                default: System.out.println("Color Foco No valido!!"); break;
            }
            opcionCont=teclado.leer("", "Desea Continuar Fabricando Focos?");        
        }
        numTotal=numVerde+numBlanco+numRojo;
        System.out.println("El total de focos que se tiene es:"+numTotal);
        System.out.println("El total de focos de color Verde es:"+numVerde);
        System.out.println("El total de focos de color Blanco es:"+numBlanco);
        System.out.println("El total de focos de color Rojo es:"+numRojo);
    }

}