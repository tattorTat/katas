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

    private void foo(String[] names, String l, int i, String s) {
        for (String name : names) {
            String nameStart = l;
            int offset = i;
            if (name.startsWith(nameStart, offset)) {
                String celebrate = s;
                sing(celebrate + name);
            } else {
                sing("Hello " + name + ", it's nice to meet you.");
            }
        }
    }
}
