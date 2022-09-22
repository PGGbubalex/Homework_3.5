public class Main {
    public static void main(String[] args) {
        int totalCansOfPaint = 120;
        int cansOfWhitePaintForOneClass = 2;
        int cansOfBrownPaintForOneClass = 4;

        int totalNumberOfClasses = totalCansOfPaint / (cansOfBrownPaintForOneClass + cansOfWhitePaintForOneClass);
        int totalNumberOfCansOfWhitePaint = totalNumberOfClasses * cansOfWhitePaintForOneClass;
        int totalNumberOfCansOfBrownPaint = totalNumberOfClasses * cansOfBrownPaintForOneClass;

            System.out.println("В школе, где " + totalNumberOfClasses + " классов, нужно " + totalNumberOfCansOfWhitePaint + " белой краски и " + totalNumberOfCansOfBrownPaint + " банок коричневой краски");

            // task 5 complete
    }
}