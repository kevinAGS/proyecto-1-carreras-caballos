package SuperClase;

public class Persona  {

    private String Nombre;

    private String FechaNacimiento;

    private String ID;

    private String Correo;

    private String Telefono;

    private String Password;
    
       public Persona() {
    }

    public Persona(String Nombre, String FechaNacimiento, String ID, String Correo, String Telefono, String Password) {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.ID = ID;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    

    public void ReestablecerPassword() {
    }

    public void IniciarSecion() {
    }
}
