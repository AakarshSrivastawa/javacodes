interface ProgrammingLanguage {
    void run();
    void debug();
    String getName();
}

// A class that implements the ProgrammingLanguage interface
class Java implements ProgrammingLanguage {
    String name = "Java";

    public void run() {
        System.out.println("Running Java program...");
    }

    public void debug() {
        System.out.println("Debugging Java program...");
    }

    public String getName() {
        return name;
    }
}

// Another class that implements the ProgrammingLanguage interface
class Python implements ProgrammingLanguage {
    String name = "Python";

    public void run() {
        System.out.println("Running Python program...");
    }

    public void debug() {
        System.out.println("Debugging Python program...");
    }

    public String getName() {
        return name;
    }
}

// Main class that creates objects of the classes that implement the interface
class javalab8 {
    public static void main(String[] args) {
        Java java = new Java();
        Python python = new Python();

        System.out.println("Java name: " + java.getName());
        java.run();
        java.debug();

        System.out.println("Python name: " + python.getName());
        python.run();
        python.debug();
    }
}