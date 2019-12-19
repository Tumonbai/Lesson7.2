public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal() {
        @Override
        public void Draw() {

        }

        @Override
        public String draw3D(String material) {
            return null;
        }

        @Override
        public void setYear(int i) {

        }
    };

	Snake snake = new Snake() {
        @Override
        public void setYear(int i) {

        }
    };
	snake.makeVoice();

	Dog dog = new Dog() {
        @Override
        public void Draw() {

        }

        @Override
        public void setYear(int i) {

        }
    };
	dog.setYear(1);
	dog.setColor("black");
	dog.makeVoice();

    }
}
