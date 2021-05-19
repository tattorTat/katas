package duplicates;

public class Lesson21 extends Song {
    public void singSong(int style, String... names) {
        switch (style) {
            case 1: {
                foo(names, "L", 0, "Hip Hip Horray! For ");
            }
                break;
            case 2: {
                foo(names, "am", 1, "Say yeah! Say yo! Say ");
            }
                break;
            case 3: {
                for (String name : names) {
                    sing("Hello " + name + ", it's nice to meet you.");
                }
            }
                break;
        }
    }

    private void foo(String[] songNames, String startSongWith, int startPosition, String celebrateTag) {
        for (String name : songNames) {
            String nameStart = startSongWith;
            int offset = startPosition;
            if (name.startsWith(nameStart, offset)) {
                String celebrate = celebrateTag;
                sing(celebrate + name);
            } else {
                sing("Hello " + name + ", it's nice to meet you.");
            }
        }
    }
}
