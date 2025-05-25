public class testLesson {
    public static void last(Lesson[] arr) {
        Lesson lastLesson = arr[0];
        Lesson l;
        for (int i = 1; i < arr.length; i++) {
            l = arr[i];
            if(l.isLater(lastLesson)) {
                lastLesson = l;
            }
        }
        System.out.println("Last lesson id is: " + lastLesson.getId());
    }

    public static int sumDuration(Lesson[] arr, int id) {
        int sum = 0;
        Lesson l;
        for (int i = 0; i < arr.length; i++) {
            l = arr[i];
            if (l.getId() == id) {
                sum += l.getDuration();
            }
        }
        return sum;
    }

    public static int longest(Lesson[] arr) {
        Lesson l = arr[0];
        int LongestDuration = sumDuration(arr, l.getId());
        Lesson LongestDurationLesson = l;
        for (int i = 1; i < arr.length; i++) {
            l = arr[i];
            if (sumDuration(arr, l.getId())> LongestDuration) {
                LongestDuration = sumDuration(arr, l.getId());
                LongestDurationLesson = l;
            }
        }
        return LongestDurationLesson.getId();
    }
}
