package biblioteca;

/*  Programacion Orientada a Objetos
    Nombre: Erick Maldonado
*/   
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MenuBiblioteca {   
 static ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>(); 
 
 public static void main (String []args)throws Exception{
    // Menú de la Aplicacion de la Biblioteca "Andres Segovia" en una ventana
    int opcion=4;
    do{
    String op="";
    op=JOptionPane.showInputDialog(" Bienvenido a la Biblioteca ANDRES SEGOVIA \n\n "
            +"Escoja una de las siguientes opciones del Menú \n\n"
            +"1. Registros de los alumnos de las carreras \n"
            +"2. Pedidos o prestamos de libros o material audiovisual \n" 
            +"3. Mostrar Reportes de Estudiantes \n"
            +"4. Salir de la aplicacion \n");
            opcion=Integer.parseInt(op);
            switch(opcion){
                case 1: addEstudent();break;
                case 2: addPrestamo();break;
                case 3: mostrarReportes();break;
                case 4: JOptionPane.showMessageDialog(null," Salir de la aplicacion \n"+"Gracias por visitarnos");break;
                default:JOptionPane.showMessageDialog(null," Elija una opcion valida \n ","Error opcion",JOptionPane.WARNING_MESSAGE);
            }}while(opcion !=4);         
 }
 public static void addEstudent()throws Exception{
    ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
    Scanner entrada = new Scanner(System.in);
    String nom,gen;
    String ced;
    System.out.println("Ingrese su nombre porfavor");
    nom= entrada.nextLine();
    System.out.println("Ingrese genero del estudiante");
    gen= entrada.nextLine();
    System.out.println("Estudiante de la Carrera de Ingenieria en Tics \n"+
            "Duracion de la Carrera: 10 Semestres \n");
    System.out.println("Ingrese su numero de cedula");
    ced = entrada.nextLine();
    boolean cedC = false;     
    try {
    if (ced.length() == 10){
    int tercerDigito = Integer.parseInt(ced.substring(2, 3));
    if (tercerDigito < 6){
    // Coeficientes de validación cédula - El decimo digito se lo considera dígito verificador
        int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
        int verificador = Integer.parseInt(ced.substring(9,10));
        int suma = 0;
        int digito = 0;
        for (int i = 0; i < (ced.length() - 1); i++) {
        digito = Integer.parseInt(ced.substring(i, i + 1))* coefValCedula[i];
        suma += ((digito % 10) + (digito / 10));
        }   if ((suma % 10 == 0) && (suma % 10 == verificador)) {
        cedC = true;System.out.println("La Cedula ingresada es Correcta");
        }
        else if ((10 - (suma % 10)) == verificador) {
        cedC = true;System.out.println("La Cedula ingresada es Correcta");
        } else {
        cedC = false;
        }
        } else {
        cedC = false;
        }
        } else {
        cedC = false;
        }
    } catch (NumberFormatException nfe) {
        cedC = false;
    } catch (Exception err) {
        System.out.println("Una excepcion ocurrio en el proceso de validadcion");
        cedC = false;
        }   if (!cedC) {
            System.out.println("La Cédula ingresada es Incorrecta");
            System.out.println("La informacion no se guarda en la base de datos \n ");
            System.out.println("Porfavor vuelva a iniciar el  proceso");
        }
   
}
public static void addPrestamo()throws Exception{
    Scanner entrada = new Scanner(System.in);         
    String cod ,titu ,a ,idi ,devL;
    String   codA,dur,tituA,devA;
    int opcion;
    char resultado;
    Date hoy = new Date();
do{
    do{    
        System.out.println("Escoja la opcion que desea solicitar");
        System.out.println("1. Solicitar Prestamo de Libro");
        System.out.println("2. Solicitar Prestamo de AudioVisual");
        System.out.println("3. Devolucion del Libro");
        System.out.println("4. Devolucion de AudioVisual");
        System.out.println("Digite la opcion: ");
        opcion = entrada.nextInt();
        }while(opcion<1 || opcion>4);
    switch(opcion){
            case 1 : // Solicitar Prestamo del Libro  
                    System.out.println("Ingrese el Codigo del Libro que necesita");
                    cod= entrada.nextLine();
                    System.out.println("Ingrese el Titulo del libro");
                    titu= entrada.nextLine();
                    System.out.println("Ingrese el Area al que pertenece el libro");
                    a= entrada.nextLine();
                    System.out.println("Ingrese el Idioma del libro");
                    idi= entrada.nextLine();
                    break;
            case 2 : // Solicitar Prestamo de AudioVisual
                    SimpleDateFormat formato1= new SimpleDateFormat("YYYY/MM/DD ");
                    System.out.println("Ingrese el Codigo del AudioVisual que necesita");
                    codA= entrada.nextLine();
                    System.out.println("Ingrese la duracion del material audiovisual");
                    dur = entrada.nextLine();
                    System.out.println("Ingrese el Titulo del material audiovisual");
                    tituA = entrada.nextLine();
                    break;
            case 3 : //Devolver prestamo de libro
                    devolverlibro();break;
            case 4 : //Devolver prestamo de audiovisual
                    devolveraudiovisual();break;
        }   
        System.out.println("Desea solicitar otro prestamo(s/n): ");
        resultado = entrada.next().charAt(0);
        System.out.println("");
            }while(resultado == 's' || resultado=='S' );
}
public static  void isResponsable( ) {
   if (Estudiante.Libro()) {
            System.out.println("Se ha prestado el libro " + Libro.getIdioma);
        } else {
            System.out.println("No quedan ejemplares del libro " + Libro.getArea() + " para prestar");         
        }

}    

public static void devolverlibro(){ 
//Devolucion del Libro y Audiovisual
    Scanner entrada = new Scanner(System.in);
//cod= Codigo, titu=titulo, a=area,idi= idioma
    String cod,titu,a,idi,devL;
    int opcion;
    char resultado;
    Date hoy = new Date();                 
       System.out.println("Dia que se entrega el libro solicitado"); 
       SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
       System.out.println(formato.format (hoy));
       System.out.println("El libro lo tiene que devolve en 3 dias"); // Se establecio 3    dias de prestamo del libro
       System.out.println("Ingrese la fecha de devolucion del libro");
       devL= entrada.nextLine();
       Date entrega = new Date(2020-1900,6 ,29);
       System.out.println(formato.format(entrega));
       int dias =(int)((entrega.getTime()-hoy.getTime())/86400000); 
       System.out.println("La diferencia entre dias es"+dias);
       
}
public static void devolveraudiovisual(){ 
//Devolucion del Libro y Audiovisual
    Scanner entrada = new Scanner(System.in);
   //codA=codigo audiovisual , dur=durancion, tituA=titulo audiovisual      
    String   codA,dur,tituA,devA;
    int opcion;
    char resultado;
    Date hoy = new Date();                 
       System.out.println("Dia que se entrega el libro solicitado"); 
       SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
       System.out.println(formato.format (hoy));
       System.out.println("El libro lo tiene que devolve en 3 dias"); // Se establecio 3 dias de prestamo del audiovisual
       System.out.println("Ingrese la fecha de devolucion del libro");
       devA= entrada.nextLine();
       Date entrega = new Date(2020-1900,6,29 );
       System.out.println(formato.format(entrega));
       int dias =(int)((entrega.getTime()-hoy.getTime())/86400000);
       System.out.println("La diferencia entre dias es"+dias);
       }
public static void mostrarReportes(){
    /* Ingresar Primero el siguiente numero de cedula: 1722349014 
    luego el segundo numero de cedula es: 1720232550/*/
    Scanner entrada = new Scanner(System.in);
    String ced="1722349014";
    System.out.println("Reportes de Estudiantes");
    System.out.println("Ingrese el numero de cedula del Alumno");
    ced = entrada.nextLine();
    System.out.println("El numero de cedula registra prestamos");
    System.out.println("Estudiante de la Carrera de Ingenieria en Tics \n"+
            "Duracion de la Carrera: 10 Semestres \n"+"Director de Carrera: Ing.German Ñacato \n");
    System.out.println("Ingrese otro numero de cedula");
    String ced1="1720232550";
    ced = entrada.nextLine();
    System.out.println("El numero de cedula no registra prestamos");
    System.out.println("Estudiante de la Carrera de Administracion de Empresas \n"+
            "Duracion de la Carrera: 9 Semestres \n"+"Director de Carrera: Ing.Carmen Aguilar \n");
}
}