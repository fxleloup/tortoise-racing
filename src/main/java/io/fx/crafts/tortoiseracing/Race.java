package io.fx.crafts.tortoiseracing;

public class Race {
    public static int[] computeCrossTime(int speedA, int speedB, int leadA) {
        if (leadA == 0) {
            return new int[3];
        }
        if (speedA >= speedB) {
            return null;
        }

        // speedAInSeconds = speedA / 3600;
        // speedBInSeconds = speedB / 3600;
        // speedAInSeconds * crossTimeInSeconds + leadA = speedBInSeconds * crossTimeInSeconds

        int crossTimeInSeconds = (leadA * 3600) / (speedB - speedA);

        return crossTimeInHoursMinutesSeconds(crossTimeInSeconds);
    }

    public static int[] crossTimeInHoursMinutesSeconds(int solutionInSeconds) {
        int secondsPart = solutionInSeconds % 60;
        int solutionInMinutes = solutionInSeconds / 60;
        int minutesPart = solutionInMinutes % 60;
        int hoursPart = solutionInMinutes / 60;

        return new int[]{hoursPart, minutesPart, secondsPart};
    }
}
