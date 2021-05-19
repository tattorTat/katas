package duplicates;

public class Lesson21 extends Song {
    public void singSong(int style, String... names) {
        switch (style) {
            case 1: {

                {
                    foo(names, "L", 0, "Hip Hip Horray! For ");
                }



            }

            break;
            case 2: {


                {
                    foo(names, "am", 1, "Say yeah! Say yo! Say ");
                }
            }
            break;
            case 3: {
                for (String name : names) {
                    if (name.startsWith("am", 1)) {
                        String name2 = name + ", it's nice to meet you.";
                        String stringOne = "Hello ";
                        sing(stringOne + name2);
                    } else {
                        sing("Hello " + name + ", it's nice to meet you.");
                    }
                }
            }
            break;
        }
    }

    private void foo(String[] names, String am, int i, String s) {
        for (String name : names) {
            if (name.startsWith(am, i)) {
                String stringOne = s;
                sing(stringOne + name);
            } else {
                sing("Hello " + name + ", it's nice to meet you.");
            }
        }
    }

}
