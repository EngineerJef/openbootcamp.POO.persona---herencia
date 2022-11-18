public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(26);
        cliente.setTelefono("+573007076311");
        cliente.setNombre("Jefersson Bedoya");
        cliente.setCredito(5000);


        System.out.println("edad: "+cliente.getEdad()+" "+"\ntelefono: "+ cliente.getTelefono()+" "+"\nNombre: "+cliente.getNombre()+" "+"\nSu credito es de "+cliente.getCredito());


        System.out.printf("\n\n####salario###\n");


        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(26);
        trabajador.setTelefono("+573007076311");
        trabajador.setNombre("Jefersson Bedoya");
        trabajador.setSalario(10000);


        System.out.println("\nedad: "+trabajador.getEdad()+" "+"\ntelefono: "+ trabajador.getTelefono()+" "+"\nNombre: "+trabajador.getNombre()+" "+"\nSu salario es de "+trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String telefono;
    private String nombre;



    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getNombre(){
        return this.nombre;
    }
}

class Cliente extends Persona{
    private int credito;
    public void setCredito(int credito){
        this.credito=credito;
    }

    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;
    public void setSalario(int salario){
        this.salario=salario;
    }

    public int getSalario(){
        return this.salario;
    }
}