public class WeeklyHighTemps{
     static int[] weatherForcast;
    public static void main(String args[]){
        //Creating array of high weather temps
        weatherForcast = new int[]{26,22,26,28,33};
        //printing array
        System.out.println("The 5 Day Forcast for high. Mon:" + weatherForcast[0] + " Tues:" + weatherForcast[1] + " Wed:" + weatherForcast[2] + " Thurs:" + weatherForcast[3] + " Fri:" + weatherForcast[4]);
    }
}