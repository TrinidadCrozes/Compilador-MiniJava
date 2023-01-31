package minijavaCompiler.semantic.nodosAST.nodosSentencia.NodosBloquePredefinidos;

import minijavaCompiler.semantic.entidades.TablaDeSimbolos;
import minijavaCompiler.semantic.nodosAST.nodosSentencia.NodoBloque;

public class NodoBloquePrintSln extends NodoBloque {

    public NodoBloquePrintSln(){
        super();
    }

    public void generar() {
        TablaDeSimbolos.codigo.add("LOAD 3  ; Apila el parámetro");
        TablaDeSimbolos.codigo.add("SPRINT  ; Imprime el booleano en el tope de la pila");
        TablaDeSimbolos.codigo.add("PRNLN  ; Imprime el caracter de nueva línea");
    }
}
