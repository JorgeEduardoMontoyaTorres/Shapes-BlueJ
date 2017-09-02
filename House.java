/** 
 * Clase: casa donde se crearan los objetos de manera de dibujar la figura.
 * @version 17 agosto 2017
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
     * Método que dibuja los objetos necesarios para dibujar la casa.
     */
    void dibujate() //Muestra las figuras en pantalla
    {
        ventana.makeVisible();
        techo.makeVisible();
        puerta.makeVisible();
        pared.makeVisible();
    }
    
    /**
     * Acomoda los objetos de manera que se represente la casa.
     */
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
