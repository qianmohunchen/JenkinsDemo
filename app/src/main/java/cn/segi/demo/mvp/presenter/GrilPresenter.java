package cn.segi.demo.mvp.presenter;

import java.util.List;

import cn.segi.demo.mvp.bean.Girl;
import cn.segi.demo.mvp.model.GirlModelImpl;
import cn.segi.demo.mvp.model.IGirlModel;
import cn.segi.demo.mvp.view.IGirlView;

public class GrilPresenter {

    IGirlModel iGirlModel;

    IGirlView iGirlView;

    public GrilPresenter(IGirlView iGirlView) {
        iGirlModel = new GirlModelImpl();
        this.iGirlView = iGirlView;
    }

    public void fetch() {
        iGirlModel.loadGirl(new IGirlModel.IGrilLoadListener() {
            @Override
            public void complete(List<Girl> girls) {
                iGirlView.showGirls(girls);
            }
        });
    }
}
