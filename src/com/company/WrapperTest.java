package src.com.company;

public class WrapperTest {
    public static void main(String[] args) {
        //Integer
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        //Double
        Double d1 = 10.5;
        Double d2 = Double.valueOf(10.5);
        Double d3 = new Double(10.0);
        Double d4 = Double.parseDouble("10.5");

        //Float
        Float f1 = 10.5F;
        Float f2 = Float.valueOf(10.5F);
        Float f3 = new Float(10.5);
        Float f4 = Float.parseFloat("10.5f");

        //Character
        Character c1 = 'a';
        Character c2 = Character.valueOf('a');
        Character c3 = new Character('a');

        //Byte
        Byte b1 = 5;
        Byte b2 = Byte.valueOf((byte)5);
        Byte b3 = new Byte((byte) 5);
        Byte b4 = Byte.parseByte("10");

        //Boolean
        Boolean bool1 = true;
        Boolean bool2 = Boolean.valueOf(true);
        Boolean bool3 = new Boolean(true);
        Boolean bool4 = Boolean.parseBoolean("true");

        //Short
        Short s1 = 15;
        Short s2 = Short.valueOf((short) 15);
        Short s3 = new Short((short) 15);
        Short s4 = Short.parseShort("15");

        //3
        Double double1 = 10.5;

        //3.1
        byte byte1 = double1.byteValue();
        short short1 = double1.shortValue();
        int int1 = double1.intValue();
        float float1 = double1.floatValue();
        long long1 = double1.longValue();

        //4.1
        Double double2 = 0.0;
        Double double3 = 20.2;
        Double nanValue = double3/double2;
        Double infinityValue = double2 / double2;

        if (nanValue.isNaN()) {
            System.out.println("Переменная nanValue = NaN");
        } else {
            System.out.println("Переменная nanValue = Infinity");
        }

        if (infinityValue.isNaN()) {
            System.out.println("Переменная infinityValue = NaN");
        } else {
            System.out.println("Переменная infinityValue = Infinity");
        }

        //5
        Long long_1 = 120L;
        Long long_2 = 120L;
        if (long_1 == long_2) {
            System.out.println("long_1 равно long_2");
        } else {
            System.out.println("long_1 неравно long_2");
        }

        long_1 = 1200L;
        long_2 = 1200L;
        if (long_1 == long_2) {
            System.out.println("long_1 равно long_2");
        } else {
            System.out.println("long_1 неравно long_2");
        }

    }
}
