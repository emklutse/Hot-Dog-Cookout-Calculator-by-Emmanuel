/**
 * This class holds value for number of people and the
 * number of buns each person receives. It also displays the
 * minimum number of packages of hot dogs required,
 * the minimum number of packages of buns required,
 * the number of hot dogs that will be left over,
 * and the number of hours that will be left over.
 */

public class cookout
{
    private int num_people; // Number of people at the cookout
    private int num_hotdogs; // Number of hot dogs each person will receive
    final int num_HotDogsInBag=10;
    final int num_BunsInBag=8;

    /**
     * The constructor initializes the num_people and
     * num_hotdogs fields to 0
     */
    public cookout()
    {
        num_people=0;
        num_hotdogs=0;
    }

    /**
     * The setNum_People method accepts an argument
     * that is stored in the num_people field
     */
    public void setNum_People(int people)
    {
        num_people=people;
    }

    /**
     * The setNum_Hotdogs method accepts an argument
     * that is stored in the num_hotdogs field
     */
    public void setNum_Hotdogs(int hotdogs)
    {
        num_hotdogs=hotdogs;
    }


    /**
     * The getNum_people method return the number of people field
     */
    public int getNum_people()
    {
        return num_people;
    }

    /**
     * The getNum_hotdogs method return the number of hotdog field
     */
    public int getNum_hotdogs()
    {
        return num_hotdogs;
    }

    /**
     * The getTot_Hotdogs method calculates and returns the
     * total number of hotdogs
     */
    public int getTot_Hotdogs()
    {
        return (getNum_people()*getNum_hotdogs());
    }

    /**
     * The getMinimum_Hotdogs method calculated and returns the
     * minimum number of packages of hot dogs needed
     */
    public int getMinimum_Hotdogs()
    {
        int minimumHotDogs;

        minimumHotDogs= getTot_Hotdogs() / num_HotDogsInBag;

        int remaining_hotdogs=getTot_Hotdogs()%num_HotDogsInBag;

        if(remaining_hotdogs > 0)
        {
            // finalize the minimum number of packages of hot dogs required
            minimumHotDogs = minimumHotDogs + 1;
        }

        return (minimumHotDogs);
    }

    /**
     * The getMinimum_Buns method calculated and returns the
     * minimum number of packages of buns needed
     */
    public int getMinimum_Buns()
    {
        int minimumBuns;

        minimumBuns= getTot_Hotdogs() / num_BunsInBag;

        int remaining_buns=getTot_Hotdogs()%num_BunsInBag;

        if(remaining_buns> 0)
        {
            // finalize the minimum number of packages of hot dogs required
            minimumBuns = minimumBuns + 1;
        }

        return (minimumBuns);
    }


    /**
     * The getRemaining_Hotdogs method calculates and returns the
     * remaining hotdogs
     */
    public int getRemaining_Hotdogs()
    {

        int remaining_hotdogs;

        remaining_hotdogs=getTot_Hotdogs()%num_HotDogsInBag;

        if(remaining_hotdogs > 0)
        {
            // finalize the number of hot dogs that will be loft over
            remaining_hotdogs = num_HotDogsInBag - remaining_hotdogs;
        }

        return (remaining_hotdogs);
    }



    /**
     * The getRemaining_Buns method calculates and returns the
     * remaining buns
     */
    public int getRemaining_Buns()
    {
        int remaining_buns;

        remaining_buns=getTot_Hotdogs()%num_BunsInBag;

        if(remaining_buns > 0)
        {
            // finalize the number of hot dogs that will be loft over
            remaining_buns = num_BunsInBag - remaining_buns;
        }

        return (remaining_buns);
    }

}
