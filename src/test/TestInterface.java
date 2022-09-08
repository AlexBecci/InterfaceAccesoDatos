package test;

import accesodatos.*;

public class TestInterface {

    public static void main(String[] args) {
        IAccesoDatos datos = new ImplemetacionMySql();
        //datos.listar();
        imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);

    }

    //El metodo se ejecuta y dependiendo el tipo al que apunta la variable datos el comportamiento sera uno u otro 
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
        datos.actualizar();
    }
}
