package classesInterfaces.enumExemple;
/*Create the PackageSize enum class with constants SMALL , MEDIUM , LARGE .
Enum should include two parameters in the constructor:
minimum package size in cm maximum package size in cm
The PackageSize enum class should adopt the static getPackageSize method.
This method should accept package size and as a result it should return a specific
PackageSize object based on the package size passed */

public enum PackageSize {
    SMALL(0, 10),
    MEDIUM(11, 20),
    LARGE(21, 30);
    private int min;
    private int max;

    PackageSize(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static PackageSize getPackageSize(int min, int max) {
        for (PackageSize magic : values()) {
            //System.out.println(magic.min);
            //System.out.println(magic.max);
           if(magic.min <= min && magic.max >= max){
               return magic;
           }

        }
        return null;
    }
}





