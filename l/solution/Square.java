class Square extends Shape {
    private int side;

    public Square(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("La taille doit être positive");
        }
        this.side = side;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("La taille doit être positive");
        }
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}