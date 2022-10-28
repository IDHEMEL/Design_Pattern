package ma.enset.patterns.strategy;

import ma.enset.Composite.Figure;

import java.util.List;

public class StrategyImpl2 implements Strategy {
    @Override
    public void traiter(List<Figure> figures) {
        for(Figure figure:figures){
            System.out.println("Traitement 2");
            figure.setCouleurContour(77);
            figure.dessiner();
        }
    }
}
