package duplicates;

public class Lesson21 extends Song {
    public void singSong(int style, String... names) {
        switch (style) {
            case 1:
                    foo(names, true, "L", 0, "Hip Hip Horray! For ");
            break;
            case 2:
                    foo(names, true, "am", 1, "Say yeah! Say yo! Say ");
            break;
            case 3:
                foo(names, false, "null", 1, "Say yeah! Say yo! Say ");
            break;
        }
    }

    private void foo(String[] names, boolean b, String s, int i, String s2) {
        for (String name : names) {
            if (b && name.startsWith(s, i)) {
                String stringOne = s2;
                sing(stringOne + name);
            } else {
                sing("Hello " + name + ", it's nice to meet you.");
            }
        }
    }

}
