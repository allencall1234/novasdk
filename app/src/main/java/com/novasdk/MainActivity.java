package com.novasdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import novj.platform.vxkit.common.bean.search.SearchResult;
import novj.platform.vxkit.handy.api.SearchManager;
import novj.publ.api.NovaOpt;
import novj.publ.net.exception.ErrorDetail;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NovaOpt.GetInstance().initialize(2);

        NovaOpt.GetInstance().searchScreen(new SearchManager.OnScreenSearchListener() {
            @Override
            public void onSuccess(SearchResult searchResult) {
                Log.d("zlt", "result = " + searchResult);
            }

            @Override
            public void onError(ErrorDetail errorDetail) {
                Log.d("zlt", "error = " + errorDetail);
            }
        });
    }
}
