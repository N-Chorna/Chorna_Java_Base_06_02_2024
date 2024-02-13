package ua.hillel.chorna.lessons.lesson2.HW2;

public class MyApp {
    public static void main(String[] args) {
        String name = "Tokyo Tower";
        String city = "Tokyo";
        String country = "Japan";
        String lat1 = "Latitude";
        String lon1 = "Longitude";
        String lat2 = "Lat";
        String lon2 = "Long";
        String dms = "DMS";
        char north = 'N';
        char east = 'E';
        double latitude = 35.658581D;
        double longitude = 139.745438D;
        int latDegree = 35;
        int longDegree = 139;
        int latMinutes = 39;
        int longMinutes = 44;
        double latSeconds = 30.8916D;
        double longSeconds = 43.5768D;

        System.out.println(name + ", " + city + ", " + country);
        System.out.println(lat1 + " " + latitude + ", " + lon1 + " " + longitude);
        System.out.println(dms + " " + lat2 + " " + latDegree + '\u00B0' + " " + latMinutes + '\'' + " " + latSeconds + '\'' + '\'' + " " + north + " " + dms + " " + lon2 + " " + longDegree + '\u00B0' + " " + longMinutes + '\'' + " " + longSeconds + '\'' + '\'' + " " + east);

    }
}
