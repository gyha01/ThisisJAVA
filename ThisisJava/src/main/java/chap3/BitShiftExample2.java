package chap3;

public class BitShiftExample2 {
    public static void main(String[] args){

        //[00000000] [00000000] [00000011] [00000100]
        int value = 772;

        // 1byte = 8bit 이므로 8단위로 나눠서 해야 끝의 자리를 읽을 수 있음
        // 우측으로 3byte(24bit) 이동하고 끝 1바이트만 읽음
        // [00000000]
        byte byte1 = (byte)(value >>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

        // [00000000]
        byte byte2 = (byte)(value >>> 16);
        int int2 = byte2 & 255;
        System.out.println("두 번째 바이트 부호 없는 값: " + int2);

        // [00000011]
        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값: " + int3);

        // [00000100]
        byte byte4 = (byte) value;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번재 바이트 부호 없는 값: " + int4);

    }
}
