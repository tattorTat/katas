package duplicates;

public class Lesson2Variable extends Song {
    public void singBottlesOfBeer() {
        {
            Integer num = 100;
            doesntmatterrightnow(num);
        }
        {
            Integer num = 99;
            doesntmatterrightnow(num);
        }
    }

    private void doesntmatterrightnow(Integer num) {
        sing(num + " bottles of beer on the wall");
        sing(num + " bottles of beer");
        sing("Take one down, pass it around");
        sing((num - 1) + " bottles of beer on the wall");
    }
}
