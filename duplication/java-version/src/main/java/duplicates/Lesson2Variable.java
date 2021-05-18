package duplicates;

public class Lesson2Variable extends Song {
    public void singBottlesOfBeer() {
        singBottleOfBeerSong(100);
        singBottleOfBeerSong(99);
    }

    private void singBottleOfBeerSong(Integer num) {
        sing(num + " bottles of beer on the wall");
        sing(num + " bottles of beer");
        sing("Take one down, pass it around");
        sing((num - 1) + " bottles of beer on the wall");
    }
}
