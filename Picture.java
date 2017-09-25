/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square sky;
    private Square grass1;
    private Square grass2;
    private Square grass3;
    private Square grass4;
    private Square grass5;
    private Square grass6;
    private Square grass7;
    private Square grass8;
    private Square grass9;
    private Square grass10;
    private Triangle mountain1;
    private Triangle mountain2;
    private Circle sun;
    private Person kid;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.moveHorizontal(-310);
        sky.moveVertical(-120);
        sky.changeSize(500);
        sky.changeColor("blue");
        sky.makeVisible();
        
        grass1 = new Square();
        grass1.moveHorizontal(129);
        grass1.moveVertical(120);
        grass1.changeColor("green");
        grass1.makeVisible();
        
        grass2 = new Square();
        grass2.moveHorizontal(69);
        grass2.moveVertical(120);
        grass2.changeColor("green");
        grass2.makeVisible();
        
        grass3 = new Square();
        grass3.moveHorizontal(9);
        grass3.moveVertical(120);
        grass3.changeColor("green");
        grass3.makeVisible();
 
        grass4 = new Square();
        grass4.moveHorizontal(-69);
        grass4.moveVertical(120);
        grass4.changeColor("green");
        grass4.makeVisible();
        
        grass5 = new Square();
        grass5.moveHorizontal(-129);
        grass5.moveVertical(120);
        grass5.changeColor("green");
        grass5.makeVisible();
        
        grass6 = new Square();
        grass6.moveHorizontal(-189);
        grass6.moveVertical(120);
        grass6.changeColor("green");
        grass6.makeVisible();
        
        grass7 = new Square();
        grass7.moveHorizontal(-249);
        grass7.moveVertical(120);
        grass7.changeColor("green");
        grass7.makeVisible();
        
        grass8 = new Square();
        grass8.moveHorizontal(-309);
        grass8.moveVertical(120);
        grass8.changeColor("green");
        grass8.makeVisible();
        
        grass9 = new Square();
        grass9.moveHorizontal(-369);
        grass9.moveVertical(120);
        grass9.changeColor("green");
        grass9.makeVisible();
        
        grass10 = new Square();
        grass10.moveHorizontal(-20);
        grass10.moveVertical(120);
        grass10.changeColor("green");
        grass10.makeVisible();
        
        mountain1 = new Triangle();  
        mountain1.changeSize(200, 210);
        mountain1.moveHorizontal(-60);
        mountain1.moveVertical(-100);
        mountain1.changeColor("magenta");
        mountain1.makeVisible();
        
        mountain2 = new Triangle();  
        mountain2.changeSize(200, 210);
        mountain2.moveHorizontal(20);
        mountain2.moveVertical(-100);
        mountain2.changeColor("magenta");
        mountain2.makeVisible();    

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-80);
        sun.makeVisible();
        
        kid = new Person();
        kid.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("black");
            grass1.changeColor("white");
            grass2.changeColor("white");
            grass3.changeColor("white");
            grass4.changeColor("white");
            grass5.changeColor("white");
            grass6.changeColor("white");
            grass7.changeColor("white");
            grass8.changeColor("white");
            grass9.changeColor("white");
            grass10.changeColor("white");
            mountain1.changeColor("white");
            mountain2.changeColor("white");
            sun.changeColor("white");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky != null)   // only if it's painted already...
        {
            sky.changeColor("blue");
            grass1.changeColor("green");
            grass2.changeColor("green");
            grass3.changeColor("green");
            grass4.changeColor("green");
            grass5.changeColor("green");
            grass6.changeColor("green");
            grass7.changeColor("green");
            grass8.changeColor("green");
            grass9.changeColor("green");
            grass10.changeColor("green");
            mountain1.changeColor("magenta");
            mountain2.changeColor("magenta");
            sun.changeColor("yellow");
        }
    }
}
