import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<ArticulosElectronicos> ListaElectronicos = new ArrayList<ArticulosElectronicos>();
    public static void main(String[] args) {
        Menu();

    }

    private static void Menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Bienvenido");
            System.out.println("1.agregar producto");
            System.out.println("2. modificar precio");
            System.out.println("3. mostrar productos");
            System.out.print("4.salir:");
            opc=sc.nextInt();
            switch (opc){
                case 1:

                    AgregarProducto();
                    break;

                case 2:
                    ModificarPrecio();
                    break;


                case 3:
                    MostrarLista();

                    break;

                case 4:
                    System.out.println("saliendo del sistema...");
                    break;


                default:
                    System.out.println("opcion no valida, intente de nuevo");
                    break;
            }

        }while (opc!=4);

    }

    private static void AgregarProducto(){
        Scanner sc = new Scanner(System.in);
        ArticulosElectronicos articulo= null;
        String nombre;
        float peso;
        int codigo;

        System.out.println("ingrese el nombre del producto");
        nombre= sc.nextLine();

        System.out.println("ingrese el peso del producto");
        peso= sc.nextFloat();
        sc.nextLine();

        System.out.println("ingrese el codigo del producto");
        codigo=sc.nextInt();
        sc.nextLine();

        Producto producto= new Producto(nombre,peso,codigo);

        String modelo;
        float precio;

        System.out.println("ingrese el modelo del prodcuto:");
        modelo=sc.nextLine();

        System.out.println("ingrese el precio del prodcuto:");
        precio=sc.nextFloat();
        sc.nextLine();

        int tipoProducto;

        System.out.println("ingrese categoria del Prodcuto");
        System.out.println("1. Telefono movil");
        System.out.println("2. laptop");
        tipoProducto=sc.nextInt();

        if (tipoProducto==1){
            System.out.println("ingresa las pulgadas del celular");
            float pulgadasCelular= sc.nextFloat();
            sc.nextLine();

            System.out.println("ingrese el anio de fabricacion del celular");
            int anioFabricacionCelular= sc.nextInt();
            sc.nextLine();

            articulo= new Telefono(producto,modelo,precio,pulgadasCelular,anioFabricacionCelular);

            ListaElectronicos.add(articulo);
            System.out.println("articulo agregado con exito");
        }if(tipoProducto==2){
            System.out.println("ingresa las pulgadas de la pantalla de la laptop");
            float pulgadasLaptop= sc.nextFloat();
            sc.nextLine();

            System.out.println("ingrese el anio de fabricacion de la laptop");
            int anioFabricacionLaptop= sc.nextInt();
            sc.nextLine();

            articulo= new Laptops(producto,modelo,precio,pulgadasLaptop,anioFabricacionLaptop);
            ListaElectronicos.add(articulo);
            System.out.println("articulo agregado con exito");
        }



    }

    private static void MostrarLista(){
        System.out.println("lista de productos");

        for(int i =0; i<ListaElectronicos.size();i++){

            ArticulosElectronicos articulo = ListaElectronicos.get(i);
            System.out.println("nombre: "+ articulo.getNombre());
            System.out.println("modelo: "+ articulo.getModelo());
            System.out.println("precio: "+articulo.obtenerPrecio());
            System.out.println("---------------------------------------");
        }

    }

    private static void ModificarPrecio(){
        Scanner sc = new Scanner(System.in);

        int codigo;

        System.out.println("ingrese el codigo del producto que desea cambiar el precio");
        codigo= sc.nextInt();

        for(int i =0; i< ListaElectronicos.size(); i++){
            if(codigo==ListaElectronicos.get(i).getCodigo()){
                System.out.println("ingrese el nuevo precio");
                float nuevoPrecio= sc.nextFloat();

                ListaElectronicos.get(i).setPrecio(nuevoPrecio);
                System.out.println("el precio del articulo "+ListaElectronicos.get(i).getNombre()+" ha sido cambiado con exito");
            }
        }

    }
}
