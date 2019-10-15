package com.example.twentyone.main;

import java.util.List;

public class MainPresenter {

    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    MainPresenter(MainView mainView, FindItemsInteractor findItemsInteractor)
    {
        this.findItemsInteractor = findItemsInteractor;
        this.mainView = mainView;
    }

    void onResume()
    {
        if(mainView != null)
        {
            mainView.showProgress();
        }

        //findItemsInteractor.findItems(this::onFinished);
    }



    void onItemClicked(String item){
        if(mainView != null){
            mainView.showMessage(String.format("%s clicked", item));
        }
    }

    void onDestroy()
    {
        mainView = null;
    }

    public void onFinished(List<String>items)
    {
        if(mainView != null){
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }

    public MainView getMainView()
    {
        return mainView;
    }

}
