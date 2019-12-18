public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (bigCount == 0 || smallCount >= goal) {
            return goal <= smallCount;
        }
        if (smallCount == 0 && (bigCount * 5) < goal) {
            return false;
        }
        for (int i = 0; i <= smallCount; i++) {
            int sum = goal - i;
            for (int j = 0; j <= bigCount; j++) {
                if (sum == j * 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
