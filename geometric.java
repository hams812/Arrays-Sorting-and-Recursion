
/**
 * Write a description of class geometric here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class geometric
{
    public static double geometric(double first_term,double r,int terms){
        return first_term*Math.pow(r,terms-1);
    }
    public static double geometricRec(double first_term,double r,int terms){
        if (terms==1){
        return first_term;
        }
        else{
        return geometricRec(first_term*r,r,terms-1);
        }
    }
}
