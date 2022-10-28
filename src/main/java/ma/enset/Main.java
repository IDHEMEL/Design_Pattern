package ma.enset;
import ma.enset.Composite.*;
import ma.enset.patterns.observer.Parametrage;
public class Main {
    public static void main(String[] args) {
        Figure figure1=new Cercle(new Point(30,20),50);
        System.out.println(figure1.getPerimetre());
        System.out.println(figure1.getSurface());
        figure1.dessiner();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Figure figure2=new Rectangle(new Point(3,2),5,20);
        System.out.println(figure2.getPerimetre());
        System.out.println(figure2.getSurface());
        figure2.dessiner();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Parametrage parametrageObservale=new Parametrage();
        parametrageObservale.addObserver(figure1);
        parametrageObservale.addObserver(figure2);
        parametrageObservale.setCouleurContour(200);
        figure1.dessiner();
        figure2.dessiner();
        System.out.println("^^^^^^^^^^^^^^^^Groupe^^^^^^^^^^^^^^^^");
        GroupeFigures groupeFigures=new GroupeFigures();
        Figure f=groupeFigures.addFigure(figure1);
        GroupeFigures g2=(GroupeFigures) groupeFigures.addFigure(new GroupeFigures());
        g2.addFigure(figure2);
        groupeFigures.dessiner();
    }
}