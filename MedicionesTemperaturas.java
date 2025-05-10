import java.util.ArrayList; 

/**
 * Registros de temperaturas diarios de una estacion meteorológica
 * grmkk
 */
public class MedicionesTemperaturas
{
    /**
     * Contiene las mediciones de temperaturas.
     */
    private ArrayList<Integer> registros;
    
    /**
     * Dia del registro
     */
    private int dia;
    
    /**
     * Mes del registro
     */
    private int mes;
    
    /**
     * Constructor de la clase. Inicializa dia y mes con los parámetros respectivos,
     * y la lista de registros se inicializa vacía (sin mediciones).
     * Precondición: 
     *  - dia debe ser un día válido (entre 1 y 31)
     *
     * - mes debe ser un mes válido (entre 1 y 12)
     */
    public MedicionesTemperaturas(int dia, int mes) {
        assert dia >= 1 && dia <= 31;
        assert mes >= 1 && mes <= 12;
        this.dia = dia;
        this.mes = mes;
        this.registros = new ArrayList<Integer>();
    }
    
    /**
     * Agrega una temperatura al registro de temperaturas
     */
    public void agregarRegistro(int nuevaTemperatura) {
        int ceroAbsoluto = -243;
        assert nuevaTemperatura >= ceroAbsoluto ;
        
        registros.add(new Integer(nuevaTemperatura));
    }
    
    /**
     * Muestra todas las temperaturas registradas en 
     * la pantalla. 
     */
    public void imprimirTemperaturas() {
        System.out.println(dia + "/" + mes);
        int pos = 0;
        for (Integer temperatura: registros) {
            System.out.print(pos + ": ");
            System.out.println(temperatura + "C");
            pos = pos + 1;
        }
    }
    
    public int canttempextrem()
    {
        int counter = 0;
        
        for(Integer temp :registros)
        {
            if(temp < -15 || temp > 35){
                counter += 1;
            }
        }
        return counter;
    }
    
    public float PromedioDeTemp()
    {
        int tam = registros.size();
        float promedio = 0;
        for (Integer prom: registros){
            promedio = promedio + prom;
        }
        promedio = promedio / tam;
        return promedio; 
    }
    
}
