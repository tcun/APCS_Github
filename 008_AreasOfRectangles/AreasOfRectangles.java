public class AreasOfRectangles
{
    public static void main(String[] args)
    {
        //print areas for each set of numbers
        System.out.println(areaFormula(5.5, 7.8));
        System.out.println(areaFormula(99.4, 500.352));
        System.out.println(areaFormula(inchToCent(75), 800));
        System.out.println(areaFormula(500029.75, centToInch(90029384.0)));
        System.out.println(areaFormula(centToYard(600000.0), milliToYard(8343491034.0)));
    }
    //method for area formula, two double inputs
    public static double areaFormula(double l, double w)
    {
    //lenth * width = area
        double area;
        area = l*w;
        return area;
        
    }
    //method for converting inches to centimeters
    public static double inchToCent(double inch)
    {
        double cent = inch / 0.393701;
        return cent;
    }
    //method for converting centimeter to inches
    public static double centToInch(double cent)
    {
        double inch = cent / 2.54;
        return inch;
    }
    //method for converting centimeters to yards
    public static double centToYard(double cent)
    {
        double yard = cent / 91.44;
        return yard;
    }
    //method for converting millimeters to yards
    public static double milliToYard(double milli)
    {
        double yard = milli / 914.4;
        return yard;
    }
}