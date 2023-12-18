package POO;

public class TestaFiguras {

    public static void main(String[] args) {

        Quadrado fig1 = new Quadrado(10, "Quadrado1");
        Retangulo fig2 = new Retangulo(10, 5, "Retangulo2");

        System.out.println("Figura 1:");
        System.out.println("Nome: " + fig1.getNome());
        System.out.println("Área: " + fig1.getArea());
        System.out.println("Perímetro: " + fig1.getPerimetro());
        System.out.println("Diagonal: " + fig1.getDiagonal());

        System.out.println("\nFigura 2:");
        System.out.println("Nome: " + fig2.getNome());
        System.out.println("Área: " + fig2.getArea());
        System.out.println("Perímetro: " + fig2.getPerimetro());
        System.out.println("Diagonal: " + fig2.getDiagonal());
    }
}
