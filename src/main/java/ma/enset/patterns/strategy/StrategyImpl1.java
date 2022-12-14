package ma.enset.patterns.strategy;

import ma.enset.Composite.Figure;
import ma.enset.Composite.GroupeFigures;

import java.util.List;

public class StrategyImpl1 implements Strategy {
    @Override
    public void traiter(List<Figure> figures) {
        for(Figure figure:figures){
            System.out.println("Traitement 1");
            figure.setCouleurContour(0);
            figure.setCouleurRemplissage(80);
            figure.setEpaisseur(8);
            if(figure instanceof GroupeFigures){
                traiter(((GroupeFigures)figure).getFigures());
            }
            figure.dessiner();
        }
    }
}
