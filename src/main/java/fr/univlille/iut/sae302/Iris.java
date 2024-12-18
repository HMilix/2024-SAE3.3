package fr.univlille.iut.sae302;

/**
 * Cette classe représente une fleur Iris avec ses attributs de caractéristiques
 * (longueur et largeur des sépales et pétales) ainsi que la variété de l'Iris.
 */
public class Iris {
    private static final String NL = System.getProperty("line.separator");
    private Number sepalLength;
    private Number sepalWidth;
    private Number petalLength;
    private Number petalWidth;
    private final String variety;

    /**
     * Constructeur pour créer une instance de la classe Iris.
     *
     * @param sepalLength Longueur du sépale.
     * @param sepalWidth Largeur du sépale.
     * @param petalLength Longueur du pétale.
     * @param petalWidth Largeur du pétale.
     * @param variety Variété de l'Iris.
     */
    public Iris(Number sepalLength, Number sepalWidth, Number petalLength, Number petalWidth, String variety) {
        this.sepalLength = sepalLength;
        this.sepalWidth = sepalWidth;
        this.petalLength = petalLength;
        this.petalWidth = petalWidth;
        this.variety = variety;
    }

    /**
     * Retourne une représentation sous forme de chaîne des caractéristiques de l'Iris.
     *
     * @return Une chaîne contenant les caractéristiques de l'Iris.
     */
    @Override
    public String toString(){
        return  "Sepal.length : " + sepalLength + NL +
                "Sepal.width : " + sepalWidth + NL +
                "Petal.length : " + petalLength + NL +
                "Petal.width : " + petalWidth + NL +
                "Variety : " + variety;
    }

    /**
     * Obtient la longueur du pétale.
     *
     * @return La longueur du pétale.
     */
    public Number getPetalLength() {
        return petalLength;
    }

    /**
     * Obtient la largeur du pétale.
     *
     * @return La largeur du pétale.
     */
    public Number getPetalWidth() {
        return petalWidth;
    }

    /**
     * Obtient la longueur du sépale.
     *
     * @return La longueur du sépale.
     */
    public Number getSepalLength() {
        return sepalLength;
    }

    /**
     * Obtient la largeur du sépale.
     *
     * @return La largeur du sépale.
     */
    public Number getSepalWidth() {
        return sepalWidth;
    }

    /**
     * Obtient la variété de l'Iris.
     *
     * @return La variété de l'Iris.
     */
    public String getVariety() {
        return variety;
    }

    /**
     * Définit la longueur du pétale.
     *
     * @param petalLength La nouvelle longueur du pétale.
     */
    public void setPetalLength(Number petalLength) {
        this.petalLength = petalLength;
    }

    /**
     * Définit la largeur du pétale.
     *
     * @param petalWidth La nouvelle largeur du pétale.
     */
    public void setPetalWidth(Number petalWidth) {
        this.petalWidth = petalWidth;
    }

    /**
     * Définit la longueur du sépale.
     *
     * @param sepalLength La nouvelle longueur du sépale.
     */
    public void setSepalLength(Number sepalLength) {
        this.sepalLength = sepalLength;
    }

    /**
     * Définit la largeur du sépale.
     *
     * @param sepalWidth La nouvelle largeur du sépale.
     */
    public void setSepalWidth(Number sepalWidth) {
        this.sepalWidth = sepalWidth;
    }

}
