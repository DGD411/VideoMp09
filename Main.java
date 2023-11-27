import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(PersonaType.FUMADOR,SourceType.FOSFOROS,mesa));
        personas.add(new Persona(PersonaType.FUMADOR,SourceType.TABACO,mesa));
        personas.add(new Persona(PersonaType.FUMADOR,SourceType.PAPEL,mesa));
        personas.add(new Persona(PersonaType.PROVEEDOR, SourceType.FOSFOROS, mesa));

        personas.forEach(Thread::start);
    }
}