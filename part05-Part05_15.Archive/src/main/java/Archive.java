public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive newArchive = (Archive) compared;

        if (this.identifier.equals(newArchive.identifier)) {
            return true;
        }
        return false;
    }

    public void read() {
        System.out.println(this.identifier + ": " + this.name);
    }
}
