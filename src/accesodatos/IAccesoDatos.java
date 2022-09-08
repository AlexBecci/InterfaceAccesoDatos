package accesodatos;

public interface IAccesoDatos {
    //De mantera obligatoria tiene q tener un valor la variable 

    int MAX_REGISTROS = 10;//public static final int ...Es una constante

    //Todosos metodos son publicos y abstractos
    void insertar();//public abstract ...

    void listar();

    //Metodos basico para trabajar con base de datos
    void actualizar();

    void eliminar();
}
