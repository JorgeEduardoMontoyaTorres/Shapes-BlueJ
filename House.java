/** 
 * Clase: casa
 */
public class House
{
    //Variables de instancia
    Circle ventana;
    Triangle techo;
    Square puerta;
    Square pared;

    /**
     * Constructor para los objetos de la clase House
     */
    public House()
    {
        // inicializa las variables de instancia
        ventana = new Circle();
        techo = new Triangle();
        puerta = new Square();
        pared = new Square();
    }

    /**
     * Metodos
     */
    void dibujate() //Muestra las figuras en pantalla
    {
        ventana.makeVisible();
        techo.makeVisible();
        puerta.makeVisible();
        pared.makeVisible();
    }
    
    void acomodate() //Coloca en un lugar determinado cada figura
    {
        //Pared
        pared.changeSize(140);
        pared.changeColor("green");
        pared.moveDown();
        pared.moveDown();
        pared.moveDown();
        pared.moveDown();
        pared.moveRight();
        
        //Techo
        techo.changeSize(100, 200);
        techo.changeColor("black");
        techo.moveDown();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        
        //Ventana
        ventana.changeSize(50);
        ventana.changeColor("blue");
        ventana.moveDown();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        
        //Puerta
        puerta.changeSize(80);
        puerta.changeColor("red");
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveDown();
        puerta.moveRight();
        puerta.moveRight();
    }
}
