public class AreasOfRectangles
{
    public static void main(String[] args)
    {
        System.out.println(areaFormula(5.5, 7.8));
        System.out.println(areaFormula(99.4, 500.352));
        System.out.println(areaFormula(inchToCent(75), 800));
        System.out.println(areaFormula(500029.75, centToInch(90029384.0)));
        System.out.println(areaFormula(centToYard(600000.0), milliToYard(8343491034.0)));
    }
    public static double areaFormula(double l, double w)
    {
        double area;
        area = l*w;
        return area;
        
    }

    public static double inchToCent(double inch)
    {
        double cent = inch / 0.393701;
        return cent;
    }

    public static double centToInch(double cent)
    {
        double inch = cent / 2.54;
        return inch;
    }

    public static double centToYard(double cent)
    {
        double yard = cent / 91.44;
        return yard;
    }

    public static double milliToYard(double milli)
    {
        double yard = milli / 914.4;
        return yard;
    }
}