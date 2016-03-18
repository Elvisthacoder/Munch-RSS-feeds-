package com.crazyhitty.chdev.ks.munch.curatedfeeds;

import android.content.Context;

/**
 * Created by Kartik_ch on 1/3/2016.
 */
public interface ICuratedFeedsInteractor {
    void fetchCuratedFeedsFromServer(OnCuratedFeedsRetrievedListener onCuratedFeedsRetrievedListener, Context context);
}
