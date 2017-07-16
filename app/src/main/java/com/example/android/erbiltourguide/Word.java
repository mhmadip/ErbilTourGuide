package com.example.android.erbiltourguide;

/**
 * it contains two translation one for the vocabulary and the other for translation
 */
public class Word {

    /** Default translation for the word (State)**/
    private String mName;

    /**Miwok Translation for the word (State)**/
    private String mDesc;

    //** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object.
     * @param address is the address of the location
     *
     */
    //Location constructor
    public Word( String Name , String address) {
        mName=Name;
        //I will use same variable of desc to display the location address , since I created LocationFragment to display location info
        mDesc = address;
    }

    //Constructor that should has the same Class name
    public Word (String defaultName, String Desc, int imageResourceID)
    {
        mName =defaultName;
        mDesc =Desc;
        mImageResourceId=imageResourceID;
    }
    //get default translation method
    public String getmName()
    {
        return mName;
    }
    //get Miwok translation
    public String getmDesc()
    {
        return mDesc;
    }
    //get image resource ID

    public int getImageResourceID()
    {
        return mImageResourceId;
    }
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mName='" + mName + '\'' +
                ", mDesc='" + mDesc + '\'' +
                ", mImageResourceId=" + mImageResourceId+
                     '}';
    }
}
