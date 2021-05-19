package duplicates;

public class Lesson21 extends Song {
    public void singSong(int style, String... names) {
        switch (style) {
            case 1: {

                {
                    for (String name : names) {
                        foo(name, "L", 0, "Hip Hip Horray! For ");
                    }
                }



            }

            break;
            case 2: {


                {
                    for (String name : names) {
                        foo(name, "am", 1, "Say yeah! Say yo! Say ");
                    }
                }




            }

            break;
            case 3: {



                for (String name : names) {
//                    foo(name, "am", 1, "Say yeah! Say yo! Say ");
                    sing("Hello " + name + ", it's nice to meet you.");
                }




            }
            break;
        }
    }

    private void foo(String name, String am, int i, String s) {
        if (name.startsWith(am, i)) {
            String stringOne = s;
            sing(stringOne + name);
        } else {
            sing("Hello " + name + ", it's nice to meet you.");
        }
    }
}
