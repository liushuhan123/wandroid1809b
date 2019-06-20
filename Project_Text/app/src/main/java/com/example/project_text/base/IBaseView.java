package com.example.project_text.base;

import android.content.Context;


public interface IBaseView<T extends IBasePresenter> {


    void setPresenter(T presenter);

    Context getContextObject();
}
