package io.fx.crafts.tortoiseracing;

public class Race {
    public static int[] computeCrossTime(int speedA, int speedB, int leadA) {
        if (leadA == 0) {
            return new int[3];
        }
        if (speedA >= speedB) {
            return null;
        }
        return new int[3];
    }
}
