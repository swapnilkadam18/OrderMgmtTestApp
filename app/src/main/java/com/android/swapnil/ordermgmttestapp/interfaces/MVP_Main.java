package com.android.swapnil.ordermgmttestapp.interfaces;

import android.content.Context;

/**
 * Created by swapnil on 21/10/2016.
 */

public interface MVP_Main {

    interface ToPresenter{
        //view will send data to presenter
    }

    interface ToModel{
        //presenter will send data for business logic to model
    }

    interface FromModel{
        //to provide response to presenter
    }

    interface FromPresenter{
        //from presenter to send data back to view
        void notifyOnDataSetReceived();
    }
}
