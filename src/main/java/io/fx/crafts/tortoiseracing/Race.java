package io.fx.crafts.tortoiseracing;

public class Race {
    public static int[] computeCrossTime(int speedA, int speedB, int leadA) {
        if (leadA == 0) {
            return new int[3];
        }
        if (speedA >= speedB) {
            return null;
        }

        // speedABySeconds = speedA / 3600;
        // speedBBySeconds = speedB / 3600;
        // speedABySeconds * solutionInSeconds + leadA = speedBBySeconds * solutionInSeconds

        int solutionInSeconds = (leadA * 3600) / (speedB - speedA);

        return solutionInHoursMinutesSeconds(solutionInSeconds);
    }

    private static int[] solutionInHoursMinutesSeconds(int solutionInSeconds) {
        int secondsPart = solutionInSeconds % 60;
        int solutionInMinutes = solutionInSeconds / 60;
        int minutesPart = solutionInMinutes % 60;
        int hoursPart = solutionInMinutes / 60;

        return new int[]{hoursPart, minutesPart, secondsPart};
    }
}
