package hr.hr.smilebacksmile.domain.util.cast;

public interface SafeCast {

    static <T> void checkType(Class<T> expectedType, Object obj) {
        if (!expectedType.isInstance(obj)) {
            throw new IllegalArgumentException("Expected " + expectedType + " but was " + obj.getClass() + ": " + obj);
        }
    }

    @SuppressWarnings({"unchecked"})
    static <T> T cast(Class<T> expectedType, Object obj) {
        if (!expectedType.isInstance(obj)) {
            throw new IllegalArgumentException("Expected " + expectedType + " but was " + obj.getClass() + ": " + obj);
        } else {
            return expectedType.cast(obj);
        }
    }
}
