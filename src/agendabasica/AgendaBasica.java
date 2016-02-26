// Sustentacion Practica 1 Ude@
package agendabasica;

import java.util.Scanner;

public class AgendaBasica {
    
    public static void menu (){
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Ingresar Usuario");
            System.out.println("2. Actualizar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Buscar Usuario");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción: ");
    
    }
    public static void main(String[] args) {
        // Almacena 1 persona: PersonalData Datos = new PersonalData ();
        PersonalData Datos[] = new PersonalData [100]; //Almacena 100 Personas
        Scanner lector = new Scanner (System.in);
        int opc = 0, contUs=0, band=0;//posAux=0; //ContUs me permite saber cuantos usuarios hay en el sistema
        String name; //variable para eliminar buscar y actualizar
    
        do{
            menu();
            opc = lector.nextInt();
            
            
            switch (opc) {
                case 1:
                    if (contUs<99){
                    
                        Datos[contUs] =new PersonalData();//Genera la posicion de Usuario a llenar
                        System.out.print("Digite el nombre del Usuario: ");
                        Datos[contUs].setNombre(lector.next());
                        System.out.print("Digite el apellido del Usuario: ");
                        Datos[contUs].setApellido(lector.next());
                        System.out.print("Digite la fecha de nacimiento del Usuario: ");
                        Datos[contUs].setFecha(lector.next());
                        System.out.print("Digite la cedula del Usuario: ");
                        Datos[contUs].setCedula(lector.next());
                        System.out.print("Digite la direccion del Usuario: ");
                        Datos[contUs].setDireccion(lector.next());
                        System.out.print("Digite el telefono del Usuario: ");
                        Datos[contUs].setTelefono(lector.next());
                        System.out.print("Digite el nombre de las areas: \n1.Quimica"+
                            "\n2.Fisica \n3.Tecnologia \n4.Calculo \n5.Programacion\n");
                        Datos[contUs].setAreas(lector.next());
                        contUs++; 
                    }
                    else
                        System.out.println("NO HAY MAS MEMORIA");
                    break;
                case 2:
                  //Verificando que Almacena
                    /*  System.out.println("Nombre: "+ Datos.getNombre());
                    System.out.println("Apellido: "+ Datos.getApellido());
                    System.out.println("Fecha de Nacimiento: "+ Datos.getFecha());
                    System.out.println("Cedula: "+ Datos.getCedula());
                    System.out.println("Direccion: "+ Datos.getDireccion());
                    System.out.println("Telefono: "+ Datos.getTelefono());
                    System.out.println("Area: "+ Datos.getAreas());
                 */ 
                    System.out.println("Actualizar Datos:\n");
                    System.out.println("Digite el nombre a Buscar");
                    name = lector.next();
                    for(int i=0; i<contUs;i++){
                    
                        if (name.equals(Datos[i].getNombre())){
                            //posAux=i;
                            band = 1;
                            System.out.print("Digite la direccion del Usuario: ");
                            Datos[i].setDireccion(lector.next());
                            System.out.print("Digite el telefono del Usuario: ");
                            Datos[i].setTelefono(lector.next());
                            System.out.print("Digite el nombre de las areas: \n1.Quimica"+
                            "\n2.Fisica \n3.Tecnologia \n4.Calculo \n5.Programacion\n");
                            Datos[i].setAreas(lector.next());
                        }
                    }
                    //Sino encuentra usuario muestra mensaje    
                    if (band==0){
                        System.out.println("Usuarios no encontrado\n");
                    }
                    else
                        band=0;// si no hago esto funcionaria solo la primera vez
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("\nGRACIAS POR USAR EL PROGRAMA, BYE\n");
                    break;
                default:
                    System.out.println("\nOPCION INCORRECTA\n");
                    break;            
                
            }
    
    } while(opc!=5);
    
    }
    
}
