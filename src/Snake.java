public  class Snake extends Reptily
        implements Drawable, Movable{
    @Override
    public void makeVoice() {
        System.out.println("Ssssss");
    }

    @Override
    public void setYear(int i) {

    }

    @Override
    public void Draw() {
        System.out.println("\uD83D\uDC0D");
    }

    @Override
    public String draw3D(String material) {
        return "Отрисовалась змея в 3D формате"
                +"из " + material;
    }

    @Override
    public void move() {
        System.out.println("Zmeya polzet");
    }
}
