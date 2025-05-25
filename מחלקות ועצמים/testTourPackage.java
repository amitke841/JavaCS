public class testTourPackage {
    public static int calculate(TourPackage[] packages) {
        int count = 0;
        TourPackage p;
        for (int i = 0; i < packages.length; i++) {
            p = packages[i];
            if (p.getExtra() > 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] customers(TourPackage[] packages) {
        int[] idArr = new int[calculate(packages)];
        int k = 0;
        TourPackage p;
        for (int i = 0; i < packages.length; i++) {
            p = packages[i];
            if (p.getExtra()>0) {
                idArr[k] = p.getId();
                k++;
            }
        }
        return idArr;
    }
}
