package duplicates;

public class Lesson2Variable extends Song {
    public void singBottlesOfBeer() {
        {
            Integer num = 100;
            sing(num + " bottles of beer on the wall");
            sing(num + " bottles of beer");
            sing("Take one down, pass it around");
            sing((num - 1) + " bottles of beer on the wall");
        }
        {
            Integer num = 99;
            sing(num + " bottles of beer on the wall");
            sing(num + " bottles of beer");
            sing("Take one down, pass it around");
            sing("98 bottles of beer on the wall");
        }
    }
}
