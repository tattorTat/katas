package duplicates;

public class Lesson21 extends Song {
    public void singSong(int style, String... names) {
        switch (style) {
            case 1: {
                for (String name : names) {
                    if (name.startsWith("L", 0)) {
                        String horray = "Hip Hip Horray! For ";
                        sing(horray + name);
                    } else {
                        sing("Hello " + name + ", it's nice to meet you.");
                    }
                }
            }
                break;
            case 2: {
                for (String name : names) {
                    if (name.startsWith("am", 1)) {
                        String sayYeah = "Say yeah! Say yo! Say ";
                        sing(sayYeah + name);
                    } else {
                        sing("Hello " + name + ", it's nice to meet you.");
                    }
                }
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
}
