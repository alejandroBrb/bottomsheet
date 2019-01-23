package androidx.fragment.app;

/**
 * @author Alejandro Barba on 1/22/19.
 */
public final class AccessFragmentInternals {
    private AccessFragmentInternals() {
        throw new AssertionError("No instances.");
    }

    public static int getContainerId(Fragment fragment) {
        return fragment.mContainerId;
    }
}
