package duplicates;

public class Lesson2Variable extends Song {
    public void singBottlesOfBeer() {

            doesntmatterrightnow(100);


            doesntmatterrightnow(99);

    }

    private void doesntmatterrightnow(Integer num) {
        sing(num + " bottles of beer on the wall");
        sing(num + " bottles of beer");
        sing("Take one down, pass it around");
        sing((num - 1) + " bottles of beer on the wall");
    }
}
