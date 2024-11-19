class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("La longueur et la largeur doivent être positives");
        }
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("La taille doit être positive");
        }
        this.width = width;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("La taille doit être positive");
        }
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}