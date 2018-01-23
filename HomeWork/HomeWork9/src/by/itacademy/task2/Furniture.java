package by.itacademy.task2;

public class Furniture {
    private String furnitureName;
    private  double furnitureSquare;

    public Furniture(String furnitureName, double furnitureSquare) {
        this.furnitureName = furnitureName;
        this.furnitureSquare = furnitureSquare;
    }

    public String getFurnitureName() {
        return furnitureName;
    }


    public double getFurnitureSquare() {
        return furnitureSquare;
    }


    public void describe() {
        System.out.println(String.format("          %s (площадь = %d м2)", furnitureName, furnitureSquare));
    }
}
