// Practical 7: Object Lifecycle and Garbage Collection
class DemoObject {
    DemoObject() { System.out.println("Object constructed"); }
    void use() { System.out.println("Object is being used"); }
    @Override
    protected void finalize() throws Throwable {
        // Deprecated and not guaranteed to run; shown only as a historical reference.
        System.out.println("finalize() called (not guaranteed)");
    }
}

public class Practical7 {
    public static void main(String[] args) {
        DemoObject object = new DemoObject();
        object.use();

        object = null; // The object may now be eligible for garbage collection.
        System.gc();   // Request only; the JVM may ignore or delay this request.
        System.out.println("Garbage collection was requested.");
    }
}
// An object is eligible when it can no longer be reached from live references.
// The JVM manages memory and reclaims eligible objects at its discretion.
// Unlike C++ destructors, Java has no deterministic destructor mechanism.
// Do not depend on finalize() or garbage-collection timing for correctness.
