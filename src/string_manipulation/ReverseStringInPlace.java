package string_manipulation;

import java.lang.reflect.Field;

public class ReverseStringInPlace {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		test("abcde");
        test("");
        test(null);
        test("q");
        // check out this one:
        System.out.println("------------");
        System.out.println("0123456789");
        inplaceReverse("0123456789");
        System.out.println("0123456789");

	}
	

    private static void test(String testStr) throws NoSuchFieldException, IllegalAccessException {
        System.out.print(String.format("'%s'", testStr));
        inplaceReverse(testStr);
        System.out.println(String.format(" became '%s'", testStr));
    }
 
    /**
     * Surrogate characters are not yet supported.
     */
    public static void inplaceReverse(String str) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        if (null != str) {
            inplaceReverseValueField(str);
            resetHashcodeField(str);
        }
    }
 
    private static void inplaceReverseValueField(String str) throws NoSuchFieldException, IllegalAccessException {
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] chars = (char[]) valueField.get(str);
        // do 'ArraysUtil.reverse(chars)' if Apache Commons Lang is in your classpath, otherwise:
        inplaceReverse(chars);
        valueField.setAccessible(false);
    }
 
    private static void inplaceReverse(char[] chars) {
        for (int forwardNdx = 0, backwardNdx = chars.length - 1; forwardNdx < backwardNdx; forwardNdx++, backwardNdx--) {
            if (Character.isSurrogate(chars[forwardNdx]) || Character.isSurrogate(chars[backwardNdx])) {
                throw new IllegalArgumentException("Surrogate characters are not yet supported.");
            }
            char _ = chars[forwardNdx];
            chars[forwardNdx] = chars[backwardNdx];
            chars[backwardNdx] = _;
        }
    }
 
    private static void resetHashcodeField(String str) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Field hashField = String.class.getDeclaredField("hash");
        hashField.setAccessible(true);
        hashField.set(str, 0);
        hashField.setAccessible(false);
    }
}

