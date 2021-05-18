package duplicates;

public class Lesson1Straight extends Song {
    public void singCatSong() {
        singWith("We gave the cat to a little kid");
        singWith("We sent the cat out on a boat");
    }

    private void singWith(String line) {
        sing(line);
        sing("But the cat came back");
        sing("The very next day");
        sing("Oh the cat came back");
        sing("We thought he was a goner");
        sing("But the cat came back, he just wouldn't go away");
    }
}
